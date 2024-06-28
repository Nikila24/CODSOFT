import java.util.*;  
public class Atm  
{   
    public static void main(String args[] )  
    {    
        int bal = 16000, withdraw, depo;    
        Scanner sc = new Scanner(System.in);  
        while(true)  
        {   
            System.out.println("1.Withdraw");  
            System.out.println("2.Deposit");  
            System.out.println("3.Check Balance");  
            System.out.println("4.Exit");  
            System.out.print("Enter your choice:");   
            int ch = sc.nextInt();  
            switch(ch)  
            {  
                case 1:
                System.out.print("Enter the  amount to be withdrawn:");  
                withdraw = sc.nextInt();     
                if(bal >= withdraw)  
                {    
                  bal = bal - withdraw;  
                  System.out.println("please collect your money.Remaining balance:"+bal);  
                }  
                else  
                {    
                  System.out.println("Insufficient Balance.Withdrawal failed!");  
                }  
                System.out.println("");  
                break;  
   
                case 2:
                System.out.print("Enter money to be deposited:");  
                depo = sc.nextInt();    
                bal = bal + depo;  
                System.out.println("Your Money has been successfully deposited.New balance:"+bal);  
                System.out.println("");  
                break;  
   
                case 3:
                System.out.println("Current Balance : "+bal);  
                System.out.println("");  
                break;  
   
                case 4:   
      
                System.out.println("Exiting.Thank you!");  
                System.exit(0);
            }  
        }  
    }  
}  
