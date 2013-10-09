package com.rajesh.spring.core.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionHolder {

	private List<String> names;
	
	private List<FoodItem> foodItems;
	
	private Map<String,String> stringMaps;
	
	private Map<String,FoodItem> foodMaps;
	
	private Set mixSet ;
	
	
	public Set getMixSet() {
		return mixSet;
	}

	public void setMixSet(Set mixSet) {
		this.mixSet = mixSet;
	}

	public Map<String, FoodItem> getFoodMaps() {
		return foodMaps;
	}

	public void setFoodMaps(Map<String, FoodItem> foodMaps) {
		this.foodMaps = foodMaps;
	}

	public Map<String, String> getStringMaps() {
		return stringMaps;
	}

	public void setStringMaps(Map<String, String> stringMaps) {
		this.stringMaps = stringMaps;
	}

	private Properties emails;

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public List<FoodItem> getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(List<FoodItem> foodItems) {
		this.foodItems = foodItems;
	}

	public Properties getEmails() {
		return emails;
	}

	public void setEmails(Properties emails) {
		this.emails = emails;
	}
	
	
	
	
	
}
