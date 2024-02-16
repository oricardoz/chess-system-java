package org.example.src.chess;

import org.example.src.boardgame.Board;
import org.example.src.boardgame.Piece;

public class ChessPiece extends Piece {
    private Color color;
    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }
    public Color getColor() {
        return color;
    }
}
