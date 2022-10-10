import java.util.Random;
class Ruota extends Thread{
  private String c;
  private int ritardo;

  public Ruota(String c, int ritardo){
    this.c=c;
    this.ritardo=ritardo;
  }
  public void run(){
    for(int i=0;i<5;i++){
      Random r=new Random();
  System.out.println(c+""+(r.nextInt(90)+1));
      try{
        sleep(ritardo);
      }
     catch(Exception e){
        System.out.println("errore");
      }
    }
  }
}







