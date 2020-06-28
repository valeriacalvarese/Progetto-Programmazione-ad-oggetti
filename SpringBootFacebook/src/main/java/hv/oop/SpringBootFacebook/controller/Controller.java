package hv.oop.SpringBootFacebook.controller;

import java.io.IOException;

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
import service.facebook.*;

import org.springframework.web.bind.annotation.RestController;

/* 
*  
* @author Valeria Calvarese
*/
@RestController
public class Controller 
{
	/*Elenco dei post della pagina
	 * @return elenco dei post con presenza di foto
	 */
	@GetMapping("/post")
	public static ArrayList<Post> getArrayPost()
	{
		return Storage.get_post();
		
		
	}
	
	/**Conta numero dei post della pagina
	 ** 
	 ** @return numero totale dei post
	**/
	
	@GetMapping("/tot")
	public static Post Count()
	{
		
		Post p = new Post();
		return Post.Count;
	}
	
	
	/**Elenco Metadati della pagina
	 ** 
	 ** @return elenco dei metadata
	 **/
	@GetMapping("/metadati")
	public static ArrayList<Metadati> getArrayMetadati()
	{
		return Storage.get_Metadati();
	}
	
	/**Max Bytes di una foto
	 ** @return massimo bytes occupato da una foto
	**/
	@GetMapping ("/maxbytes")
	public static Statistics  MaxByte() throws IOException
	{
		
		Statistics s= new Statistics();
		return StatsService.MaxBytes(s);
	}
	/**Min Bytes di una foto
	 ** 
	 ** @return minimo bytes occupato da una foto
	**/
	@GetMapping ("/minbytes")
	public static Statistics MinByte() throws IOException
	{
		
		Statistics s= new Statistics();
		return StatsService.MinBytes(s);
	}
	
	/**Max Pixel di una foto
	  ** @return massimo dei pixel occupato da una foto
	**/
		@GetMapping ("/maxpixel")
		public static Statistics  MaxPixel() throws IOException
		{
			
			Statistics s= new Statistics();
			return StatsService.MaxPixel(s);
		}
		/**Min Pixel di una foto
		  ** @return minimo dei pixel occupato da una foto
		**/
		@GetMapping ("/minpixel")
		public static Statistics MinPixel() throws IOException
		{
			
			Statistics s= new Statistics();
			return StatsService.MinPixel(s);
		}
	
	@GetMapping ("AveragePixel")
	  /**Media dei Pixel
	 ** @return media dei pixel	
	 **/
	
	public static Statistics AveragePixel() throws IOException 
	{
		Statistics s = new Statistics();
		return StatsService.AveragePixel(s);
	}
	
	/**Media dei Bytes
	 ** @return media dei bytes 
	**/
	@GetMapping ("AverageBytes")
	public static Statistics AverageBytes() throws IOException 
	{
		Statistics s = new Statistics ();
		return StatsService.AverageBytes(s);
	}
	
	
	
	
}
