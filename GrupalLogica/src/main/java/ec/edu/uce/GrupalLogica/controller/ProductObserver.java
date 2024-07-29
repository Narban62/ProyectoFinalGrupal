package ec.edu.uce.GrupalLogica.controller;

import ec.edu.uce.GrupalLogica.model.interfaces.Observer;

public class ProductObserver implements Observer {
    private final String name;

    public ProductObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received update: " + message);
    }
}