import javax.security.auth.Subject;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Students a = new Students();
//        Grades g = new Grades();
        Subject s = new Subject();
        System.out.print("""
                Select which Subject you would like to Access:
                1. Biology
                2. English
                3. Mathematics
                4. GradeBoundaries
                5. Exit \n""");
        var subject = scan.nextInt();



        switch(subject){
            case 1, 2, 3:
                try{
                    a.getGrade();
                }catch(Exception e) {
                    System.out.println("No grade in system atm");
                }
                System.out.println("""
            Select from options below:
            1. Add new Score
            2. Go Back
            3. Exit""");
                var option = scan.nextInt();
                if(option == 1){
                    System.out.print("Whats the new Score:");
                    int value = scan.nextInt();
                    a.addBioGrade(a.setScore(value)); // So its gets the value and converts to grade => adds to bio listarray
                    System.out.println("Grade: " + a.gradeListBio); // Print the gradeListBio from the array

                    scan.close();
                }
                break;
            case 4:
//                    Print the gradeboundaries for each grade
                break;

        }






    }
}
