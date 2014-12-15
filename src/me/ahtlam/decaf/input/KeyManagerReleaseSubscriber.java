package me.ahtlam.decaf.input;

import me.ahtlam.decaf.input.key.KeyReleaseSubscriber;

public class KeyManagerReleaseSubscriber implements KeyReleaseSubscriber {
	public void proc(String keyText) {
		KeyManager.setHeld(keyText, false);
	}
}
