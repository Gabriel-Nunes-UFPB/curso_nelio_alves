package util;

public class Student {
    public String name;
    public double grade1, grade2, grade3;

    public double finalGrade(){
        return (grade1 + grade2 + grade3);
    }

    public String aprovacao(){
        if(finalGrade() < 60){
            return "FAILED\nFINAL GRADE: " + finalGrade() + "\nMISSING " + (60 - finalGrade()) + " POINTS!";


        } else {
            return "PASS\nFINAL GRADE: " + finalGrade();
        }
    }
}
