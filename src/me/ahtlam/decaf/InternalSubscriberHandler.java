package me.ahtlam.decaf;

import me.ahtlam.decaf.input.KeyManagerPressSubscriber;
import me.ahtlam.decaf.input.KeyManagerReleaseSubscriber;
import me.ahtlam.decaf.input.PointerPressSubscriber;
import me.ahtlam.decaf.input.PointerReleaseSubscriber;

public class InternalSubscriberHandler {
	public static void startup() {
		PublisherHandler.MOUSE_PRESS.addSubscriber(new PointerPressSubscriber());
		PublisherHandler.MOUSE_RELEASE.addSubscriber(new PointerReleaseSubscriber());
		
		PublisherHandler.KEY_PRESS.addSubscriber(new KeyManagerPressSubscriber());
		PublisherHandler.KEY_RELEASE.addSubscriber(new KeyManagerReleaseSubscriber());
	}
}
