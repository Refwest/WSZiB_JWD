package modifieres.laboratory14;

import java.util.Random;

public class AnimalShelter {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println();

        Animal[] animalShelter = new Animal[100];

        Animal[] animals = {new Kot(), new Pies(), new Papuga()};
//        System.out.println(animals[0].getType());
//        animalShelter[0] = animals[0];
//        System.out.println(random.nextInt(3));
       System.out.println(animalShelter[random.nextInt(3)].getType());

        for (int i = 0; i < 100; i++) {
            animalShelter[i] = animals[random.nextInt(3)];
        }

        for (int j = 0; j < 100; j++) {
            System.out.println(animalShelter[j].getType());
        }









//        for (int i = 0; i < 100; i++) {
//
//            switch (random.nextInt()) {
//                case 0 -> new Kot();
//                case 1 -> new Pies();
//                case 2 -> new Papuga();
//            }
//        }


//        animalShelter[0] = new Kot();

//        System.out.println(animalShelter[0].getT);

//        Kot kot1 = new Kot();
//        System.out.println(kot1.getType());


    }
}
