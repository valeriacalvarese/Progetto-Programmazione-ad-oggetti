package model.facebook;
/** Classe Foto che estende la classe post;
 *  
* @author Valeria Calvarese
* 
*/
public class Foto extends Post{
	
	
	private String id;
	private String media_url ;
	private int pixelWidth; //larghezza 
	private int pixelHeight; //altezza 
	private int nbyte;
	private String full_picture;

	
	public Foto ()
	{
		super();
		this.id = null;
		this.media_url =null;
		this.pixelHeight = 0;
		this.pixelWidth = 0;
		this.nbyte =0 ;
		this.full_picture = null;
			
	}
	
	public Foto(String id, String media_url, String full_picture)
	{
		this.id =id;
		this.media_url=media_url;
		this.full_picture=full_picture;
		
	}
	public boolean getFoto() 
	{
		if(this.media_url != null)
		{
			return true;
		}
		else
		{
			return false;
		
		}
		}
	
		public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMedia_url() {
		return media_url;
	}

	public void setMedia_url(String media_url) {
		this.media_url = media_url;
	}

	public int getPixelWidth() {
		return pixelWidth;
	}

	public void setPixelWidth(int pixelWidth) {
		this.pixelWidth = pixelWidth;
	}

	public int getPixelHeight() {
		return pixelHeight;
	}

	public void setPixelHeight(int pixelHeight) {
		this.pixelHeight = pixelHeight;
	}

	public int getNbyte() {
		return nbyte;
	}

	public void setNbyte(int nbyte) {
		this.nbyte = nbyte;
	}
	
	
	
	
	

	public String getFull_picture() {
		return full_picture;
	}

	public void setFull_picture(String full_picture) {
		this.full_picture = full_picture;
	}

	@Override
	public String toString() {
		return "Foto [id=" + id + ", media_url=" + media_url + ", pixelWidth=" + pixelWidth + ", pixelHeight="
				+ pixelHeight + ", nbyte=" + nbyte + ", full_picture=" + full_picture + "]";
	
	
	}
	
} 
