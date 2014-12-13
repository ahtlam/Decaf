package me.ahtlam.microengine;

import me.ahtlam.microengine.input.PointerPressSubscriber;
import me.ahtlam.microengine.input.PointerReleaseSubscriber;

public class InternalSubscriberHandler {
	public static void startup() {
		PublisherHandler.MOUSE_PRESS.addSubscriber(new PointerPressSubscriber());
		PublisherHandler.MOUSE_RELEASE.addSubscriber(new PointerReleaseSubscriber());
	}
}
