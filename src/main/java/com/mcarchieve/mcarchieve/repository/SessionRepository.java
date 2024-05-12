package com.mcarchieve.mcarchieve.repository;

import com.mcarchieve.mcarchieve.entity.session.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long>{
}
