package com.tma.user;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tma.user.UserData;

public interface UserDataRepository extends JpaRepository<UserData, Integer>{

}
