package com.springboot.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.springboot.domain.Book;

@Component
public class BookDAO {
    
	public static List<Book> bookList = new ArrayList<Book>();
	static {
		bookList.add(new Book(1L, "The Silent Patient","Psychological thriller","Celadon Books", "Alex Michaelides"));
		bookList.add(new Book(2L, "The Plot","Domestic Fiction","Celadon Books", "Jean Hanff Korelitz"));
		bookList.add(new Book(3L, "In Cold Blood","Non-fiction","Random House", "Truman Capote"));
		bookList.add(new Book(4L, "The Road to Reality","LAWS OF THE UNIVERSE","Random House", "ROGER PENROSE"));
		bookList.add(new Book(5L, "Big Little Lies","Non-fiction","Penguin Publishing","Liane Moriarty"));
	}

	public Map<String, List<Book>> categorizeBooks() {
		Map<String, List<Book>> book = new HashMap<>();
        ArrayList<Book> sil = new ArrayList<>();
        ArrayList<Book> plot = new ArrayList<>();
        ArrayList<Book> col = new ArrayList<>();
        
        for(Book b: bookList){
            if(book.containsKey(b.getName())){
                book.get(b.getName()).add(b);
            }
            else{
                book.put(b.getPublisher(), new ArrayList<Book>()
                    {   
                        {add(b);}
                    });
                
            }
        }
        return book;
	}
	
	public Book saveBook(Book book) {
		bookList.add(book);
        return book;
	}
}
