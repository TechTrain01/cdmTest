import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    enum Currency {
        STERLING,
        DOLLARS,
        YEN,
        EUROS,
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Students a = new Students("Hannah");
//        System.out.println("Subject List: " + subjectlist);
        System.out.print("Select which subject you would like to Access:" +
                "1. Biology" +
                "2. English" +
                "3. Mathematics" +
                "4. Exit");
        var option = scan.nextInt();



        switch(option){
            case 1:
                System.out.println("Your current Grade: " + a.getGrade());
                break;
            case 2:
                System.out.println("English");
                break;
            case 3:
                System.out.println("Mathematics");
                break;
            case 4:
//                    You have exited the screen
                break;

        }

    }
}
