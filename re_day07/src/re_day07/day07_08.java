package re_day07;
/* 
 * [출력결과]
 * 1-2+3-4+5......-10=??
 */
public class day07_08 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0&&i!=10) {
				System.out.print(i+"+");
				sum-=i;
			}else if(i%2!=0) {
				System.out.print(i+"-");
				sum+=i;
		}else if(i==10) {
			System.out.print(i+"=");
			sum-=i;
		}
	}System.out.println(sum);
}
}