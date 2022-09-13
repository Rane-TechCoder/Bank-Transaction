package myproject;
import java.util.*;
public class bank_statement
{
    double amt=0;
    String ministate [][]=new String[20][4];
            int i=0;
            int temp;

    Scanner sc=new Scanner(System.in);
  
    //Check Balance
    void CheckBalance()
    {
        System.out.println("Available Balance: "+amt);
    }
    //Deposite Amount
    void Deposite()
    {
        System.out.println("Enter Deposite Amount");
        int dep=sc.nextInt();
        amt += dep;
               MiniStatement("Deposite",dep,amt);

    }
    //withdraw
    void Withdraw()
    {
        System.out.println("Enter Withdraw Amount");
        int wid=sc.nextInt();
        if(amt<wid)
        {
            System.out.println("Available Balance is low \nPlease Deposite...!");
        }
        else{
        amt -= wid;
       MiniStatement("Withdraw",wid,amt);
        }
    }
    
     void MiniStatement(String S,int Word,double bal)
    {
        String word1=String.valueOf(Word);	//convert int value to String value
        String Bal=String.valueOf(bal);		//convert int value to String value
        
         temp=++i;
        String Temp1=String.valueOf(temp);	//convert int value to String value
        
        ministate[i][0]=Temp1;
        ministate[i][1]=S;
        ministate[i][2]=word1;
        ministate[i][3]=Bal;
        
        
    }
    void PrintStatement()
    {
        ministate[0][0]="No";
             ministate[0][1]="Process";
            ministate[0][2]="Wid/Dep";
            ministate[0][3]="Amount";
        for(int k=0;k<temp+1;k++)
        {
            for(int l=0;l<4;l++)
            {
        		System.out.print(ministate[k][l] + "   ");
            }
            System.out.println();
        }
    }
   
    
	public static void main(String[] args) 
	{
	    int ch;
	        Scanner sc=new Scanner(System.in);

	        bank_statement M=new bank_statement();
	    System.out.println("Press \n 1.Check Balance  \n 2.Deposite  \n 3.Withdraw \n 4.Mini Statement  \n 5.Exit");
	    while(true)
	    {
	    System.out.println("Enter Your Choice");
	    ch=sc.nextInt();
	    
	        switch(ch)
	        {
	            case 1:
	                {
	                    M.CheckBalance();
	                    break;
	                }
	            case 2:
	                {
	                    M.Deposite();
	                    break;
	                }
	           case 3:
	               {
	                   M.Withdraw();
	                   break;
	               }
	           case 4:
	               {
	                   M.PrintStatement();
	                   break;
	               }
	           case 5:
	               {
	                   return;
	               }
	        }
	        
	    }
	    
	}
}

/*

Enter 1.Check Balance   2.Deposite   3.Withdraw 
		 4.Mini Statement   5.Exit
Enter Your Choice
2
Enter Deposite Amount
3000
Enter Your Choice
2
Enter Deposite Amount
3000
Enter Your Choice
3
Enter Withdraw Amount
2000
Enter Your Choice
3
Enter Withdraw Amount
1000
Enter Your Choice
2
Enter Deposite Amount
5000
Enter Your Choice
3
Enter Withdraw Amount
3000
Enter Your Choice
1
Available Balance: 5000.0
Enter Your Choice
4
No   Process   Wid/Dep   Amount   
1   Deposite   3000   3000.0   
2   Deposite   3000   6000.0   
3   Withdraw   2000   4000.0   
4   Withdraw   1000   3000.0   
5   Deposite   5000   8000.0   
Enter Your Choice
5

*/
