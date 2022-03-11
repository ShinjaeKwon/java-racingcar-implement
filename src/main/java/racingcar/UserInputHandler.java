package racingcar;

import static camp.nextstep.edu.missionutils.Console.*;

import java.util.StringTokenizer;

public class UserInputHandler {

	public static String Input() {
		return readLine();
	}

	public static int inputOfAttempts(String input) {
		if (FormChecking.isNumber(input)) {
			return Integer.parseInt(input);
		}
		return inputOfAttempts(input);
	}

	public static void inputCarsNames() {
		String carsNames = readLine();
		Car.createAsManyCars(carsNames);
	}

}
