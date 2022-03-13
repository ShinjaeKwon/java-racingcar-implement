package racingcar.check;

import java.util.ArrayList;

import racingcar.Car;

public class NumberChecking {

	public static final int FORWARD_STANDARD = 4;

	public static boolean isForward(int randomNumber) {
		return randomNumber >= FORWARD_STANDARD;
	}

	public static boolean isListLastIndex(ArrayList<Car> carsNamesList, int car) {
		return car == carsNamesList.size() - 1;
	}

}