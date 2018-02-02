package com.logindemo.logindemo.Repository;

import com.logindemo.logindemo.Entity.Userdata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserdataRepository extends JpaRepository<Userdata, Integer> {

    @Query("select s from Userdata s where s.id=:userId")
    public Userdata findByLogin(@Param("userId") Integer userId);

}
