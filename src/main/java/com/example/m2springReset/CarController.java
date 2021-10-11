package com.example.m2springReset;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CarController {

    @GetMapping("/coche")
    public Car findCar(){
        Car toyota = new Car (1L, "Toyota", "Prius");
        return toyota;
    }

    // Como voy a poner el nº que quiera buscar en las {}, le pongo la notación @PathVariable
    @GetMapping("/coche/{id}")
    public Car findById (@PathVariable Long id) {
        Car toyota = new Car (id, "Toyota", "Prius");
        return toyota;
    }

    @GetMapping ("/coches/{manufacturer}")
    public List<Car> findAllByManufacturer(@PathVariable String manufacturer) {
        System.out.println("El fabricante a filtrar es: " + manufacturer);
        List<Car> cars = new ArrayList<>();
        cars.add (new Car (1L, manufacturer, "Mondeo")) ;
        cars.add  (new Car (2L, manufacturer, "Fiesta"));
        return cars;
    }

    @GetMapping ("coches/{manufacturer}/{model}")
    public List<Car> findByManufacturerAndModel (@PathVariable String manufacturer, @PathVariable String model) {
        System.out.println("Filtrando coches: " + manufacturer + " " + model);
        List<Car> cars = new ArrayList<>();
        cars.add (new Car (4L, manufacturer, model));
        cars.add (new Car (5L,  manufacturer, model));
        return cars;
    }

    // GUARDAR DATOS => Para poder meter datos a través de la consola en base de datos
    @PostMapping ("/coches")
    public void save (@RequestBody Car coche) {
        System.out.println(coche.getManufacturer() + " " + coche.getModel());
    }


    @GetMapping("/coches")
    public List<Car> findAll () {
        List<Car> cars = new ArrayList<>();
        Car toyota = new Car (1L, "Toyota", "Prius");
        cars.add (toyota);
        Car ford = new Car (2L, "Ford", "Mondeo");
        cars.add (ford);
        cars.add (new Car (3L, "Seat", "Ibiza"));
        cars.add (new Car (4L, "Ford", "Fiesta"));
        cars.add (new Car (5L, "Fiat", "Panda"));
        return cars;
    }

}
