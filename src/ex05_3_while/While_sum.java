package ex05_3_while;

public class While_sum {
	public static void main(String args[]) {
		int num=1;
		int sum=0;
		while(num<=10) {
			sum+=num;
			num++;
		}
		System.out.println(sum);
	}

}
