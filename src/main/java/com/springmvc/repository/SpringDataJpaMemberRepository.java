package com.springmvc.repository;

import com.springmvc.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    //JPQL: select m from Member as m where m.name = ?
    @Override
    Optional<Member> findByName(String name);
}
