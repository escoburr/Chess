package project;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Siddharth
 */
public class rook extends pieces {

    public rook(String name, boolean alive) {
        super(name, alive);
    }

    @Override
    public boolean[][] allowedMoves(int i, int j) {
        boolean[][] temp=new boolean[8][8];
        
        for(int k=0;k<8;k++)
            for(int l=0;l<8;l++){
                if (i==k)
                    temp[k][l]=true;                
                else if (j==l)
                    temp[k][l]=true;
                else
                    temp[k][l]=false;
                if (i==k && j==l)
                    temp[k][l]=false;
            }
        return temp;         
    
}}
