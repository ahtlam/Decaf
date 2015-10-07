package me.angushtlam.decaf.input.mouse;

import java.util.ArrayList;

public class MouseExitPublisher {
	private ArrayList<MouseExitSubscriber> subs = new ArrayList<MouseExitSubscriber>();
	
	// Procs an alert and gives the subscriber some information.
	public void alert(int x, int y) {
		for (MouseExitSubscriber sub : subs) {
			sub.proc(x, y);
		}
	}

	// Add a new subscriber.
	public void addSubscriber(MouseExitSubscriber sub) {
		subs.add(sub);
	}

	// Remove a subscriber.
	public void removeSubscriber(MouseExitSubscriber sub) {
		subs.remove(sub);
	}

}
