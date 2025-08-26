package CreationalDesignPattern.BuilderDesignPattern.WithoutPattern;

public class Car {
    private String model;
    private int wheels;
    private String color;
    private boolean hasSunRoof;
    private String navigationSystem;

    //Here some of the values are optional
    //So we have to create multiple constructors for it
    //That is not scalable and becomes difficult to maintain
}
