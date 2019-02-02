package com.springbits.springwebapp.repositories;

import com.springbits.springwebapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sergioletras on 02/02/19.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
