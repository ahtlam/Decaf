package me.ahtlam.decaf.input.mouse;

// Implement this class and add that to MousePressPublisher's subs list to get procs.
public interface MousePressSubscriber {
	public void proc(int x, int y);
}
