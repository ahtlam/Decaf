package me.angushtlam.decaf.input.mouse;

import java.util.ArrayList;

public class MousePressPublisher {
	private ArrayList<MousePressSubscriber> subs = new ArrayList<MousePressSubscriber>();
	
	// Procs an alert and gives the subscriber some information.
	public void alert(int x, int y) {
		for (MousePressSubscriber sub : subs) {
			sub.proc(x, y);
		}
	}

	// Add a new subscriber.
	public void addSubscriber(MousePressSubscriber sub) {
		subs.add(sub);
	}

	// Remove a subscriber.
	public void removeSubscriber(MousePressSubscriber sub) {
		subs.remove(sub);
	}

}
