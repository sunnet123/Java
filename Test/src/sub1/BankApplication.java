package sub1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BankApplication {
    private static List<Account> accounts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    static int count = 0;

    public static void main(String[] args) {
        boolean run = true;
        // 반복문으로 계속 수행, 5번 입력시 루프빠져나감
        while (run) {
            System.out.println("----------------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("----------------------------------------------------------");
            System.out.print("선택> ");

            int menuNum;
            // 정수가 아닐시 예외처리
            try {
                menuNum = scanner.nextInt();
                scanner.nextLine(); 
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력하세요.");
                scanner.nextLine();
                continue;
            }
            
            switch (menuNum) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    accountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    run = false;
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
               
            }
        }
        System.out.println("프로그램 종료");
    }
    // 계좌 생성하기
    private static void createAccount() {
    	System.out.println("-----------");
        System.out.println("   계좌생성 ");
        System.out.println("-----------");

        String cNum = "";
        // 루프를 사용하여 계좌번호 입력 받음
        while (true) {
            boolean bool = true;	// 계좌번호의 중복 여부를 확인하기 위한 변수 초기화
            System.out.print("계좌번호: ");
            // 사용자로부터 계좌번호 입력받음
            cNum = scanner.next();
            for (int i = 0; i < count; i++) {
                if (cNum.equals(accounts.get(i).getAno())) {
                    bool = false;
                    break;
                }
            }
            // 계좌가 번호 중복방지
            if (!bool) {	// 중복된 계좌번호가 있을 경우 false로 설정하고 계속 반복
                System.out.print("중복된 계좌입니다. ");
            } else if (bool) {
                break;
            }
        }
        System.out.print("계좌주: ");
        String cName = scanner.next();
        System.out.print("초기입금액: ");
        int cMoney = scanner.nextInt();

        Account a = new Account(cNum, cName, cMoney);
        add(a);

        System.out.println("결과: 계좌가 생성되었습니다.");
    }
    
    //계좌목록조회
    private static void accountList() {
        System.out.println("-----------");
        System.out.println("   계좌목록 ");
        System.out.println("-----------");
        for (int i = 0; i < count; i++) {
            System.out.print(accounts.get(i).getAno()+"\t");
            System.out.printf("%s", accounts.get(i).getOwner()+"\t");
            System.out.printf("%d", accounts.get(i).getBalance());
            System.out.println("");
        }
    }
    
    // 예금하기
    private static void deposit() {
    	 
    	Account mine = findAccount("예금");
		int amount = scanner.nextInt();
		mine.setBalance(mine.getBalance() + amount);
		System.out.println();

    }
    
    // 출금하기
    private static void withdraw() {
    	Account myAccount = findAccount("출금");
        int amount = scanner.nextInt();

        if (amount < 0) {	// 입력값이 음수일시
        	System.out.println("잘못된 입력입니다.");
            return;
        }

         if (myAccount.getBalance() >= amount) {
            myAccount.setBalance(myAccount.getBalance() - amount);
            System.out.println("결과: 출금이 성공되었습니다.");
         } else {	// 잔액을 초과한 경우
            System.out.println("잔액이 부족합니다.");
         }
         System.out.println();
    }
    // 계좌 조회
    private static Account findAccount(String ano) {
        int myNum = 0;
        boolean bool = true;
        boolean bb = true;

        System.out.println("-----------");
        System.out.println("   " + ano  );
        System.out.println("-----------");

        while (bb) {
            System.out.print("계좌번호입력>> ");
            String myAcc = scanner.next();

            for (int i = 0; i < count; i++) {
                if (myAcc.equals(accounts.get(i).getAno())) {
                    myNum = i;
                    bool = false;
                    break;
                }
            }
            if (bool) {
                System.out.println("계좌번호 조회 실패했습니다. 다시 입력하세요");
            } else if (!bool) {
                System.out.print(ano + "액: ");
                bb = false;
            }
        }
        return accounts.get(myNum);
    }
    // 새로운 계좌를 리스트에 추가
    private static void add(Account account) {
        accounts.add(account);
        count++;
    }
}