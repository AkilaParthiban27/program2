 public class Book
 {

  String  b_name ; // name of the book

  String author; // author of the book

  double rate; // rate of the book

  long ISBN ;// ISBN of the book

  int  year; // year of publication

  public void Book() {
 
    b_name = "Data Structures And Algorithms"; 

    author = "A.A.Puntambekar"; 

    rate = 529.00; 
     
    ISBN = 1843560283L;

    year = 2009;
}

public void Book( String str, String str_author, double x , long num , int y)
 { 
    b_name = str ; 

    author = str_author; 

    rate = x; 
    
    ISBN = num;

    year = y;

}

//function called to view details of book

void detail(Book bk) {

System.out.println("Book Name : "+bk.b_name); 

System.out.println("Author Name : "+bk.author);

System.out.println("Year Of Publication : "+bk.year);

System.out.println("ISBN : "+bk.ISBN);

System.out.println("Price of Book : "+bk.rate);

}
	public static void main(String[] args) {
	    
		Book b = new Book();
		
		b.Book();
		
		Book a = new Book();
		
		a.detail(b);
	}
}
