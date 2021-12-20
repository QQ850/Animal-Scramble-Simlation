/*Qiqi Hu, CS 211, assignment#9b, 01/11/2021, Frog.java*/
import java.awt.Color;  //need import
public class Frog implements Animal{
  private int step; // moves randomly 3 steps
  private double rand; //randomly direction
  private int direction;
  
 //a zero parameter constructor
  public Frog(){
   step = 0;
   rand = Math.random();
  }
  
  // over-rides Object, and satisfies interface
  public String toString(){
    return "F";
  } 
  
  //same as Bird, but 3 steps to each direction
  public int getMove(){ 
    if(step==3){
      step=0;
      rand = Math.random();
    }
    if(rand < 0.25){
      while(step<3){
        direction = NORTH;
        step++;
        break;
      }  
    }else if(rand < 0.5){
      while(step<3){
        direction = SOUTH;
        step++;
        break;
      } 
    }else if(rand < 0.75){
      while(step<3){
        direction = EAST;
        step++;
        break;
      } 
    }else{
      while(step<3){
        direction = WEST;
        step++;
        break;
      } 
    }
    return direction;  
  }
  
  public Color getColor(){
    return new Color(0,225,0); 
  }
}     
