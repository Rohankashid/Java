abstract class car{        
    public abstract void drive ();


    public void playMusic(){

        System.out.println("play music");

    }
}

class WagonR extends car{

    public void drive(){
        System.out.println(" driving...");
    }

}



public class abstract_class {
    public static void main(String[] args) {
        car obj=new WagonR();
        obj.playMusic();
        obj.drive();

    }
}
