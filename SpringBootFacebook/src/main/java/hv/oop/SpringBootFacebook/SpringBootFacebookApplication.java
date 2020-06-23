package hv.oop.SpringBootFacebook;

/*
* 
*  
* @author Valeria Calvarese
* 
*/
import java.io.IOException;

import java.net.MalformedURLException;

import org.json.JSONException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import util.facebook.*;

@SpringBootApplication
public class SpringBootFacebookApplication
{
	public static void main(String[] args) throws MalformedURLException, IOException, JSONException
	{
		try
		{
		Storage.fill_post(
				"https://graph.facebook.com/v7.0/PerriSristorantePizzeria/feed?access_token=EAAEBaCJy5BwBAIruMFDGMl91xciu9nbcXZCEl4o6hxWgiV0IW2gZAVcFZCVtZC7Wzz31z5WVZCJoEdX0OeLHU5NZBc2dZAL0SaliVY2jkq9ioI5PQ6rFxA61fGssIN3HP2WMkKudehNctbQYY8ql1Lw7cr07CjE3JToP9kH53BjXAZDZD");
		Storage.fill_foto("https://graph.facebook.com/v7.0/PerriSristorantePizzeria/feed?fields=full_picture&access_token=EAAEBaCJy5BwBAIruMFDGMl91xciu9nbcXZCEl4o6hxWgiV0IW2gZAVcFZCVtZC7Wzz31z5WVZCJoEdX0OeLHU5NZBc2dZAL0SaliVY2jkq9ioI5PQ6rFxA61fGssIN3HP2WMkKudehNctbQYY8ql1Lw7cr07CjE3JToP9kH53BjXAZDZD");
		Parsing.ContainPhoto(Storage.post,Storage.foto);
		Storage.fill_Metadati();
			}
			catch (MalformedURLException e)
 		{
		e.printStackTrace();
		}
		
	catch (IOException e)
		{
		e.printStackTrace();
		}
		
	catch (JSONException e)
		{
		e.printStackTrace();
		}
		{
		SpringApplication.run(SpringBootFacebookApplication.class, args);
		}
	}
}
		

