package racingcar.check;

public class NumberChecking {

	public static final int FORWARD_STANDARD = 4;

	public static boolean isJudgeForward(int randomNumber) {
		if (randomNumber >= FORWARD_STANDARD) {
			return true;
		}
		return false;
	}
}