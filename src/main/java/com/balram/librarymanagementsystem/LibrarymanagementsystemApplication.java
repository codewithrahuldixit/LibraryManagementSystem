package com.balram.librarymanagementsystem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

import com.balram.librarymanagementsystem.entity.Author;
import com.balram.librarymanagementsystem.entity.Book;
import com.balram.librarymanagementsystem.entity.Category;
import com.balram.librarymanagementsystem.entity.Publisher;
import com.balram.librarymanagementsystem.service.BookService;

@SpringBootApplication
//(exclude = SecurityAutoConfiguration.class)
public class LibrarymanagementsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibrarymanagementsystemApplication.class, args);
	}

	@Bean
	public CommandLineRunner initialCreate(BookService bookService) {
		return (args) -> {

			Book book = new Book("10003", "Complete Reference", "1001", "Core Java");
			Author author = new Author("Balram", "Programming Expert");
			Category category = new Category("Programming Books");
			Publisher publisher = new Publisher("Rahul");

			book.addAuthors(author);
			book.addCategories(category);
			book.addPublishers(publisher);

			bookService.createBook(book);

			Book book1 = new Book("10004", "India Before Independence", "1002", "Comtemprary of Gandhi");
			Author author1 = new Author("Rahul", "Historian");
			Category category1 = new Category("History Books");
			Publisher publisher1 = new Publisher("Sourav");

			book1.addAuthors(author1);
			book1.addCategories(category1);
			book1.addPublishers(publisher1);

			bookService.createBook(book1);

			Book book2 = new Book("10005", "TCP-IP Protocol Suite", "1003", "Networking Book");
			Author author2 = new Author("Jena", "Network Engineer");
			Category category2 = new Category("Networking");
			Publisher publisher2 = new Publisher("Rajni");

			book2.addAuthors(author2);
			book2.addCategories(category2);
			book2.addPublishers(publisher2);

			bookService.createBook(book2);

		};
	}
}
