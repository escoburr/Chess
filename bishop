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
public class bishop extends pieces {

    public bishop(String name, boolean alive) {
        super(name, alive);
    }

    @Override

    public boolean[][] allowedMoves(int i, int j) {
        boolean[][] temp = new boolean[8][8];
        //int l = i;
//        for (int k = j; k < 8; k++) {
//            if(){
//                
//            }
//        }
//        return temp;
//    }

        for (int k=0;k<8;k++)
            for (int l=0;l<8;l++){
                for (int x=0;x<8;x++){
                if ((k==i+x)&&(l==j+x)){
                        System.out.println(k+" k "+l+" l "+x+" x ");
                    temp[k][l]=true;}
                else if ((k==i-x)&&(l==j-x))   
                    temp[k][l]=true;
                else if ((k==i+x)&&(l==j-x))
                    temp[k][l]=true;
                else if ((k==i-x)&&(l==j+x))
                    temp[k][l]=true;
//                else    
//                    temp[k][l]=false;
                
            }
                System.out.println(temp[k][l]+ " at "+k+" "+l);
            }
                        
        return temp;}
//         for(int p=0;p<8;p++){
//          for(int o=0;o<8;o++){
//                     temp[p][0] = false;
//                  }}
//        
//         int k = i;
//         
//         
//        for(int l = j; l<8;l++){
//                if ((l+1)<=7 && (k-1)>=0){
//                     
//                        temp[l+1][k-1]=true;
//                k=k-1;
//                }}
//        k=i;
//   
//        for(int l = j; l>=0;l--){
//                if ((l-1)>=0 && (k-1)>=0){
//                     
//                        temp[l-1][k-1]=true;
//                k=k-1;
//                }
//        }
//        
//        k=i;
//        
//        
//        
//        
//        for(int l = j; l>=0;l--){
//               
//                    if ((l-1)>=0 && (k+1)<8){
//                     
//                        temp[l-1][k+1]=true;
//                k=k+1;
//                }}       
//       k=i;
//        
//         for(int l = j; l<8;l++){
//        if ((l+1)<8 && (k+1)<8){
//                     
//                        temp[l+1][k+1]=true;
//                
//                        k=k+1;}}
//        
//        
//        return temp;
//                
//            
//                
//    }
}
