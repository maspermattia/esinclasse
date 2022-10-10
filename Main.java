import java.util.Random;
class Ruota extends Thread{
  private String c;
  private int ri;

  public Ruota(String c, int ri){
    this.c=c;
    this.ri=ri;
  }
  public void run(){
    for(int i=0;i<5;i++){
      Random r=new Random();
  System.out.println(c+""+(r.nextInt(90)+1));
      try{
        sleep(ri);
      }
     catch(Exception e){
        System.out.println("errore");
      }
    }
  }
}







