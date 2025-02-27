public class Students {
public String name;
public String[] subject = {"Biology", "English", "Mathematics"};
public String[] grade = {"A", "B", "C", "D"};

Students(String name){
    this.name = name;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSubject() {
        return subject;
    }

    public String getGrade() {
        return grade[3];
    }
}
