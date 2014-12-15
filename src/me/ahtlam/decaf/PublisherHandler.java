package me.ahtlam.decaf;

import me.ahtlam.decaf.input.MouseClickPublisher;
import me.ahtlam.decaf.input.MouseEnterPublisher;
import me.ahtlam.decaf.input.MouseExitPublisher;
import me.ahtlam.decaf.input.MousePressPublisher;
import me.ahtlam.decaf.input.MouseReleasePublisher;
import me.ahtlam.decaf.loop.RenderTickPublisher;
import me.ahtlam.decaf.loop.UpdateTickPublisher;

public class PublisherHandler {
	public static UpdateTickPublisher UPDATE_TICK;
	public static RenderTickPublisher RENDER_TICK;

	public static MouseClickPublisher MOUSE_CLICK;
	public static MouseEnterPublisher MOUSE_ENTER;
	public static MouseExitPublisher MOUSE_EXIT;
	public static MousePressPublisher MOUSE_PRESS;
	public static MouseReleasePublisher MOUSE_RELEASE;
	
	public static void startup() {
		UPDATE_TICK = new UpdateTickPublisher();
		RENDER_TICK = new RenderTickPublisher();
		
		MOUSE_CLICK = new MouseClickPublisher();
		MOUSE_ENTER = new MouseEnterPublisher();
		MOUSE_EXIT = new MouseExitPublisher();
		MOUSE_PRESS = new MousePressPublisher();
		MOUSE_RELEASE = new MouseReleasePublisher();
	}
}
