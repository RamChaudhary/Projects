package com.SpringBootLearning.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.SpringBootLearning.VO.UserVO;

public interface ConnectionDAO extends CrudRepository<UserVO, Integer> {
	
	public List<UserVO> findByName(String name);
	public List<UserVO> findByNameLike(String name);
	public List<UserVO> findByNameAndCity(String name,String city);
	
	@Query("select user from UserVO user")
	public List<UserVO> getAllUser();
	
	@Query(" select user from UserVO user where name=:n ")
	public List<UserVO> getAllUserByName(@Param("n") String name);
	
	@Query(value = "select * from user_dtl" ,nativeQuery = true)
	public List<UserVO> getAllUserWithSQL();

}
