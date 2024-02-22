package org.example.src.chess.pieces;

import org.example.src.boardgame.Board;
import org.example.src.chess.ChessPiece;
import org.example.src.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R" ;
    }
}
