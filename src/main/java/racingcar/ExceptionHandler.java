package racingcar;

public class ExceptionHandler {

	public static final String MORE_THAN_FIVE_CHARACTERS = "[ERROR] 차의 이름이 5글자 이하여야 한다.";
	public static final String NOT_INPUT_NUMBER = "[ERROR] 시도 횟수는 숫자여야 한다.";

	public static void moreThanFiveCharacters() {
		throwIllegalArgumentExceptionWithMessage(MORE_THAN_FIVE_CHARACTERS);
	}

	public static void notInputNumber() {
		throwIllegalArgumentExceptionWithMessage(NOT_INPUT_NUMBER);
	}

	private static void throwIllegalArgumentExceptionWithMessage(String message) {
		throw new IllegalArgumentException(message);
	}
}
