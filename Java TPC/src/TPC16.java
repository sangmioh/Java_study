import kr.tpc.OverLoad;

public class TPC16 {

	public static void main(String[] args) {
		//1+1=? , 23.4+56=?, 56.7+78.9=?
		OverLoad ov = new OverLoad();
        ov.hap(20,50); //ov.hap_int_int(20,50) =>컴파일러에서 이렇게 호출됨
	    ov.hap(23.4f,56); //ov.hap_float_int(23.4f,56) => 순서는 상관이 없다.
	    ov.hap(56.7f, 78.9f); //ov.hap_float_float(56.7f,78.9f)
	}

}
