package me.angushtlam.decaf.input;

import me.angushtlam.decaf.input.key.KeyReleaseSubscriber;

public class KeyManagerReleaseSubscriber implements KeyReleaseSubscriber {
	public void proc(String keyText) {
		KeyManager.setHeld(keyText, false);
	}
}
