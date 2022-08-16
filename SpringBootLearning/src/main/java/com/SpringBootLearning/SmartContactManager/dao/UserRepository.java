package com.SpringBootLearning.SmartContactManager.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.SpringBootLearning.SmartContactManager.Entities.Contacts;
import com.SpringBootLearning.SmartContactManager.Entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	@Query("select u from User u where u.userEmail=:email")
	public User getUserDetails(@Param("email") String userEmail);
	

	@Query(value = "select count(1) from scm_user_dtl where user_Email=:n",nativeQuery = true)
	public int checkUserExist(@Param("n") String userEmail);
	@Query(value = "select value from parameter_master where parameter_key='FILE_UPLOAD_PATH' ",nativeQuery = true)
	public String getFileUploadPath();
	@Query("select u from Contacts u where u.user.id=:userId order by u.id desc")
	public Page<Contacts> getContactsByUser(@Param("userId") int userId,Pageable pageable);
	
	@Transactional
	@Modifying
	@Query(value="delete from scm_contacts_dtl  where id=:contactId " ,nativeQuery = true)
	public int  deleteContactById(@Param("contactId") int id);
	@Query("select u from Contacts u where u.id=:contactId ")
	public List<Contacts> getContactsByUser(@Param("contactId") int contactId);
	

}
