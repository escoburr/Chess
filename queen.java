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
public class queen extends pieces {
    public queen(String name, boolean alive) {
        super(name, alive);
    }
   public boolean[][] allowedMoves(int i, int j) {
        boolean[][] temp = new boolean[8][8] ;
      
         for(int p=0;p<8;p++){
          for(int o=0;o<8;o++){
                     temp[p][0] = false;
                  }}
        
         int k = j;
         
         
        for(int l = i; l<8;l++){
                if ((l+1)<=7 && (k-1)>=0){
                     
                        temp[l+1][k-1]=true;
                k=k-1;
                }}
        k=j;
   
        for(int l = i; l>=0;l--){
                if ((l-1)>=0 && (k-1)>=0){
                     
                        temp[l-1][k-1]=true;
                k=k-1;
                }
        }
        
        k=j;
        
        
        
        
        for(int l = i; l>=0;l--){
               
                    if ((l-1)>=0 && (k+1)<8){
                     
                        temp[l-1][k+1]=true;
                k=k+1;
                }}       
       k=j;
        
         for(int l = i; l<8;l++){
        if ((l+1)<8 && (k+1)<8){
                     
                        temp[l+1][k+1]=true;
                
                        k=k+1;}}
     
        k=j;
        
        for(int l = 0;l<8;l++){
            for(int m =0;m<8;m++)
            {          
      if(l==i){
      temp[l][m]=true;
      }
          if(l==j){            
            temp[m][l]= true;
            }
              }}
        temp[i][j]=false;
        
          
             return temp;
                
            
        
    }
    
}
