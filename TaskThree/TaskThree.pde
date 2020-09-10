//Task 3

// vi starter med at fine 

color redL = color (255, 0, 0);
color yellowL = color (255, 255, 0);
color greenL = color(0, 255, 0);
color background = color(0);
color gray = color (149);

void setup() {
  size (200, 500);
  frameRate(144);
}

void draw() {
  background(background);
  fill(gray);
  //laver den øverste røde cirkel først
  float x = width/2;
  float y = height/6;
  float radius = height*0.25;
  circle(x, y, radius);
  
  //keypressed for det røde lys
  if (keyPressed) {
    if (key=='1') {
      fill(redL);
      circle(x, y, radius);
    }
  }

  //gule midtercirkel dannes

  fill(gray);
  float secondY=height/2;
  circle (x, secondY, radius);
  if (keyPressed) {
    if (key == '2') {
      fill(yellowL);
      circle (x, secondY, radius);
    }
  }
  
  //det nederste grønne lys dannes
  fill(gray);
  float thirdY = (secondY+secondY*3/4);
  circle(x,thirdY,radius);
  if (keyPressed){
    if(key == '3'){
      fill(greenL);
      circle(x,thirdY,radius);
    }
  }
}
