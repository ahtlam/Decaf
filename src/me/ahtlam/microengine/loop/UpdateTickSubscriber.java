package me.ahtlam.microengine.loop;

// Implement this class and add that to ProcessTickPublisher's subs list to get procs.
public interface UpdateTickSubscriber {
	public void proc();
}
