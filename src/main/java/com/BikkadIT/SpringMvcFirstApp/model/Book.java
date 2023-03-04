package com.BikkadIT.SpringMvcFirstApp.model;

public class Book {

	int BookId;
	String BookName;
	double BookPrice;
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public double getBookPrice() {
		return BookPrice;
	}
	public void setBookPrice(double bookPrice) {
		BookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "Book [BookId=" + BookId + ", BookName=" + BookName + ", BookPrice=" + BookPrice + "]";
	}
	
	
	
}
