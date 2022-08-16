package com.SpringBootLearning.RestAPIs.OneToOneMappingApi;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "book_dtl_1_1_map")
public class BookVO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String bookName;
	private String bookTitle;
	private String bookContent;
	@OneToOne(cascade = CascadeType.ALL)
	@JsonManagedReference//only manage by this class
	private BookAuthorDtl bookAuthorDtl;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookContent() {
		return bookContent;
	}
	public void setBookContent(String bookContent) {
		this.bookContent = bookContent;
	}
	public BookAuthorDtl getBookAuthorDtl() {
		return bookAuthorDtl;
	}
	public void setBookAuthorDtl(BookAuthorDtl bookAuthorDtl) {
		this.bookAuthorDtl = bookAuthorDtl;
	}
	public BookVO(int id, String bookName, String bookTitle, String bookContent, BookAuthorDtl bookAuthorDtl) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.bookTitle = bookTitle;
		this.bookContent = bookContent;
		this.bookAuthorDtl = bookAuthorDtl;
	}
	public BookVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BookVO [id=" + id + ", bookName=" + bookName + ", bookTitle=" + bookTitle + ", bookContent="
				+ bookContent + ", bookAuthorDtl=" + bookAuthorDtl + "]";
	}
	
}
