package com.example.learningStrings.practice;

import com.example.learningStrings.Car;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "http:/localhost:4200")
public class Controller {
    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public ArrayList<Car> getCars(Model model){
        ArrayList<Car> carList = new ArrayList<>();

        carList.add(new Car(1000,4,"red","Mustang","Ford",2020,200));
        carList.add(new Car(2000,4,"blue","Corvette","Chevrolet",2020,220));

        return carList;
    }
}
