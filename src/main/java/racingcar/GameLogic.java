package racingcar;

import static racingcar.PrintHandler.*;
import static racingcar.UserInputHandler.*;

public class GameLogic {

	public static final int NUMBER_ZERO = 0;

	public static void startGame() {
		printInputCarsNames();
		Car[] carsNamesArray = inputCarsNames();
		printHowManyGamesPlaying();
		int numberOfGames = inputOfAttempts(Input());
		for (int game = NUMBER_ZERO; game < numberOfGames; game++) {
			progressGame(carsNamesArray);
		}

	}

	public static void progressGame(Car[] carsNamesArray) {
		for (int car = NUMBER_ZERO; car < carsNamesArray.length; car++) {
			int randomNumber = RandomNumber.makeRandomNumber();
			if (NumberChecking.isJudgeForward(randomNumber)) {
				Car.forward(carsNamesArray[car]);
			}
		}

	}

}
