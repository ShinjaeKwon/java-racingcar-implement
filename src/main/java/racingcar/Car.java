package racingcar;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Car {
	private final String name;
	private int position = 0;

	public Car(String name) {
		this.name = name;
	}

	public static Car createCar(String name) {
		if (!FormChecking.checkNameLength(name)) {
			return null;
		}
		return new Car(name);
	}

	public static ArrayList<Car> createAsManyCars(String carsNames){
		StringTokenizer carsNamesTokens = new StringTokenizer(carsNames, ",");
		ArrayList<Car> carsNamesList = new ArrayList<>();
		while (carsNamesTokens.hasMoreTokens()){
			String carName = carsNamesTokens.nextToken();
			Car car = createCar(carName);
			if(FormChecking.checkNull(car)){
				carsNamesTokens = new StringTokenizer(UserInputHandler.lengthExceptionAgainInput(), ",");
				continue;
			}
			carsNamesList.add(car);
		}
		return carsNamesList;
	}

	public static void forward(Car car) {
		car.position ++;
	}

}
