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
	
	/* dopo il parsing salvo l'array dei posts
	 * @param str,url del parsing
	 * @throws MalformedURLException
	 * @throws IOException
	 * @throws JSONException 
	 *  
	*/
	
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
	
	
	public static void fill_foto(String string2) throws JSONException, MalformedURLException, IOException
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
	
	/*
	 * @return array post
	 */
	
	public static ArrayList<Post> get_post() {
		return post;
	}
	/*
	 * @return array foto
	 */
public static ArrayList<Post> get_foto(){
		
			return foto;
		
	}
	
/* dopo il parsing salvo l'array dei posts
 * @return metadata
 *  
*/
	
	public static void fill_Metadati() {
		
		metadati.add(new Metadati("id","String","identificator"));
		metadati.add(new Metadati("message","String","description"));
		metadati.add(new Metadati("create_time","String","whenwaspublished"));
		metadati.add(new Metadati("story","String","tag"));
		metadati.add(new Metadati("full_picture","String","link immagine"));
		metadati.add(new Metadati("Containphoto","boolean","vero se è una foto"));
		
		
		
	}
	
	/*array che restituisce i metadati
	 * 
	 * @return array metadati
	 */
	public static ArrayList<Metadati> get_Metadati()
	{
		return metadati;
	}

	
}
