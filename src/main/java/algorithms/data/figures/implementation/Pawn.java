package algorithms.data.figures.implementation;

import com.capgemini.chess.algorithms.data.Coordinate;
import com.capgemini.chess.algorithms.data.Move;
import com.capgemini.chess.algorithms.data.enums.Color;
import com.capgemini.chess.algorithms.data.enums.MoveType;
import com.capgemini.chess.algorithms.data.figures.Piece;
import com.capgemini.chess.algorithms.data.figures.PieceInterface;

public class Pawn extends Piece implements PieceInterface {


    public Pawn(Color color, Coordinate coordinate) {
        super(color, coordinate);
    }

    @Override
    public void doMove(Move move) {

        if (move.getType().equals(MoveType.ATTACK)) {
            return;
        }

    }
}
