package util.facebook;

/** 
 *  
* @author Valeria Calvarese
* 
*/
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;

import org.json.JSONException;

import model.facebook.*;



public class Storage
{
	
	public static ArrayList<Metadati> metadati = new ArrayList<Metadati>();
	public static ArrayList<Post> post = new ArrayList<Post>();
	public static ArrayList<Post> foto = new ArrayList<Post>();
	
	public static void fill_post(String string1) throws MalformedURLException, IOException, JSONException
	{
		//controllo eccezioni
		try 
		{
			post= Parsing.getPost(string1);
		}
		 catch (MalformedURLException e)
		 {
			 e.printStackTrace();
		 }
		 
		 catch (IOException e)
		 {
			 e.printStackTrace();
		 }
		catch(JSONException e) 
		{
			e.printStackTrace();
		} 
		
	}
	
	
	public static void fill_foto(String string2) throws MalformedURLException, IOException, JSONException
	{
		//controllo eccezioni
		try 
		{
			foto= Parsing.getFoto(string2);
		}
		 catch (MalformedURLException e)
		 {
			 e.printStackTrace();
		 }
		 
		 catch (IOException e)
		 {
			 e.printStackTrace();
		 }
		catch(JSONException e) 
		{
			e.printStackTrace();
		} 	
	}
	
	public static ArrayList<Post> get_post() {
		return post;
	}
	public static ArrayList<Post> get_foto(){
		
			return foto;
		
	}
	
	
	public static ArrayList<Metadati> fill_Metadati() {
		// TODO Auto-generated method stub
		metadati.add(new Metadati("id","String","identificator"));
		metadati.add(new Metadati("message","String","description"));
		metadati.add(new Metadati("create_time","String","whenwaspublished"));
		metadati.add(new Metadati("story","String","richiamo"));
		metadati.add(new Metadati("size","ArrayList","dimensioni relativa all'immagine"));
		metadati.add(new Metadati("height","int","altezza relativa all'immagine"));
		metadati.add(new Metadati("width","int","larghezza relativa all'immagine"));
		metadati.add(new Metadati("resize","String","ridimensioni immagine"));
		
		return metadati;
	}

	
}
