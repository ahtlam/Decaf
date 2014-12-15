package me.ahtlam.decaf.input.mouse;

// Implement this class and add that to MousePublisher's subs list to get procs.
public interface MouseReleaseSubscriber {
	public void proc(int x, int y);
}
