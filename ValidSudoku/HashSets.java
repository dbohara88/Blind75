import java.util.HashSet;
import java.util.Scanner;

public class HashSets {
    public boolean isValidSudoku(char[][] board) {

        HashSet<String> hs = new HashSet<>();

        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
                char currentValue = board[i][j];
                if(currentValue != '.')
                {
                    if(!hs.add(currentValue+" found in row "+ i) || 
                       !hs.add(currentValue+ " found in column "+ j) ||
                       !hs.add(currentValue+" found in box "+ i/3+"-"+j/3))
                        return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);

        char[][] board = new char[9][9];

        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
                char inputChar = ss.nextLine().charAt(0);
                board[i][j] = inputChar;
            }
        }

        HashSet obj1 = new HashSet();
        obj1.isValidSudoku(board);
    }
}
