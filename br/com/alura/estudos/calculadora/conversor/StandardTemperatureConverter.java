package br.com.alura.estudos.calculadora.conversor;

public class StandardTemperatureConverter implements TemperatureConverter{
    private double celsius;
    private double fahrenheit;

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    @Override
    public void celsiustoFahrenheit() {

        double temperature = (1.8*celsius) + 32;
        System.out.println("A temperatura " +celsius+ " graus celsius para fahrenheit é igual: " +temperature);
    }

    @Override
    public void fahrenheittoCelsius() {

        double temperaturecelsius = (fahrenheit-32)/1.8;
        System.out.println("A temperatura " +fahrenheit+ " graus fahrenheit para celsius é igual: " +temperaturecelsius);
    }
}
