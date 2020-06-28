package service.facebook;


import java.io.IOException;
import java.util.ArrayList;


public class StatsService 
{
  
	/* metodo che restituisce la media dei pixel
	 *  @return avg
	 */
	public static Statistics AveragePixel(Statistics stat) throws IOException
	{
		
		ArrayList<Integer> Pixel = Statistics.Pixel();
		float sum = 0;
		 for(int i=0; i<Pixel.size(); i++)
		{
			sum += Pixel.get(i);
		}
		 
		
		stat.setAvg(sum/Pixel.size()) ;
		return stat;
		
	}
	
	/* metodo che restituisce la media dei bytes
	 *  @return avg
	 */
	public static Statistics AverageBytes(Statistics stat) throws IOException
	{
		
		
		ArrayList<Integer> Bytes = Statistics.Bytes();
		
		float sum=0;
		 for(int i=0; i<Bytes.size(); i++)
		{
			sum +=Bytes.get(i);
		}
		 
		
		stat.setAvg(sum/Bytes.size());
		return stat;
		
	}
	
    
	/* metodo che restituisce massimo di bytes usati per una foto
	 *  @return max
	 */
public static Statistics MaxBytes (Statistics stat) throws IOException 
    {
	ArrayList<Integer> Bytes = Statistics.Bytes();
	int max=0;
    for(int i=0; i<Bytes.size() ; i++) 
    			{
    
 	   		
 	   			if(Bytes.get(i) > max)
 	    	          {
 	    	               max= Bytes.get(i);
 	    	           }
 	   			    	   		
 	   		} 
     	stat.setMax(max);
     	return stat;
    	}


/* metodo che restituisce minimo di bytes usati per una foto
 *  @return min
 */
public static Statistics MinBytes (Statistics stat) throws IOException
{
	
	ArrayList<Integer> Bytes = Statistics.Bytes();
	int min= MaxBytes(stat).getMax();
	for(int i=0; i<Bytes.size() ;i++) 
			{
 	   		
 	   			if(Bytes.get(i)< min)
 	    	          {
 	    	               min= Bytes.get(i);
 	    	           }
 	   		
 	   		
 	  	  }
	stat.setMin(min);
		stat.setMax(0);
     	return stat;    
}

/* metodo che restituisce massimo dei pixel usati per una foto
 *  @return max
 */
public static Statistics MaxPixel (Statistics stat) throws IOException 
{
ArrayList<Integer> Pixel = Statistics.Pixel();
int max=0;
for(int i=0; i<Pixel.size() ; i++) 
			{

	   		
	   			if(Pixel.get(i) > max)
	    	          {
	    	               max= Pixel.get(i);
	    	           }
	   			    	   		
	   		} 
 	stat.setMax(max);
 	return stat;
	}

/* metodo che restituisce minimo dei pixel usati per una foto
 *  @return min
 */

public static Statistics MinPixel (Statistics stat) throws IOException
{

ArrayList<Integer> Pixel = Statistics.Pixel();
int min= MaxPixel(stat).getMax();
for(int i=0; i<Pixel.size() ;i++) 
		{
	   		
	   			if(Pixel.get(i)< min)
	    	          {
	    	               min= Pixel.get(i);
	    	           }
	   		
	   		
	  	  }
stat.setMin(min);
	stat.setMax(0);
 	return stat;    
}


	

}

