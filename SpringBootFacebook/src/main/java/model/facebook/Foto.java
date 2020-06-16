package model.facebook;

/** Classe Foto che estende la classe post;
 *  
* @author Valeria Calvarese
* @author Hermes Karalliu
*/
 
public class Foto {
	private String id_foto =null;
	private String media_url = null;
	private int pixelWide=0; //larghezza 
	private int pixelHeight=0; //altezza 
	private int nbyte=0;
	private String resize; //addamento delle immagini
	
		
	public Foto(String id_foto, String media_url) 
	{
		this.id_foto = id_foto;
		this.media_url= media_url;
	}

	public String getId_foto() {
		return id_foto;
	}

	public void setId_foto(String id_foto) {
		this.id_foto = id_foto;
	}

	public String getMedia_url() {
		return media_url;
	}

	public void setMedia_url(String media_url) {
		this.media_url = media_url;
	}

	public int getPixelWide() {
		return pixelWide;
	}

	public void setPixelWide(int pixelWide) {
		this.pixelWide = pixelWide;
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
	
	public String getResize() {
		return resize;
	}

	public void setResize(String resize) {
		this.resize = resize;
	}

	@Override
	public String toString() {
		return "Foto [id_foto=" + id_foto + ", media_url=" + media_url + ", pixelWide=" + pixelWide + ", pixelHeight="
				+ pixelHeight + ", nbyte=" + nbyte + "]";
	}
	
} 
