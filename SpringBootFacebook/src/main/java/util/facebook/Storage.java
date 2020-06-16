package util.facebook;


/** 
 *  
* @author Valeria Calvarese
* @author Hermes Karalliu
*/
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;

import org.json.JSONException;

import model.facebook.Metadati;
import model.facebook.Post;


public class Storage
{
	
	public static ArrayList<Metadati> metadati = new ArrayList<Metadati>();
	public static ArrayList<Post> post = new ArrayList<Post>();
	
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

	public static ArrayList<Metadati> fill_Metadati() {
		// TODO Auto-generated method stub
		metadati.add(new Metadati("id","String","identificator"));
		metadati.add(new Metadati("message","String","description"));
		metadati.add(new Metadati("create_time","String","whenwaspublished"));
		return metadati;
	}

	public static ArrayList<Post> get_post() {
		// TODO Auto-generated method stub
		return post;
	}
}
