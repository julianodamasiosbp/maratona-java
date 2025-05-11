package maratonajava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class MapTest02 {

    public static void main(String[] args) {

        Consumidor joao = new Consumidor("Joao");
        Consumidor pedro = new Consumidor("Pedro");

        Smartphone galaxyS21 = new Smartphone("123456", "Samsung Galaxy S21");
        Smartphone iPhone12 = new Smartphone("234776", "iPhone 12");
        Smartphone xiaomiMi11 = new Smartphone("667774", "Xiaomi Mi 11");
        Smartphone galaxyS20FE = new Smartphone("433444", "Samsung Galaxy S20 FE");
        Smartphone motorolaEdge20 = new Smartphone("534454", "Motorola Edge 20");
        Smartphone motoG = new Smartphone("975565", "Moto G");

        Map<Consumidor, List<Smartphone>> consumidorSmartPhone = new HashMap<>();

        consumidorSmartPhone.put(joao, List.of(galaxyS21, iPhone12));
        consumidorSmartPhone.put(pedro, List.of(xiaomiMi11, galaxyS20FE, motorolaEdge20, motoG));

        for (Map.Entry<Consumidor, List<Smartphone>> entry : consumidorSmartPhone.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
