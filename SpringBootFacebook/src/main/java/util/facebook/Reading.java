package util.facebook;


/* creata classe Reading

 *  
* @author Valeria Calvarese
* 
*/
import java.io.IOException;
import java.net.MalformedURLException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
/* 
 *  
* @author Valeria Calvarese
* 
*/
public class Reading {
	
	/** legge il contenuto del url	
	 * @param url per fare il reading
	 * @return stringa da leggere
	 * @throws MalformedURLException 
	 * @throws IOException
	 *
	 */
	
	
	public static String read_url (String url) throws  MalformedURLException, IOException
	{
		String string1 = new String ( );
		
		//controllo eccezioni
		try{
			URL u = new URL (url);
			BufferedReader input = new BufferedReader (new InputStreamReader(u.openStream()));
			String string2 = input.readLine();
			while (string2 != null)
		{
				string1 += string2;
		string2= input.readLine ();
		}
		}
		catch (MalformedURLException e){
			e.printStackTrace();
		}
		catch (IOException e){
			e.printStackTrace();
		}
		return string1;
	}

}
