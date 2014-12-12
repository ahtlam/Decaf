package me.ahtlam.microengine;

import me.ahtlam.microengine.render.RenderTickPublisher;

public class PublisherHandler {
	public static RenderTickPublisher RENDER_TICK;
	
	public static void startup() {
		RENDER_TICK = new RenderTickPublisher();
	}
}
