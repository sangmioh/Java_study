//1. JVM Memory Model 1 => static키워드 있는 경우
public class TPC08 {

	public static void main(String[] args) {
	  
		int a=30;
		int b=50;
	
		int v =add(a,b); //static method를 call. 
		                 //static 키워드=> static존 영역에 로딩,고정된 위치에 자동으로 로딩. 
		System.out.println(v); //80
	}
	public static int add(int a, int b) {
		int sum = a+b;
		return sum;
	}
	


}
