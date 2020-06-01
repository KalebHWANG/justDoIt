package re_day07;
/*
 * 스위치 문을 이용하여 점수 3개 국영수 받고 학
 */
import java.io.*;
public class day07_02 {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("점수를 입력하시오");
		System.out.print("국어:");
		int kor=Integer.parseInt(br.readLine());
		System.out.print("영어:");
		String eng_s=br.readLine();
		int eng=Integer.parseInt(eng_s);
		System.out.print("수학:");
		int mat=Integer.parseInt(br.readLine());
		
		int sum=kor+eng+mat;
		int avg=sum/3;
		System.out.println("총점:"+sum);
		System.out.println("평균:"+avg);
		
		char grade='A';
		switch(avg/10) {
		case 10:case 9: grade='A';break;
		case 8: grade='B';break;
		case 7: grade='C';break;
		case 6: grade='D';break;
		default: grade='F';
		}
		System.out.println("학점:"+grade);
	}

}
