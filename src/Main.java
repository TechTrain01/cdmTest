import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Students a = new Students();
        System.out.print("""
                Select which Subject you would like to Access:
                1. Biology
                2. English
                3. Mathematics
                4. Exit \n""");
        var subject = scan.nextInt();



        switch(subject){
            case 1, 2, 3:
                a.getSubject(subject);
                a.getGrade();
                System.out.println("""
            Select from options below:
            1. Add new Score
            2. Go Back
            3. Exit""");
                var option = scan.nextInt();
                if(option == 1){
                    System.out.print("Whats the new Score:");
                    int value = scan.nextInt();
                    a.setGrade("grade", value); // Corrected method call

                    System.out.println("Grade: " + a.grade); // Print the grade from the array

                    scan.close();
                }
                break;
            case 4:
//                    You have exited the screen
                break;

        }






    }
}
