package pl.devopsi.akademia;

import java.util.List;

public class ZOO {
    private String name;
    private int yearOfEstablishment;
    private List<ANIMAL>animals;

    // List<Main.ANIMAL> zoo = Arrays.asList();

    public ZOO(String name, int yearOfEstablishment, List<ANIMAL> animals) {
        this.name = "Zoo w Opolu.";
        this.yearOfEstablishment = 1990;
    }
    public void addAnimal(ANIMAL animal){
        animals.add(animal);
    }
    public List<ANIMAL> getAnimals(){
        return animals;
    }
    public void showAnimals() {
        for (ANIMAL animal : animals) {
            System.out.println(getAnimals());
        }
    }
    public int countAnimals(){
        return animals.size();
        }

     // public double avgAge(){
    //  int x = 0;
    //   for(ANIMAL animal: animals){
    //       x = x + ANIMAL.getAge(); // zdefiniować w ANIMAL
    //   }
    //   return x/this.countAnimals();
    // }

    public void showInfo()
    {
        System.out.println(this.name + " zostało wybudowane w roku " + this.yearOfEstablishment
        + ". Średni wiek zwierząt to avgAge.");
    }



}
