package me.ahtlam.demo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.Random;

import me.ahtlam.microengine.render.RenderTickSubscriber;

public class SeizureInducingSubscriber implements RenderTickSubscriber {
	public void proc(Graphics g, BufferStrategy buffer) {
		try {
        	g.setColor(Color.BLACK); // Black should never be rendered.
            g.fillRect(0, 0, Demo.engine.getWidth(), Demo.engine.getHeight());
        	
            g.setColor(Color.getHSBColor(new Random().nextFloat(), 1.0F, 1.0F)); // Pick a random color.
            g.fillRect(0, 0, Demo.engine.getWidth(), Demo.engine.getHeight());
            
            g.setColor(Color.getHSBColor(new Random().nextFloat(), 0.5F, 1.0F)); // Pick a random color.
            g.drawString(Demo.engine.FPS + " fps, " + Demo.engine.UPS + " ups", 10, 20);

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

}
