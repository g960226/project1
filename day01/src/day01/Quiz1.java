package day01;

public class Quiz1 {
	public static void main(String[] args) {
		
		// 첫날에 은행에 돈을 10원 준비하여 입금한다
		// 둘째날에는 이전날의 두배인 20원을 준비하여 입금한다
		// 셋째날에는 이전날의 두배인 40원을 준비하여 입금한다
		// 이런식으로 30일동안 은행에 돈을 입금하면
		// 30일 이후 은행계좌에 입금된 금액의 총액은 얼마인가?
		// (단, 은행계좌에는 처음에 돈이 없었던 것으로 가정한다)
		
		long money = 10;
		int day = 1;
		long bank = 0;
		
		while(day <= 30) {
			bank += money; // 준비한 돈을 은행에 입금한다
//			System.out.printf("%d일차 : %d\n", day, bank);
			money *= 2; // 다음 날을 위해 2배의 돈을 미리 준비해둔다
			day++;
		}
				
		System.out.printf("결과 : %,d원\n",bank);		
		
				
	}
}
