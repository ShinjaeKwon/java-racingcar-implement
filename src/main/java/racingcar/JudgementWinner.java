package racingcar;

import static racingcar.GameLogic.*;

import java.util.ArrayList;

import racingcar.handler.PrintHandler;

public class JudgementWinner {

	public static void judgeWinner(ArrayList<Car> carsNamesList) {
		removeLoser(carsNamesList, getHighPosition(carsNamesList));
		PrintHandler.printWinner(carsNamesList);
	}

	private static void removeLoser(ArrayList<Car> carsNamesList, int highPosition) {
		for (int car = NUMBER_ZERO; car < carsNamesList.size(); car++) {
			if (carsNamesList.get(car).getPosition() != highPosition) {
				carsNamesList.remove(car);
				car = NUMBER_ZERO;
			}
		}
	}

	private static int getHighPosition(ArrayList<Car> carsNamesList) {
		int highPosition = Integer.MIN_VALUE;
		for (Car car : carsNamesList) {
			if (highPosition < car.getPosition()) {
				highPosition = car.getPosition();
			}
		}
		return highPosition;
	}

}