package me.ahtlam.decaf;

import me.ahtlam.decaf.input.key.KeyPressPublisher;
import me.ahtlam.decaf.input.key.KeyReleasePublisher;
import me.ahtlam.decaf.input.mouse.MouseClickPublisher;
import me.ahtlam.decaf.input.mouse.MouseEnterPublisher;
import me.ahtlam.decaf.input.mouse.MouseExitPublisher;
import me.ahtlam.decaf.input.mouse.MousePressPublisher;
import me.ahtlam.decaf.input.mouse.MouseReleasePublisher;
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
	
	public static KeyPressPublisher KEY_PRESS;
	public static KeyReleasePublisher KEY_RELEASE;
	
	public static void startup() {
		UPDATE_TICK = new UpdateTickPublisher();
		RENDER_TICK = new RenderTickPublisher();
		
		MOUSE_CLICK = new MouseClickPublisher();
		MOUSE_ENTER = new MouseEnterPublisher();
		MOUSE_EXIT = new MouseExitPublisher();
		MOUSE_PRESS = new MousePressPublisher();
		MOUSE_RELEASE = new MouseReleasePublisher();
		
		KEY_PRESS = new KeyPressPublisher();
		KEY_RELEASE = new KeyReleasePublisher();
	}
}
