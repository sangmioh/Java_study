import kr.tpc.Inflearn;

public class TPC31 {

	public static void main(String[] args) {
		
		Inflearn inf = new Inflearn();
	
		inf.tpc();
		//Inflearn.tpc(); //TPC강의 너무 재미있어여
		//inf.java();=> new객체 생성하지 않아도 객체 생성됨
	    Inflearn.java(); //Java 강의 너무 재밌있다
	    
	    //Java API 생성자 private 
	    //System sys = new System();
         System.out.println("출력"); //출력
        // Math m = new Math();
        int v = Math.max(10, 20);
        System.out.println(v); //20
	}

}
