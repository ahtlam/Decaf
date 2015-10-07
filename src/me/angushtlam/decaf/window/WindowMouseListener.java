package me.angushtlam.decaf.window;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import me.angushtlam.decaf.PublisherHandler;

public class WindowMouseListener implements MouseListener {
	public void mouseClicked(MouseEvent evt) {
		int x = evt.getX();
		int y = evt.getY();
		
		PublisherHandler.MOUSE_CLICK.alert(x, y);
	}

	public void mouseEntered(MouseEvent evt) {
		int x = evt.getX();
		int y = evt.getY();
		
		PublisherHandler.MOUSE_ENTER.alert(x, y);
	}

	public void mouseExited(MouseEvent evt) {
		int x = evt.getX();
		int y = evt.getY();
		
		PublisherHandler.MOUSE_EXIT.alert(x, y);
	}

	public void mousePressed(MouseEvent evt) {
		int x = evt.getX();
		int y = evt.getY();
		
		PublisherHandler.MOUSE_PRESS.alert(x, y);
	}

	public void mouseReleased(MouseEvent evt) {
		int x = evt.getX();
		int y = evt.getY();
		
		PublisherHandler.MOUSE_RELEASE.alert(x, y);
	}


}
