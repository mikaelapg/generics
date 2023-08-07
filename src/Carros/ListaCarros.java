package Carros;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListaCarros {
    private List<Carros> carros;
    private Map<String, Carros> primeiroCarroMarca;

    public ListaCarros() {
        carros = new ArrayList<>();
        primeiroCarroMarca = new HashMap<>();
    }

    public void adicionarCarro(Carros carro) {
        carros.add(carro);
        if(!primeiroCarroMarca.containsKey(carro.getNome())) {
            primeiroCarroMarca.put(carro.getNome(), carro);
        }
    }

    public void imprimir() {
        for(Carros carros : primeiroCarroMarca.values()) {
            System.out.println("O primeiro carro da marca " + carros.getMarca() + " foi o " + carros.getNome() + 
            " do ano de " + carros.getAno());
            }
    }
    public static void main(String[] args) {
        ListaCarros listaCarros = new ListaCarros();

        Carros ford = new Ford("Ford","Ford T", 1908);
        Carros honda = new Honda( "Honda","S500",1963);
        Carros peugeot = new Peugeot("Peugeot", "Phaéton",1898);

        listaCarros.adicionarCarro(ford);
        listaCarros.adicionarCarro(honda);
        listaCarros.adicionarCarro(peugeot);

        listaCarros.imprimir();
    }
}

