import kr.tpc.BookDTO;

//사용자정의 자료형 UDDT
public class TPC10 {

	public static void main(String[] args) {
		
       //int, float, char, boolean -> PDT
		int a;  a=10;
		
		//책(BookDTO)이라는 자료형을 만들자.--> class로 만들기
		//객체 생성
		//BookDTO b;
		//b= new BookDTO();
		BookDTO b= new BookDTO();
		b.title = "자바의정석";
		b.price = 15000;
		b.company = "자바회사";
		b.page = 670;
		
		System.out.print(b.title +"\t");
		System.out.print(b.price +"\t");
		System.out.print(b.company +"\t");
		System.out.println(b.page +"\t");
	}

}
