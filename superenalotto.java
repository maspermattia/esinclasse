import java.util.Random;
class Main {
  public static void main(String[] args) {
   
    Ruota t=new Ruota("bergamo ",100);
    Ruota t1=new Ruota("roma ",600);
    Ruota t2=new Ruota("venezia ",1200);


    t.start();
    t1.start();
    t2.start();
  }
}