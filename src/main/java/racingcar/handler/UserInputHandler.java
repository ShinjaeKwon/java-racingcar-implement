package racingcar.handler;

import static camp.nextstep.edu.missionutils.Console.*;

import java.util.ArrayList;

import racingcar.Car;
import racingcar.check.FormChecking;

public class UserInputHandler {

	public static int inputOfAttempts(String inputNumber) {
		if (FormChecking.isNumber(inputNumber)) {
			return Integer.parseInt(inputNumber);
		}
		return inputOfAttempts(readLine());
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