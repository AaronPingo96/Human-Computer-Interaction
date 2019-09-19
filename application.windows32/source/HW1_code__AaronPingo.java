import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import g4p_controls.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class HW1_code__AaronPingo extends PApplet {



GCustomSlider slider;

GButton btn6;
GButton btn5;
GButton btn4;
GButton btn3;
GButton btn2;
GButton btng;

GButton btn11;
GButton btn10;
GButton btn9;
GButton btn8;
GButton btn7;

GButton close;
GButton open;
GButton emergency;

public void setup() {
   
  
  slider = new GCustomSlider(this, 40, 0, 270, 100, "metallic");
  slider.setShowValue(true);
  
  slider.setLimits(3, 1, 11);
  slider.setNbrTicks(10);
  slider.setShowTicks(true);
  slider.setEasing(6.0f);
  slider.setNumberFormat(G4P.INTEGER,0);
  
  
  
  
  G4P.setCtrlMode(GControlMode.CENTER);
  btn6 = new GButton(this, 100, 100 ,130, 50, "Floor 6");
  btn5 = new GButton(this, 100, 155 ,130, 50, "Floor 5");
  btn4 = new GButton(this, 100, 210 ,130, 50, "Floor 4");
  btn3 = new GButton(this, 100, 265 ,130, 50, "Floor 3");
  btn2 = new GButton(this, 100, 320 ,130, 50, "Floor 2");
  btng = new GButton(this, 100, 375 ,130, 50, "Ground Floor");
  
  btn11 = new GButton(this, 250, 100 ,130, 50, "Floor 11");
  btn10 = new GButton(this, 250, 155 ,130, 50, "Floor 10");
  btn9 = new GButton(this, 250, 210 ,130, 50, "Floor 9");
  btn8 = new GButton(this, 250, 265 ,130, 50, "Floor 8");
  btn7 = new GButton(this, 250, 320 ,130, 50, "Floor 7");
  
  close = new GButton(this, 265, 375 ,50, 50, "> | <");
  
  open = new GButton(this, 210, 375 ,50, 50, "< | >");
  
  emergency = new GButton(this, 220, 450 ,70, 50, "Emergency");
  
}

public void draw() 
{
  background(0);
  
  //button background color
  btn6.setLocalColor(4, color(0,100,255));
  btn5.setLocalColor(4, color(0,100,255));
  btn4.setLocalColor(4, color(0,100,255));
  btn3.setLocalColor(4, color(0,100,255));
  btn2.setLocalColor(4, color(0,100,255));
  btng.setLocalColor(4, color(0,100,255));
  close.setLocalColor(4, color(0,100,255));
  
  btn11.setLocalColor(4, color(0,100,255));
  btn10.setLocalColor(4, color(0,100,255));
  btn9.setLocalColor(4, color(0,100,255));
  btn8.setLocalColor(4, color(0,100,255));
  btn7.setLocalColor(4, color(0,100,255));
  open.setLocalColor(4, color(0,100,255));
  emergency.setLocalColor(4, color(255,0,0));
  
  //button border color
  btn6.setLocalColor(3, color(0,0,0));
  btn5.setLocalColor(3, color(0,0,0));
  btn4.setLocalColor(3, color(0,0,0));
  btn3.setLocalColor(3, color(0,0,0));
  btn2.setLocalColor(3, color(0,0,0));
  btng.setLocalColor(3, color(0,0,0));
  
  btn11.setLocalColor(3, color(0,0,0));
  btn10.setLocalColor(3, color(0,0,0));
  btn9.setLocalColor(3, color(0,0,0));
  btn8.setLocalColor(3, color(0,0,0));
  btn7.setLocalColor(3, color(0,0,0));
  close.setLocalColor(3, color(0,0,0));
  open.setLocalColor(3, color(0,0,0));
  emergency.setLocalColor(3, color(0,0,0));
  
  //button text color
  btn6.setLocalColor(2, color(0,0,0));
  btn5.setLocalColor(2, color(0,0,0));
  btn4.setLocalColor(2, color(0,0,0));
  btn3.setLocalColor(2, color(0,0,0));
  btn2.setLocalColor(2, color(0,0,0));
  btng.setLocalColor(2, color(0,0,0));
  
  btn11.setLocalColor(2, color(0,0,0));
  btn10.setLocalColor(2, color(0,0,0));
  btn9.setLocalColor(2, color(0,0,0));
  btn8.setLocalColor(2, color(0,0,0));
  btn7.setLocalColor(2, color(0,0,0));
  close.setLocalColor(2, color(0,0,0));
  open.setLocalColor(2, color(0,0,0));
  
  //slider number color
  slider.setLocalColor(2, color(255, 255, 255));
  
}


public void handleButtonEvents(GButton button, GEvent event) 
{
 if(button == btn6)
 {
  frameRate(10);
  textSize(32);
  //text("Level 6",10,30);
  slider.setValue(6);
 }
  if(button == btn5)
 {
  frameRate(10);
  textSize(32);
  //text("Level 5",10,30);
  slider.setValue(5);
 }
 if(button == btn4)
 {
  frameRate(10);
  textSize(32);
  //text("Level 4",10,30);
  slider.setValue(4);
 }
 if(button == btn3)
 {
  frameRate(10);
  textSize(32);
  //text("Level 3",10,30);
  slider.setValue(3);
 }
  
  if(button == btn2)
 {
  frameRate(10);
  textSize(32);
  //text("Level 2",10,30);
  slider.setValue(2);
 }
 
 if(button == btng)
 {
  frameRate(10);
  textSize(32);
  //text("Ground floor",10,30);
  slider.setValue(1);
 }
 
 if(button == btn7)
 {
  frameRate(10);
  textSize(32);
  //text("Level 7",10,30);
  slider.setValue(7);
 }
  if(button == btn8)
 {
  frameRate(10);
  textSize(32);
  //text("Level 8",10,30);
  slider.setValue(8);
 }
 if(button == btn9)
 {
  frameRate(10);
  textSize(32);
  //text("Level 9",10,30);
  slider.setValue(9);
 }
 if(button == btn10)
 {
  frameRate(10);
  textSize(32);
  //text("Level 10",10,30);
  slider.setValue(10);
 }
  
  if(button == btn11)
 {
  frameRate(10);
  textSize(32);
  //text("Level 11",10,30);
  slider.setValue(11);
 }
 
 
 
 
  
}


  public void settings() {  size(400, 500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "HW1_code__AaronPingo" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
