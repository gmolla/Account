package Account2;
 
public class Account {
	private int balance;
	public int getBalance(){
		return balance;
	}
	public void setBalance(int balance){
		this.balance=balance;
	}
	public int credit(int b){
		balance +=b;
		return balance;
	}
	public int debit(int b){
		balance -=b;
		if(balance<0){
			System.out.printf("Not Enough Money!\n");
			balance +=b;
			return 0;
		}
		else
			return balance;
	}
	public void balanceCheck(){
		System.out.printf("Current Balance: %d\n", balance);
	}
}