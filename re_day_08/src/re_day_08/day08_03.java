package re_day_08;
/* 12345
 * 23456
 * 34567
 * 45678
 * 56789	 */
public class day08_03 {
	public static void main(String[] args) {
		for(int i=1;i<6;i++) {
			for(int j=i;j<i+5;j++) {
				System.out.print(j);
			}System.out.println();
		}
		
		System.out.println();
		
		for(int i=5;i>0;i--) {
			for (int j=i;j<i+5;j++) {
				System.out.print(j);
			}System.out.println();
		}
	}

}
