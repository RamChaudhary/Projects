package com.SpringBootLearning.RestAPIs.OneToOneMappingApi;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface BookOneToOneMap extends CrudRepository<BookVO, Integer>
{
	public BookVO findById(int bookId);
	
	@Query("select count(1) from BookVO where id=:n")
	public int getcheckBookExistOrNot(@Param("n") int BookId);
}
