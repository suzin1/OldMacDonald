class Cow implements Animal 
{     
     //your code here
     protected String mySound;
     protected String myType;
     public Cow(String type, String sound){
       myType = type;
       mySound = sound;
     }
     public Cow(){
       myType = "unknown";
       mySound = "unknown";
     }
     public String getSound(){return mySound;}
     public String getType(){return myType;}   
}
