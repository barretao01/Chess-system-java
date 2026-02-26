package aplication;


import chess.ChessMatch;
import chess.Ui;
public class Program
{
    public static void main (String[] args)
    {
        ChessMatch chessMatch = new ChessMatch();
        Ui.printBoard(chessMatch.getPieces());
    }
}