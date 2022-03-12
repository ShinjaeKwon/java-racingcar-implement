package racingcar.handler;

import static racingcar.GameLogic.*;

import java.util.ArrayList;

import racingcar.Car;

public class PrintHandler {

	public static final String INPUT_CARS_NAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	public static final String HOW_MANY_GAMES_PLAYING = "시도할 횟수는 몇회인가요?";
	public static final String AGAIN_INPUT_CARS_NAMES = "자동차 이름을 다시 입력하세요.(이름은 5글자 이하여야 합니다.)";
	public static final String LENGTH_EXCEPTION_NAME = " 자동차부터 이름을 다시 입력하세요.(이름은 쉼표(,) 기준으로 구분).";
	public static final String WINNER = "최종 우승자 : ";
	public static final String RESULT = "실행 결과";

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
		if (carsNamesList.size() == NUMBER_ONE) {
			System.out.print(WINNER);
			System.out.println(carsNamesList.get(NUMBER_ZERO).getName());
			return;
		}
		printCoWinner(carsNamesList);
	}

	private static void printCoWinner(ArrayList<Car> carsNamesList) {
		System.out.print(WINNER);
		for (int car = NUMBER_ZERO; car < carsNamesList.size(); car++) {
			System.out.print(carsNamesList.get(car).getName());
			if (car == carsNamesList.size() - NUMBER_ONE) {
				System.out.println();
				continue;
			}
			System.out.print(", ");
		}
	}

	public static void printResult() {
		System.out.println(RESULT);
	}

	public static void printRacingResult(ArrayList<Car> carsNamesList) {
		for (Car car : carsNamesList) {
			System.out.print(car.getName() + " : ");
			for (int process = 0; process < car.getPosition(); process++) {
				System.out.print("-");
			}
			printEnter();
		}
		printEnter();
	}

	public static void printEnter() {
		System.out.println();
	}

}