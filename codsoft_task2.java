import java.util.Scanner;
public class StudGradeCal{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number of subjects");
        int subs = s.nextInt();
        int[] mrks = new int[subs];
        for (int j = 0; j < subs; j++) {
            System.out.println("enter subject marks" + (j + 1) + " is: ");
            mrks[j] = s.nextInt();
        }
        int tot = 0;
        for (int j = 0; j < subs; j++) {
            tot += mrks[j];
        }
        double avg = (double) tot / subs;
        char grade;
        if (avg >= 95) {
            grade = 'O';
        }
       else if (avg >= 85) {
            grade = 'A';
        }
        else if (avg >= 75) {
            grade = 'B';
        }
        else if (avg >= 65) {
            grade = 'C';
        }
        else if (avg >= 45) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Total marks:" + tot);
        System.out.println("Average percentage:" + avg);
        System.out.println("Grade obtained:" + grade);
    }
}
