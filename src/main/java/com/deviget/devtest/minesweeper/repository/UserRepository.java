package com.deviget.devtest.minesweeper.repository;

import com.deviget.devtest.minesweeper.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
