package me.angushtlam.decaf.input.key;

import java.util.ArrayList;

public class KeyPressPublisher {
	private ArrayList<KeyPressSubscriber> subs = new ArrayList<KeyPressSubscriber>();
	
	// Procs an alert and gives the subscriber some information.
	public void alert(String keyText) {
		for (KeyPressSubscriber sub : subs) {
			sub.proc(keyText);
		}
	}

	// Add a new subscriber.
	public void addSubscriber(KeyPressSubscriber sub) {
		subs.add(sub);
	}

	// Remove a subscriber.
	public void removeSubscriber(KeyPressSubscriber sub) {
		subs.remove(sub);
	}

}
