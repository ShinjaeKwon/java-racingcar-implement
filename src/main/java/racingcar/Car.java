package racingcar;

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
		return createCar(UserInputHandler.againInput());
	}

}
