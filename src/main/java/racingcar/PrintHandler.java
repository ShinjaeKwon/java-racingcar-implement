package racingcar;

public class PrintHandler {

	public static final String INPUT_CARS_NAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	public static final String HOW_MANY_GAMES_PLAYING = "시도할 횟수는 몇회인가요?";
	public static final String AGAIN_INPUT_CARS_NAMES = "자동차 이름을 다시 입력하세요.(이름은 5글자 이하여야 합니다.)";
	public static final String LENGTH_EXCEPTION_NAME = " 자동차부터 이름을 다시 입력하세요.(이름은 쉼표(,) 기준으로 구분).";

	public static void printInputCarsNames() {
		System.out.println(INPUT_CARS_NAMES);
	}

	public static void printHowManyGamesPlaying() {
		System.out.println(HOW_MANY_GAMES_PLAYING);
	}

	public static void printAgainInputNames() {
		System.out.println(AGAIN_INPUT_CARS_NAMES);
	}

	public static void printExceptionName(String carName) {
		System.out.println(carName + LENGTH_EXCEPTION_NAME);
	}

	public static void printExceptionMessage(Exception exception) {
		System.out.println(exception.getMessage());
	}

	//TODO 차수별 실행 결과

	//TODO 단독 우승자 안내 문구

	//TODO 최종 우승자 안내 문구

}
