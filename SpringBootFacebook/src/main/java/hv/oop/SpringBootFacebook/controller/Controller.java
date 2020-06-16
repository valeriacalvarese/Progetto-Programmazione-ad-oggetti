package hv.oop.SpringBootFacebook.controller;

/** 
 *  
* @author Valeria Calvarese
* @author Hermes Karalliu
*/

 
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;


import model.facebook.Metadati;
import model.facebook.Post;
import util.facebook.Storage;


/* 
*  
* @author Valeria Calvarese
* @author Hermes Karalliu
*/
public class Controller 
{
	@GetMapping("/post")
	public ArrayList<Post> getArrayPost()
	{
		return Storage.get_post();
	}
	
	@GetMapping("/metadati")
	public ArrayList<Metadati> getArrayMetadati()
	{
		return Storage.fill_Metadati();
	}


}
