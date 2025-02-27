public class GradeChecker{
//    HashMap<Integer, Integer> D = people.put(0,50);
//    HashMap<Integer, Integer> C = people.put(51,60);
//    HashMap<Integer, Integer> B = people.put(61,70);
//    HashMap<Integer, Integer> A = people.put(71,100);
    protected String grade;




    public String setGrade(int score){
        if(score >= 10 && score <=50){
            System.out.println("Lock in, you got a D!");
            grade = "D";
            return grade;
        } else if (score >=51 && score<= 60) {
            System.out.println("Just barely passed: C");
            grade = "C";
            return grade;
        } else if (score >= 61 && score <= 70) {
            System.out.println("Ok not bad: B");
            grade = "B";
            return grade;
        } else if (score >= 71 && score <= 80) {
            System.out.println("Fair play, you smashed it! A");
            grade = "A";
            return grade;
        }else if (score >= 81 && score <= 100) {
            System.out.println("Hmm, a bit sus! A+");
            grade = "A+";
            return grade;
        } else{
            System.out.println("Have some shame.");
            grade = "Fail";

        }
        return grade;
    }
}
