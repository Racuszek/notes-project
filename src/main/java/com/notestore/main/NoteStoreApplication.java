package com.notestore.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.notestore"})
public class NoteStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoteStoreApplication.class, args);
	}

}
