package com.company;

/**
 * Created by Admin on 7/18/17.
 */
public class GamePiece {
   int positionX;
    int positionY;
    boolean frozen;
     String name;
     String color;

    public GamePiece() {
        positionX = 0;
        positionY = 0;
        frozen = false;
        name = "King";
        color = "black";
    }

    // get
    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean isFrozen(){
        return frozen;
    }

    public String getName() {
        return name;
    }

    public String color() {
        return color;
    }

    // set
    public String setName(String name){
        return this.name = name;
    }

    public String setColor(String newcolor){
        return color = newcolor;
    }

    // Add a move() method (returns void) that takes a new x and y position. Set the instance variables to the parameters.
    public void move(int x, int y) {

        if (frozen == true) {
            System.out.println("you cannot move me");
        } else {
            this.positionX = x;
            this.positionY = y;
        }
    }

// Add a freeze() method (returns void) and set frozen to true
    public void freeze() {
        this.frozen = true;
    }

// Add a unfreeze() method (returns void) and set frozen to false
    public void unfreeze() {
        this.frozen = false;
    }


    // Change move() so that that when frozen the piece does not move


}
