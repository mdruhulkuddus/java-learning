package Abstracts;

public class Zoo {
    private Animal[] animals; // animal type array
    public Zoo(Animal[] animals)
    {
        this.animals = animals;
    }
    public void printInfo(){
        for (Animal animal : animals)
        {
            System.out.println(animal.toString());
            System.out.println("Diet: "+ animal.getDiets());

        }
    }
}


/**
 * if(animal instanceof Lion){
 *                 Lion lion = (Lion) animal; // Explicit downcasting from Animal to Lion
 *                 System.out.println("Diet of lion "+ lion.getDiets() );
 *             } else if (animal instanceof Tiger) {
 *                 Tiger tiger = (Tiger) animal;
 *                 System.out.println("Diet of tiger "+ tiger.getDiets() );
 *             }
 */