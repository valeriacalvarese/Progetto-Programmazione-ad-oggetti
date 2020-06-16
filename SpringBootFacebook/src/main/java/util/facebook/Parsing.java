package util.facebook;

/** Classe Foto che estende la classe post;
 *  
* @author Valeria Calvarese
* @author Hermes Karalliu
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
	 
	 public static ArrayList<Post> getPost(String link) throws MalformedURLException, IOException, JSONException
	 	 {
			 String url =null;
			 ArrayList<Post> post = new ArrayList<Post>();
			 
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
				 JSONObject o = object.getJSONArray("data").getJSONObject(i);
				 ObjectMapper m=new ObjectMapper ();
				 Post p = m.readValue(o.toString(), Post.class);
				 post.add(p);
						 
			 }
			 return post;
		 }
	}

