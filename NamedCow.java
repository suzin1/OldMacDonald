class NamedCow extends Cow
{
     private String getSound;
     private String getType;
     String getName;
     public Cow(String type, String sound){
       myType = type;
       mySound = sound;
       myName = name;
     }
     public Cow(){
       myType = "unknown";
       mySound = "unknown";
     }
     public String getSound(){return mySound;}
     public String getType(){return myType;}   
     String getName(){return myName;}
}
