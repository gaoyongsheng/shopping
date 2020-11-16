package com.shopping.demo.repository;

import com.shopping.demo.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.QueryHint;

import static org.hibernate.jpa.QueryHints.HINT_COMMENT;

/**
 * @Author Gao
 * @Date 2020/10/22 0:27
 * @Version 1.0
 */

public interface UserRepository extends JpaRepository<User,Long> {

    @Query(value = "select * from user",nativeQuery = true)
    Page<User> findAllUsers(Pageable pageable);
}
