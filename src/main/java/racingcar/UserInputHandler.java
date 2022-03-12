package racingcar;

import static camp.nextstep.edu.missionutils.Console.*;

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

	public static Car[] inputCarsNames() {
		String carsNames = readLine();
		Car[] carsNamesArray = Car.createAsManyCars(carsNames);
		return carsNamesArray;
	}

}
