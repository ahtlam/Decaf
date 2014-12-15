package me.ahtlam.decaf;

import me.ahtlam.decaf.input.PointerPressSubscriber;
import me.ahtlam.decaf.input.PointerReleaseSubscriber;

public class InternalSubscriberHandler {
	public static void startup() {
		PublisherHandler.MOUSE_PRESS.addSubscriber(new PointerPressSubscriber());
		PublisherHandler.MOUSE_RELEASE.addSubscriber(new PointerReleaseSubscriber());
	}
}
