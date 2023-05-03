package Homework;

public class Task4Student {

    char getGrade (int score){

        if (score>90){
            return 'A';
        } else if (score>80){
            return 'B';
        } else if (score>70){
            return 'C';
        } else if (score>50){
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {

        Task4Student student = new Task4Student();
        int score = 99;
        char grade = student.getGrade(score);
        System.out.println(grade);
    }
}
