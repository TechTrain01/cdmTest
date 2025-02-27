import java.util.ArrayList;

public class Students extends GradeChecker{
public String[] subject = {"Biology", "English", "Mathematics"};
    public ArrayList<String> grade = new ArrayList<>()
//public Map<String, String> gradeSbj = Map.of(
//        "Biology", "D",
//        "English", "D",
//        "Mathematics", "D"
//Map<String, String> gradeSbj = new HashMap<String, String>() {{
//    put("Biology", "D");
//    put("English", "D");
//    put("Mathematics", "D");
//}};
;

Students(){
    super();
}

    public void getSubject(int val) {
        System.out.println(subject[val -1]);
    }

    public void  getGrade() {
        System.out.print("Your Current Grade is: " +grade[]+ "\n");
    }

//    public String setGrade(String grade, int score) {
//        this.grade = super.setGrade(score);
//        return this.grade;
//    }
//
//    public String[] setGrade(String grade, int score) {
//        this.grade = new String[]{super.setGrade(score)};
//        return this.grade;
//    }

    public String setGrade(String grade, int score) {
        String newGrade = super.setGrade(score);
        this.grade.add(newGrade);// Store the grade in the first element of the array
        return newGrade;
    }
}