package Lesson1;

public class Main {

    public static void main(String[] args) {
        Team team1 = new Team("Бригада");
        team1.printInformationAboutTheTeam();
        Team team2 = new Team("Братва");
        team2.printInformationAboutTheTeam();
        Course course = new Course();
        course.printInformationAboutTheObstacle();
        course.passObstacles(team1);
        course.passObstacles(team2);
        team1.passedTheDistance();
        team2.passedTheDistance();
    }
}
