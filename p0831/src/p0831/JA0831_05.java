
package p0831;

public class JA0831_05 {

	public static void main(String[] args) {
		System.out.println(7+7);  //int+int = int
		System.out.println(7+""); //int+String=String  "7" 문자열타입
		System.out.println(""+7+7); //String + int + int = String "77"
		System.out.println(7+7+""); // int + int + String = String "14"
		System.out.println("--------------------------");
		
		int num=7;
		int num2=8;
		String str ="";
		char ch = ' ';
		
		System.out.println(num+num2);  // 7+8 = 15
		System.out.println(str+num+num2); // ""+7+8 = "78" 문자열타입(String)
		System.out.println(num+num2+str); //7+8""="15" 문자열타입(String)
		
		System.out.println("합계 : "+(num+num2));
		
		int kor = 98;
		int eng = 99;
		int math = 100;
		
		System.out.println("합계 : " +(kor+eng+math));
		System.out.println("-------------------");
		
		String name = "홍길동";
		int kor1 = 98;
		int eng1 = 99;
		int math1 = 100;
		int total = 0;
		double avg = 0;
		
		total = kor1+eng1+math1;
		avg = total/3.0;
		
		System.out.println("이름 : "+(name));
		System.out.println("국어점수: "+(kor1));
		System.out.println("영어점수: "+(eng1));
		System.out.println("수학점수: "+(math1));
		System.out.println("합계 : "+(total));
	
		
		System.out.println("---------pratice---------------");
		
		System.out.printf("이름 : %s \n",name);
		System.out.printf("국어점수는 %d \n", kor1);
		System.out.printf("영어점수는 %d \n",eng1);
		System.out.printf("수학점수는 %d \n",math1);
		System.out.printf("합계는 %d \n",total);
		System.out.printf("평균은 %.2f \n",avg);

		
		
		
	}

}
