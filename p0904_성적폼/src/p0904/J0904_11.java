package p0904;

public class J0904_11 {

	public static void main(String[] args) {
		//1부터 100까지의 합 : 5050
		//1부터 100까지의 합에서 합이 200을 넘는 때는 언제일까요? i를 출력하시오.
		
		int i = 0, sum = 0, result =0;
		
		for(i=1;i<=100;i++) {
			sum = sum+i;
			if(sum >=200) {
				break;
			}
		}
		
		System.out.println(sum);
		System.out.println(i);
		
		
		//1부터 100까지의 합을 출력하시오.
		
//		int i = 0;
//		int sum = 0; // int i=0, sum=0; 가능
//		
//		for(i=1;i<=100;i++) {
//			sum = sum + i; 
//		}
//		
//		System.out.printf("1부터 %d 까지 합계\n ",i-1,sum);	
//		
		
		
		
		//		int  i = 0;
//		int  sum = 0;
//		for(i = 1; i<=10; i++) {
//			System.out.println(i);
//			sum += i;
//		}
//		
//		System.out.println("for문 밖 i : "+i);
//		System.out.println("for문 밖 sum : "+sum);
			
		
		
		
		
		
		
		
		
	}//main

}//class
