import java.util.ArrayList;

public class Grades{
    protected String grade;
    public ArrayList<String> gradeListBio = new ArrayList<>();



    public String setScore(int score){
        if(score >= 10 && score <=50){
            System.out.println("Lock in!");
            grade = "D";
            return grade;
        } else if (score >=51 && score<= 60) {
            System.out.println("Just barely passed");
            grade = "C";
            return grade;
        } else if (score >= 61 && score <= 70) {
            System.out.println("Ok not bad");
            grade = "B";
            return grade;
        } else if (score >= 71 && score <= 80) {
            System.out.println("Fair play, you smashed it!");
            grade = "A";
            return grade;
        }else if (score >= 81 && score <= 100) {
            System.out.println("Hmm, a bit sus!");
            grade = "A+";
            return grade;
        } else{
            System.out.println("Have some shame.");
            grade = "Fail";

        }
        return grade;
    }

    public void addBioGrade(String grade){
        gradeListBio.add(grade);
    }


    //This should be in the Grades class
    public void getGrade() {
        for (String g : gradeListBio) {
            System.out.print(g + " ");
        }
        System.out.print("Your Current Grades are: " + gradeListBio.getLast());
    }
}
