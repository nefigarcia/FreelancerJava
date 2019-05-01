package Bicis;
//import Bicycle;
import java.util.*;

public  class   Bicycle {
    static int pru;
int speed,gear; String color;
public Bicycle(){}
public Bicycle(int spe,int gea){
  speed=spe;gear=gea;
}
int brake(int br){
return   speed-=br;
}
int accelerate(int ac){
return   speed+=ac;
}
void color(String col){System.out.print("col:"+col);}
public String toString(){return  "tu vel es:"+speed+" gear"+gear;}
}
