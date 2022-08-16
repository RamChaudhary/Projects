package com.SpringBootLearning.RestAPIs.OneToOneMappingApi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "author_book_dtl_1_1_map")
public class BookAuthorDtl {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String authorName;
	private String language;
	@OneToOne(mappedBy = "bookAuthorDtl")
	@JsonBackReference//do not move to book class
	private BookVO book;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public BookAuthorDtl(int id, String authorName, String language) {
		super();
		this.id = id;
		this.authorName = authorName;
		this.language = language;
	}
	
	public BookVO getBook() {
		return book;
	}
	public void setBook(BookVO book) {
		this.book = book;
	}
	public BookAuthorDtl() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BookAuthorDtl [id=" + id + ", authorName=" + authorName + ", language=" + language + "]";
	}
	

}
