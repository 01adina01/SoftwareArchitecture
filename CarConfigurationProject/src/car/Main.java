package car;

public class Main {

    public static void main(String[] args) {

        Car car = new Car.CarBuilder("V6", "Automatic")
                .interiorFeatures("Leather seats, GPS, Premium Sound")
                .exteriorOptions("Red color, 18-inch rims, Sunroof")
                .safetyFeatures("ABS, Airbags, Rear Camera")
                .build();

        System.out.println(car);
    }
}
