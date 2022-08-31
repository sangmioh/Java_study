
//메서드의 매개변수 전달기법
public class TPC07 {

	public static void main(String[] args) {
		
		
		int a=20;
		float b = 56.7f;
		//a+b=?
		float v=sum(a,b); //CALL BY VALUE 방식=> 값을 넘기는 것
		System.out.println(v); //76.7
		
		int[] arr = {1,2,3,4,5};
		//배열의 총합 = ?
		int vv = arrSum(arr); //call by reference(번지)
		System.out.println(vv); //15
	}
	
	public static float sum(int a, float b) {
		float v= a+b;
		return v;
	}
	
	private static int arrSum(int[] x) {
		int hap = 0;
		for(int i=0;i<x.length;i++) {
			hap+=x[i];
		}
		return hap;
	}

}
