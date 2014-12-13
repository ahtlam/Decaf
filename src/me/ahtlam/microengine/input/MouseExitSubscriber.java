package me.ahtlam.microengine.input;

// Implement this class and add that to MouseExitPublisher's subs list to get procs.
public interface MouseExitSubscriber {
	public void proc(int x, int y);
}
