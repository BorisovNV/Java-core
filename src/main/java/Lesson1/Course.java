package Lesson1;

import java.util.*;

public class Course {
    Let[] let = new Let[3];
    Random random = new Random();
    // Создаем полосу препятствий
    public Course() {
        Track track = new Track(random.nextInt(100));
        Wall wall = new Wall(random.nextFloat() * 10);
        Pool pool = new Pool(random.nextInt(100));
        let[0] = (Let) track;
        let[1] = (Let) wall;
        let[2] = (Let) pool;
    }
    //Вывод информации о полосе препятствий
    public void printInformationAboutTheObstacle() {
        System.out.println("Длина пути: " + ((Track) let[0]).getLength() + " м.");
        System.out.println("Высота стены: " + ((Wall) let[1]).getHeight() + " м.");
        System.out.println("Длина бассейна: " + ((Pool) let[2]).getLength() + " м.");
        System.out.println();
    }
    // Проходим полосу препятствий
    public void passObstacles(Team team){
        for(Animal animal : team.teamAnimal){
            for(Let l : let){
                if(!l.doIt(animal)){
                    animal.setPassing(l.doIt(animal));
                    break;
                }
                animal.setPassing(true);
            }
        }
    }
}

