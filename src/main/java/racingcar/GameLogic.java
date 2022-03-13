package racingcar;

import static camp.nextstep.edu.missionutils.Console.*;

import java.util.ArrayList;

import racingcar.check.NumberChecking;
import racingcar.handler.PrintHandler;
import racingcar.handler.UserInputHandler;

public class GameLogic {

	public static void startGame() {
		PrintHandler.printInputCarsNames();
		ArrayList<Car> carsNamesList = UserInputHandler.inputCarsNames();
		PrintHandler.printHowManyGamesPlaying();
		int numberOfGames = UserInputHandler.inputOfAttempts(readLine());

		PrintHandler.printResult();
		for (int game = 0; game < numberOfGames; game++) {
			progressGame(carsNamesList);
		}
		JudgementWinner.judgeWinner(carsNamesList);
	}

	private static void progressGame(ArrayList<Car> carsNamesList) {
		for (Car car : carsNamesList) {
			int randomNumber = RandomNumber.makeRandomNumber();

			if (NumberChecking.isForward(randomNumber)) {
				Car.forward(car);
			}
		}
		PrintHandler.printRacingResult(carsNamesList);
	}

}