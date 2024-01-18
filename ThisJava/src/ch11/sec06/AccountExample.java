package ch11.sec06;
/*
 * 날짜 : 2024/01/18
 * 이름 : 최형욱
 * 내용 : 11장 사용자 정의 예외
 */
public class AccountExample {
	public static void main(String[] args) {
		
		Account account = new Account();
		
		//예금하기
		account.deposit(10000);
		System.out.println("예금액 : " + account.getBalance());
		
		
		//출금하기
		try {
			account.withdraw(30000);
		}catch (InsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
	}
}
