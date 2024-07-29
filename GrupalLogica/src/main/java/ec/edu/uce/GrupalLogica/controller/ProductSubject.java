package ec.edu.uce.GrupalLogica.controller;

import ec.edu.uce.GrupalLogica.model.interfaces.Observer;
import ec.edu.uce.GrupalLogica.model.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class ProductSubject implements Subject {
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {

        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}