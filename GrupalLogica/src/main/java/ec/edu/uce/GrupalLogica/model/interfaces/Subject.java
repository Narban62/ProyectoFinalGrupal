package ec.edu.uce.GrupalLogica.model.interfaces;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers(String message);
}