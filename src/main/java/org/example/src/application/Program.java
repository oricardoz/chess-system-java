package org.example.src.application;

import org.example.src.boardgame.Board;
import org.example.src.boardgame.Position;
import org.example.src.chess.ChessMatch;

public class Program {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }
}