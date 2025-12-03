package com.tutorial.marco.photos_clone.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.tutorial.marco.photos_clone.model.Photo;
import com.tutorial.marco.photos_clone.repository.PhotosRepository;

@Service
public class PhotosService {
	
	private final PhotosRepository photosRepository;

	public PhotosService(PhotosRepository photosRepository) {
		this.photosRepository = photosRepository;
	}

	public Iterable<Photo> get() {
		
		return photosRepository.findAll();
	}

	public Photo get(Integer id) {
		return photosRepository.findById(id).orElse(null);
	}

	public void remove(Integer id) {
		photosRepository.deleteById(id);
	}

	public Photo save(String fileName, String contentType, byte[] data) {
		Photo photo = new Photo();
		photo.setFileName(fileName);
		photo.setContentType(contentType);
		photo.setData(data);
		photosRepository.save(photo);
		return photo;
	}

}
