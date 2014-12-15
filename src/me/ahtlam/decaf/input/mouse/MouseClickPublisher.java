package me.ahtlam.decaf.input.mouse;

import java.util.ArrayList;

public class MouseClickPublisher {
	private ArrayList<MouseClickSubscriber> subs = new ArrayList<MouseClickSubscriber>();
	
	// Procs an alert and gives the subscriber some information.
	public void alert(int x, int y) {
		for (MouseClickSubscriber sub : subs) {
			sub.proc(x, y);
		}
	}

	// Add a new subscriber.
	public void addSubscriber(MouseClickSubscriber sub) {
		subs.add(sub);
	}

	// Remove a subscriber.
	public void removeSubscriber(MouseClickSubscriber sub) {
		subs.remove(sub);
	}

}
