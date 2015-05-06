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
public class king extends pieces {
    
      public king(String name, boolean alive) {
        super(name, alive);
    }
    public boolean[][] allowedMoves(int i, int j) {
    
          boolean[][] temp = new boolean[8][8] ;
       
     
          for(int p=0;p<8;p++){
          for(int o=0;o<8;o++){
                     temp[p][0] = false;
                  }}
 
          
  if((i+1)<8)
         {
         temp[i+1][j]=true;
         }
 if((i-1)>=0)
         {
         temp[i-1][j]=true;
         }
 if((j+1)<8)
         {
         temp[i][j+1]=true;
         }
 if((j-1)>=0)
         {
         temp[i][j-1]=true;
         }
 if((i+1)<8 && (j-1)>=0)
          {
          temp[i+1][j-1]=true;
          }
 
 if((i+1)<8 && (j+1)<8)
          {
          temp[i+1][j+1]=true;
          }
          if((i-1)>=0 && (j-1)>=0)
          {
          temp[i-1][j-1]=true;
          }
          if((i-1)>=0 && (j+1)<8)
          {
          temp[i-1][j+1]=true;
          }
          
          
          if((j+1)<8 && (i-1)>=0)
          {
          temp[i-1][j+1]=true;
          }
          if((j+1)<8 && (i+1)<8)
          {
          temp[i+1][j+1]=true;
          }
          if((j-1)>=0 && (i-1)>=0)
          {
          temp[i-1][j-1]=true;
          }
          if((j-1)>=0 && (i+1)<8)
          {
          temp[i+1][j-1]=true;
          }
         
       return temp;
                
    }
    
    
    
}
