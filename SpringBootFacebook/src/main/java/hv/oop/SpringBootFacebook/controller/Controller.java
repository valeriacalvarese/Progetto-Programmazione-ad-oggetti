package hv.oop.SpringBootFacebook.controller;

/** 
 *  
* @author Valeria Calvarese
* @author Hermes Karalliu
*/

 
import java.util.ArrayList;
import java.util.Vector;

import org.springframework.web.bind.annotation.GetMapping;


import model.facebook.Metadati;
import model.facebook.Post;
import util.facebook.Storage;
import org.springframework.web.bind.annotation.RestController;

/* 
*  
* @author Valeria Calvarese
*/
@RestController
public class Controller 
{
	@GetMapping("/post")
	public static ArrayList<Post> getArrayPost()
	{
		return Storage.get_post();
		
		
	}
	
	//conta numero dei post della pagina;
	
	@GetMapping("/tot")
	public String Count()
	{
		
		return "Il numero totale di post e' : " +getArrayPost().size();
	}
	
	
	
	@GetMapping("/metadati")
	public static ArrayList<Metadati> getArrayMetadati()
	{
		return Storage.get_Metadati();
	}
	
	
	
	
	
}
