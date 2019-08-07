package com.notestore.main;

import org.springframework.data.repository.CrudRepository;

public interface Repository extends CrudRepository<Note, Integer> {

}