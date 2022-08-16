package com.SpringBootLearning.RestAPIs;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.SpringBootLearning.DAO.BooksDAO;

@Component
public class BookService {

	@Autowired
	private BooksDAO booksDAO;
	/*private static List<BooksVO> bookList=new ArrayList<BooksVO>();
	
	static
	{
		BooksVO book1=new BooksVO();
		book1.setId(10);;
		book1.setBookTitle("Java Programming ");
		book1.setBookName("Java Programming");
		book1.setBookContent("Java is a programming languae");
		book1.setBookAuthor("Ram Chaudhary");
		bookList.add(book1);
		
		BooksVO book2=new BooksVO();
		book2.setId(20);;
		book2.setBookTitle("C is a Programming ");
		book2.setBookName("C is a Programming");
		book2.setBookContent("C is a Programming");
		book2.setBookAuthor("Ram Chaudhary");
		bookList.add(book2);
		
		BooksVO book3=new BooksVO();
		book3.setId(30);;
		book3.setBookTitle("C is a Programming ");
		book3.setBookName("C is a Programming");
		book3.setBookContent("C is a Programming");
		book3.setBookAuthor("Ram Chaudhary");
		bookList.add(book3);
	}*/
	
	public List<BooksVO> getAllBooks()
	{
		List<BooksVO> allBooks = (List<BooksVO>)booksDAO.findAll();
		return allBooks;
	}
	public BooksVO getBookById(int bookId)
	{
		BooksVO book=null;
		try {
			
			// book=bookList.stream().filter(e->e.getId()==bookId).findFirst().get();
			 book = booksDAO.findById(bookId);
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
		
		return book;
	}
	
	public BooksVO addBook(BooksVO book)
	{
		System.out.println("1");
		BooksVO book1 = booksDAO.save(book);
		System.out.println("2");
		return book1;
	}
	
	public void deleteBookById(int bookId)
	{
		
		booksDAO.deleteById(bookId);
		/*for(BooksVO books: bookList)
		{
			System.out.println(books);
			System.out.println("book id==="+books.getId()+": "+bookId);
			int count=0;
			if(books.getId()==bookId)
			{System.out.println("count=="+count);
				bookList.remove(count);
				break;
				
			}
			count++;
		}*/
	}
		
		public void updateBookById(BooksVO book,int bookId)
		{
			
			book.setId(bookId);
			booksDAO.save(book);
			
			/*bookList=bookList.stream().map(e->{
				if(e.getId()==bookId)
				{
				e.setBookTitle(book.getBookTitle());
				e.setBookName(book.getBookName());
				e.setBookContent(book.getBookContent());
				e.setBookAuthor(book.getBookAuthor());
				}
				return e;
			}).collect(Collectors.toList());
			*/
		}
		
	
}
