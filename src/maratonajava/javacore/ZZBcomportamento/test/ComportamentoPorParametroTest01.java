package maratonajava.javacore.ZZBcomportamento.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import maratonajava.javacore.ZZBcomportamento.dominio.Car;
import maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("Blue", 1995), new Car("Red", 2005), new Car("GREEN", 2005));

    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, new CarPredicate() {

            @Override
            public boolean test(Car car) {
                return car.getColor().toLowerCase().equals("green".toLowerCase());
            }

        });

        List<Car> greenCars2 = filter(cars, car -> car.getColor().toLowerCase().equals("green"));

        System.out.println("===== Listando os carros verdes utilizando funções anônimas =====");
        System.out.println(greenCars);
        System.out.println("===== Listando os carros verdes utilizando funções lambdas =====");
        System.out.println(greenCars2);

        List<Car> oldCars = filter(cars, car -> car.getYear() < 2000);

        System.out.println("===== Listando os carros antigos =====");
        System.out.println(oldCars);

        System.out.println("===== Listando os carros depois de 2000 usando filtro genérico =====");
        List<Car> carsAfter2000 = filter2(cars, car -> car.getYear() > 2000);
        System.out.println(carsAfter2000);

    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    // Criando um filtro genérico
    private static <T> List<T> filter2(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filteredList.add(e);
            }
        }
        return filteredList;
    }
}
