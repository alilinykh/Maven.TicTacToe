package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] input;
    boolean isWinC = false;
    boolean isWinR = false;
    boolean isWinD = false;


    
    public Board(Character[][] matrix) {
        input = matrix;
    }

    public Boolean isInFavorOfX() {

        for (int i = 0; i <input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if ((input[i][j].equals('X'))) {
                    isWinC = true;
                } else {
                    isWinC = false;
                    break;
                }
            }
            if (isWinC) break;
        }


        for (int i = 0; i <input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if ((input[j][i].equals('X'))) {
                    isWinR = true;
                } else {
                    isWinR = false;
                    break;
                }
            }
            if (isWinR) break;
        }


        if ((input[0][0].equals('X') && input[1][1].equals('X') && input [2][2].equals('X')) ||
            (input[2][0].equals('X') && input[1][1].equals('X') && input [0][2].equals('X')))
        {
            isWinD = true;
        }
        if (isWinC || isWinD || isWinR){ return true;}
        else {return false;}
    }

    public Boolean isInFavorOfO() {


        for (int i = 0; i <input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if ((input[i][j].equals('O'))) {
                    isWinC = true;
                } else {
                    isWinC = false;
                    break;
                }
            }
            if (isWinC == true) break;
        }


        for (int i = 0; i <input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if ((input[j][i].equals('O'))) {
                    isWinR = true;
                } else {
                    isWinR = false;
                    break;
                }
            }
            if (isWinR == true) break;
        }


        if ((input[0][0].equals('O') && input[1][1].equals('O') && input [2][2].equals('O')) ||
                (input[2][0].equals('O') && input[1][1].equals('O') && input [0][2].equals('O')))
        {
            isWinD = true;
        }
        if (isWinC || isWinD || isWinR){ return true;}
        else {return false;}
    }
    public Boolean isTie() {
        if (isInFavorOfO() == false && isInFavorOfX() == false) {
            return true;
        }
        else {
            return false;
        }
    }

    public String getWinner() {
        if (isInFavorOfX() == true) return "X";
        else if (isInFavorOfO() == true) return "O";
        else return "";
    }

}
