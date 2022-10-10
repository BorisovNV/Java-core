package Check2;

public class Main {
    public static void main(String[] args){
        System.out.println("Creating a new phonebook");
        Phonebook phonebook = new Phonebook();
        System.out.println("-----------------");

        System.out.println("Filling out the phonebook");
        phonebook.add("Peters", "26677667");
        phonebook.add("Peters", "28856798");
        phonebook.add("o'Connor", "24684344");
        phonebook.add("Fergusson", "27899876");
        phonebook.add("Peters", "25060706");
        System.out.println("-----------------");

        System.out.println("Getting numbers");
        System.out.println("Peters");
        System.out.println(phonebook.get("Peters"));
        System.out.println("o'Connor");
        System.out.println(phonebook.get("o'Connor"));
        System.out.println("Fergusson");
        System.out.println(phonebook.get("Fergusson"));
        System.out.println("-----------------");

        System.out.println("Record missing");
        System.out.println("Potter");
        System.out.println(phonebook.get("Potter"));
        System.out.println("-----------------");

        System.out.println("Trying to write down an existing number");
        phonebook.add("Peters", "26677667");
        System.out.println("Peters");
        System.out.println(phonebook.get("Peters"));
    }
}
