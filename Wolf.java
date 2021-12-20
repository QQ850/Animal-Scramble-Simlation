/*Qiqi Hu, CS 211, assignment#9b, 01/11/2021,Wolf.java*/
import java.awt.Color;  //need import
public class Wolf implements Animal{
  	private boolean sneak;
   
 //a zero parameter constructor
  public Wolf(){
    sneak = true;
  }
  
  public String toString(){
    return "W";
  }
  
  public int getMove(){ //	Has custom behavior that you define
  //let it move up, then move right(sneak up and right), one step each direction
    sneak = !sneak;
    if(sneak)
      return EAST;
    else
      return NORTH;  
  }
  
  public Color getColor(){
    return new Color(100,0,100);
  }  
}    
  
