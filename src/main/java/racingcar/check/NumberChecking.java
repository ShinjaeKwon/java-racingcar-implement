package racingcar.check;

import static racingcar.GameLogic.*;

import java.util.ArrayList;

import racingcar.Car;

public class NumberChecking {

	public static final int FORWARD_STANDARD = 4;

	public static boolean isJudgeForward(int randomNumber) {
		if (randomNumber >= FORWARD_STANDARD) {
			return true;
		}
		return false;
	}

	public static boolean isListLastIndex(ArrayList<Car> carsNamesList, int car) {
		return car == carsNamesList.size() - NUMBER_ONE;
	}

}