package students;

public class Main {
    public static void main(String[] args) {
        Students[] roster = {
                new Students(1, "Fargana", 70),
                new Students(2, "Saadat", 60),
                new Students(3, "Agha", 89),
                new Students(4, "Aysun", 60),
                new Students(5, "Lilya", 98)
        };
        System.out.println("===== Student Roster =====");
        for (Students std : roster){
            std.listOfStudent();
        }
        System.out.println("===== Top Student =====");
        Students top = roster[0].findTopStudent(roster);
        top.listOfStudent();
    }
}