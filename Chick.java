class Chick implements Animal 
{     
     //your code here
     private String myType;
     private String mySound;
     private String mySound2;
     public Chick(String type, String sound, String sound2){
       myType = type;
       mySound = sound;
       mySound2 = sound2;
     }
     public Chick(){
       myType = "unknown";
       mySound = "unknown";
       mySound2 = "unknown";
     }
     public String getSound(){
       if((int)(Math.random()*2)<1){
         return mySound;}
         else{
           return mySound2;
         }
     }
     public String getType(){return myType;}    
}
