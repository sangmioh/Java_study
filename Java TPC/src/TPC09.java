//2. JVM Memory Model 2 =>static키워드가 없는 경우(new 객체 생성)
public class TPC09 {

	public static void main(String[] args) {
		
		int a=56;
		int b=40;
		//a+b=?
		//int v= sum(a+b);
		TPC09 tpc = new TPC09(); //heap Area(힙영역에 생성됨)
		int v = tpc.sum(a,b);
		System.out.println(v);
		

	}
	public int sum(int a, int b) {
		int v= a+b;
		return v;
	}

}
