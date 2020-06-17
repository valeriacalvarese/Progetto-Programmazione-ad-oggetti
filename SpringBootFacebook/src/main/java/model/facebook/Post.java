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
	private int pixelHeigth;
	private int pixelWidth;
	private String resize;
	private int nbyte;
	
	
	//costruttore;
	public Post ()
	{
		this.id = null;
		this.message= null;
		this.created_time = null;
		this.story =null;
		this.pixelHeigth =0;
		this.pixelWidth= 0;
		this.resize = null;
		this.nbyte = 0;
	
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


	public int getPixelHeigth() {
		return pixelHeigth;
	}


	public void setPixelHeigth(int pixelHeigth) {
		this.pixelHeigth = pixelHeigth;
	}


	public int getPixelWidth() {
		return pixelWidth;
	}


	public void setPixelWidth(int pixelWidth) {
		this.pixelWidth = pixelWidth;
	}


	public String getResize() {
		return resize;
	}


	public void setResize(String resize) {
		this.resize = resize;
	}


	public int getNbyte() {
		return nbyte;
	}


	public void setNbyte(int nbyte) {
		this.nbyte = nbyte;
	}
	
	

	

	
	
	
	
}
