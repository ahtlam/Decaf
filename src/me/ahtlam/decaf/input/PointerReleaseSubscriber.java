package me.ahtlam.decaf.input;

import me.ahtlam.decaf.input.mouse.MouseReleaseSubscriber;

public class PointerReleaseSubscriber implements MouseReleaseSubscriber {
	// Changes the boolean of Pointer's isPressed variable.
	public void proc(int x, int y) {
		Pointer.isPressed = false;
	}
}
