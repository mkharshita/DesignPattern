package creational.prototype.Approach1;

import java.util.ArrayList;
import java.util.List;

/*
Let the object class create a copy of itself -> clone method
 */
public class Client {

    public static void main(String[] args) {

        Bird bird1 = new Bird();
        bird1.setName("Harshita");
        bird1.setColor("white");
        bird1.setWeight(12);

        Sparrow sparrow1 = new Sparrow();
        sparrow1.setColor("Blue");
        sparrow1.setLegSize("hey");

        Crow crow1 = new Crow();
        crow1.setSound("Koooooo");
        crow1.setWeight(34);

        List<Bird> birds = List.of(
                bird1,crow1,sparrow1
        );

        List<Bird> children = new ArrayList<>();

        for (Bird parent : birds) {
            children.add(parent.clone());
        }

        Sparrow longLeggedSparrow = new Sparrow();
        longLeggedSparrow.setColor("Black");
        longLeggedSparrow.setLegSize("Hundred");

        Crow sweetSoundCrow = new Crow();
        sweetSoundCrow.setSound("kooKoo");

        BirdRegistry birdRegistry = new BirdRegistry();
        birdRegistry.registerBird("sweetSoundCrow", sweetSoundCrow);
        birdRegistry.registerBird("longLeggedSparrow", longLeggedSparrow);

        List<String> getBirdOfTypes = List.of(
                "sweetSoundCrow",
                "longLeggedSparrow",
                "sweetSoundCrow"
        );

        List<Bird> requestedBirds = new ArrayList<>();

        for(String type : getBirdOfTypes){
            requestedBirds.add(birdRegistry.getBird(type));
        }

        System.out.println("Done");
    }
}

/*

 */