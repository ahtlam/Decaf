package me.ahtlam.microengine.loop;

import java.util.ArrayList;

public class UpdateTickPublisher {
	private ArrayList<UpdateTickSubscriber> subs = new ArrayList<UpdateTickSubscriber>();
	
	// Procs an alert
	public void alert() {
		for (UpdateTickSubscriber sub : subs) {
			sub.proc();
		}
	}

	// Add a new subscriber.
	public void addSubscriber(UpdateTickSubscriber sub) {
		subs.add(sub);
	}

	// Remove a subscriber.
	public void removeSubscriber(UpdateTickSubscriber sub) {
		subs.remove(sub);
	}

}
