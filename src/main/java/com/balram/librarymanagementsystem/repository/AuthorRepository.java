package com.balram.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balram.librarymanagementsystem.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
