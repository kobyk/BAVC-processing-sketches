

void setup()
{
  size(550, 350); 
  int value = 0;
  smooth();
  strokeWeight(5);
  noStroke();
  ellipseMode(RADIUS);
  rectMode(CORNERS);
}


//draw loop
void draw()
{
  background(0, 0, 0);
  jumpingjackguy(width/2, height/2);

greyBall();

}

