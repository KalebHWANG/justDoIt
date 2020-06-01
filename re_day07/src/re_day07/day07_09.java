package re_day07;
/*
 * 1과 나 자신으로 나눠지는 수
 * 소수 판별 프로그램 작성
 * [출력결과]
 * 숫자입력:
 * 입력 한 11 은 소수 입니다.
 */
import java.io.*;
public class day07_09 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자 입력:");
		int a=Integer.parseInt(br.readLine());
		
		String result="";
		for(int i=2;i<a;i++) {
		
				
			if(a%i==0){
				result="소수가 아닙니다.";
				break;
			}else {
				result="소수 입니다.";
			}
		}
		System.out.println("입력한 "+a+" 은 "+result);
	}

}
