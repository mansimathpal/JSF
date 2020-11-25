package com.learning;

import java.util.Set;


public class NewBooks {
    private int bookId;
    private String bookName;
    private String authorName;
    private String publisherName;
    private String categoryofBooks;
    private Set<NewBooks> books;

    public NewBooks(){
    }

    public NewBooks(int bookId, String bookName, String authorName, String publisherName, String categoryofBooks, Set<NewBooks> books) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.publisherName = publisherName;
        this.categoryofBooks = categoryofBooks;
        this.books = books;
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

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getCategoryofBooks() {
        return categoryofBooks;
    }

    public void setCategoryofBooks(String categoryofBooks) {
        this.categoryofBooks = categoryofBooks;
    }

    public Set<NewBooks> getBooks() {
        return books;
    }

    public void setBooks(Set<NewBooks> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "NewBooks{" + "bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + ", publisherName=" + publisherName + ", categoryofBooks=" + categoryofBooks + ", books=" + books + '}';
    }

}

