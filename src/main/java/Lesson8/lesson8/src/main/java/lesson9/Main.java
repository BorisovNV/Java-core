package lesson9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Courses physicsM = new Courses("Юриспруденция", "Законов");
        Courses physicsT = new Courses("Программирование", "Жавакорова");
        Courses physicsN = new Courses("Экономика","Рублев");
        Courses chemistry = new Courses("Теория вероятностей", "Теорверов");
        Courses theoryOfGames = new Courses("Картография", "Землянова");
        Courses notCourse = new Courses("Нет", "Нет");
        Courses math = new Courses("Геодезия", "Фетяхин");

        Students student1 = new Students("Николаев");
        List<Course> student1Courses = new ArrayList<>();
        student1Courses.add(physicsM);
        student1Courses.add(chemistry);
        student1Courses.add(math);
        student1.setStudentCourses(student1Courses);

        Students student2 = new Students("Смирнова");
        List<Course> student2Courses = new ArrayList<>();
        student2Courses.add(physicsM);
        student2Courses.add(physicsN);
        student2Courses.add(physicsT);
        student2.setStudentCourses(student2Courses);

        Students student3 = new Students("Агеев");
        List<Course> student3Courses = new ArrayList<>();
        student3Courses.add(theoryOfGames);
        student3Courses.add(math);
        student3Courses.add(physicsM);
        student3Courses.add(physicsT);
        student3.setStudentCourses(student3Courses);
    }
}
