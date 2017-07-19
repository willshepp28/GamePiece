package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        GamePiece piece = new GamePiece();



      // make sure piece is frozen when freeze() is called
        piece.freeze();
        System.out.println(piece.frozen);

       // make sure piece is unfrozen when unfreeze() is called
        piece.unfreeze();
        System.out.println(piece.frozen);


        // make sure move() moves postions when frozen is set to false
        piece.move(3,3);
        System.out.println(piece.positionX);
        System.out.println(piece.positionY);


        // make sure move() doesnt move positions when set to true
        piece.freeze();
        piece.move(4,4);
        System.out.println(piece.positionY);
        System.out.println(piece.positionX);



    }
}
