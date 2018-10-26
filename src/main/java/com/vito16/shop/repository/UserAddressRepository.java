package com.vito16.shop.repository;

import com.vito16.shop.model.User;
import com.vito16.shop.model.UserAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author 朱鑫龙
 * @date 2018/10/17
 * 
 */
@Repository
public interface UserAddressRepository extends JpaRepository<UserAddress, Integer> {
    List<UserAddress> findByUser(User user);
}
