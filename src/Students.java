import java.util.ArrayList;

public class Students extends Grades {
    public String[] subject = {"Biology", "English", "Mathematics"};

    Students() {
        super();
    }
}




//    public String setGrade(String gradeListBio, int score) {
//        this.gradeListBio = super.setGrade(score);
//        return this.gradeListBio;
//    }
//
//    public String[] setGrade(String gradeListBio, int score) {
//        this.gradeListBio = new String[]{super.setGrade(score)};
//        return this.gradeListBio;
//    }

//        public String setGrade(ArrayList<String> gradeListBio, int score){
//            String newGrade = super.setScore(score); //translate the score (int) to gradeListBio letter (string)
//            super.grade= gradeListBio.add(grade);// Store the gradeListBio in the first element of the array
//            return newGrade;
//        }

//        public String getBiograde(grade){
//            for (String grade : super.gradeListBio) {
//                System.out.println(grade);
//            }
//        }


