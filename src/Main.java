import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal[] animal = {new Shark("Shark1"), new Turtle("Turtle1"), new Eagle("Eagle1"), new Shark("Shark2"), new Turtle("Turtle2"), new Eagle("Eagle2")};
        for (Animal animals : animal) {
            if (animals instanceof Shark) {
                ((Shark) animals).attack();
            } else if (animals instanceof Turtle) {
                ((Turtle) animals).swim();
            } else if (animals instanceof Eagle) {
                ((Eagle) animals).fly();
            }
        }

        sortByClass(animal);

    }

    public static void sortByClass(Animal[] animals) {


        int sharkCount = 0;
        int turtleCount = 0;
        int eagleCount = 0;


        for (int i = 0; i < animals.length; i++) {
            if (animals[i].getClass() == Shark.class) {
                sharkCount++;
            } else if (animals[i].getClass() == Turtle.class) {
                turtleCount++;
            } else if (animals[i].getClass() == Eagle.class) {
                eagleCount++;
            }
        }
        Shark[] sharks = new Shark[sharkCount];
        Turtle[] turtles = new Turtle[turtleCount];
        Eagle[] eagles = new Eagle[eagleCount];

//        for (int i = 0; i < sharks.length; i++) {
//            for(Animal animal:animals){
//                if (animal.getClass()==Shark.class){
//                    sharks[i]=(Shark) animal;
//                }
//            }
//        }


        int sharkIndex = 0;
        int turtleIndex = 0;
        int eagleIndex = 0;
        for (Animal animal : animals) {
            if (animal.getClass() == Shark.class) {

                sharks[sharkIndex] = (Shark) animal;
                sharkIndex++;
            } else if (animal.getClass() == Turtle.class) {

                turtles[turtleIndex] = (Turtle) animal;
                turtleIndex++;
            } else if (animal.getClass() == Eagle.class) {

                eagles[eagleIndex] = (Eagle) animal;
                eagleIndex++;
            }

        }


        System.out.println("\n\nSharks: ");
        for (int i = 0; i < sharks.length; i++) {
            System.out.print(sharks[i].getName()+"  ");
        }
        System.out.println("\nTurtles: ");
        for (int i = 0; i < turtles.length; i++) {
            System.out.print(turtles[i].getName()+"  ");
        }
        System.out.println("\nEagles: ");
        for (int i = 0; i < eagles.length; i++) {
            System.out.print(eagles[i].getName()+"  ");
        }

    }

}