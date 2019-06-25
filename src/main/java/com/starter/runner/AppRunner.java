package com.starter.runner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;import com.starter.document.Book;
import com.starter.repo.BookRepository;

@Component
public class AppRunner implements CommandLineRunner {

	@Autowired
	private BookRepository repo;
	
	@Override
	public void run(String... args) throws Exception {

		Map<String,String> m1 = new HashMap<>();
		m1.put("A1","B1");
		m1.put("A2", "B2");
		
		Properties p = new Properties();
		p.put("M1", "N1");
		p.put("M2", "N2");
		
		repo.deleteAll();
		repo.save(new Book("Java", "James", 1.1, 
				Arrays.asList("A1","A2"), 
				new String[]{"B1","B2"},
				m1,
				p));
	}

}
