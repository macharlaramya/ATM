package project_atm;


	import java.util.Scanner;


	public class newclass1{
	    public static void main(String[] args){
	        int pin;
	        int password=1234;
	        int count=0;
	        double deposite=0.0;
	        double balance=0.0;
	        double withdraw=0.0 ;
	        double PayBill=0.0;
	        double ChangePin=0000;
	        int Exit;
	        int entry;
	        boolean istrue=true;
	        
	        do
	        {
	          System.out.println("Welcome to  ATM services"); 
	          System.out.println("Enter your pin");
	          Scanner sc= new Scanner(System.in);
	          pin=sc.nextInt();
	          
	          if(pin==password)
	          {
	              do
	              {
	                   System.out.println("Welcome to  ATM services"); 
	             System.out.println("1. Deposite");
	            System.out.println("2. Balance");
	            System.out.println("3. Withdraw");
	            System.out.println("4. PayBill");
	            System.out. println("5. ChangePin");
	            System.out.println("6. Exit");
	            System.out.println("choose an option");
	            Scanner en=new Scanner(System.in);
	            entry= en.nextInt();
	             switch(entry)
	            {
	                case 1:
	                   System.out.println("Deposite an amount in dollar");
	                   deposite=sc.nextInt();
	                   balance = balance + deposite;
	                   System.out.println("Your new balance is $" +balance);
	                   System.out.println("your deposite is done successfully"+" thank you");
	                   System.out.println(" ");
	                   break; 
	                
	                case 2:
	                    System.out.println(balance+" is the current balance ");
	                    break;
	                case 3:
	                     System.out.println("Wthdraw an amount");
	                     withdraw=sc.nextDouble(); 
	                      if(balance>=withdraw){
	                          balance = balance - withdraw;
	                          System.out.println("please take your money");
	                      }
	                      else{
	                          System.out.println("sorry you have insufficient balance");
	                       }
	                     System.out.println(" ");
	                     break;
	                case 4:
	                    Scanner py = new Scanner(System.in);
	                    System.out.println("Pay your bills");
	                    
	                     System.out. println("1.school fees");
	                     System.out. println("2.ECG");
	                     System.out.println("3.Water bills");
	                     System.out.println("select the bill you want to pay");
	                     
	                      PayBill =py.nextDouble();
	                       System.out.println("pay your amount");
	                      int joe =py.nextInt();
	                     
	                      switch(joe){
	                          case 1:
	                              
	                              if(PayBill==balance){  
	                              double amount;
	                              amount = deposite;
	                              balance = 0;
	                             balance=balance-amount;
	                             }else{
	                             System.out.println("balance insufficient");
	                              }
	                              break;
	                          case 2:
	            
	                               if(PayBill==balance){  
	                              double amount;
	                              amount = deposite;
	                              balance = 0;
	                             balance=balance-amount;
	                             }else{
	                             System.out.println("balance insufficient");
	                             break;
	                              }
	                          case 3:
	                    
	                               if(PayBill==balance){  
	                              double amount;
	                              amount = deposite;
	                              balance = 0;
	                             balance=balance-amount;
	                             }else{
	                             System.out.println("balance insufficient");
	                             break;
	                              }
	                          }  
	                           
	                               System.out.print("payment made sucessfully ");
	                      
	                   
	                    break;
	                  case 5:
	                      System.out.println("Change your pin");
	                      break;
	                  default:
	                      System.out.println("Exist the programe");
	                      istrue = false;
	                      break;
	            } 
	              }while(istrue != false);   
	     
	             System.out.println("Welcome to Joe Franklin ATM services"); 
	             System.out.println("1. Deposite");
	            System.out.println("2. Balance");
	            System.out.println("3. Withdraw");
	            System.out.println("4. PayBill");
	            System.out. println("5. ChangePin");
	            System.out.println("6. Exit");
	            System.out.println("choose an option");
	            Scanner en=new Scanner(System.in);
	            entry= en.nextInt();
	             switch(entry)
	            {
	                case 1:
	                   System.out.println("Deposite an amount in dollar");
	                   deposite=sc.nextInt();
	                   balance = balance + deposite;
	                   System.out.println("Your new balance is $" +balance);
	                   System.out.println("your deposite is done successfully"+" thank you");
	                   System.out.println(" ");
	                   break; 
	                
	                case 2:
	                    System.out.println(balance+" is the current balance ");
	                    break;
	                case 3:
	                     System.out.println("Wthdraw an amount");
	                     withdraw=sc.nextDouble(); 
	                      if(balance>=withdraw){
	                          balance = balance - withdraw;
	                          System.out.println("please take your money");
	                      }
	                      else{
	                          System.out.println("sorry you have insufficient balance");
	                       }
	                     System.out.println(" ");
	                     break;
	                case 4:
	                    Scanner py = new Scanner(System.in);
	                    System.out.println("Pay your bills");
	                    
	                     System.out. println("1.school fees");
	                     System.out. println("2.ECG");
	                     System.out.println("3.Water bills");
	                     System.out.println("select the bill you want to pay");
	                     
	                      PayBill =py.nextDouble();
	                       System.out.println("pay your amount");
	                      int joe =py.nextInt();
	                     
	                      switch(joe){
	                          case 1:
	                              
	                              if(PayBill==balance){  
	                              double amount;
	                              amount = deposite;
	                              balance = 0;
	                             balance=balance-amount;
	                             }else{
	                             System.out.println("balance insufficient");
	                              }
	                              break;
	                          case 2:
	            
	                               if(PayBill==balance){  
	                              double amount;
	                              amount = deposite;
	                              balance = 0;
	                             balance=balance-amount;
	                             }else{
	                             System.out.println("balance insufficient");
	                             break;
	                              }
	                          case 3:
	                    
	                               if(PayBill==balance){  
	                              double amount;
	                              amount = deposite;
	                              balance = 0;
	                             balance=balance-amount;
	                             }else{
	                             System.out.println("balance insufficient");
	                             break;
	                              }
	                          }  
	                           
	                               System.out.print("payment made sucessfully ");
	                      
	                   
	                    break;
	                  case 5:
	                      System.out.println("Change your pin");
	                      break;
	                  default:
	                      System.out.println("Exist the programe");
	                      istrue = false;
	                      break;
	            } 
	          }
	        
	        else{
	        count++; 
	          if(count == 3)
	              istrue=false;
	                else
	                System.out.println("incorrect password");
	                }
	    }while(istrue!= false);
	}
	}

