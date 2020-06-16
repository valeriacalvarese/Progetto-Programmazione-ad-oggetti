package util.facebook;

import java.io.IOException;
import java.net.MalformedURLException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Reading {
	public static String read_url (String url) throws  MalformedURLException, IOException
	{
		String str = new String ( );
	
		try{
			URL u = new URL (url);
			BufferedReader input = new BufferedReader (new InputStreamReader(u.openStream()));
			String s = input.readLine();
			while (s != null)
		{
				str += s;
		s= input.readLine ();
		}
		}
		catch (MalformedURLException e){
			e.printStackTrace();
		}
		catch (IOException e){
			e.printStackTrace();
		}
		return str;
	}

}
