
package deiparine.it2c;
import java.util.Scanner;

public class Input {
    public void pInput(){
        Scanner input = new Scanner(System.in);
        Output output = new Output();
        
        System.out.print("Enter no. of applicants: ");
        int num = input.nextInt();
        
        for( int i=0; i<num; i++){
            System.out.print("Enter the details of applicant no."+(i+1)+"\n");
            System.out.print("ID: ");
            int id = input.nextInt();
            System.out.print("Name: ");
            String name = input.next();
            System.out.print("Monthly Income: ");
            int month = input.nextInt();
            System.out.print("Credit Score: ");
            int credit = input.nextInt();
            System.out.print("Existing Loan: ");
            int loan = input.nextInt();
            
            output.addAppli(i + 1, name, id, month, credit, loan);
            output.viewAppli();
        }
        
    }
}
