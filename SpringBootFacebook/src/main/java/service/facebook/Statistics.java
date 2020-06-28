package service.facebook;

import model.facebook.*;


import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import java.net.URL;
import java.net.URLConnection;

import java.util.ArrayList;

import javax.imageio.ImageIO;

import util.facebook.*;

public class Statistics {
	
	private int max;
	private int min;
	private float avg;
	
	//costuttore
	public Statistics(int max, int min, int avg)
	{
		this.max =max;
		this.min=min;
		this.avg=avg;
	}
	
	public Statistics()
	{
		this.max=0;
		this.min=0;
		this.avg=0;
	}	
	
	//metodi Getters and  Setters
		
	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

		//ArrayList che contiene i Bytes delle foto
	public static ArrayList<Integer> Bytes() throws IOException 
	{
		ArrayList<Integer> Bytes = new ArrayList<Integer>();
		ArrayList<Post> getFoto = Storage.get_foto();
			       for(int i=0; i<getFoto.size(); i++)
	    	  {
	    	   	URL url = new URL(getFoto.get(i).getFull_picture());
	    	   ByteArrayOutputStream output = new ByteArrayOutputStream();
	    	   	URLConnection conn = url.openConnection();
	    	   	conn.setRequestProperty("User-Agent", "Firefox");
		       
	    	   		 InputStream inputStream = conn.getInputStream();
	    	   		
			           ByteArrayOutputStream bos = new ByteArrayOutputStream();

			           ByteArrayOutputStream baos = new ByteArrayOutputStream();
			          
			           byte[] b = new byte[2^16];
			           int read = inputStream.read(b);
			           while (read > -1) {
			               baos.write(b, 0, read);
			               read = inputStream.read(b);
			           }
			           int size = baos.toByteArray().length;
			           Bytes.add(size);

	    	  }	
			       return Bytes;
	    	}
	
		//ArrayList che contiene i pixel delle foto
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
	       

	
	
}
