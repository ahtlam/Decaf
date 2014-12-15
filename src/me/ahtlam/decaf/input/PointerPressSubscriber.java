package me.ahtlam.decaf.input;

import me.ahtlam.decaf.input.mouse.MousePressSubscriber;

public class PointerPressSubscriber implements MousePressSubscriber {
	// Changes the boolean of Pointer's isPressed variable.
	public void proc(int x, int y) {
		Pointer.isPressed = true;
	}
}
