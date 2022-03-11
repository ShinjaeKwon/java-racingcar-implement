package racingcar;

import java.util.StringTokenizer;

public class Car {
	private final String name;
	private int position = 0;

	public Car(String name) {
		this.name = name;
	}

	public static Car createCar(String name) {
		if (FormChecking.checkNameLength()) {
			return new Car(name);
		}
		return createCar(UserInputHandler.Input());
	}

	public static Car[] createAsManyCars(String carsNames){
		StringTokenizer carsNamesTokens = new StringTokenizer(carsNames, ",");
		int numberOfCars = carsNamesTokens.countTokens();
		Car[] carsNamesArray = new Car[numberOfCars];
		for(int cars=0; cars<numberOfCars; cars++){
			carsNamesArray[cars] = new Car(carsNamesTokens.nextToken());
		}
		return carsNamesArray;
	}

}
