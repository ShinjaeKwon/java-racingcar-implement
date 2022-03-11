package racingcar;

public class FormChecking {

	public static boolean checkNameLength(String carName) {
		if (carName.length() >= 5) {
			ExceptionHandler.moreThanFiveCharacters();
			return false;
		}
		return true;
	}

	public static boolean isNumber(String input) {
		for (int character = 0; character < input.length(); character++) {
			if (input.charAt(character) < '0' && input.charAt(character) > '9') {
				ExceptionHandler.notInputNumber();
				return false;
			}
		}
		return true;
	}
}
