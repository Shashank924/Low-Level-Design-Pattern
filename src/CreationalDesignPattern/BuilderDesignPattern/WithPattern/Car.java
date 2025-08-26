package CreationalDesignPattern.BuilderDesignPattern.WithPattern;

public class Car {

    private String model;
    private String engine;
    private int wheels;
    private String color;
    private boolean hasSunRoof;
    private String navigationSystem;

    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.model = builder.model;
        this.wheels = builder.wheels;
        this.color = builder.color;
        this.hasSunRoof = builder.hasSunRoof;
        this.navigationSystem = builder.navigationSystem;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", model='" + model + '\'' +
                ", navigationSystem='" + navigationSystem + '\'' +
                ", color='" + color + '\'' +
                ", hasSunRoof=" + hasSunRoof +
                ", wheels=" + wheels +
                '}';
    }

    public static class CarBuilder {

        private String engine;
        private String model = "V8";
        private int wheels = 4;
        private String color = "Blue";
        private boolean hasSunRoof = false;
        private String navigationSystem = "Automatic";

        public CarBuilder Engine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder Color(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder HasSunRoof(boolean hasSunRoof) {
            this.hasSunRoof = hasSunRoof;
            return this;
        }

        public CarBuilder Model(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder NavigationSystem(String navigationSystem) {
            this.navigationSystem = navigationSystem;
            return this;
        }

        public CarBuilder Wheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public Car build() {
            return new Car(this);
        }

    }


}
