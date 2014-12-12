package me.ahtlam.microengine.render;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;

public class RenderTickPublisher {
	private ArrayList<RenderTickSubscriber> subs = new ArrayList<RenderTickSubscriber>();
	
	// Procs an alert and gives the subscriber an object variable.
	public void alert(Graphics g, BufferStrategy buffer) {
		for (RenderTickSubscriber sub : subs) {
			sub.proc(g, buffer);
		}
	}

	// Add a new subscriber.
	public void addSubscriber(RenderTickSubscriber sub) {
		subs.add(sub);
	}

	// Remove a subscriber.
	public void removeSubscriber(RenderTickSubscriber sub) {
		subs.remove(sub);
	}

}
