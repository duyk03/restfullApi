package com.example.j6store.repository;

import com.example.j6store.entity.Account;
import com.example.j6store.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AuthorityRepository extends JpaRepository<Authority, Integer> {
    @Query("select DISTINCT a from Authority a where a.account IN ?1")
    List<Authority> authoritiesOf(List<Account> accounts);
}
