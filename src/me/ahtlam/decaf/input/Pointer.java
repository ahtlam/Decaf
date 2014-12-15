package me.ahtlam.decaf.input;

public class Pointer {
	public static int x = 0, y = 0;
	public static boolean isPressed = false;
	public static boolean isOffScreen = false;

	public static int getX() {
		return x;
	}

	public static void setX(int val) {
		x = val;
	}

	public static int getY() {
		return y;
	}

	public static void setY(int val) {
		y = val;
	}

	public static boolean isPressed() {
		return isPressed;
	}

	public static void setPressed(boolean bool) {
		isPressed = bool;
	}
	
	public static boolean isOffScreen() {
		return isOffScreen;
	}

	public static void setOffScreen(boolean bool) {
		isOffScreen = bool;
	}
	
}
