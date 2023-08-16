package com.example.j6store.repository;

import com.example.j6store.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account,String> {
    @Query("select distinct au.account from Authority au where au.role.id in ('DIRE','STAFF')")
    List<Account> getAdmin();
}
