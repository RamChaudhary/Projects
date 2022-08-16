package com.SpringBootLearning.DAO;

import org.springframework.data.repository.CrudRepository;

import com.SpringBootLearning.RestAPIs.BooksVO;

public interface BooksDAO extends CrudRepository<BooksVO, Integer> {
	
public BooksVO findById(int bookId);
}
