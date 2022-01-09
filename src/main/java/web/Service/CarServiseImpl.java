package web.Service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiseImpl implements CarService {
    public List<Car> getCarsFromList(List<Car> carList, int countOfCars) {
        List<Car> result = new ArrayList<>();
        for (int i = 0; i < countOfCars; i++) {
            result.add(carList.get(i));
        }
        return result;
    }
}
