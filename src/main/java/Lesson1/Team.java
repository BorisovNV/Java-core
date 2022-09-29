package Lesson1;

import java.util.*;

public class Team {

    private String nameTeam = "unknown";
    Animal[] zoo = {new Cat("Щегол"), new Cock("Шпора"), new Hippo("Большой"), new Cock("Гребень"), new Cat("Шустрый"),
            new Hippo("Толстокожий")};
    public Animal[] teamAnimal = new Animal[5];
    Random random = new Random();

    public Team(String nameTeam) {
        this.nameTeam = nameTeam;
        for(int i = 0; i < 5; i++){
            int ran = random.nextInt(5);
            teamAnimal[i] = zoo[ran];
        }
    }

    public void printInformationAboutTheTeam() {
        System.out.println("Команда: " + nameTeam + "\n");
        for(Animal a : teamAnimal) {
            System.out.println(a);
            System.out.println("Лимит бега: " + a.run_limit + " м.");
            if (a instanceof Swim)
                System.out.println("Лимит плавания: " + ((Swim) a).getSwimLimit() + " м.");
            if (a instanceof Jump)
                System.out.println("Лимит прыжка: " + ((Jump) a).getJumpLimit() + " м.");
            System.out.println();
        }
        System.out.println();
    }

    public void passedTheDistance(){
        System.out.println(nameTeam);
        for (Animal a : teamAnimal){
            if(a.passing){
                System.out.println(a + " задача выполнена.");
            } else {
                System.out.println(a + " не получилось.");
            }
            System.out.println();
        }

    }
}