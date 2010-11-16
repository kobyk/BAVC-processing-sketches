    
   //character template
   
   //setup
    void setup()
    {
      size(400, 400); 
    int value = 0;
  smooth();
}
    
    
    //draw loop
    void draw()
    {
      background(255);
      jumpingjackguy();
      
    }
    
    // character function
    void jumpingjackguy()
    {
      
    fill(0, 102, 0); // bodycolor
    ellipse( width / 2, height / 6, 100, 100);
     
     
      float x = width / 2;
     float y = height / 2;
        if(mousePressed == true) {
            fill(255, 0, 0);
        } else {
          fill(0, 46, 184);
        }
      
      
     ellipse( x - 10 , y / 5, 25, 25);
      ellipse(  x + 10 , y / 5, 25, 25);
     fill(204, 102, 0);
    
    if(mousePressed == true) {
      fill(0, 46, 184);
    } else {
      fill(255, 0, 0);
    }
    
    ellipse( x - 10 , y / 5, 5, 5);
    ellipse(  x + 10 , y / 5, 5, 5);

  rect(height / 2.25, width / 5, 40, 10);

















}
    

