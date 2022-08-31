//객체생성과정
import kr.tpc.BookVO;

public class TPC11 {

	public static void main(String[] args) {
		//책 1권을 저장하기위해 [객체를 생성]하시오.
		BookVO b = new BookVO();
        b.title = "파이썬";
        b.price = 11000;
        b.company = "에이콘";
        b.page = 500;
        
        System.out.print(b.title +"\t");
		System.out.print(b.price +"\t");
		System.out.print(b.company +"\t");
		System.out.println(b.page);
		
		
		BookVO b1 = new BookVO();
        b1.title = "오라클";
        b1.price = 12000;
        b1.company = "에이콘2";
        b1.page = 510;
        
        System.out.print(b1.title +"\t");
		System.out.print(b1.price +"\t");
		System.out.print(b1.company +"\t");
		System.out.println(b1.page);
	}

}
