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
import model.facebook.Foto;
import util.facebook.Storage;
import org.springframework.web.bind.annotation.RestController;

/* 
*  
* @author Valeria Calvarese
* 
*/
@RestController
public class Controller 
{
	@GetMapping("/post")
	public ArrayList<Post> getArrayPost()
	{
		return Storage.get_post();
		
		
	}
	//conta numero dei post della pagina;
	
	@GetMapping("/tot")
	public int Count()
	{
		return getArrayPost().size();
	}
	
	
	
	@GetMapping("/metadati")
	public ArrayList<Metadati> getArrayMetadati()
	{
		return Storage.fill_Metadati();
	}
	
	@GetMapping("/foto")
	public ArrayList<Foto> getArrayFoto()
	{
		return Storage.get_foto();
	}
	
	
}
