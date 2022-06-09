import processing.core.PApplet;
import processing.core.PImage;

public class Sketch1 extends PApplet {

  //Declare Variables
  int screen = 1;

  float speedYOne = 0;
  float speedYTwo = 0;
  float speedYTwoOne = 100;
  float speedYTwoTwo = 200;
  float speedYTwoThree = 300;
  float speedYTwoFour = 400;
  float speedYThree = 0;
  float speedYFour = 0;

 
  int[] speedEnemy = new int[20];

  float playerX = 30;
  float playerY = 200;
  float[] circleX = new float[30];
  float[] circleY = new float[30];
  boolean[] boolSnowShow = new boolean[30];
  int intLives = 3;

  PImage imgJohn;


  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {

    //declare size
  
    size(1000, 500);

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

 /*    for (int i = 0; i <= 10; i++) {
      speedEnemy[i] = i;

      if (playerX);
    }
    */
  }

  public void setup() {

  imgJohn = loadImage("Shrek_Johnson (1).jpg");

  background(3, 252, 132);
  for(int i = 0; i < circleY.length; i++){
    circleY[i] = random(200, 400);
    circleX[i] = random(200, 400);
    
  }
  }

  public void draw() {

  if(screen == 1) {
    menu();
  }

  if(screen == 2){
    level1();
  }

  if(screen == 3){
    level2();
  }

  if(screen == 4){
    level3();
  }

  if(screen == 5){
    youWin();
  }

  


  //draw background
  
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


  public void menu(){

    
    background(50);

    fill(255); // White
      textSize(50);
      text("Main Menu", 55, 145);

    if ((mouseX >= 50 && mouseX <= 750) && (mouseY >= 200 && mouseY <= 250)) {
      fill(0, 0, 255); // Blue
      rect(50, 200, 700, 50);
  
      fill(255); // White
      textSize(50);
      text("Level 1", 55, 245);
  
      if (mousePressed == true) {
       screen = 2;
      }
    }
    else {
      fill(255); // white
      rect(50, 200, 700, 50);
  
      fill(0, 0, 255); // Blue
      textSize(50);
      text("Level 1", 55, 245);
    }

    //Level 2

    if ((mouseX >= 50 && mouseX <= 750) && (mouseY >= 300 && mouseY <= 350)) {
      fill(0, 0, 255); // Blue
      rect(50, 300, 700, 50);
  
      fill(255); // White
      textSize(50);
      text("Level 2", 55, 345);
  
      if (mousePressed == true) {
       screen = 2;
      }
    }
    else {
      fill(255); // white
      rect(50, 300, 700, 50);
  
      fill(0, 0, 255); // Blue
      textSize(50);
      text("Level 2", 55, 345);
    }


    if ((mouseX >= 50 && mouseX <= 750) && (mouseY >= 400 && mouseY <= 450)) {
      fill(0, 0, 255); // Blue
      rect(50, 400, 700, 50);
  
      fill(255); // White
      textSize(50);
      text("Level 3", 55, 445);
  
      if (mousePressed == true) {
       screen = 4;
      }
    }
    else {
      fill(255); // white
      rect(50, 400, 700, 50);
  
      fill(0, 0, 255); // Blue
      textSize(50);
      text("Level 3", 55, 445);
    }

    




    
  }
  public void level1(){

       //draw background
  //background(3, 252, 132);

  
  
  //Draws Black Snowballs on screen
  background(50);
  //Make Player
  fill(200);
  ellipse(playerX, playerY, 20, 20);

  //make image fall

  

  image( imgJohn, 100, speedYOne);
  image( imgJohn, 300, speedYTwo);
  image( imgJohn, 300, speedYTwoTwo);
  image( imgJohn, 300, speedYTwoThree);
  image( imgJohn, 300, speedYTwoFour);
  image( imgJohn, 300, speedYTwoOne);
  image( imgJohn, 200, speedYThree);
  image( imgJohn, 600, speedYFour);

  

  speedYOne++;
  speedYTwo += speedEnemy[10];
  speedYTwoOne += speedEnemy[10];
  speedYTwoTwo += 2;
  speedYTwoThree += 2;
  speedYTwoFour += 2;
  speedYThree+= 4;
  speedYFour += 8;
  

  if (speedYOne > height) {
    speedYOne = 0;
  }
  
  if(speedYTwo > height){
    speedYTwo = 0; 
   }

   if(speedYTwoOne > height){
    speedYTwoOne = 0; 
   }
   if(speedYTwoTwo > height){
    speedYTwoTwo = 0; 
   }
   if(speedYTwoThree > height){
    speedYTwoThree = -10; 
   }
   if(speedYTwoFour > height){
    speedYTwoFour = -10; 
   }

  if(speedYThree > height){
   speedYThree = 0; 
  }

  if(speedYFour > height){
    speedYFour = 0; 
   }

  if(speedYTwoOne > height){
    speedYTwoOne = 0;}

    if(playerX >= 800){
      screen = 5;
  }
  }

  public void level2(){

     //Draws Black Snowballs on screen
  background(50);
  //Make Player
  fill(200);
  ellipse(playerX, playerY, 20, 20);

  //make image fall

  

  image( imgJohn, 100, speedYOne);
  image( imgJohn, 300, speedYTwo);
  image( imgJohn, 300, speedYTwoTwo);
  image( imgJohn, 300, speedYTwoThree);
  image( imgJohn, 300, speedYTwoFour);
  image( imgJohn, 300, speedYTwoOne);
  image( imgJohn, 200, speedYThree);
  image( imgJohn, 600, speedYFour);

  

  speedYOne++;
  speedYTwo += speedEnemy[10];
  speedYTwoOne += speedEnemy[10];
  speedYTwoTwo += 2;
  speedYTwoThree += 2;
  speedYTwoFour += 2;
  speedYThree+= 4;
  speedYFour += 8;
  

  if (speedYOne > height) {
    speedYOne = 0;
  }
  
  if(speedYTwo > height){
    speedYTwo = 0; 
   }

   if(speedYTwoOne > height){
    speedYTwoOne = 0; 
   }
   if(speedYTwoTwo > height){
    speedYTwoTwo = 0; 
   }
   if(speedYTwoThree > height){
    speedYTwoThree = -10; 
   }
   if(speedYTwoFour > height){
    speedYTwoFour = -10; 
   }

  if(speedYThree > height){
   speedYThree = 0; 
  }

  if(speedYFour > height){
    speedYFour = 0; 
   }

  if(speedYTwoOne > height){
    speedYTwoOne = 0;}

    if(playerX >= 800){
      screen = 5;
  }
  }

  public void level3(){

     //Draws Black Snowballs on screen
  background(50);
  //Make Player
  fill(200);
  ellipse(playerX, playerY, 20, 20);

  //make image fall

  

  image( imgJohn, 100, speedYOne);
  image( imgJohn, 300, speedYTwo);
  image( imgJohn, 300, speedYTwoTwo);
  image( imgJohn, 300, speedYTwoThree);
  image( imgJohn, 300, speedYTwoFour);
  image( imgJohn, 300, speedYTwoOne);
  image( imgJohn, 200, speedYThree);
  image( imgJohn, 600, speedYFour);

  

  speedYOne++;
  speedYTwo += speedEnemy[10];
  speedYTwoOne += speedEnemy[10];
  speedYTwoTwo += 2;
  speedYTwoThree += 2;
  speedYTwoFour += 2;
  speedYThree+= 4;
  speedYFour += 8;
  

  if (speedYOne > height) {
    speedYOne = 0;
  }
  
  if(speedYTwo > height){
    speedYTwo = 0; 
   }

   if(speedYTwoOne > height){
    speedYTwoOne = 0; 
   }
   if(speedYTwoTwo > height){
    speedYTwoTwo = 0; 
   }
   if(speedYTwoThree > height){
    speedYTwoThree = -10; 
   }
   if(speedYTwoFour > height){
    speedYTwoFour = -10; 
   }

  if(speedYThree > height){
   speedYThree = 0; 
  }

  if(speedYFour > height){
    speedYFour = 0; 
   }

  if(speedYTwoOne > height){
    speedYTwoOne = 0;}

    if(playerX >= 800){
      screen = 5;
  }


  

  
  }


  public void youWin(){


    background(50);
    
    fill(0, 0, 255); // Blue
      textSize(100);
      text("YOU WIN!!!", 100, 250);

      //back to menu button

      if ((mouseX >= 50 && mouseX <= 750) && (mouseY >= 350 && mouseY <= 400)) {
        fill(0, 0, 255); // Blue
        rect(50, 350, 700, 50);
    
        fill(255); // White
        textSize(50);
        text("Main Menu", 55, 395);
    
        if (mousePressed == true) {
          playerX = 100;
         screen = 1;
        }
      }
      else {
        fill(255); // white
        rect(50, 350, 700, 50);
    
        fill(0, 0, 255); // Blue
        textSize(50);
        text("Main Menu", 55, 395);

        
  }
}






}
