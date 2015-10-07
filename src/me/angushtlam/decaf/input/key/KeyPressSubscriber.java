package me.angushtlam.decaf.input.key;

// Implement this class and add that to RenderTickPublisher's subs list to get procs.
public interface KeyPressSubscriber {
	public void proc(String keyText);
}
