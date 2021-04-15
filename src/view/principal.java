package view;
import processing.core.PApplet;
import processing.core.PImage;	
public class principal extends PApplet{

	public static void main(String[] args) {	
		
		PApplet.main("view.principal");
	}
	
	@Override
	public void settings() {
		size(750,600);
	}
	
	//ALADINO'S STORY
	String [] aladinoStory;
	
	//SCREENS
		PImage startingScreen;
		PImage storyPart1;
		PImage storyPart2;
		PImage instructions;
		PImage gameCave;
		PImage resume;
		
	//CHARACTERS
		PImage aladino;
		PImage aladinoEyes;
		PImage genius;
				
	//SCREEN DETAILS AND IMAGES FOR THE INTERACTION
		PImage one;
		PImage two;
		PImage three;
		PImage four;
		PImage five;
		PImage lamp;
		PImage lampLopsided;
		PImage jewels;
		PImage ring;
		PImage treasure;
		PImage openTreasure;
		
	//BUTTONS
		PImage startButton;
		PImage continueButton;
		PImage lestGoButton;
	
	//PARALAX EFFECT
		int paralaxX;
		
	//SWICHT BETWEEN SCREENS
		int stay;
			
	//MOVE PARALAX
	boolean moveParalax;
	
	@Override
	public void setup() {
	//SCREENS	
		startingScreen = loadImage("inicio.png");
		storyPart1 = loadImage("historia1.png");
		storyPart2 = loadImage ("historia2.png");
		instructions = loadImage("instruccion.png");
		gameCave = loadImage("cueva.png");
		//resume = loadImage("pResumen.png");
		
	//CHARACTERS
		aladino  = loadImage("aladino.png");;
		aladinoEyes  = loadImage("aladino ojos cerrados.png");;
		genius  = loadImage("genio.png");;
						
	//SCREEN DETAILS AND IMAGES FOR THE INTERACTION
		one = loadImage("1.png");
		two = loadImage("2.png");
		three = loadImage("3.png");
		four = loadImage("4.png");
		five = loadImage("5.png");
		lamp = loadImage("lampara.png");
		lampLopsided = loadImage("lampara lado.png");
		jewels = loadImage("joyas.png");
		ring = loadImage("anillo.png");
		treasure = loadImage("tesoro cerrado.png");
		openTreasure = loadImage("tesoro abierto lado.png");
		
	//BUTTONS
		startButton  = loadImage("start.png"); ;
		continueButton  = loadImage("continue.png");;
		lestGoButton  = loadImage("lest go.png");;

	//PARALAX EFFECT
		moveParalax = true;
	//SWICHT BETWEEN SCREENS	
		stay = 4;

		}
	
	@Override
	public void draw() {
		background(255);
		System.out.println(mouseX + ","+ mouseY);
		
		if (stay == 0) {
			image(startingScreen, 0, 0);
			
			if(mouseX >= 336 && mouseX <= 421 && mouseY >= 405 && mouseY <= 434){
			image (startButton,334,402);
		}else {
			image(startingScreen, 0, 0);
		}
		} 
		
	if (stay == 1) {
		image(storyPart1,0,0);
		
		if(mouseX >= 576 && mouseX <= 712 && mouseY >= 448 && mouseY <= 477){
			image (continueButton,576,446);
		}else {
			image(storyPart1, 0, 0);
	}
	}
	
	if (stay == 2) {
		image(storyPart2,0,0);
		
		if(mouseX >= 576 && mouseX <= 712 && mouseY >= 448 && mouseY <= 477){
			image (continueButton,575,446);
		}else {
			image(storyPart2, 0, 0);
	}
	}
	
	if (stay == 3) {
		image(instructions,0,0);
		
		if(mouseX >= 574 && mouseX <= 710 && mouseY >= 430 && mouseY <= 462){
			image (lestGoButton,574,431);
		}else {
			image(instructions, 0, 0);
		}
	}
	
	if (stay == 4) {
		paralaxX =  mouseX;
		image(gameCave,-paralaxX,0);
		if(mouseX<=50) {
			moveParalax =false;
			
			
			
		}
		
		
	}
	}
}

