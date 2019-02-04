package com.springbits.springwebapp.bootstrap;

import com.springbits.springwebapp.model.Author;
import com.springbits.springwebapp.model.Book;
import com.springbits.springwebapp.model.Publisher;
import com.springbits.springwebapp.repositories.AuthorRepository;
import com.springbits.springwebapp.repositories.BookRepository;
import com.springbits.springwebapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by sergioletras on 02/02/19.
 */
@Component
public class DataBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DataBootstrap(BookRepository bookRepository, AuthorRepository authorRepository, PublisherRepository publisherRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.publisherRepository = publisherRepository;
    }

    public void initData(){

        Publisher pbd = new Publisher("PBD publishings", "Washington");
        Publisher bestEditor = new Publisher("BestEditor", "Hollywood");

        publisherRepository.save(bestEditor);
        publisherRepository.save(pbd);

        Book ddd = new Book("Domain driven development", "12345");
        Author eric = new Author("John", "Jackson");

        ddd.addAuthor(eric);
        ddd.setPublisher(bestEditor);
        eric.addBook(ddd);

        Book noEjb = new Book("No EJB", "44444");
        Author don = new Author("Donald", "Trump");

        noEjb.addAuthor(don);
        noEjb.setPublisher(pbd);
        don.addBook(noEjb);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        authorRepository.save(don);
        bookRepository.save(noEjb);



    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
}
