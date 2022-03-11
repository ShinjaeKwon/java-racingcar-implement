package racingcar;

import static racingcar.PrintHandler.*;
import static racingcar.UserInputHandler.*;

public class GameLogic {

	public static void startGame() {
		printInputCarsNames();
		inputCarsNames();
		printHowManyGamesPlaying();
		int numberOfGames = inputOfAttempts(Input());

	}

	public static void progressGame(int numberOfGames){
		while(numberOfGames-- < 0){

		}
	}

}
