package me.ahtlam.decaf.audio;

import java.io.InputStream;
import java.util.HashMap;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import me.ahtlam.decaf.Decaf;

// TODO: A more in-depth sound handler. This sucks.
public class AudioHandler {
	public static HashMap<String, Clip> clips = new HashMap<String, Clip>();

	/**
	 * Load a wav file from a stream
	 * @param id A unique internal reference id to be used to identify the clip object.
	 * @param is The input stream of the file you want to play
	 * @return boolean indicating if the sound can be played.
	 */
	public static boolean loadWavFromStream(String id, InputStream is) {
		try {
			if (clips.containsKey(id)) {
				return false;
			}
			
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(is);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clips.put(id, clip);
			return true;

		} catch(Exception ex) {
			ex.printStackTrace();
			return false;

		}
	}
	
	/**
	 * Loads and plays a wav file from a stream.
	 * @param id A unique internal reference id to be used to identify the clip object.
	 * @param is The input stream of the file you want to play
	 * @return boolean indicating if the sound can be played.
	 */
	public static boolean playWavFromStream(String id, InputStream is) {
		if (loadWavFromStream(id, is)) {
			clips.get(id).start();
			return true;
		}
		
		return false;
	}
	
	/**
	 * Loads a wav file from resource
	 * @param filename the path to the wav file to be loaded.
	 * @return boolean indicating if the sound can be played.
	 */
	public static boolean loadWavFromResource(String filename) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(Decaf.class.getResourceAsStream(filename));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clips.put(filename, clip);
			return true;

		} catch(Exception ex) {
			ex.printStackTrace();
			return false;

		}
	}
	
	/**
	 * Loads and plays a wav file from resource.
	 * @param filename the path to the wav file to be loaded.
	 * @return boolean indicating if the sound can be played.
	 */
	public static boolean playWavFromResource(String filename) {
		if (loadWavFromResource(filename)) {
			Clip clip = clips.get(filename);
			clip.start();
			return true;
		}
		
		return false;
	}

}
