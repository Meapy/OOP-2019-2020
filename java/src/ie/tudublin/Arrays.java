package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet
{

	float[] rainfall = {45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 50};
	String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "OCct" ,"Nov", "Dec"};
	public void settings()
	{
		size(1000, 500);
	}

	public void setup() 
	{
		float min = rainfall[0];
		float max = rainfall[0];

		String MinM = months[0];
		String MaxM = months[0];

		for(int i = 0; i < rainfall.length; i++){
			if(rainfall[i] < min) {
				min = rainfall[i];
				MinM = months[i];
			}
			if(rainfall[i] > max)
			{
				max = rainfall[i];
				MaxM = months[i];
			}
		}
		println( MinM+ " " + min + " " +MaxM + " " +  max);
	}

	public void drawBarChart(){
		int j = 0;
		for(int i = 0; i < rainfall.length; i++){
			fill(10 + (i * 10),100,100+(i * 10));
			j += 70;
			rect(j,  500 , -50, rainfall[i] * -1);
		}
	}
	

	float offset = 0;

	
	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{	
		background(50);
		colorMode(HSB);

		drawBarChart();
	}

	public static void main(String... args) {
		PApplet.main("ie.tudublin.Arrays");

	}
}
