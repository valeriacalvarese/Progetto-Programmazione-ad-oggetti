package model.facebook;

 /** Classe che descrive i post di facebook;
  * 
  * @author Valeria Calvarese
  * @author Hermes Karalliu
  */
public class Post {
	private String id; 
	private String message;
	private String created_time;
	private String story;
	
	//costruttore;
	public Post ()
	{
		this.id = null;
		this.message= null;
		this.created_time = null;
		this.story =null;
	}
	//metodi get e set utilizzati per modificare e visualizzare le variabili;
	
	
	public String getid() 
	{
		return id;
	}
	public void setid(String id)
	{
		this.id = id;
	}
	public String getmessage()
	{
		return message;
	}
	public void setmessage(String message)
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


	
	
	
}
