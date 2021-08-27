package ver2;

public class Account {
	private double balance;
	private String name;
	public double getBalance() {
		return balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name ) {
		this.name = name;
	}
	public Account(double balance) {
		this("Unknown", balance);
	}
	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
		}
	}
	public void mergeAccount(Account a) {
		if(this.getName().equals(a.getName())) {
			this.balance+= a.getBalance();
		}
	}
	public void withdraw(double amount) {
		if(amount > 0) {
			balance -= amount;
		}
	}
	public String toString() {
		String msg = "name=" + name + ", balance=$" + balance;
		return msg;
	}
	public static void main(String[] args) {
		Account a1 = new Account(1000.00);
		System.out.println("Balance=$" + a1.getBalance());
		a1.deposit(500.00);
		System.out.println("Balance=$" + a1.getBalance());
		a1.withdraw(200.00);
		System.out.println("Balance=$" + a1.getBalance());
		System.out.println(a1.toString());
		System.out.println(a1);
	}
}
