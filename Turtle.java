/*Qiqi Hu, CS 211, assignment#9b, 01/11/2021,Turtle.java*/
import java.awt.Color;  //need import
public class Turtle implements Animal{
  private int clockwise;
  private int direction;
 
 //a zero parameter constructor
  public Turtle(){
    clockwise = 0;
    direction = 0;
  }
  
  public String toString(){
    return "T";
  }
  
  public int getMove(){  //5 steps each direction
    while(clockwise<=21){
      if(clockwise<5){
        clockwise++;
        direction = SOUTH;
        break;
      }else if(clockwise<10){
        clockwise++;
        direction = WEST;
        break;
      }else if(clockwise<15){
        clockwise++;
        direction = NORTH;
        break;
      }else if(clockwise<20){
        clockwise++;
        direction = EAST;
        break;
      }else{
        clockwise = 0;
        continue;     
      }
    }
    return direction;
  }
  
  public Color getColor(){
    return new Color(0,100,100);
  }  
}    
  
