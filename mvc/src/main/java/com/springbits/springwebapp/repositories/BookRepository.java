package com.springbits.springwebapp.repositories;

import com.springbits.springwebapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sergioletras on 02/02/19.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
