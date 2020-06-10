package com.codeclan.RESTful_Routes.repositories;

import com.codeclan.RESTful_Routes.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {


}
