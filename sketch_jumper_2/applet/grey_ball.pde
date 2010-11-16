
float mx;
float my;
float easing = 0.05;
int radius = 24;
int edge = 56;
int inner =  + radius;


void greyBall(){
  
   if (abs(mouseX - mx) > 0.1) {
    mx = mx + (mouseX - mx) * easing;
  }
  if (abs(mouseY - my) > 0.1) {
    my = my + (mouseY- my) * easing;
  }

  mx = constrain(mx, inner, width + inner);
  my = constrain(my, inner, height + inner);
  fill(123, 123, 123);
  ellipse(mx, my, radius, radius);
}
