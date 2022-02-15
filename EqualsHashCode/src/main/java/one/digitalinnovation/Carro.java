package one.digitalinnovation;

import java.util.Objects;

public class Carro {
    private String carros;

    public Carro(String carros) {
        this.carros = carros;
    }

    public String getCarros() {
        return carros;
    }

    public void setCarros(String carros) {
        this.carros = carros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(carros, carro.carros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carros);
    }
}
