package me.ahtlam.microengine.input;

// Implement this class and add that to RenderTickPublisher's subs list to get procs.
public interface MouseClickSubscriber {
	public void proc(int x, int y);
}
