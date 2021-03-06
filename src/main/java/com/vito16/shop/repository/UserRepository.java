package com.vito16.shop.repository;

import com.vito16.shop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User DAO
 * @author 朱鑫龙
 * @date 2018/10/17
 * 
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	public User findByUsernameAndPassword(String username, String password);

    public User  findByUsername(String username);

    @Query(value = "select username from t_user", nativeQuery = true)
    List<User> findAllUser();

}
