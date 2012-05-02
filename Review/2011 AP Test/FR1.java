/* 2011 AP Computer Science A FRQ
 * Question 1
 */

/* A */
public int limitAmplitude(int limit) {
	int result = 0;

	for (int i = 0; i < samples.length; i++) {
		if (samples[i] > limit) {
			samples[i] = limit;

			result++;
		} else if (samples[i] < limit - (limit * 2)) {
			samples[i] = limit - (limit * 2);

			result++;
		} else { }
	}
	
	return result;
}


/* B */
public void trimSilenceFromBeginning() {
	int i = 0;
	int numSilence = 0;
	int silence = true;
	while (silence) {
		if (samples[i] == 0) {
			silence = false;
		}

		numSilence++;
	}

	int[] result = new int[samples.length - numSilence];
	for (int i = numSilence; i < samples.length; i++) {
		result[i - numSilence] = samples[i];
	}

	samples = result;
}