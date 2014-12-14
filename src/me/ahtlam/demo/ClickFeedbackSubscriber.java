package me.ahtlam.demo;

import java.awt.Point;
import java.util.HashMap;
import java.util.Random;

import me.ahtlam.microengine.audio.AudioWrapper;
import me.ahtlam.microengine.input.MouseClickSubscriber;

public class ClickFeedbackSubscriber implements MouseClickSubscriber {
	public static HashMap<Point, Long> clicks = new HashMap<Point, Long>();
	
	public void proc(int x, int y) {
		Point p = new Point();
		p.setLocation(x, y);
		
		clicks.put(p, System.currentTimeMillis() + (new Random().nextInt(10000) + 250));
		AudioWrapper.playWavFromStream("ding", Demo.class.getResourceAsStream("/ding.wav"));
		
	}

}
