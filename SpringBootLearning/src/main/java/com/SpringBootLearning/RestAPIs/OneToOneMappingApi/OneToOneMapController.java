package com.SpringBootLearning.RestAPIs.OneToOneMappingApi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/OneToOneMapController")
public class OneToOneMapController {

	@Autowired
	private BookOneToOneServices bookOneToOneServices;
	
	@Autowired
	private BookOneToOneMap bookOneToOneMap;
	
	
	@PostMapping("saveBook")
	public ResponseEntity<BookVO> saveBookDtls(@RequestBody BookVO vo )
	{
		try {
			System.out.println(vo);
			BookVO saveBook = bookOneToOneServices.saveBook(vo);
			return ResponseEntity.of(Optional.of(saveBook));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	
	@GetMapping("getBook/{id}")
	public ResponseEntity<BookVO> getBooksById(@PathVariable("id") int BookId)
	{
		try {
			System.out.println("bookId==="+BookId);
			BookVO resultBook = bookOneToOneServices.getBoolById(BookId);
			System.out.println("resultBook=="+resultBook);
			if(resultBook==null)
			{
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			return ResponseEntity.of(Optional.of(resultBook));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@GetMapping("/getAllBooks")
	public ResponseEntity<List<BookVO>> getAllBooks()
	{
		try {
			List<BookVO> allBooks = bookOneToOneServices.getAllBooks();
			if(allBooks.size()==0)
			{
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			return ResponseEntity.of(Optional.of(allBooks));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	@DeleteMapping("deleteBook/{id}")
	public ResponseEntity<BookVO> deleteBookById(@PathVariable("id") int id)
	{
		try {
			System.out.println("delete id=="+id);
			BookVO checkBookExist = bookOneToOneMap.findById(id);
			if(checkBookExist==null)
			{
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			BookVO deleteBookDtl = bookOneToOneServices.deleteBook(id);
			if(deleteBookDtl==null)
			{
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			return ResponseEntity.of(Optional.of(deleteBookDtl));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	@PutMapping("updateBookById/{id}")
	public ResponseEntity<BookVO> updateBookById(@RequestBody BookVO vo,@PathVariable("id") int id)
	{
		
		try {
			
			System.out.println("book update dtl==="+vo);
			System.out.println("book id=="+id);
			int count = bookOneToOneMap.getcheckBookExistOrNot(id);
			System.out.println("count=="+count);
			if(count==0)
			{
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			BookVO updateBook = bookOneToOneServices.updateBook(vo, id);
			if(updateBook!=null)
			{
				return ResponseEntity.of(Optional.of(updateBook));
			}else
			{
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
}
