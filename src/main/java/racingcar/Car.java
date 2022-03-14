package racingcar;

import java.util.ArrayList;
import java.util.StringTokenizer;

import racingcar.check.FormChecking;
import racingcar.handler.UserInputHandler;

public class Car {
	private final String name;
	private int position = 0;

	private Car(String name) {
		this.name = name;
	}

	private static Car createCar(String name) {
		if (!FormChecking.checkNameLength(name)) {
			return null;
		}
		return new Car(name);
	}

	private static ArrayList<Car> createAsManyCars(String carsNames) {
		StringTokenizer carsNamesTokens = new StringTokenizer(carsNames, ",");
		ArrayList<Car> carsNamesList = new ArrayList<>();

		while (carsNamesTokens.hasMoreTokens()) {
			String carName = carsNamesTokens.nextToken();
			Car car = createCar(carName);
			if (FormChecking.isNull(car)) {
				carsNamesTokens = new StringTokenizer(UserInputHandler.lengthExceptionAgainInput(), ",");
				continue;
			}
			carsNamesList.add(car);
		}
		return carsNamesList;
	}

	public static ArrayList<Car> getCars(String carsNames) {
		return Car.createAsManyCars(carsNames);
	}

	public static ArrayList<String> extractCarsNames(ArrayList<Car> carsNamesList) {
		ArrayList<String> carsNames = new ArrayList<>();
		for (Car car : carsNamesList) {
			carsNames.add(car.name);
		}
		return carsNames;
	}

	public static void moveForward(Car car) {
		car.position++;
	}

	public int getPosition() {
		return position;
	}

	public String getName() {
		return name;
	}

}