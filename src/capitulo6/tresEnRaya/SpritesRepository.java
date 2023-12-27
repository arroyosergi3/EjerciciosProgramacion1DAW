package capitulo6.tresEnRaya;

import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.net.URL;
import java.util.HashMap;

import javax.imageio.ImageIO;

public class SpritesRepository {

	private HashMap<String, BufferedImage> sprites = new HashMap<String, BufferedImage>();
	
	private static SpritesRepository instance = null;
	
	private String RESOURCES_FOLDER = "resources/images/";
	private static String IMG_J_1 = "FiguraTino.png";
	private static String IMG_J_2 = "FiguraQuiniones.png";

	public SpritesRepository() {
		this.getSprite(IMG_J_1);
		this.getSprite(IMG_J_2);
	}


	public static SpritesRepository getInstance() {
		if(instance == null) {
			instance = new SpritesRepository();
		}
		return instance;
	}

	private BufferedImage loadImage (String resourceName) {
		URL url= null;
		try {
			url = getClass().getResource(resourceName);
			return ImageIO.read(url);
		} catch (Exception e) {
			System.out.println("No se puedo cargar la imagen " + resourceName + " de " + url);
			System.out.println("El error fue: " + e.getClass().getName()+ " " + e.getMessage());
			System.exit(0);
		}
		return null;
	}
	
	public BufferedImage getSprite(String resourceName) {
		BufferedImage img = sprites.get(resourceName);
		if(img == null) {
			img = loadImage(RESOURCES_FOLDER + resourceName);
			sprites.put(resourceName, img);
			
		}
		return img;
	}


}
