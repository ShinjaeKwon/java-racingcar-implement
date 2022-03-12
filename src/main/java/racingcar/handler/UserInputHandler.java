package racingcar.handler;

import static camp.nextstep.edu.missionutils.Console.*;

import java.util.ArrayList;

import racingcar.Car;
import racingcar.check.FormChecking;

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
		return Car.getCars(carsNames);
	}

	public static String lengthExceptionAgainInput() {
		PrintHandler.printAgainInputNames();
		return readLine();
	}

}