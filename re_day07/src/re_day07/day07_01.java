package re_day07;
/*
 * 스위치문 사용하여 중국집 메뉴 선택 
 */
import java.io.*;
public class day07_01 {

	public static void main(String[] args) throws IOException{
		System.out.println("메뉴를 고르시오");
		System.out.println("메뉴> 1.짜장, 2.짬뽕, 3.탕수, 4.유산슬");
		
		
		while(true) {
			
			System.out.print("메뉴>");
			int a=System.in.read()-48;
			switch(a){
			case 1:System.out.println("짜장 하나 주문");break;
			case 2:System.out.println("짬뽕 하나 주문");break;
			case 3:System.out.println("탕수육 하나 주문");break;
			case 4:System.out.println("유산슬 하나 주문");break;
			case 5:System.out.println("주문 내용 완료");
			if(a==5) {
				System.exit(0);
			}
		}
	}
	}
}
