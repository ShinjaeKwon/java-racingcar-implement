package racingcar;

import static racingcar.handler.PrintHandler.*;
import static racingcar.handler.UserInputHandler.*;

import java.util.ArrayList;

import racingcar.check.NumberChecking;

public class GameLogic {

	public static final int NUMBER_ZERO = 0;
	public static final int NUMBER_ONE = 1;

	public static void startGame() {
		printInputCarsNames();
		ArrayList<Car> carsNamesList = inputCarsNames();
		printHowManyGamesPlaying();
		int numberOfGames = inputOfAttempts(input());

		printResult();
		for (int game = NUMBER_ZERO; game < numberOfGames; game++) {
			progressGame(carsNamesList);
		}
		JudgementWinner.judgeWinner(carsNamesList);
	}

	public static void progressGame(ArrayList<Car> carsNamesList) {
		for (Car car : carsNamesList) {
			int randomNumber = RandomNumber.makeRandomNumber();

			if (NumberChecking.isForward(randomNumber)) {
				Car.forward(car);
			}
		}
		printRacingResult(carsNamesList);
	}

}