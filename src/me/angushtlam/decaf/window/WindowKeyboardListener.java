package me.angushtlam.decaf.window;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import me.angushtlam.decaf.PublisherHandler;

public class WindowKeyboardListener implements KeyListener {

	public void keyPressed(KeyEvent evt) {
		String keyText = KeyEvent.getKeyText(evt.getKeyCode());
		PublisherHandler.KEY_PRESS.alert(keyText);
	}

	public void keyReleased(KeyEvent evt) {
		String keyText = KeyEvent.getKeyText(evt.getKeyCode());
		PublisherHandler.KEY_PRESS.alert(keyText);
	}

	public void keyTyped(KeyEvent evt) {
		
	}

}
