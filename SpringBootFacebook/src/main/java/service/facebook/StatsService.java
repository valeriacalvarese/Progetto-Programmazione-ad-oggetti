package service.facebook;

import java.util.Vector;

public class StatsService 
{
	private float AverageByte;
	private float AveragePixel;
	
	private Vector<Integer> bytes = new Vector<>();
	private Vector<Long> pixel = new Vector<>();

	
		@Override
	public String toString() {
		return "StatsService [AverageByte=" + AverageByte + ", AveragePixel=" + AveragePixel + "]";
	}

	public float getAverageByte() {
		return AverageByte;
	}

	public void setAverageByte(float averageByte) {
		AverageByte = averageByte;
	}

	public float getAveragePixel() {
		return AveragePixel;
	}

	public void setAveragePixel(float averagePixel) {
		AveragePixel = averagePixel;
	}
	
	public float AveragePixel()
	{
		float sum = 0;
		for (long p : pixel )
		{
			sum += p;
		}
		return sum/ pixel.size();
		
	}
	

	public float AverageBytes()
	{
		float sum = 0;
		for (long b : bytes )
		{
			sum += b;
		}
		return sum/ bytes.size();
		
	}
	

}
