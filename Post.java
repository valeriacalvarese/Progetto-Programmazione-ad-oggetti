package model.facebook;

 /** Classe che descrive i post di facebook;
  * 
  * @author Valeria Calvarese
  * @author Hermes Karalliu
  */
public class Post {
	private String id; 
	private String media_type;
	private String created_time;
	
	//metodi get e set utilizzati per modificare e visualizzare le variabili;
	
	public String getid() 
	{
		return id;
	}
	public void setid(String id)
	{
		this.id = id;
	}
	public String getMedia_type()
	{
		return media_type;
	}
	public void setMedia_type(String media_type)
	{
		this.media_type = media_type;
	}
	public String getCreated_time() 
	{
		return created_time;
	}
	public void setCreated_time(String created_time) 
	{
		this.created_time = created_time;
	}
	
	

	@Override
	//metodo che restituisce la stringa della classe Post;
	
	public String toString() {
		return "Post [id=" + id + ", media_type=" + media_type + ", created_time=" + created_time + "]";
	}
	
	
}
