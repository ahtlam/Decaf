package me.angushtlam.decaf.input;

import me.angushtlam.decaf.input.key.KeyPressSubscriber;

public class KeyManagerPressSubscriber implements KeyPressSubscriber {
	public void proc(String keyText) {
		KeyManager.setHeld(keyText);
	}
}
