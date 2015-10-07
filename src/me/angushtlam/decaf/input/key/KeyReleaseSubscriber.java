package me.angushtlam.decaf.input.key;

// Implement this class and add that to KeyReleasePublisher's subs list to get procs.
public interface KeyReleaseSubscriber {
	public void proc(String keyText);
}
