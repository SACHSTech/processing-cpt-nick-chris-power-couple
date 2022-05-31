import processing.core.PApplet;

public class Sketch1 extends PApplet {

  //Declare Variables
  
  float circleYOne = 0;
  float circleYTwo = 0;

  float playerX = 30;
  float playerY = 200;
  float[] circleX = new float[30];
  float[] circleY = new float[30];
  boolean[] boolSnowShow = new boolean[30];
  int intLives = 3;


  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {

    //declare size
  
    size(400, 400);

    //declares position of the black snowballs
    for (int i = 0; i < circleY.length; i++) {
      circleY[i] = random(height);
      circleX[i] = random(width);  
    }

    //Decides if snow is visible or not
    for (int i = 0; i < circleY.length; i++) {
      circleY[i] = random(height);
      boolSnowShow[i] = true;
    }
  }

  public void setup() {

  background(3, 252, 132);
  for(int i = 0; i < circleY.length; i++){
    circleY[i] = random(200, 400);
    circleX[i] = random(200, 400);
    
  }
  }

  public void draw() {

  //draw background
  background(3, 252, 132);

  //Make Player
  fill(200);
  ellipse(playerX, playerY, 20, 20);
  
  //Draws Black Snowballs on screen
  background(50);

  ellipse(100, circleYOne, 25, 25);
  ellipse(200, circleYTwo, 25, 25);

  circleYOne++;
  circleYTwo += 2;

  if (circleYOne > height) {
    circleYOne = 0;
  }
  
  if(circleYTwo > height){
   circleYTwo = 0; 
  }
}
  //method to move the player
  public void keyPressed() {

  if (key == 'w') {
    playerY-=4;
  }
  if (key == 's') {
    playerY+=4;
  }
  if (key == 'a') {
    playerX-=4;
  }
  if (key == 'd') {
    playerX+=4; 
  }

  
    }

}