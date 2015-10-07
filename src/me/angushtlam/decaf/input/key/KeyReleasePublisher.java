package me.angushtlam.decaf.input.key;

import java.util.ArrayList;

public class KeyReleasePublisher {
	private ArrayList<KeyReleaseSubscriber> subs = new ArrayList<KeyReleaseSubscriber>();
	
	// Procs an alert and gives the subscriber some information.
	public void alert(String keyText) {
		for (KeyReleaseSubscriber sub : subs) {
			sub.proc(keyText);
		}
	}

	// Add a new subscriber.
	public void addSubscriber(KeyReleaseSubscriber sub) {
		subs.add(sub);
	}

	// Remove a subscriber.
	public void removeSubscriber(KeyReleaseSubscriber sub) {
		subs.remove(sub);
	}

}
