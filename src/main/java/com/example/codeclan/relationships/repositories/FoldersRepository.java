package com.example.codeclan.relationships.repositories;

import com.example.codeclan.relationships.models.Folders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoldersRepository extends JpaRepository<Folders, Long> {
}
