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
public abstract class pieces {
    String name;
    boolean[][] allowed;
    boolean alive;
    public pieces(String name, boolean alive){
        this.alive=alive;
        this.name=name;
    }
    public abstract boolean[][] allowedMoves(int i, int j);
    
}
