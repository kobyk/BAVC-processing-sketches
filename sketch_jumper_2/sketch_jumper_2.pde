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

