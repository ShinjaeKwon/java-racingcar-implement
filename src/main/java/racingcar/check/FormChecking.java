package racingcar.check;

import racingcar.Car;
import racingcar.handler.InputException;
import racingcar.handler.PrintHandler;

public class FormChecking {

	public static final int LENGTH_STANDARD = 5;

	public static boolean checkNameLength(String carName) {
		if (carName.length() > LENGTH_STANDARD) {
			try {
				InputException.moreThanFiveCharacters();
			} catch (Exception exception) {
				PrintHandler.printExceptionMessage(exception);
			} finally {
				PrintHandler.printExceptionName(carName);
				return false;
			}
		}
		return true;
	}

	public static boolean isNumber(String inputNumber) {
		if (!checkNumber(inputNumber)) {
			try {
				InputException.notInputNumber();
			} catch (Exception exception) {
				PrintHandler.printExceptionMessage(exception);
			} finally {
				PrintHandler.printHowManyGamesPlaying();
				return false;
			}
		}
		return true;
	}

	private static boolean checkNumber(String inputNumber) {
		try {
			Integer.parseInt(inputNumber);
			return true;
		} catch (NumberFormatException exception) {
			return false;
		}

	}

	public static boolean isNull(Car car) {
		return car == null;
	}

}