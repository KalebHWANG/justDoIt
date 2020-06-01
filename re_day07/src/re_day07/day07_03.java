package re_day07;
/* 
 * for 문을 이용하여 1-10의 합을 구하시
 */
public class day07_03 {

	public static void main(String[] args) {
		System.out.println("1-10의 합은?");
		int sum=0;
		for (int i=1;i<=10;i++) {
			sum+=i;
		}
		System.out.println("1-10의 합:"+sum);
	}

}
