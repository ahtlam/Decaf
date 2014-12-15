package me.ahtlam.demo;

import java.awt.Point;
import java.util.HashMap;
import java.util.Random;

import me.ahtlam.decaf.input.key.KeyPressSubscriber;
import me.ahtlam.decaf.render.StringPoint;

public class DrawingKeyPressSubscriber implements KeyPressSubscriber {
	public static HashMap<StringPoint, Long> keys = new HashMap<StringPoint, Long>();
	
	public void proc(String keyText) {
		StringPoint p = new StringPoint(keyText, new Point(new Random().nextInt(Demo.engine.getWidth()), new Random().nextInt(Demo.engine.getHeight())));

		keys.put(p, System.currentTimeMillis() + (new Random().nextInt(10000) + 250));
	}

}
