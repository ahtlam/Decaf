package me.ahtlam.microengine.input;

public class PointerPressSubscriber implements MousePressSubscriber {
	// Changes the boolean of Pointer's isPressed variable.
	public void proc(int x, int y) {
		Pointer.isPressed = true;
	}
}
