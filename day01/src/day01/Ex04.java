package day01;

public class Ex04 {
	public static void main(String[] args) {
		// 논리 연산에 의한 연산 미수행
		int n1 = -1, n2 = 0 , n3 = 1, n4 = 2;
		
		System.out.printf("%d, %d, %d, %d\n", n1, n2, n3, n4);
		
		boolean flag1 = n1++ + ++n2 < 0 && n3-- * ++n4 == 0; // &&연산자에서 이미 앞 조건이 false였기 때문에 뒤의 연산을 하지 않는다
		System.out.println(flag1);
		System.out.printf("%d, %d, %d, %d\n", n1, n2, n3, n4);
		
		// 두 조건중 첫번째 조건만으로 전체결과가 확정된다면
		// 두번째 조건은 연산을 수행하지 않는다
		
		
	}
}
