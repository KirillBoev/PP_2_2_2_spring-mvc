package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Mitsubishi", 10, 2013));
        carList.add(new Car("Ferrari", 6, 1999));
        carList.add(new Car("Mercedes", 8, 1983));
        carList.add(new Car("Skoda", 11, 2010));
        carList.add(new Car("BMW", 3, 2020));
    }

    public List<Car> getCarList() {
        return carList;
    }


    @Override
    public List<Car> listUsers(int e) {
        if (e > 0 && e <= 5) {
            return carList.stream().limit(e).collect(Collectors.toList());
        } else {
            return carList;
        }
    }
}
