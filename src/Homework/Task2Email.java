package Homework;

public class Task2Email {

    String createEmail (String firstName, String lastName,String emailType){
        String symbol = "@";
        String completeEmail = firstName+lastName+symbol+emailType;
        return completeEmail;
    }

    public static void main(String[] args) {
        Task2Email user = new Task2Email();
        String completeEmail = user.createEmail("john","snow","gmail.com");
        System.out.println(completeEmail);
    }
}
