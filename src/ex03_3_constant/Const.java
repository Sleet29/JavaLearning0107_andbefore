package ex03_3_constant;
// 상수 : 값을 한 번만 저장할 수 있는 공간
// 상수 만드는 법 : 변수 타입 앞에 키워드 final만 붙여 주기만 하면 됨
// 일반적으로 상수의 이름은 대문자로 사용
public class Const {
	public static void main(String args[]) {
		final int MAX = 500;
		System.out.println(MAX);

		//MAX = MAX - 50 등의 값 투입 시 오류발생
	}
}
