package com.codeclan.RESTful_Routes.repositories;

import com.codeclan.RESTful_Routes.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
