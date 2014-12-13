package me.ahtlam.microengine.input;

import java.util.ArrayList;

public class MouseEnterPublisher {
	private ArrayList<MouseEnterSubscriber> subs = new ArrayList<MouseEnterSubscriber>();
	
	// Procs an alert and gives the subscriber some information.
	public void alert(int x, int y) {
		for (MouseEnterSubscriber sub : subs) {
			sub.proc(x, y);
		}
	}

	// Add a new subscriber.
	public void addSubscriber(MouseEnterSubscriber sub) {
		subs.add(sub);
	}

	// Remove a subscriber.
	public void removeSubscriber(MouseEnterSubscriber sub) {
		subs.remove(sub);
	}

}
