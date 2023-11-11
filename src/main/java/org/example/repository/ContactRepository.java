package org.example.repository;

import org.example.entity.ContactInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<ContactInfo, Long> {

    List<ContactInfo> findContactInfoByfirstName(String firstName);
    List<ContactInfo> findContactInfoBylastName(String lastName);
}

