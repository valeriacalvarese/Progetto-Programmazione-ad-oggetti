package model.facebook;


import java.net.MalformedURLException;
import java.net.URL;
import util.facebook.Parsing;
import util.facebook.Storage;
import hv.oop.SpringBootFacebook.controller.*;

/** Classe che descrive i post di facebook;
  * 
  * @author Valeria Calvarese
  */

public class Post {
	
	private String id; 
	private String message;
	private String created_time;
	private String story;
	private String full_picture;
	
	
	
	
	//costruttore;
	public Post ()
	{
		this.id = null;
		this.message= null;
		this.created_time = null;
		this.story =null;
		this.full_picture = null ;
		
	}
	
	
	
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getMessage()
	{
		return message;
	}
	public void setMessage(String message)
	{
		this.message = message;
	}
	public String getCreated_time() 
	{
		return created_time;
	}
	public void setCreated_time(String created_time) 
	{
		this.created_time = created_time;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public String getFull_picture() {
	return full_picture;
	}
	public void setFull_picture(String full_picture) {
	this.full_picture = full_picture;
	}


	public void setContainPhoto(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
}

