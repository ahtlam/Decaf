package me.angushtlam.decaf;

import me.angushtlam.decaf.input.KeyManagerPressSubscriber;
import me.angushtlam.decaf.input.KeyManagerReleaseSubscriber;
import me.angushtlam.decaf.input.PointerPressSubscriber;
import me.angushtlam.decaf.input.PointerReleaseSubscriber;

public class InternalSubscriberHandler {
	public static void startup() {
		PublisherHandler.MOUSE_PRESS.addSubscriber(new PointerPressSubscriber());
		PublisherHandler.MOUSE_RELEASE.addSubscriber(new PointerReleaseSubscriber());
		
		PublisherHandler.KEY_PRESS.addSubscriber(new KeyManagerPressSubscriber());
		PublisherHandler.KEY_RELEASE.addSubscriber(new KeyManagerReleaseSubscriber());
	}
}
