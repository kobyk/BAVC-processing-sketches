import processing.core.*; 
import processing.xml.*; 

import java.applet.*; 
import java.awt.Dimension; 
import java.awt.Frame; 
import java.awt.event.MouseEvent; 
import java.awt.event.KeyEvent; 
import java.awt.event.FocusEvent; 
import java.awt.Image; 
import java.io.*; 
import java.net.*; 
import java.text.*; 
import java.util.*; 
import java.util.zip.*; 
import java.util.regex.*; 

public class sketch_jumper_2 extends PApplet {

/*
    Program Name: kobyk sketch#1
    Version: 1.0
  
    Copyright (C) 2010  koby kayden

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

public void setup()
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
public void draw()
{
  background(0, 0, 0);
  jumpingjackguy(width/2, height/2);
  greyBall();
}

// character function
public void jumpingjackguy(int x, int y)
{
  pushMatrix();
  translate(x, y);

 
 
  // body
  fill(255, 0, 0); // bodycolor  
  ellipse(0, 0, 100, 100);  
  
  // nose
  fill(0, 255, 255);
  ellipse( 0, 0, 9, 9);  

  // eyes
  eye( -50,  -50,  20, mx-x, my-y);
  eye( 50,   -50,  20, mx-x, my-y);
  
  
  popMatrix();
}


public void eye(int x, int y, int s, float lookx, float looky) {
  
    // eye angle
    float  angle = atan2(looky-y, lookx-x);
    
    // draw eye
    pushMatrix();
    translate(x, y);
    fill(255, 255, 255);
    ellipse(0, 0, s, s);
    rotate(angle);
    fill(0, 0, 255);
    ellipse(s/4, 0, s/2, s/2);
    popMatrix();      
}




float mx;
float my;
float easing = 0.05f;
int radius = 24;
int edge = 56;
int inner =  + radius;


public void greyBall(){
  
   if (abs(mouseX - mx) > 0.1f) {
    mx = mx + (mouseX - mx) * easing;
  }
  if (abs(mouseY - my) > 0.1f) {
    my = my + (mouseY- my) * easing;
  }

  mx = constrain(mx, inner, width + inner);
  my = constrain(my, inner, height + inner);
  fill(123, 123, 123);
  ellipse(mx, my, radius, radius);
}
  static public void main(String args[]) {
    PApplet.main(new String[] { "--bgcolor=#FFFFFF", "sketch_jumper_2" });
  }
}
