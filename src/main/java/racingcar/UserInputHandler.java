package racingcar;

import static camp.nextstep.edu.missionutils.Console.*;

import java.util.ArrayList;

public class UserInputHandler {

	public static String Input() {
		return readLine();
	}

	public static int inputOfAttempts(String input) {
		if (FormChecking.isNumber(input)) {
			return Integer.parseInt(input);
		}
		return inputOfAttempts(Input());
	}

	public static ArrayList<Car> inputCarsNames() {
		String carsNames = readLine();
		ArrayList<Car> carsNamesList = Car.createAsManyCars(carsNames);
		return carsNamesList;
	}

	public static String lengthExceptionAgainInput() {
		PrintHandler.printAgainInputNames();
		return readLine();
	}

}