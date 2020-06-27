package service.facebook;

import model.facebook.*;
import hv.oop.*;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import util.facebook.*;

public class Statistics {
	
		
	public static ArrayList<byte[]> Bytes() throws IOException 
	{
		ArrayList<byte[]> Bytes = new ArrayList<byte[]>();
		ArrayList<Post> getFoto = Storage.get_foto();
			       for(int i=0; i<getFoto.size(); i++)
	    	  {
	    	   	URL url = new URL(getFoto.get(i).getFull_picture());
	    	   	ByteArrayOutputStream output = new ByteArrayOutputStream();
	    	   	URLConnection conn = url.openConnection();
	    	   	conn.setRequestProperty("User-Agent", "Firefox");
		       
	    	   		try (InputStream inputStream = conn.getInputStream())
	    	   			{
	    	   				int n = 0;
	    	   				byte[] buffer = new byte[1024];
	    	   				while (-1 != (n = inputStream.read(buffer))) 
	    	   					{
	    	   						output.write(buffer, 0, n);
	    	   					}
	    	   			}
		         catch (IOException e)
	    	   			{
		        	 		e.printStackTrace();
	    	   			}
	    	   		byte[] img = output.toByteArray();
	    	   		ByteBuffer imagBytes = ByteBuffer.wrap(img);
	    	  }	
			       return Bytes;
	    	}
	
	      public static ArrayList<Integer> Pixel() throws IOException 
	       {
	    	   
	    	   ArrayList<Integer> Pixel =new ArrayList<Integer>();
	    	   ArrayList<Post> getFoto = Storage.get_foto();
	    	   
	    	 for(int j=0; j< getFoto.size() ; j++)  
	    	 {
	    		 try   
	    		 	{
	    			 URL url=new URL(getFoto.get(j).getFull_picture());
	    			 BufferedImage image = ImageIO.read(url);
	    			 int height = image.getHeight();
	    			 int width = image.getWidth();
	    			 Pixel.add(height*width);  		
	    		 	}
	    		catch(IOException e)
	    		{e.printStackTrace();}
	    	}
	    	return Pixel;
	   }
	       
	       
	       
/*	       public int MaxBytes () 
	       {
	       for(int i=0; i< ; i++) 
	       			{
	       int max=0;
	    	   		
	    	   			if(img[i] > max)
	    	    	          {
	    	    	               max= img[i];
	    	    	           }
	    	   			    	   		
	    	   		} 
	        	return max;    
	       	}
	
	
	
	public int MinBytes () throws IOException
	{
		ArrayList<Post> getFoto = Storage.get_foto();
		int min= MaxBytes();
		for(int i=0; i< ;i++) 
				{
	    	   		
	    	   			if(img[i] < min)
	    	    	          {
	    	    	               min= img[i];
	    	    	           }
	    	   		
	    	   		
	    	  	  }
	
	        	return min;    
	}


*/
	
	
}
