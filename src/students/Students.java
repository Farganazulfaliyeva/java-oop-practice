package students;

public class Students {
    int studentId;
    String name;
    int grade;

    public Students(int studentId, String name, int grade){
        this.studentId=studentId;
        this.name=name;
        this.grade=grade;
    }
    public void listOfStudent(){
        System.out.println("ID: " + studentId);
        System.out.println("Students: " + name);
        System.out.println("Student's grade: "+ grade);
        System.out.println("________________________________");
    }
    public Students findTopStudent(Students[] students){
        Students top = students[0];
        for (int i =1; i<students.length; i++){
           if (students[i].grade > top.grade){
               top = students[i];
           }
        }
        return top;
    }
}