import java.util.*;
import java.time.*;
import java.time.format.*;
import java.io.IOException;
import Bicis.Bicycle;
interface x{
  public static final int xxx=2;
  public  static void mei(){System.out.print("intaer");}
}
 class Mountain extends Bicycle{
  protected double hightseat;
   static int prim=1;
  public Mountain(){}
  public Mountain(int spe,int gea,double hightse){
    super(spe,gea);
    hightseat=hightse;
  }
  public double setHigh(double hi){
  return   hightseat+=hi;
  }
  void color(String col){System.out.print("color:"+col);}
  public String toString(){
    return super.toString()+"altura "+hightseat;
  }
   void arr()throws Exception{System.out.print(prim);}
}


 class P extends Mountain implements x{
  static int xxx;
    char chr;
   static int[] ps;
   public P(){}
//  static int prim=2;
    void arr(){System.out.print("p"+xxx);}

  public P(int a,int b,double dou){super(a,b,dou);}
final void color(String co){System.out.print("pcolor");}
public void mei(){System.out.print("pmeto");}
  public static void main(String[] args)throws Exception{
    ArrayList<String> arl=new ArrayList<String>();
    StringBuilder stb=new StringBuilder("15");
    stb.append("6").append("3");
    Short s=1;Integer i=1;Float f=1f;Long l=1l;Double d=1.0;
 float fl;fl=2.0f;long lo=1;double dou=1;int in=1____8;String num="no54";short sh=1;char c='a';
 int[]ii={1,2,3};
 int[][]iii={ii};
char[]cha=new char[4];
P p=new P();



}
}
