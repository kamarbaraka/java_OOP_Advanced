package interfaces;

class EnumsTest{
    public static void main(String[] args) {
        var student = new Student("kamar", "baraka", 1234, 2023);
        var professor = new Professor("evans", "murunga", 1475, "java");
        var assistant = new Assistant("karimi", "wanjugu", 2567, true);

        student.goToCollege();
        professor.goToCollege();
        assistant.goToCollege();

        student.studyAtHome();
        professor.teachToOtherPeople();
        assistant.studyAtHome();
        assistant.teachToOtherPeople();

    }
}

public interface LearningPerson {

    void studyAtHome();
}

interface TeachingPerson{

    void teachToOtherPeople();
}

abstract class CollegePerson{

    private String name, surname;
    private int collegeId;

    public CollegePerson(String name, String surname, int collegeId) {
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    void goToCollege(){
        System.out.printf("name= %s, surname= %s, collegeId= %s\n", name, surname, collegeId);
    }
}

class Student
    extends CollegePerson
        implements LearningPerson{

    private int academicYear;

    public Student(String name, String surname, int collegeId, int academicYear){
        super(name, surname, collegeId);
        this.academicYear = academicYear;
    }

    public int getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(int academicYear) {
        this.academicYear = academicYear;
    }

    @Override
    public void studyAtHome() {
        System.out.println("I'm a student that can learn");
    }
}

class Professor
    extends CollegePerson
        implements TeachingPerson{

    private String teachingSubject;

    public Professor(String name, String surname, int collegeId, String subject){

        super(name, surname, collegeId);
        this.teachingSubject = subject;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("I'm a professor that can teach");
    }
}

class Assistant
    extends CollegePerson
        implements LearningPerson, TeachingPerson{

    private boolean isGoingToBeAPhd;

    public Assistant(String name, String surname, int collegeId, boolean willBeAPhd){

        super(name, surname, collegeId);
        this.isGoingToBeAPhd = willBeAPhd;
    }

    public boolean isGoingToBeAPhd() {
        return isGoingToBeAPhd;
    }

    public void setGoingToBeAPhd(boolean goingToBeAPhd) {
        isGoingToBeAPhd = goingToBeAPhd;
    }

    @Override
    public void studyAtHome() {
        System.out.println("I can study");
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("I can teach");
    }
}
