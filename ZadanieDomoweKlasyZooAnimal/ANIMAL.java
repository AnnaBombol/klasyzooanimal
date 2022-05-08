package pl.devopsi.akademia;

import java.util.Objects;


// definicja klasy ANIMAL
public class ANIMAL implements SPEAKABLE{
    private String name;
    private int yearOfBirth;
    private Type type;
    private static int CURRENT_YEAR = 2022; // statyczne CURRENT_YEAR

    // konstruktor klasy ANIMAL
    public ANIMAL(String name, int yearOfBirth, Type type) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.type = type;
    }

    // gettery klasy ANIMAL
    public String getName() {
        return name;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public Type getType() {
        return type;
    }
    // public int getAge() {
    //        return CURRENT_YEAR - yearofBirth; }

    // enum Typu
    public enum Type {
        REPTILE, AMPHIBIANE,NONE
    }

    // nadpisanie equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ANIMAL)) return false;
        ANIMAL animal = (ANIMAL) o;
        return getYearOfBirth() == animal.getYearOfBirth() && Objects.equals(getName(), animal.getName()) && getType() == animal.getType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getYearOfBirth(), getType());
    }

    @Override
    public String toString() {
        return "ANIMAL{" +
                "name='" + name + '\'' + ", yearOfBirth=" + yearOfBirth + ", type=" + type + '}';
    }

    @Override
    public void sound() {
        System.out.println("Głos");
    }
}




