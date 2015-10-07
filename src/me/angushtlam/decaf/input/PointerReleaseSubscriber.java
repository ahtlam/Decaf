package me.angushtlam.decaf.input;

import me.angushtlam.decaf.input.mouse.MouseReleaseSubscriber;

public class PointerReleaseSubscriber implements MouseReleaseSubscriber {
	// Changes the boolean of Pointer's isPressed variable.
	public void proc(int x, int y) {
		Pointer.isPressed = false;
	}
}
