package Homework;

public class Task1Language {

    void HelloWord (String country){
        switch (country){
            case "Ukraine":
                System.out.println("Pryvit");
                break;
            case "USA":
                System.out.println("Hello");
                break;
            case "France":
                System.out.println("Bonjour");
                break;
            case "Mexico":
                System.out.println("Hola");
                break;
            default:
                System.out.println("Your country is not listed");
        }
    }

    public static void main(String[] args) {

        Task1Language language = new Task1Language();
        language.HelloWord("Ukraine");
        language.HelloWord("USA");
        language.HelloWord("France");
        language.HelloWord("Mexico");
    }
}
