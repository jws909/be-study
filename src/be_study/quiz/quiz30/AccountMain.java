package be_study.quiz.quiz30;

public class AccountMain {

	public static void main(String[] args) {
		Account acc1 = new Account();
		acc1 = new Account("나");
		acc1 = new Account(100000);
		acc1 = new Account("나", 100000);
		acc1 = new Account(100000, "나");
		
		acc1.setOwner("나이름");
		acc1.setBalance(50000);
		
		System.out.println(acc1.getOwner() +"의 계좌 잔금: "+ acc1.getBalance());
		
		System.out.println("3만원 저축 후 잔금: "+ acc1.deposit(30000));
		
		System.out.println("4만원 출금 후 잔금: "+ acc1.withdraw(40000));
		
		System.out.println("8만원 출금 시도 후 잔금: "+ acc1.withdraw(80000));

	}

}
