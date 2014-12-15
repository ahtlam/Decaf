package me.ahtlam.decaf.loop;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

// Implement this class and add that to RenderTickPublisher's subs list to get procs.
public interface RenderTickSubscriber {
	public void proc(Graphics g, BufferStrategy buffer);
}
