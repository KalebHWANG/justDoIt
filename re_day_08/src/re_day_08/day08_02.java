package re_day_08;
/* 구구단 만들기
 * 2*1~  3*1 9*1
 * 2*9~  3*9 9*9 */
public class day08_02 {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			for (int j=2;j<=9;j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}System.out.println();
		}
	}

}
