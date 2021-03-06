package me.angushtlam.demo;

import me.angushtlam.decaf.Decaf;
import me.angushtlam.decaf.PublisherHandler;

public class Demo extends Decaf {
	public static void main(String[] args) {
		new Demo().start();
		
		PublisherHandler.RENDER_TICK.addSubscriber(new DemoRenderSubscriber());
		PublisherHandler.UPDATE_TICK.addSubscriber(new ClickParticleTimerSubscriber());
		PublisherHandler.MOUSE_CLICK.addSubscriber(new ClickFeedbackSubscriber());
		PublisherHandler.KEY_PRESS.addSubscriber(new DrawingKeyPressSubscriber());
	}
	
	public Demo() {
		super("Demo", 1280, 720);
	}

}
