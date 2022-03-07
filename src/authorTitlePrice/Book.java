package authorTitlePrice;

/**
 * @author Student
 *
 */
public class Book {

static int count = 0;	
 
private String title ="--to be defined";
 double price=0.0;
 private String  author;

 Book(String title,String author, double price){
	 this.title = title;
	 this.author = author;
	 setPrice (price);
	 count ++;
 
 }
  void increasePrice(double d) {
 	this.price += d;
  }
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
 	
 	
 
  		
} 



  
