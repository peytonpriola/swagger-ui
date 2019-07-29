package com.tts.APIexample.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tts.APIexample.model.ItemV2;

@RestController
@RequestMapping("/v2")
public class APIcontrollerV2 {
	
	@GetMapping("/items")
	public ResponseEntity<List<ItemV2>> getItems() {
			return new ResponseEntity<>(new ArrayList<ItemV2>(), HttpStatus.OK);
}
}
