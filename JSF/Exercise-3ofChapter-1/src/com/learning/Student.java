package com.learning;


public class Student {
    private int bookId;
    private String bookName;
    private String studentName;
    private int studentId;
    private String issueDate;
    private String returnDate;
    
    public Student(){
    }

    public Student(int bookId, String bookName, String studentName, int studentId, String issueDate, String returnDate) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.studentName = studentName;
        this.studentId = studentId;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
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

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
@Override
    public String toString() {
        return "Student{" + "bookId=" + bookId + ", bookName=" + bookName + ", studentName=" + studentName + ", studentId=" + studentId + ", issueDate=" + issueDate + ", returnDate=" + returnDate +'}';
    }
}
