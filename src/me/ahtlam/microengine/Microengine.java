package me.ahtlam.microengine;

import me.ahtlam.microengine.render.AppWindow;

public abstract class Microengine implements Runnable {
	public static Microengine engine;
	private boolean isRunning; // Used to determine if the game is currently running.
	
	// These are final variables so we don't have to worry about any other ups/fps for now. We can eventually get it working.
	public static final double FPS_TARGET = 60D; // Amount of frame rendering each second.
	public static final double OPTIMAL_FPS_TIME = 1000000000 / FPS_TARGET; // Determines how many ns are in between frame rendering.
	
	public int UPS = 0;
	public int FPS = 0;
	
	private String title;
	private int width, height;
	private AppWindow window;
	
	// Sets the window's name, width, and height on creation of this object.
	public Microengine(String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;
	}
	
	// Ran when the program starts.
	public synchronized void start() {
		// Store this class to allow other classes to access it's dynamic functions and variables.
		engine = this;
		
		// Create new publisher objects through the PublisherHandler class.
		PublisherHandler.startup();
		
		// Create a new window for the program.
		window = new AppWindow(title, width, height);

		// Set this to running.
		isRunning = true;
		
		// Creates a new Thread that runs the run() function in this file.
		new Thread(Microengine.this).start();
	}

	// Ran when the program stops (hopefully ran after a crash).
	public synchronized void stop() {
		isRunning = false;
	}
	
	// This function is ran when this class is started as a Thread
	public void run() {
		long prevTime = System.nanoTime();
		long clockCounter = System.currentTimeMillis(); // Used to check what the application's FPS and UPS is.
		
		long lag = 0; // Determine how many ns we're behind and apply additional updating if needed.
		
		int updates = 0, frames = 0;
		
		while (isRunning) { // Running loop.
			long currTime = System.nanoTime(); // Find the new time in this new loop.
			long elapsed = currTime - prevTime; // Find the amount of ns passed since the last check.
			
			prevTime = currTime; // Switch the old time with the current time for the next loop.
			lag += elapsed;
			
			process();
			
			// This updates the game accordingly if the system is falling behind the clock, and applies the needed updates.
			// This shouldn't be a problem in smaller games.
			while (lag >= OPTIMAL_FPS_TIME) {
				update();
				lag -= OPTIMAL_FPS_TIME;
				updates++;
			}
			
			render();
			frames++;
			
			// Updates the class's UPS and FPS internal timer.
			long clockNow = System.currentTimeMillis();
			if (clockNow >= clockCounter + 1000) { // Checks if a second has passed.
				clockCounter = clockNow;
				
				FPS = frames;
				UPS = updates;
				
				frames = 0;
				updates = 0;
			}
			
			// Prevent the program from running too fast.
			try {
				Thread.sleep(Math.max(0, (long) ((System.nanoTime() - prevTime + OPTIMAL_FPS_TIME) / 1000000)));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		
	}

	// This function should not be overwritten by any subclasses, as they handle all of the events that are called. 
	// This function fires custom input events that the program should use to detect new inputs.
	private final void process() {
		
	}

	// This function should not be overwritten by any subclasses, as they handle all of the events that are called, and the program should use events to detect information.
	private final void update() {
		
	}

	// This function should not be overwritten by any subclasses, as they handle all of the events that are called.
	private final void render() {
		PublisherHandler.RENDER_TICK.alert(this.window.getGraphics(), this.window.getBuffer());
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
}
