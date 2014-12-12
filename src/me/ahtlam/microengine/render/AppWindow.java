package me.ahtlam.microengine.render;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public class AppWindow {
	// Important parts of displaying a window.
	private JFrame frame;
	private Canvas canvas;
	
	// Graphics are drew onto the BufferStrategy
	private BufferStrategy buffer;
	
	private String title;
	private int width, height;
	
	public AppWindow(String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;
		
		init();
	}
	
	private void init() {
		frame = new JFrame(title);
		frame.setPreferredSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));
		frame.setResizable(false);

		frame.setIgnoreRepaint(true); // Allows the program to handle the repaints.
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Stops program on close.
		frame.setLocationRelativeTo(null); // Window opens in center of screen.
		
		frame.setVisible(true); // Show display.
		
		canvas = new Canvas();
		
		frame.add(canvas);
		frame.pack(); // Required to show canvas in the frame.
		
		canvas.createBufferStrategy(2); // Java's internal double buffering (or page flipping)
		buffer = canvas.getBufferStrategy();
	}
	
	public BufferStrategy getBuffer() {
        return this.buffer;
    }
    
    public Graphics getGraphics() {
        return this.buffer.getDrawGraphics();
    }
    
}
