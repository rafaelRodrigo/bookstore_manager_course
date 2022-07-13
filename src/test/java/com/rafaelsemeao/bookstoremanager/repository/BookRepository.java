package com.rafaelsemeao.bookstoremanager.repository;

import com.rafaelsemeao.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
