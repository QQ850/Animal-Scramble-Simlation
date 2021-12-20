/*Qiqi Hu, CS 211, assignment#9b, 01/11/2021,Snake.java*/
import java.awt.Color;  //need import
public class Snake implements Animal{
  private int slithers; // determines which way to go for each snake
  private int direction;
  private int call; //count how many time getMove() get called
  private int increase; 
  
 //a zero parameter constructor
  public Snake(){
    slithers = 0;
    direction = 0;
    call = 0;
    increase = call*5+2*call*(call-1); //beacuse the steaps to east and west are increasing
  }
  
  public String toString(){
    return "S";
  }
  
  // alternates down, right, down, left
  public int getMove(){  //Moves south 1 step, east 1 step, south 1 step, west 2 steps, south 1 step, east 3 steps, south 1 step, west 4 steps
    while(slithers<=(increase+4*call+5)){ 
      if(slithers==increase){
        slithers++;
        direction = SOUTH; //always one step to down 
        break;
      }else if(slithers<=(increase+2*call+1)){
        slithers++;
        direction = EAST; //increasing odd number steps to right
        break;
      }else if(slithers==(increase+2*call+2)){
        slithers++;
        direction = SOUTH; //always one step to down
        break;
      }else if(slithers<=(increase+4*call+4)){
        slithers++;
        direction = WEST;  //left 
        break;
      }else{
        call++;
        increase = call*5+2*call*(call-1);
        continue;
      }      
    } 
    return direction;    
  }
  
  public Color getColor(){
    return new Color(100,100,0);
  }  
}    
  
