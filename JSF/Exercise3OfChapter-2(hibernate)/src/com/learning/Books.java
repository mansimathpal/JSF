package com.learning;


public class Books {
	private int bookId;
	private String bookName;
	private String Author;
	private int Edition;
	private String Category;
	private String Publisher;
	private int publishingYear;
	private double Price;
	private int Quantity;

	
	public Books(){
    }

	public Books(int bookId, String bookName, String author, int edition, String category, String publisher,
			int publishingYear, double price, int quantity) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.Author = author;
		this.Edition = edition;
		this.Category = category;
		this.Publisher = publisher;
		this.publishingYear = publishingYear;
		this.Price = price;
		this.Quantity = quantity;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public int getEdition() {
		return Edition;
	}

	public void setEdition(int edition) {
		Edition = edition;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public String getPublisher() {
		return Publisher;
	}

	public void setPublisher(String publisher) {
		Publisher = publisher;
	}

	public int getPublishingYear() {
		return publishingYear;
	}

	public void setPublishingYear(int publishingYear) {
		this.publishingYear = publishingYear;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + ", Author=" + Author + ", Edition=" + Edition
				+ ", Category=" + Category + ", Publisher=" + Publisher + ", publishingYear=" + publishingYear
				+ ", Price=" + Price + ", Quantity=" + Quantity + "]";
	}
}
