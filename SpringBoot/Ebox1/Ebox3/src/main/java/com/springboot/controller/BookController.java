package com.springboot.controller;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.domain.Book;
import com.springboot.dao.BookDAO;

import java.util.Map;

@RestController
@RequestMapping("/book")
public class BookController {
    
    
    BookDAO dao = new BookDAO();

    @PostMapping( value="/create")
    public Book create(@RequestBody Book book)
    {
	    return dao.saveBook(book);
//        return b;
    }

	@GetMapping(value="/categorize")
    public Map<String, List<Book>> categorizeBooks()
    {
        return dao.categorizeBooks();
    }
}
