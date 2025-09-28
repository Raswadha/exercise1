import java.util.*;

interface Observer {
    void update(float temp);
}

interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

class WeatherStation implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void setTemperature(float temp) {
        temperature = temp;
        notifyObserver(); // ❌ Error: wrong method name (should be notifyObservers)
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temprature); // ❌ Error: variable name typo
        }
    }
}

class PhoneDisplay implements Observer {
    public void update(float temp) {
        System.out.println("Phone Display: Temp is " + temp + "°C");
    }
}
