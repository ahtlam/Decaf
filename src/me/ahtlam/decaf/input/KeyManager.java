package me.ahtlam.decaf.input;

import java.util.ArrayList;

public class KeyManager {
	private static ArrayList<String> held = new ArrayList<String>();
	
	public static boolean isHeld(String keyText) {
		if (held.contains(keyText)) {
			return true;
		}
		
		return false;
	}
	
	public static void setHeld(String keyText) {
		held.add(keyText);
	}
	
	public static void setHeld(String keyText, boolean add) {
		if (add) {
			held.add(keyText);
			return;
			
		}
		
		held.remove(keyText);
	}
	
	public static void clearHeld() {
		held.clear();
	}
}
