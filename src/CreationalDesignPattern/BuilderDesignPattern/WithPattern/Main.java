package CreationalDesignPattern.BuilderDesignPattern.WithPattern;

public class Main {
    public static void main(String[] args) {

        Car.CarBuilder carBuilder = new Car.CarBuilder();

        Car car1 = carBuilder.Engine("500hP")
                .Model("Xls")
                .Color("Black")
                .HasSunRoof(true)
                .build();

        System.out.println(car1);
    }
}
