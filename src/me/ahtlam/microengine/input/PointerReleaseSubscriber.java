package me.ahtlam.microengine.input;

public class PointerReleaseSubscriber implements MouseReleaseSubscriber {
	// Changes the boolean of Pointer's isPressed variable.
	public void proc(int x, int y) {
		Pointer.isPressed = false;
	}
}
