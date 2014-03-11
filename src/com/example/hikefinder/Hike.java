package com.example.hikefinder;

public class Hike
{
	int id;
	String name;
	String description;
	double distance;
	int elevationChange;
	int waterfall;
	int geological;
	int historical;
	int dogFriendly;
	int oceanView;
	String location;
	
	int completed;
	int rating;
	String review;
	String notes;
	
	
	Hike()
	{
		id = -1;
		name = "default";
		description = "default";
		distance = 0;
		elevationChange = 0;
		waterfall = 0;
		geological = 0;
		historical = 0;
		dogFriendly = 0;
		oceanView = 0;
		location = "default";

		completed = 0;
		rating = 0;
		review = "default";
		notes = "default";
	}
	
	Hike(	String new_name, String new_description, double new_distance, int new_elevationChange, int new_waterfall,
			int new_geological, int new_historical, int new_dogFriendly, int new_oceanView, String new_location)
	{
		name = new_name;
		description = new_description;
		distance = new_distance;
		elevationChange = new_elevationChange;
		waterfall = new_waterfall;
		geological = new_geological;
		historical = new_historical;
		dogFriendly = new_dogFriendly;
		oceanView = new_oceanView;
		location = new_location;
		
		completed = 0;
		rating = 0;
		review = "default";
		notes = "default";
	}
	
	Hike( int new_id, String new_name, String new_description, double new_distance, int new_elevationChange, int new_waterfall,
			int new_geological, int new_historical, int new_dogFriendly, int new_oceanView, String new_location,
			int new_completed, int new_rating, String new_review, String new_notes)
	{
		id = new_id;
		name = new_name;
		description = new_description;
		distance = new_distance;
		elevationChange = new_elevationChange;
		waterfall = new_waterfall;
		geological = new_geological;
		historical = new_historical;
		dogFriendly = new_dogFriendly;
		oceanView = new_oceanView;
		location = new_location;
		
		completed = new_completed;
		rating = new_rating;
		review = new_review;
		notes = new_notes;
	}
	
	// getters
	public int getId() { return this.id; }
	public String getName() { return this.name; }
	public String getDescription() { return this.description; }
	public double getDistance() { return this.distance; }
	public int getElevationChange() { return this.elevationChange; }
	public int getWaterfall() { return this.waterfall; }
	public int getGeological() { return this.geological; }
	public int getHistorical() { return this.historical; }
	public int getDogFriendly() { return this.dogFriendly; }
	public int getOveanView() { return this.oceanView; }
	public String getLocation() { return this.location; }
	public int getCompleted() { return this.completed; }
	public int getRating() { return this.rating; }
	public String getReview() { return this.review; }
	public String getNotes() { return this.notes; }
	
	// setters
	public void setId(int newId) { this.id = newId; }
	public void setName(String newName) { this.name = newName; }
	public void setDescription(String newDescripion) { this.description = newDescripion; }
	public void setDistance(double newDistance) { this.distance = newDistance; }
	public void setElevationChange(int newElevationChange) { this.elevationChange = newElevationChange; }
	public void setWaterfall(int newWaterfall) { this.waterfall = newWaterfall; }
	public void setGeological(int newGeological) { this.geological = newGeological; }
	public void setHistorical(int newHistorical) { this.historical = newHistorical; }
	public void setDogFriendly(int newdogFriendly) { this.dogFriendly = newdogFriendly; }
	public void setOveanView(int newOceanView) { this.oceanView = newOceanView; }
	public void setLocation(String newLocation) { this.location = newLocation; }
	public void setCompleted(int newCompleted) { this.completed = newCompleted; }
	public void setRating(int newRating) { this.rating = newRating; }
	public void setReview(String newReview) { this.review = newReview; }
	public void setNotes(String newNotes) { this.notes = newNotes; }
	
	public String toString()
	{
		String hikeString = "Hike Name:" + this.name;		
		return hikeString;
	}
}
