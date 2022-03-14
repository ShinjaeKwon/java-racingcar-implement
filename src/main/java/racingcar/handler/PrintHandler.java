package racingcar.handler;

import java.util.ArrayList;

import racingcar.Car;

public class PrintHandler {

	private static final String INPUT_CARS_NAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	private static final String HOW_MANY_GAMES_PLAYING = "시도할 횟수는 몇회인가요?";
	private static final String AGAIN_INPUT_CARS_NAMES = "자동차 이름을 다시 입력하세요.(이름은 5글자 이하여야 합니다.)";
	private static final String LENGTH_EXCEPTION_NAME = " 자동차부터 이름을 다시 입력하세요.(이름은 쉼표(,) 기준으로 구분).";
	private static final String WINNER = "최종 우승자 : ";
	private static final String RESULT = "실행 결과";

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

	public static void printWinner(ArrayList<Car> carsNamesList) {
		ArrayList<String> winnerList = Car.extractCarsNames(carsNamesList);
		System.out.print(WINNER);
		System.out.println(String.join(",", winnerList));
	}

	public static void printGameStart() {
		System.out.println(RESULT);
	}

	public static void printRacingResult(ArrayList<Car> carsNamesList) {
		StringBuilder carsNames = new StringBuilder();
		for (Car car : carsNamesList) {
			carsNames.append(car.getName()).append(" : ");
			for (int process = 0; process < car.getPosition(); process++) {
				carsNames.append("-");
			}
			carsNames.append("\n");
		}
		carsNames.append("\n");
		System.out.println(carsNames);
	}

}