package capitulo6.tresEnRaya;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import java.util.HashMap;

public class SoundRepository {

	
	
	
	
	private HashMap<String, AudioClip> sounds = new HashMap<String, AudioClip>();

	private static SoundRepository instance = null;
	
	private static String RESOURCES_FOLDER ="resources/sounds/";
	
	public static String MUSICA_DE_FONDO = "fondo.wav";
	public static String EFECTO_J_1 = "ole.wav";
	public static String EFECTO_J_2 = "infantiOE.wav";
	public SoundRepository() {
		this.getAudioClip(MUSICA_DE_FONDO);
		this.getAudioClip(EFECTO_J_1);
		this.getAudioClip(EFECTO_J_2);

	}
	
	public static SoundRepository getInstance() {
		if (instance == null) {
			instance = new SoundRepository();
		}
		return instance;
	}
	
	
	private AudioClip loadResource(String name) {
		URL url=null;
		url = getClass().getResource(name);
		return Applet.newAudioClip(url);
	}
	
	private AudioClip getAudioClip(String resourceName) {
		AudioClip clip = sounds.get(resourceName);
		if(clip == null) {
			clip = loadResource(RESOURCES_FOLDER+resourceName);
			sounds.put(resourceName, clip);
		}
		return clip;
	}
	
	public void playSound(final String name) {
		getAudioClip(name).play();
	}
	
	public void loopSound(final String name) {
		getAudioClip(name).loop();
	}








}
