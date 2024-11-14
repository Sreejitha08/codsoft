import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        System.out.println("Welcome to student grade calculator!!");
        System.out.println("Enter the number of subjects:");
        int subjects=o.nextInt();
        int totalmarks=0;
        for(int i=1;i<=subjects;i++)
        {
            System.out.println("Enter the marks of subject "+i);
            int marks=o.nextInt();
            totalmarks=totalmarks+marks;
        }
        float average=(float)totalmarks/subjects;
        char grade;
        if(average>90)
        {
            grade='A';
        }
        else if(average>80)
        {
            grade='B';
        }
        else if(average>70)
        {
            grade='C';
        }
        else if(average>60)
        {
            grade='D';
        }
        else if(average>50)
        {
            grade='E';
        }
        else{
            grade='F';
        }
        System.out.println("Total marks is: "+totalmarks);
        System.out.println("average percentage is: "+average);
        System.out.println("Your grade is: "+grade);
        o.close();
    }
}
