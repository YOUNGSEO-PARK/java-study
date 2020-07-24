package prob05;

public class Account {
	String accountNo;
	int balance = 0;

	public Account(String account) {
		accountNo = account;
		System.out.println(account + "계좌가 개설되었습니다.");
	}
	
	public void save(int money) {
		System.out.println(accountNo + "계좌에 " +money+ "만원이 입금되었습니다.");
		balance += money;
	}
	
	public void deposit(int money) {
		System.out.println(accountNo + "계좌에 " +money+ "만원이 출금되었습니다.");
		balance -= money;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}


