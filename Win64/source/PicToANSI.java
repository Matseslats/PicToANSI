import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class PicToANSI extends PApplet {

PImage img;
public void setup(){
  img = loadImage("image.png");
  String[] list = new String[img.pixelHeight];
  for(int y = 0; y < img.pixelHeight; y++){
    list[y] = "echo -e \"";
    print("echo -e \"");
    for(int x = 0; x < img.pixelWidth; x++){
      int c = img.get(x,y);
      list[y] += ("\\e[38;2;" + (int)red(c) + ";" + (int)green(c) + ";" + (int)blue(c) + "m");
      list[y] += (alpha(c) < 127 ? " " : "#");
    }
    list[y] += ("\\e[0m\"");
    println(list[y]);
  }
  saveStrings("out.txt", list);
  exit();
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "PicToANSI" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
