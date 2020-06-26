package service.facebook;

import model.facebook.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.util.ArrayList;

import hv.oop.*;
import util.facebook.*;

public class Statistics {
	private int width;
	private int heighth;
	private static int nbytes;
	private byte[] img;
	
	public void statistics()
	{
		this.width =0 ;
		this.heighth = 0;
		this.nbytes=0;
		
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeighth() {
		return heighth;
	}
	public void setHeighth(int heighth) {
		this.heighth = heighth;
	}
	public int getNbytes() {
		return nbytes;
	}
	public void setNbytes(int nbytes) {
		this.nbytes = nbytes;
	}
		
	public byte MaxBytes () throws IOException
	{
		ArrayList<Post> getFoto = Storage.get_foto();
		byte max=0;
		
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
	    	   			    	   		
	    	   		for(int j=0; j<img.length; j++)
	    	   		{
	    	   		
	    	   			if(img[j] > max)
	    	    	          {
	    	    	               max= img[j];
	    	    	           }
	    	   		}
	    	   		
	    	  	  }
	        	return max;    
	       	}
	
	
	
	public byte MinBytes () throws IOException
	{
		ArrayList<Post> getFoto = Storage.get_foto();
		byte min= MaxBytes();
		
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
	    	   		
	    	   		
	    	   		for(int j=0; j<img.length; j++)
	    	   		{
	    	   		
	    	   			if(img[j] < min)
	    	    	          {
	    	    	               min= img[j];
	    	    	           }
	    	   		}
	    	   		
	    	  	  }
	        	return min;    
	       	}
	
}
