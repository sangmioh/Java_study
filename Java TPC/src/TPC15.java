import kr.tpc.MemberVO;

public class TPC15 {

	public static void main(String[] args) {
		
		MemberVO m = new MemberVO("홍길동",20,"010-2222-1111", "서울");
		//setter method 필요없음
		System.out.println(m);
		
		MemberVO m1 = new MemberVO();
		m1.setName("나길동");
		m1.setAge(34);
		m1.setTel("010-2222-3333");
		m1.setAddr("광주");
		System.out.println(m1.toString());
		System.out.println(m1); //위와 동일하다. 
	}

}
