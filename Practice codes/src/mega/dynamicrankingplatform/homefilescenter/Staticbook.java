package mega.dynamicrankingplatform.homefilescenter;

public class Staticbook {
	private int bookno;
	private String title;
	private String author;
	private float price;
	private static int bookcount;
	public static int  getbookcount() {
		bookcount=0;
		bookcount=bookcount+1;
		return bookcount;
	}
	
}
class bookmain {
	public static void main(String args[]) {
		Staticbook num=new Staticbook();
		
		Staticbook.getbookcount();
		
	}
}
