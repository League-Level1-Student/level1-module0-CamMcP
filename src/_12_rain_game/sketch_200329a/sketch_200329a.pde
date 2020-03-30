int yy = 30;
int xx = (int) random(width);
int score = 0;
void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
void setup(){
      size(600, 600);
}

void draw(){
  background(255, 0, 0);
  fill(0, 0, 255);
    stroke(0, 0, 0);
    ellipse(xx, yy, 40, 60);
    yy = yy + 10;
    if(yy >= 600){
      checkCatch(xx);
      yy = 0;
       xx = (int) random(width);
    }
    rect(mouseX,500, 100,100 );
    fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
}
