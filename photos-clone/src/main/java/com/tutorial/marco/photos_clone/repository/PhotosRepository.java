package com.tutorial.marco.photos_clone.repository;

import org.springframework.data.repository.CrudRepository;

import com.tutorial.marco.photos_clone.model.Photo;

public interface PhotosRepository extends CrudRepository<Photo,Integer> {
	
	

}
