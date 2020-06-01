package re_day07;
/* 0-50 중 5의 배수를 출력
 * 출력 값의 총 합을 출력
 */
public class day07_04 {

	public static void main(String[] args) {
		System.out.println("0-50중 5의 배수 출력 및 총 합");
		int sum=0;
		for(int i=0;i<=50;i++) {
			if(i%5==0) {
				System.out.print(i+"/");
				sum+=i;
			}
		}System.out.println();
		System.out.println(sum);
	}

}
