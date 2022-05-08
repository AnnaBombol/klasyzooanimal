package pl.devopsi.akademia;

public class DOG extends ANIMAL {

    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private String colour;



    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public DOG(String name, int yearOfBirth, Type type, String colour, int height) {
        super(name, yearOfBirth, type);

    }

    @Override
    public void sound() {
        System.out.println("Hau Hau.");
    }
}
