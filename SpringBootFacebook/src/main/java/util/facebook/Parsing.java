package util.facebook;

/** il parsing analizza i dati d'ingresso;
 *  
* @author Valeria Calvarese
* 
*/


import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;

import model.facebook.Post;
import model.facebook.Foto;

import util.facebook.Parsing;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Parsing {
	 
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
			 public static ArrayList<Foto> getFoto(String link) throws MalformedURLException, IOException, JSONException
		 	 {
				 String url =null;
				 ArrayList<Foto> foto = new ArrayList<Foto>();
				 //Controllo eccezioni con try-catch
				 try {
					 url = Reading.read_url (link);
				  }
				 catch (MalformedURLException e) {
					 e.printStackTrace();
				 }
				 catch (IOException e) {
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
					 JSONObject o4 = object.getJSONArray("data").getJSONObject(i);
					 ObjectMapper o5 =new ObjectMapper ();
					 Foto o6  = o5.readValue(o4.toString(), Foto.class);
					 foto.add(o6);
				 }
				 
				 
			 return foto; }
	}

