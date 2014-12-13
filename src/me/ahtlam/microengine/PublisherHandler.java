package me.ahtlam.microengine;

import me.ahtlam.microengine.input.MouseClickPublisher;
import me.ahtlam.microengine.input.MouseEnterPublisher;
import me.ahtlam.microengine.input.MouseExitPublisher;
import me.ahtlam.microengine.input.MousePressPublisher;
import me.ahtlam.microengine.input.MouseReleasePublisher;
import me.ahtlam.microengine.loop.UpdateTickPublisher;
import me.ahtlam.microengine.loop.RenderTickPublisher;

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
