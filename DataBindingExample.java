class TemperatureSensor {
    private double temperature;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void displayTemperature() {
        System.out.println("Current temperature: " + temperature + " °C");
    }
}

public class DataBindingExample {
    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();

        sensor.setTemperature(25.5); // Data binding: setting temperature
        sensor.displayTemperature(); // Data binding: displaying temperature

        sensor.setTemperature(30.0);
        sensor.displayTemperature();
    }
}

