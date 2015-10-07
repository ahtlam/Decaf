package me.angushtlam.decaf.input.mouse;

import java.util.ArrayList;

public class MouseReleasePublisher {
	private ArrayList<MouseReleaseSubscriber> subs = new ArrayList<MouseReleaseSubscriber>();
	
	// Procs an alert and gives the subscriber some information.
	public void alert(int x, int y) {
		for (MouseReleaseSubscriber sub : subs) {
			sub.proc(x, y);
		}
	}

	// Add a new subscriber.
	public void addSubscriber(MouseReleaseSubscriber sub) {
		subs.add(sub);
	}

	// Remove a subscriber.
	public void removeSubscriber(MouseReleaseSubscriber sub) {
		subs.remove(sub);
	}

}
