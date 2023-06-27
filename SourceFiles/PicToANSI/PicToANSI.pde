PImage img;
void setup(){
  img = loadImage("image.png");
  String[] list = new String[img.pixelHeight];
  for(int y = 0; y < img.pixelHeight; y++){
    list[y] = "echo -e \"";
    print("echo -e \"");
    for(int x = 0; x < img.pixelWidth; x++){
      color c = img.get(x,y);
      list[y] += ("\\e[38;2;" + (int)red(c) + ";" + (int)green(c) + ";" + (int)blue(c) + "m");
      list[y] += (alpha(c) < 127 ? " " : "#");
    }
    list[y] += ("\\e[0m\"");
    println(list[y]);
  }
  saveStrings("out.txt", list);
  exit();
}
