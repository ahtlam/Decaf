package me.ahtlam.decaf.input;

import me.ahtlam.decaf.input.key.KeyPressSubscriber;

public class KeyManagerPressSubscriber implements KeyPressSubscriber {
	public void proc(String keyText) {
		KeyManager.setHeld(keyText);
	}
}
