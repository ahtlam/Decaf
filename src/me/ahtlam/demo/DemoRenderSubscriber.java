package me.ahtlam.demo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferStrategy;
import java.util.Random;

import me.ahtlam.decaf.input.Pointer;
import me.ahtlam.decaf.loop.RenderTickSubscriber;
import me.ahtlam.decaf.render.StringPoint;

public class DemoRenderSubscriber implements RenderTickSubscriber {
	public void proc(Graphics g, BufferStrategy buffer) {
		g.setColor(Color.BLACK); // Background color
		g.fillRect(0, 0, Demo.engine.getWidth(), Demo.engine.getHeight());
		
		// Seizure warning.
		g.setColor(Color.getHSBColor(new Random().nextFloat(), 0.1F, 0.1F)); // Pick a random color.
		g.fillRect(0, 0, Demo.engine.getWidth(), Demo.engine.getHeight());
		
		g.setColor(Color.WHITE);
		g.drawString(Demo.engine.FPS + " fps, " + Demo.engine.UPS + " ups", 10, 20);
		g.drawString("Mouse coordinates: "+ Pointer.getX() + ", " + Pointer.getY(), 10, 40);
		g.drawString("Mouse off screen: " + (Pointer.isOffScreen ? "Yes" : "No"), 10, 60);
		
		// This is also pretty obnoxious looking, so refrain from staring at it for too long.
		for (Point p : ClickFeedbackSubscriber.clicks.keySet()) {
			int multi = new Random().nextInt(5) + 1;
			g.drawOval(p.x - 20 * multi, (int) p.y - 20 * multi, 40 * multi, 40 * multi);
			g.drawOval(p.x - 15 * multi, (int) p.y - 15 * multi, 30 * multi, 30 * multi);
			g.drawOval(p.x - 10 * multi, (int) p.y - 10 * multi, 20 * multi, 20 * multi);
			
		}
		
		// This is also pretty obnoxious looking, so refrain from staring at it for too long.
		for (StringPoint sp : DrawingKeyPressSubscriber.keys.keySet()) {
			Point p = sp.getPoint();
			
			g.drawString(sp.getString(), p.x, p.y);
		}

	}

}
