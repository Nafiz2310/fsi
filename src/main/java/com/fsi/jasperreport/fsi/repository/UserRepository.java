package com.fsi.jasperreport.fsi.repository;

import com.fsi.jasperreport.fsi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

}
