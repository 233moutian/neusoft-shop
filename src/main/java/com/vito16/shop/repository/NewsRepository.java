package com.vito16.shop.repository;

import com.vito16.shop.model.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 朱鑫龙
 * @date 2018/10/17
 * 
 */
@Repository
public interface NewsRepository extends JpaRepository<News, Integer> {
}
