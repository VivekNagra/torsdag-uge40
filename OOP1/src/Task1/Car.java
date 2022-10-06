package Task1;

public class Car
{
    String make;
    String model;
    String bodyStyle;
    int year;
    static Driver driver;



    public Car(String make, String model, String bodyStyle, int year)
    {
        this.make = make;
        this.model = model;
        this.bodyStyle = bodyStyle;
        this.year = year;
    }

    public  void setDriver(Driver driver)
    {
        this.driver = driver;
    }



    @Override
    public String toString()
    {
        return "Car{" +
                "Make: " + make + ". Model: "+model+ " ("+ year + "), BodyStyle: "+bodyStyle +
                '}';
    }
}
