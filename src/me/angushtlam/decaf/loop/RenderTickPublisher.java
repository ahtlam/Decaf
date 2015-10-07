package me.angushtlam.decaf.loop;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;

public class RenderTickPublisher {
	private ArrayList<RenderTickSubscriber> subs = new ArrayList<RenderTickSubscriber>();
	
	// Procs an alert and gives the subscriber an object variable.
	public void alert(Graphics g, BufferStrategy buffer) {
		try {
			for (RenderTickSubscriber sub : subs) {
				sub.proc(g, buffer);
			}

            if (!buffer.contentsLost()) {
            	buffer.show();
            }

            Thread.yield();
            
        } finally {
            if (g != null) {
                g.dispose();
            }
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
