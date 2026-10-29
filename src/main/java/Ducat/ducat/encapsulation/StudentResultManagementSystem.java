package Ducat.ducat.encapsulation;



class Student{
    private int studentId;
    private String studentname;
    private double marks;
    private char grade;

    public void setStudentId(int studentId){
        if(studentId>=1000 && studentId<=9999){
            this.studentId=studentId;
        }else{
            System.out.println("Invalid input. Can't update");
        }

    }

    public int getStudentId(){
        return studentId;
    }   

    public void setStudentname(String studentname){
        if(studentname!=null && !studentname.trim().isEmpty()){
            this.studentname=studentname;
        }else{
            System.out.println("Invalid name. Can't update");
        }
    }

    public String getStudentname(){
        return studentname;
    }

    public void setMarks(double marks){
        if(marks>=0 && marks<=100){
            this.marks=marks;
        }else{
            System.out.println("Invalid input. Can't update");
        }

    }

    public double getMarks(){
        return marks;
    }

   public void calculateGrade(){
    if(marks>=90){
        grade='A';
    }else if(marks>=75){
        grade='B';
    }else if(marks>=50){
        grade='C';
    }else{
        grade='F';
   }
}


   public void displayStudentDetails(){
    System.out.println("Student Id: " + studentId);
    System.out.println("Student Name: " + studentname);
    System.out.println("Marks: " + marks);
    System.out.println("Grade: " + grade);
   }


  



}


public class StudentResultManagementSystem {

   public static void main (String [] args){
    Student student=new Student();
    student.setStudentId(1001);
    student.setStudentname("Jatin Rout");
    student.setMarks(85);
    student.calculateGrade();
    student.displayStudentDetails();

   }

    
}
