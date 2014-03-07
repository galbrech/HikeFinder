package com.example.hikefinder;

import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper 
{
  // Database Version
   private static final int DATABASE_VERSION = 1;
   // Database Name
   private static final String DATABASE_NAME = "HikeDB";
   
	static final String NAME = "name";
	static final String DESC = "description";
	static final String DIST = "distance";
	static final String ELEVCH = "elevationChange";
	static final String WTRFL = "waterfall";
	static final String GEO = "geological";
	static final String HIST = "historical";
	static final String DOG = "dogFriendly";
	static final String OCNVW = "oceanView";
	static final String LOC = "location";
	               
	static final String COMP = "completed";
	static final String RATE = "rating";
	static final String REVW = "review";
	static final String NOTES = "notes";

   public DatabaseHandler(Context context) {
       super(context, DATABASE_NAME, null, DATABASE_VERSION);  
   }

   @Override
   public void onCreate(SQLiteDatabase db) {
       // SQL statement to create book table
       String CREATE_HIKE_TABLE = "CREATE TABLE hikesDB ( " +
               "id INTEGER PRIMARY KEY AUTOINCREMENT, " + 
               "name TEXT, "+
               "description TEXT, "+
               "distance INTEGER, "+
               "elevationChange INTEGER, "+
               "waterfall INTEGER, "+
               "geological INTEGER, "+
               "historical INTEGER, "+
               "dogFriendly INTEGER, "+
               "oceanView INTEGER, "+
               "location TEXT, "+
               
               "completed INTEGER, "+
               "rating INTEGER, "+
               "review TEXT, "+
               "notes TEXT )";

       // create hikesDB table
       db.execSQL(CREATE_HIKE_TABLE);
   }

   @Override
   public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
       // Drop older books table if existed
       db.execSQL("DROP TABLE IF EXISTS hikesDB");

       // create fresh books table
       this.onCreate(db);
   }
   
   // Adding new Hike
   public void addHike(Hike newhike) {
      SQLiteDatabase db = this.getWritableDatabase();
      
      ContentValues values = new ContentValues();
      values.put(NAME, newhike.getName());
      values.put(DESC, newhike.getDescription());
      values.put(DIST, newhike.getDistance());
      values.put(ELEVCH, newhike.getElevationChange());
      values.put(WTRFL, newhike.getWaterfall());
      values.put(GEO, newhike.getGeological());
      values.put(HIST, newhike.getHistorical());
      values.put(DOG, newhike.dogFriendly);
      values.put(OCNVW, newhike.getOveanView());
      values.put(LOC, newhike.getLocation());
      values.put(COMP, newhike.getCompleted());
      values.put(RATE, newhike.getRating());
      values.put(REVW, newhike.getReview());
      values.put(NOTES, newhike.getNotes());
   
      // Inserting Row
      db.insert(DATABASE_NAME, null, values);
      db.close(); // Closing database connection
   }
 
   // Getting single Hike
   //public Hike getContact(int id) {}
 
   // Getting All Hike
   //public List<Hike> getAllContacts() {}
 
   // Getting Hike Count
   //public int getHikesCount() {}
   
   // Updating single Hike
   //public int updateHike(Hike contact) {}
 
   // Deleting single Hike
   //public void deleteHike(Hike contact) {}
   
}
