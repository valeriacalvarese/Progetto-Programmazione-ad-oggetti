package util.facebook;

/** il parsing analizza i dati d'ingresso;
 *  
* @author Valeria Calvarese
* 
*/


import java.io.IOException;
import java.net.MalformedURLException;

import java.util.ArrayList;

import model.facebook.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Parsing {
	 
	

	
	/*
	 * metodo di parsing per la creazione di ArrayList<Post>
	 * @param link, da dove otteniamo le stringhe per effetuare richiesta get per il parsing
	 * @return arraylist di post
	 * @throws MalformedURLException
	 * @throws IOException
	 * @throws JSONException
	 *
	 */
	public static ArrayList<Post> getPost(String link) throws MalformedURLException, IOException, JSONException
	 	 {
			 String url =null;
			 ArrayList<Post> post = new ArrayList<Post>();
			 
			 //Controllo eccezioni con try-catch
			 
			 try 
			 {
				 url = Reading.read_url (link);
				 
			 }
			 catch (MalformedURLException e)
			 {
				 e.printStackTrace();
			 }
			 
			 catch (IOException e)
			 {
				 e.printStackTrace();
			 }
			  
			 JSONObject object =null;
			 try {
				 object =new JSONObject(url);
			 }
			 catch (JSONException e){
				 e.printStackTrace ();
			 }
			 
			 JSONArray array = object.getJSONArray("data");
			 
			 for (int i=0; i<array.length(); i++)
			 {
				 JSONObject o1 = object.getJSONArray("data").getJSONObject(i);
				 ObjectMapper o2 =new ObjectMapper ();
				 Post o3  = o2.readValue(o1.toString(), Post.class);
				 post.add(o3);
						 
			 }
			 return post;
	 	 }
	
	 /* metodo di parsing per la creazione di ArrayList<Post>
	 * @param link, da dove otteniamo le stringhe per effetuare richiesta get per il parsing
	 * @return arraylist di post
	 * @throws MalformedURLException
	 * @throws IOException
	 * @throws JSONException
	 *
	 */
	public static ArrayList<Post> getFoto(String link) throws JSONException, IOException
	{
		 String url =null;
		 ArrayList<Post> foto = new ArrayList<Post>();
		 //Controllo eccezioni con try-catch 
		 try 
		 {
			 url = Reading.read_url (link);
			 //URL url1 = new URL("https://graph.facebook.com/v7.0/PerriSristorantePizzeria/feed?fields=full_picture&access_token=EAAEBaCJy5BwBAIruMFDGMl91xciu9nbcXZCEl4o6hxWgiV0IW2gZAVcFZCVtZC7Wzz31z5WVZCJoEdX0OeLHU5NZBc2dZAL0SaliVY2jkq9ioI5PQ6rFxA61fGssIN3HP2WMkKudehNctbQYY8ql1Lw7cr07CjE3JToP9kH53BjXAZDZD");
			 
		 }
		 catch (MalformedURLException e)
		 {
			 e.printStackTrace();
		 }
		 catch (IOException e)
		 {
			 e.printStackTrace();
		 } 
		 JSONObject o =null;
		 try {
			 o =new JSONObject(url);
		 }
		 catch (JSONException e){
			 e.printStackTrace ();
		 }
		 
		 JSONArray array2 = o.getJSONArray("data");
		 
		 for (int i=0; i<array2.length(); i++)
		 {
			 //prende elemento in pos i dell'array data  e lo mette in o
			 //data è l'array json restituito da postman
			 JSONObject o4 = o.getJSONArray("data").getJSONObject(i);
			 ObjectMapper o5 =new ObjectMapper ();
			 Post o6  = o5.readValue(o4.toString(), Post.class);
			 foto.add(o6);
					 
		 }
		 return foto;
		 
	 }
	 
	/*metodo per la presenza delle foto nei post
	 * @return true se è presente
	 * @return link della foto
	*/
	public static void ContainPhoto(ArrayList<Post> post, ArrayList<Post> a)
	{
	int j=0; 
				
		
		for(int i=0;i<a.size();i++)
		{ 

			for (j=0; j<post.size(); j++) 
			{
				if(a.get(i).getId().compareTo(post.get(j).getId())==0)
				{
					post.get(j).setContainPhoto(true); 
					post.get(j).setFull_picture(a.get(i).getFull_picture());
				}
			}
			

		}
		
	}   
}

			