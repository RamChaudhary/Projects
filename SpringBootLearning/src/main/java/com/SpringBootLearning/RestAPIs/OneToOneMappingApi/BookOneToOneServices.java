package com.SpringBootLearning.RestAPIs.OneToOneMappingApi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookOneToOneServices {

	
	  @Autowired private BookOneToOneMap bookOneToOneMap;
	  
	  public BookVO saveBook(BookVO vo)
	  {
		  System.out.println("saving book==="+vo);
		  BookVO save = bookOneToOneMap.save(vo);
		  System.out.println("1");
		  return save;
	  }
	  
	  public BookVO getBoolById(int id)
	  {
		BookVO book = bookOneToOneMap.findById(id);
		return book;
	  }
	  
	  public List<BookVO> getAllBooks()
	  {
		  
	 List<BookVO> allBokks =(List<BookVO>)bookOneToOneMap.findAll();
		System.out.println("all books=="+allBokks);
		  System.out.println(allBokks);
		  return allBokks;
	  }
	  
	  public BookVO deleteBook(int id)
	  {
		  BookVO deleteDtl = bookOneToOneMap.findById(id);
		  bookOneToOneMap.deleteById(id);
		  
		  return deleteDtl;
	  }
	  
	  public BookVO updateBook(BookVO book,int bookId)
	  {
		  book.setId(bookId);
		  bookOneToOneMap.save(book);
		  BookVO updatedBook = bookOneToOneMap.findById(bookId);
		  
		  return updatedBook;
	  }
	 
	
}
