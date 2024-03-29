package com.tts.APIexample.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tts.APIexample.model.Item;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value="menuitems", description="Operations pertaining to Menu Items")
@ApiResponses(value = {
	    @ApiResponse(code = 200, message = "Successfully retrieved menu items"),
	    @ApiResponse(code = 401, message = "You are not authorized to view the menu items")
	})
@RequestMapping("/v1")
public class APIcontroller {
	
	@ApiOperation(value = "Get all menu items", response = Item.class, 
            responseContainer = "List")
	
	
	@GetMapping("/items")
	public ResponseEntity<List<Item>> getItems() {
			return new ResponseEntity<>(new ArrayList<Item>(), HttpStatus.OK);
}
	
	
	
		

}
