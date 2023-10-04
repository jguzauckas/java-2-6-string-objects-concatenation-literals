public class Car {
    private String make; // This is the brand like Honda, Toyota, etc.
    private String model; // This is the type of car like Civic, Camry, etc.
    private int year; // This is the year the car was made.
    private int odometer; // This is how many total miles the car has driven.

    public Car(){
        make = "Unknown";
        model = "Unknown";
        year = 1900;
        odometer = 0;
    }

    public Car(String ma, String mo, int y, int o, boolean e){
        make = ma;
        model = mo;
        year = y;
        odometer = o;
    }

    public String getMake(){
        return make;
    }

    public void setMake(String ma){
        make = ma;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String mo){
        model = mo;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int y){
        year = y;
    }

    public int getOdometer(){
        return odometer;
    }

    public void setOdometer(int o){
        odometer = o;
    }

    public void drive(int m){
        odometer += m;
    }

    public double odometerKilometers(){
        return odometer * 1.609;
    }
}
