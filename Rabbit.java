/*Qiqi Hu, CS 211, assignment#9b, 01/11/2021, Rabbit.java*/
import java.awt.Color;  //need import
public class Rabbit implements Animal{
  private int hops;//determines if hop to right for each rabbit
  private int direction;
  
 //a zero parameter constructor
  public Rabbit(){
    hops = 0;
    direction = 0;
  }
  
  public String toString(){
    return "V";
  }
 
  // toggle integer, so alternates up, right, and down
  // hops to the right
  public int getMove(){  //Move north 2 steps, east 2 steps, south 2 steps
    while(hops<=6){
      if(hops<2){ //hops = 0/1 up. so, Rabbit takes two stpes to up;
        hops++;
        direction = NORTH;
        break;
      }else if(hops<4){ //2, 3
        hops++;
        direction = EAST;
        break;
      }else if(hops<6){ //4, 5
        hops++;
        direction = SOUTH;
        break;
      }else if(hops==6){
        hops=0;
        continue; 
      }
    }
    return direction;    
  }
  
  public Color getColor(){
    return new Color(225,0,0);
  }
}    
