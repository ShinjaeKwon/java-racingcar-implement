package racingcar;

import static racingcar.GameLogic.*;

public class FormChecking {

	public static final int LENGTH_STANDARD = 5;

	public static boolean checkNameLength(String carName) {
		if (carName.length() > LENGTH_STANDARD) {
			ExceptionHandler.moreThanFiveCharacters();
			return false;
		}
		return true;
	}

	public static boolean isNumber(String input) {
		for (int character = NUMBER_ZERO; character < input.length(); character++) {
			if (input.charAt(character) < '0' && input.charAt(character) > '9') {
				ExceptionHandler.notInputNumber();
				return false;
			}
		}
		return true;
	}
}
