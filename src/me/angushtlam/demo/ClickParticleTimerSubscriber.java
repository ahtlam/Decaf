package me.angushtlam.demo;

import java.awt.Point;
import java.util.ArrayList;

import me.angushtlam.decaf.loop.UpdateTickSubscriber;

public class ClickParticleTimerSubscriber implements UpdateTickSubscriber {
	public void proc() {
		ArrayList<Point> toRemove = new ArrayList<Point>();
		
		for (Point p : ClickFeedbackSubscriber.clicks.keySet()) {
			Long ms = ClickFeedbackSubscriber.clicks.get(p);
		
			if (ms < System.currentTimeMillis()) {
				toRemove.add(p);
				continue;
			}
		}
		
		for (Point p : toRemove) {
			ClickFeedbackSubscriber.clicks.remove(p);
		}
	}

}
