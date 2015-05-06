/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

/**
 *
 * @author Aakar
 */
public class pawn extends pieces {
    private char type;
    public pawn(String name, boolean alive, char type) {
        super(name, alive);
this.type = type;
    }
   
   
   
      public boolean[][] allowedMoves(int i, int j) {
   
          boolean[][] temp = new boolean[8][8] ;
     
          for(int p=0;p<8;p++){
          for(int o=0;o<8;o++){
                 temp[p][o] = false;
                  }}
 
 
 
          if(type=='b')
          {
          if((j+1)<8){
              if(j==1){
               temp[i][j+2]= true;  
              temp[i][j+1] = true;}
              else
                   temp[i][j+1] = true;
        }}
 
   if(type=='w'){
           if((j-1)>=0){
               if(j==6)
               {
               temp[i][j-1] = true;
               temp[i][j-2] = true;
               }else
              temp[i][j-1] = true;
        }}
        
        
        
       return temp;
               
    }
}
