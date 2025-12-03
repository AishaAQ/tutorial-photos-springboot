package com.tutorial.marco.photos_clone.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.marco.photos_clone.service.PhotosService;

@RestController
public class DownloadController {
	
	private final PhotosService photosService;
	
	public DownloadController(PhotosService photosService) {
		this.photosService = photosService;
	}

	@GetMapping("/download/{id}")
	public ResponseEntity<byte[]> download(@PathVariable String id) {
		
		byte[] data = new byte[0];
		HttpHeaders headers = new HttpHeaders();
		
		return new ResponseEntity<>(data, headers, HttpStatus.OK);
				
	}
}
