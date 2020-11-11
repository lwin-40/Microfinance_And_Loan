package com.mdls.microfinancesystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mdls.microfinancesystem.entity.Guarantor;
import com.mdls.microfinancesystem.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>{

	@Query(value="Select m from Member m  where m.memberGroupName like concat('%',concat(?1,'%'))")
List<Member> searchMemberGroup(String memberGroupName);
}
