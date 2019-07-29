package com.tts.APIexample.model;

import java.util.Date;
import java.util.List;

public class ItemV2 {

	public class Item {
	    private String name;
	    private String description;
	    private String category;
	    private List<Ingredient> ingredients;
	    private double price;
	    private Date createdDate;
	    private Date updatedDate;
	    private boolean glutenFree;
	    private boolean vegetarian;
	}
	
}
