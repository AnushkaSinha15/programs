import java.util.Scanner;

public class Student
{
     String name;
     int mm;
     int scm;
     int comp;

    public Student(String n, int m, int sc, int c)
    {
        name = n;
        mm = m;
        scm = sc;
        comp = c;
    }

     String check()
    {
        String course = "Not Eligible";
        double avg = (mm + scm + comp) / 3.0;
        
        if (mm >= 90 && scm >= 90 && comp >= 90)
            course = "Science with Computer";
        else if (avg >= 90)
            course = "Bio-Science";
        else if (avg >= 80)
            course = "Science with Hindi";

        return course;
    }
    
    public void display() 
    {
        String eligibility = check();
        System.out.println("Eligibility: " + eligibility);
    }
    
    public static void main(String args[]) 
    {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String n = in.nextLine();
        System.out.print("Enter Marks in Maths: ");
        int maths = in.nextInt();
        System.out.print("Enter Marks in Science: ");
        int sci = in.nextInt();
        System.out.print("Enter Marks in Computer: ");
        int compSc = in.nextInt();
        
        Student obj = new Student(n, maths, sci, compSc);
        obj.display();
    }
}