package util.facebook;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;

import org.json.JSONException;

import model.facebook.Post;
//import model.facebook.Metadata;

public class Storage
{
	
	//public static ArrayList<Metadata> metadata = newArrayList<Metadata> ();
	public static ArrayList<Post> post = new ArrayList<Post>();
	
	public static void fill_post(String str) throws MalformedURLException, IOException, JSONException
	{
		try 
		{
			post= Parsing.getPost(str);
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
}
