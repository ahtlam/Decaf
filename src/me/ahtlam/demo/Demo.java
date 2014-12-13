package me.ahtlam.demo;

import me.ahtlam.microengine.Microengine;
import me.ahtlam.microengine.PublisherHandler;

public class Demo extends Microengine {
	public static void main(String[] args) {
		new Demo().start();
		
		// PublisherHandler.RENDER_TICK.addSubscriber(new SeizureInducingSubscriber());
		PublisherHandler.RENDER_TICK.addSubscriber(new ClickParticleRenderSubscriber());
		PublisherHandler.UPDATE_TICK.addSubscriber(new ClickParticleTimerSubscriber());
		PublisherHandler.MOUSE_CLICK.addSubscriber(new ClickFeedbackSubscriber());
	}
	
	public Demo() {
		super("Demo", 1280, 720);
	}

}
