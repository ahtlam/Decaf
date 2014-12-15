package me.ahtlam.demo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.Random;

import me.ahtlam.decaf.input.Pointer;
import me.ahtlam.decaf.loop.RenderTickSubscriber;

public class SeizureInducingSubscriber implements RenderTickSubscriber {
	public void proc(Graphics g, BufferStrategy buffer) {
		g.setColor(Color.BLACK); // Black should never be rendered.
		g.fillRect(0, 0, Demo.engine.getWidth(), Demo.engine.getHeight());

		// Seizure warning.
		g.setColor(Color.getHSBColor(new Random().nextFloat(), 0.1F, 1.0F)); // Pick a random color.
		g.fillRect(0, 0, Demo.engine.getWidth(), Demo.engine.getHeight());

		g.setColor(Color.BLACK);
		g.drawString(Demo.engine.FPS + " fps, " + Demo.engine.UPS + " ups", 10, 20);
		g.drawString("Mouse coordinates: "+ Pointer.getX() + ", " + Pointer.getY(), 10, 40);
		g.drawString("Mouse off screen: " + (Pointer.isOffScreen ? "Yes" : "No"), 10, 60);

	}

}
