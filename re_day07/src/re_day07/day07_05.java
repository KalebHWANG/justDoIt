package re_day07;
/* 사용자로부터 이름 입력 받아
 * [안녕하세요 00님~]
 * 출력을 10번 수행하는 프로그램
 * 
 * [결과]
 * 이름:
 * 반복횟수:
 */
import java.io.*;
public class day07_05 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("이름:");
		String name=br.readLine();
		System.out.print("반복횟수:");
		int c=br.read()-48;
		
		
		for(int i=0;i<c;i++) {
		System.out.println("안녕하세요 "+name+"님");
		}
	}

}
