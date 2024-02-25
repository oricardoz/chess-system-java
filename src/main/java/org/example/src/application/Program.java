package org.example.src.application;

import org.example.src.boardgame.Board;
import org.example.src.boardgame.Position;
import org.example.src.chess.ChessMatch;
import org.example.src.chess.ChessPiece;
import org.example.src.chess.ChessPosition;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        while(true){
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.println("Source: ");
            ChessPosition sorce = UI.readChessPosition(sc);
            System.out.println();
            System.out.println("Target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(sorce, target);
        }


    }
}