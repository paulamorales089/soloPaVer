package view;
import processing.core.PApplet;
import processing.core.PImage;	
public class principal extends PApplet{

	public static void main(String[] args) {	
		
		PApplet.main("principal");
	}
	
	@Override
	public void settings() {
		size(500,500);
	}
	
	//SCREEN
		PImage startingScreen;
		PImage instructions ;
		PImage game;
		PImage resume;

	//SWICHT BETWEEN SCREENS
		int stay;
			
	
	@Override
	public void setup() {
		}
	
	@Override
	public void draw() {
		background(255);
		System.out.println(mouseX + ","+ mouseY);
		
		
		
		
		
		

	
		
		
		
		
		}
	
}
