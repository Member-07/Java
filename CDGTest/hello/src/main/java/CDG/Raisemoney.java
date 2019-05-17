package CDG;

public class Raisemoney {
		 static int money;
		 
		 public Object getBalance() {
		
		  return money ;
		 }

		 public void deposit(int i) {
		    money += i;
		    
		 }

		 public void withdraw(int i) {
		  money -= i;
		  
		 }
		 
		
	
}
