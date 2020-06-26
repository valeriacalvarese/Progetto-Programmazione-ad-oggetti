package hv.oop.SpringBootFacebook.controller;

import java.io.IOException;

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
import service.facebook.*;

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
	
	@GetMapping ("/maxbytes")
	public static String MaxByte() throws IOException
	{
		
		Statistics s= new Statistics();
		return "Il massimo e':" + s.MaxBytes();
	}
	
	@GetMapping ("/minbytes")
	public static String MinByte() throws IOException
	{
		
		Statistics s= new Statistics();
		return "Il minimo e':" + s.MinBytes();
	}
	
	
	
	
	
}