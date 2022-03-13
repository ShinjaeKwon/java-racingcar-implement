package racingcar;

import java.util.ArrayList;

import racingcar.handler.PrintHandler;

public class JudgementWinner {

	public static void judgeWinner(ArrayList<Car> carsNamesList) {
		removeLoser(carsNamesList, getHighPosition(carsNamesList));
		PrintHandler.printWinner(carsNamesList);
	}

	private static void removeLoser(ArrayList<Car> carsNamesList, int highPosition) {
		for (int car = 0; car < carsNamesList.size(); car++) {
			if (carsNamesList.get(car).getPosition() != highPosition) {
				carsNamesList.remove(car);
				car = 0;
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

	private static boolean isSoloWin(ArrayList<Car> carsNamesList) {
		return carsNamesList.size() == 1;
	}

}