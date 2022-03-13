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

	public static boolean isNumber(String input) {
		if (!checkNumber(input)) {
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

	private static boolean checkNumber(String input) {
		for (int character = 0; character < input.length(); character++) {
			if (input.charAt(character) < '0' || input.charAt(character) > '9') {
				return false;
			}
		}
		return true;
	}

	public static boolean isNull(Car car) {
		return car == null;
	}

}