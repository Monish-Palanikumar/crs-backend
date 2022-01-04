package com.hcl.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	@Query(value = "select * from users where uname=?1 and pwd=?2", nativeQuery = true)
	public User getUser(String uname, String pwd);

	@Query(value = "select * from users where uname=?1", nativeQuery = true)
	public User getUsername(String uname);
}
