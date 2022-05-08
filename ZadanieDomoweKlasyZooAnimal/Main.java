package pl.devopsi.akademia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        // tworzenie listy animals na bazie klasy ANIMAL
        List<ANIMAL> animals = Arrays.asList(

                new ANIMAL("Daniel", 2012, ANIMAL.Type.REPTILE),
                new ANIMAL("Maciej", 2002, ANIMAL.Type.AMPHIBIANE),
                new ANIMAL("Olaf", 1999, ANIMAL.Type.REPTILE)
        );


        for (ANIMAL animal : animals) {
            System.out.println("Rok urodzenia zwierzęcia o imieniu " + animal.getName() + " to " + animal.getYearOfBirth()
                    + ". Zwierzę to należy do typu " + animal.getType());

        }
        
        DOG Burek = new DOG("Burek", 2005, ANIMAL.Type.NONE, "Bury", 120);
        DOG Fafik = new DOG("Fafik", 2008, ANIMAL.Type.NONE, "Rudy", 50);
        FISH  Eleonor = new FISH("Eleonor", 2020, ANIMAL.Type.NONE, "Fioletowy", 20);
        SNAKE Waclaw = new SNAKE("Wacław", 2020, ANIMAL.Type.NONE, 200, "Zielony");

        List<SPEAKABLE> dzwieki = new ArrayList<>();
        dzwieki.add(Burek);
        dzwieki.add(Fafik);
        dzwieki.add(Eleonor);
        dzwieki.add(Waclaw);
        dzwieki.forEach(SPEAKABLE::sound);
    }
}






