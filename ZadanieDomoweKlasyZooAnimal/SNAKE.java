package pl.devopsi.akademia;

public class SNAKE extends ANIMAL {

    private int length;
    private String colour;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public SNAKE(String name, int yearOfBirth, Type type, int length, String colour) {
        super(name, yearOfBirth, type);
    }

    @Override
    public void sound() {
        System.out.println("SssSSSSssss.");
    }
}
