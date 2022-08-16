package com.SpringBootLearning.RestAPIs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book_dtl")
public class BooksVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "book_id")
	private int id;
	private String bookTitle;
	private String bookName;
	private String bookContent;
	private String bookAuthor;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookContent() {
		return bookContent;
	}
	public void setBookContent(String bookContent) {
		this.bookContent = bookContent;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public BooksVO(int id, String bookTitle, String bookName, String bookContent, String bookAuthor) {
		super();
		this.id = id;
		this.bookTitle = bookTitle;
		this.bookName = bookName;
		this.bookContent = bookContent;
		this.bookAuthor = bookAuthor;
	}
	public BooksVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BooksVO [id=" + id + ", bookTitle=" + bookTitle + ", bookName=" + bookName + ", bookContent="
				+ bookContent + ", bookAuthor=" + bookAuthor + "]";
	}

}
