package me.angushtlam.decaf;

import me.angushtlam.decaf.input.key.KeyPressPublisher;
import me.angushtlam.decaf.input.key.KeyReleasePublisher;
import me.angushtlam.decaf.input.mouse.MouseClickPublisher;
import me.angushtlam.decaf.input.mouse.MouseEnterPublisher;
import me.angushtlam.decaf.input.mouse.MouseExitPublisher;
import me.angushtlam.decaf.input.mouse.MousePressPublisher;
import me.angushtlam.decaf.input.mouse.MouseReleasePublisher;
import me.angushtlam.decaf.loop.RenderTickPublisher;
import me.angushtlam.decaf.loop.UpdateTickPublisher;

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
