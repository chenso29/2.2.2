package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarServiseImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarsController {

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW", "Black", 2020));
        carList.add(new Car("Mercedez-Benz", "Red", 2013));
        carList.add(new Car("Hyundai", "White", 2045));
        carList.add(new Car("KIA", "Yellow", 2404));
        carList.add(new Car("LADA", "Blue", 2457));
        CarServiseImpl carServise = new CarServiseImpl();
        try {
            if (count > 0 && count <= 5) {
                List<Car> result = carServise.getCarsFromList(carList, count);
                model.addAttribute("list", result);
            }else{
                List<Car> result = carServise.getCarsFromList(carList, 5);
                model.addAttribute("list", result);
            }
        } catch (NullPointerException npe) {
            List<Car> result = carServise.getCarsFromList(carList, 5);
            model.addAttribute("list", result);
        }
        return "cars";
    }
}
