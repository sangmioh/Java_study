package kr.tpc;

public class Inflearn {
	public Inflearn() { //private로 하면 static멤버로 해서 new객체 생성 안해도 된다. 
		
	}
	
	//인스턴스메서드 
	public void tpc() {
		System.out.println("TPC강의 너무 재미있어여.");
	}
	//클래스메서드 
	public static void java() {
		System.out.println("Java 강의 너무 재밌있다.");
	}
	//어떤 객체에 생성자 메서드가 private이면 모든 멤버는 static붙은 멤버가 되어야 한다. 
	//static 멤버 접근방법=> 클래스이름.클래스메서드(static메서드)
	
	
}
