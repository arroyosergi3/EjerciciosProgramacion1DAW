package capitulo6.tresEnRaya;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Cuadros {
	private int xEnTablero, yEnTablero;
	private int esquinaSuperiorIzquierdaX, esquinaSuperiorIzquierdaY;
	private int ancho, alto;
	private int jugadorPropietario = 0;

	
	
	
	public Cuadros(int xEnTablero, int yEnTablero) {
		super();
		this.xEnTablero = xEnTablero;
		this.yEnTablero = yEnTablero;
	}
	
	public void paint (Graphics g) {
		ancho = TresEnRaya.getInstance().getWidth() / 3;
		alto = TresEnRaya.getInstance().getHeight() / 3;
		esquinaSuperiorIzquierdaX = this.xEnTablero * ancho;
		esquinaSuperiorIzquierdaY = this.yEnTablero * alto;
		g.setColor(Color.BLACK);
		g.drawRect(esquinaSuperiorIzquierdaX, esquinaSuperiorIzquierdaY, ancho, alto);
		
			// pintaImagenesVectoriales(g);
			pintaImagenesMapasDeBits(g);
		
	}
	private void pintaImagenesMapasDeBits(Graphics g) {
		BufferedImage imagenAPintar = null;
		if(this.jugadorPropietario == TresEnRaya.JUGADOR_1) {
			imagenAPintar = SpritesRepository.getInstance().getSprite("FiguraTino.png");
			
					
		}
		if(this.jugadorPropietario == TresEnRaya.JUGADOR_2) {
			imagenAPintar = SpritesRepository.getInstance().getSprite("FiguraQuiniones.png");
		}
		if(imagenAPintar != null) {
			int x = this.esquinaSuperiorIzquierdaX + this.ancho/2 - imagenAPintar.getWidth() / 2;
			int y = this.esquinaSuperiorIzquierdaY + this.alto / 2 - imagenAPintar.getHeight() / 2;
			g.drawImage(imagenAPintar, x, y, null);
			
		}
		
	}
	private void pintaImagenesVectoriales(Graphics g) {
		if(this.jugadorPropietario == TresEnRaya.JUGADOR_1) {
			g.drawLine(this.esquinaSuperiorIzquierdaX, this.esquinaSuperiorIzquierdaY, this.esquinaSuperiorIzquierdaX + this.ancho, this.esquinaSuperiorIzquierdaX + this.alto);
			g.drawLine(this.esquinaSuperiorIzquierdaX, this.esquinaSuperiorIzquierdaY + alto, this.esquinaSuperiorIzquierdaX + this.ancho, this.esquinaSuperiorIzquierdaY);

		}
		
		if(this.jugadorPropietario == TresEnRaya.JUGADOR_2) {
			g.drawOval(this.esquinaSuperiorIzquierdaX, this.esquinaSuperiorIzquierdaY, this.ancho, this.alto);
		}
	}
	public boolean seHaHechoClicSobreCuadro(int xClic, int yClic) {
		if (xClic > this.esquinaSuperiorIzquierdaX && xClic < (esquinaSuperiorIzquierdaX + ancho) && yClic > this.esquinaSuperiorIzquierdaY && yClic < (esquinaSuperiorIzquierdaY + alto)) {
			return true;
		} 
		return false;
	}
	
	public static boolean comprobarGanar(int[][] m, int player) {
        // Comprobar filas y columnas
        for (int i = 0; i < 3; i++) {
            if ((m[i][0] == player && m[i][1] == player && m[i][2] == player) ||
                (m[0][i] == player && m[1][i] == player && m[2][i] == player)) {
                return true;
            }
        }

        // Comprobar diagonales
        if ((m[0][0] == player && m[1][1] == player && m[2][2] == player) ||
            (m[0][2] == player && m[1][1] == player && m[2][0] == player)) {
            return true;
        }

        return false;
    }
	public void mensajeEmpate() {
		JFrame ventana = new JFrame("EMPATE");

        // Crear una etiqueta para mostrar el mensaje
        JLabel mensajeLabel = new JLabel("¡EMPATE!");

        // Agregar la etiqueta a la ventana
        ventana.add(mensajeLabel, BorderLayout.CENTER);

        // Configurar las propiedades de la ventana
        ventana.setSize(300, 150); // Establecer tamaño
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar la aplicación al cerrar la ventana
        ventana.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        ventana.setVisible(true); // Hacer la ventana visible
	}
	
	public void mensajeGanador(int j) {
		
		
		if(j == TresEnRaya.getInstance().JUGADOR_1) {
			JFrame ventana = new JFrame("Ganador - Jugador 1");

	        // Crear una etiqueta para mostrar el mensaje
	        JLabel mensajeLabel = new JLabel("¡TINO TOVAR ha ganado!");

	        // Agregar la etiqueta a la ventana
	        ventana.add(mensajeLabel, BorderLayout.CENTER);

	        // Configurar las propiedades de la ventana
	        ventana.setSize(300, 150); // Establecer tamaño
	        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar la aplicación al cerrar la ventana
	        ventana.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
	        ventana.setVisible(true); // Hacer la ventana visible
	    }
		else if(j == TresEnRaya.getInstance().JUGADOR_2) {
			JFrame ventana = new JFrame("Ganador - Jugador 2");

	        // Crear una etiqueta para mostrar el mensaje
	        JLabel mensajeLabel = new JLabel("¡JOAQUÍN QUIÑONES ha ganado!");

	        // Agregar la etiqueta a la ventana
	        ventana.add(mensajeLabel, BorderLayout.CENTER);

	        // Configurar las propiedades de la ventana
	        ventana.setSize(300, 150); // Establecer tamaño
	        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar la aplicación al cerrar la ventana
	        ventana.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
	        ventana.setVisible(true); // Hacer la ventana visible
			
		}
			
	
		
	}
	
	public boolean comprobarDisponibles() {
		for (int i = 0; i < TresEnRaya.getInstance().getMatrizJugadas().length; i++) {
			for (int j = 0; j < TresEnRaya.getInstance().getMatrizJugadas().length; j++) {
				if (TresEnRaya.getInstance().getMatrizJugadas()[i][j] ==0) {
					return true;
					
					
				}
			}
		}
		return false;
		
				
	}
	
	public void clic(int jugador) {
		
		
		if(this.jugadorPropietario == 0) {
			this.jugadorPropietario = jugador;
			
			
			
			TresEnRaya.getInstance().getMatrizJugadas()[this.yEnTablero][this.xEnTablero] = jugador;
			
		}
		
		TresEnRaya.getInstance().repaint();
		TresEnRaya.getInstance().revalidate();
		if(comprobarGanar(TresEnRaya.getInstance().getMatrizJugadas(), jugador)) {
			mensajeGanador(jugador);
		}
		else if(comprobarDisponibles() == false) {
			mensajeEmpate();
		}
	
			
				
			
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Cuadros [xEnTablero=" + xEnTablero + ", yEnTablero=" + yEnTablero + "]";
	}
	public int getxEnTablero() {
		return xEnTablero;
	}
	public void setxEnTablero(int xEnTablero) {
		this.xEnTablero = xEnTablero;
	}
	public int getyEnTablero() {
		return yEnTablero;
	}
	public void setyEnTablero(int yEnTablero) {
		this.yEnTablero = yEnTablero;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
