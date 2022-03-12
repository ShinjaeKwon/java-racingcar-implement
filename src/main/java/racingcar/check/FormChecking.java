package racingcar.check;

import static racingcar.GameLogic.*;
import static racingcar.handler.PrintHandler.*;

import racingcar.Car;
import racingcar.handler.ExceptionHandler;
import racingcar.handler.PrintHandler;

public class FormChecking {

	public static final int LENGTH_STANDARD = 5;

	public static boolean checkNameLength(String carName) {
		if (carName.length() > LENGTH_STANDARD) {
			try {
				ExceptionHandler.moreThanFiveCharacters();
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
				ExceptionHandler.notInputNumber();
			} catch (Exception exception) {
				PrintHandler.printExceptionMessage(exception);
			} finally {
				printHowManyGamesPlaying();
				return false;
			}
		}
		return true;
	}

	public static boolean checkNumber(String input) {
		for (int character = NUMBER_ZERO; character < input.length(); character++) {
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