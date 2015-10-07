package me.angushtlam.decaf.input.mouse;

// Implement this class and add that to MouseEnterPublisher's subs list to get procs.
public interface MouseEnterSubscriber {
	public void proc(int x, int y);
}
