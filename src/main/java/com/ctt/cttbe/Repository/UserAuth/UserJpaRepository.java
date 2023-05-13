package com.ctt.cttbe.Repository.UserAuth;

import com.ctt.cttbe.Entity.UserAuth.UserAuth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserJpaRepository extends JpaRepository<UserAuth, String> {
    UserAuth findByMsv(String msv);
}
