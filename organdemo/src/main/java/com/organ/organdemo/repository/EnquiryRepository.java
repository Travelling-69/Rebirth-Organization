package com.organ.organdemo.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.organ.organdemo.model.Enquiry;


@Repository
@Qualifier("enRepo")
public interface EnquiryRepository extends JpaRepository<Enquiry,Integer>{

}
