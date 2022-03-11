package racingcar;

import static camp.nextstep.edu.missionutils.Randoms.*;

public class RandomNumber {

	public static final int RANGE_START = 0;
	public static final int RANGE_END = 9;

	public static int makeRandomNumber() {
		return pickNumberInRange(RANGE_START, RANGE_END);
	}

}
