package com.SpringBootLearning.RestAPIs;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPIsController {

	@Autowired
	private BookService bookService;
	/*
	 * @RequestMapping(value = "/test",method = RequestMethod.GET)
	 * 
	 * @ResponseBody
	 */
	@GetMapping("/getAllBooks")
	public ResponseEntity<List<BooksVO>> test()
	{
		//BookService bs=new BookService();
		List<BooksVO> allBooks = bookService.getAllBooks();
		if(allBooks.size()<=0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(allBooks));
	}
	
	
	@GetMapping("/getBookById/{bookId}")
	public ResponseEntity<BooksVO> getBook(@PathVariable("bookId") int bookId)
	{
		System.out.println("bookId...."+bookId);
		BooksVO bookById = bookService.getBookById(bookId);
		if (bookById==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(bookById));
	}
	
	@PostMapping("/AddBook")
	public ResponseEntity<BooksVO> addNewBook(@RequestBody BooksVO book)
	{
		System.out.println(book);
		BooksVO addBook =null;
		try {
			addBook= bookService.addBook(book);
			return ResponseEntity.of(Optional.of(addBook));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		//return addBook;
	}
	
	@DeleteMapping("bookDelete/{bookId}")
	public ResponseEntity<BooksVO> deleteBookById(@PathVariable("bookId") int bookId)
	{
		System.out.println(bookId);
		BooksVO book=null;
		try {
			

			book=bookService.getBookById(bookId);
			if(book!=null)
			{
			bookService.deleteBookById(bookId);
			return ResponseEntity.ok(book);
			}else
			{
				return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		
	}
	
	@PutMapping("/updateBook/{bookId}")
	public BooksVO updateBook(@RequestBody BooksVO book,@PathVariable("bookId") int bookId)
	{
		System.out.println("books==="+book+"\n book id==="+bookId);
		
		BooksVO  updatedbook=null;
		bookService.updateBookById(book, bookId);
		return book;
	}
}

