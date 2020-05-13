package top.jiaway.headfirst.Observer;


public interface Subject{
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}
