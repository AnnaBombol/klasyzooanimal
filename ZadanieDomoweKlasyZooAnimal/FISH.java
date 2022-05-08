package pl.devopsi.akademia;

public class FISH extends ANIMAL {

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

    // czy muszą byc wszystkie opcje z animals?
    public FISH(String name, int yearOfBirth, Type type, String colour, int lenght) {
        super(name, yearOfBirth, type);

    }

    @Override
    public void sound() {
        System.out.println("Bul bul.");
    }
}
