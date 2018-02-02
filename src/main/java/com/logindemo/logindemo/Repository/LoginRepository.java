package com.logindemo.logindemo.Repository;


import com.logindemo.logindemo.Entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer> {

    @Query("select s from  Login s where s.username=:username")
    Login findByUserName(@Param("username") String username);

}
