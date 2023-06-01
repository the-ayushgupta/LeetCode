class Convert_The_Tempreature {
    public double[] convertTemperature(double celsius) {
        double kelvin = (double) (celsius + 273.15);

        double Fahrenheit = (double) ((celsius * 1.80) + 32.00);
        
        double[] temp = {kelvin,Fahrenheit};

        return temp;
    }
}
