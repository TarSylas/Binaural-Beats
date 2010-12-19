package com.ihunda.android.binauralbeat;

import com.ihunda.android.binauralbeat.viz.HypnoticSpiral;
import com.ihunda.android.binauralbeat.viz.Leds;
import com.ihunda.android.binauralbeat.viz.Mandelbrot;
import com.ihunda.android.binauralbeat.viz.SpiralDots;

public class DefaultProgramsBuilder {
	public static Program SELF_HYPNOSIS() {
		Program p  = new Program("Self Hypnosis");
		
		p.addPeriod(new Period(120, SoundLoop.OCEAN_WAVES, SoundLoop.RIVER, null, 0f).
				addVoice(new BinauralBeatVoice(12f, 4f, 1f)).
				setV(new SpiralDots())
		).
		addPeriod(new Period(600, SoundLoop.OCEAN_WAVES, SoundLoop.RIVER, null, 0f).
				addVoice(new BinauralBeatVoice(4f, 4f, 0.9f)).
				setV(new SpiralDots())
		).
		addPeriod(new Period(120, SoundLoop.OCEAN_WAVES, SoundLoop.RIVER, null, 0f).
				addVoice(new BinauralBeatVoice(4f, 12f, 0.9f)).
				setV(new SpiralDots())
		);
		
		return p;
	}
}