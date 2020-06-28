package model.facebook;




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
	private Boolean ContainPhoto;
	
	
	
	
	/**costruttore;
	 * 
	 */
	public Post ()
	{
		this.id = null;
		this.message= null;
		this.created_time = null;
		this.story =null;
		this.full_picture = null ;
		this.ContainPhoto =null;
		
	}
	
	/**
	 * metodi Getters and Setters
	 */
	
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

	
	public Boolean getContainPhoto() {
		return ContainPhoto;
	}



	public void setContainPhoto(Boolean b) {
		this.ContainPhoto=b;
	}
	
}

