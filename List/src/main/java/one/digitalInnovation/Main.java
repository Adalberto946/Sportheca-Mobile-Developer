package one.digitalInnovation;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        List<one.digitalinnovation.Carro> listCarros = new ArrayList<>();

        listCarros.add(new one.digitalinnovation.Carro("Ford"));
        listCarros.add(new one.digitalinnovation.Carro("Chevrolet"));
        listCarros.add(new one.digitalinnovation.Carro("Fiat"));
        listCarros.add(new one.digitalinnovation.Carro("Pegeout"));

        System.out.println(listCarros.contains(new one.digitalinnovation.Carro("Ford")));

        System.out.println(listCarros.get(2));

        System.out.println(listCarros.indexOf(new one.digitalinnovation.Carro("Fiat")));

        System.out.println(listCarros.remove(2));

        System.out.println(listCarros);
    }
}
