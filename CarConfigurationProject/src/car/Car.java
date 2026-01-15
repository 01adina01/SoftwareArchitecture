package car;

public class Car {

    private String engine;
    private String transmission;
    private String interiorFeatures;
    private String exteriorOptions;
    private String safetyFeatures;

    // Private constructor - only Builder can create Car
    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.transmission = builder.transmission;
        this.interiorFeatures = builder.interiorFeatures;
        this.exteriorOptions = builder.exteriorOptions;
        this.safetyFeatures = builder.safetyFeatures;
    }

    @Override
    public String toString() {
        return "Car Configuration:\n" +
                "Engine: " + engine + "\n" +
                "Transmission: " + transmission + "\n" +
                "Interior: " + interiorFeatures + "\n" +
                "Exterior: " + exteriorOptions + "\n" +
                "Safety: " + safetyFeatures;
    }

    // ---------- BUILDER ----------
    public static class CarBuilder {

        // Required
        private String engine;
        private String transmission;

        // Optional
        private String interiorFeatures;
        private String exteriorOptions;
        private String safetyFeatures;

        public CarBuilder(String engine, String transmission) {
            this.engine = engine;
            this.transmission = transmission;
        }

        public CarBuilder interiorFeatures(String interiorFeatures) {
            this.interiorFeatures = interiorFeatures;
            return this;
        }

        public CarBuilder exteriorOptions(String exteriorOptions) {
            this.exteriorOptions = exteriorOptions;
            return this;
        }

        public CarBuilder safetyFeatures(String safetyFeatures) {
            this.safetyFeatures = safetyFeatures;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
