package web.Service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCarsFromList(List<Car> carList, int countOfCars);
}
