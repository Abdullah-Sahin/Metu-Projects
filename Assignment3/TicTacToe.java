import javax.swing.JOptionPane;
/**
Class by which the game TicTacToe is played.
 */
public class TicTacToe
{
    private String[][] board = new String[3][3];

    /**
    Constructor of objects in class TicTacToe
    */
    public TicTacToe()
    {
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[i].length; j++)
            {
                board[i][j] = " - ";
            }
        }
    }
    
    /**
    Prints 3x3 matrix with their entries
    */
    public void printBoard()
    {
        System.out.println("**********");
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[i].length; j++)
            {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println("**********");
    }
    
    /**
    Displays the coordinates of each entry in the board
    */
    public void printAvailableCoordinates()
    {
        System.out.println("Available Coordinates");
        System.out.println("**********");
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[i].length; j++)
            {
                System.out.print("("+ i + ", "+ j +")");
            }
            System.out.println();
        }
        System.out.println("**********");
    }
    
    /**
     * Calculates the number at most how many sane type appears on board
    @return at most how many sane type appears on board
    */
    public int checkWinDrawn()
    {
        int consecutive = 1;
        for(int i = 0; i<board.length; i++)
        {
            if(board[i][0] != " - " && (board[i][0] == board[i][1] || board[i][1] == board[i][2]))
            {
            consecutive = 2;
                if(board[i][0] == board[i][2])
                {
                    consecutive = 3;
                }
                for(int j = 0; j < board[i].length; j++)
                {
                    if(board[0][j] != " - " && (board[0][j] == board[1][j] || board[1][j] == board[2][j] ))
                    {
                    consecutive = 2;
                        if(board[0][j] == board[2][j])
                        {
                            consecutive = 3;
                        }
                    }
                }
            }
            if(board[0][0] == board[1][1] && board[0][0] != " - ")
            {
                consecutive = 2;
                if(board[0][0] == board[2][2])
                {
                    consecutive = 3;
                }
            }
        }
        if(board[0][2] == board[1][1] && board[0][2] != " - ")
        {
            consecutive = 2;
            if(board[0][2] == board[2][0])
            {
                consecutive = 3;
            }
        }
        return consecutive;
    }
    
    /**
    Checks whether the board is full
    @return true if board is full, false otherwise
     */
    public boolean isFull()
    {
        for(int i = 0; i<board.length; i++)
            for(int j = 0; j<board[i].length; j++)
                if((board[i][j].equals(" - ")))
                {
                    return false;
                }
        return true;
    }
    
    /**
    Starts the game TicTacToe and ends when one of the players won
    */
    public void playGame()
    {
        while(true)
        {
            if(isFull())
            {
                JOptionPane.showMessageDialog(null, "Game ended.\n ***DRAW***");
                break;
            }
            play1();
            printBoard();
            if(checkWinDrawn() == 3)
            {
                JOptionPane.showMessageDialog(null, "First Player won the game. Game ended.");
                break;
            }
            if(isFull())
            {
                JOptionPane.showMessageDialog(null, "Game ended.\n ***DRAW***");
                break;
            }
            play2();
            printBoard();
            if(checkWinDrawn() == 3)
            {
                JOptionPane.showMessageDialog(null, "Second Player won the game. Game ended.");
                break;
            }
        }
        
    }
    
    /**
    Gives one turn play for player 1
    */
    public void play1()
    {
        while(!isFull())
        {
            JOptionPane.showMessageDialog(null, "1st Player's Turn");
            String coor = JOptionPane.showInputDialog("Pleasae type coordinates you want to fill");
            String[] stringCoor = coor.split(",");
            int coorİ = Integer.parseInt(stringCoor[0]);
            int coorJ = Integer.parseInt(stringCoor[1]);
            if (coorİ < 0 || coorİ > 2 || coorJ < 0 || coorJ > 2)
            {
                JOptionPane.showMessageDialog(null, "Please typle valid coordinates");
                continue;
            }
            if(!(board[coorİ][coorJ].equals(" - ")))
            {
                JOptionPane.showMessageDialog(null, "This coordinate was filled");
                continue;
            }
            else
            {
                board[coorİ][coorJ] = " X ";
                break;
            }
        }
    }
    
    
    /**
    Gives one turn play for player 2
    */public void play2()
    {
        while(!isFull())    
        {
            JOptionPane.showMessageDialog(null, "2st Player's Turn");
            String coor = JOptionPane.showInputDialog("Pleasae type coordinates you want to fill");
            String[] stringCoor = coor.split(",");
            int coorİ = Integer.parseInt(stringCoor[0]);
            int coorJ = Integer.parseInt(stringCoor[1]);
            if (coorİ < 0 || coorİ > 2 || coorJ < 0 || coorJ > 2)
            {
                JOptionPane.showMessageDialog(null, "Please typle valid coordinates");
                continue;
            }
            if(!(board[coorİ][coorJ].equals(" - ")))
            {
                JOptionPane.showMessageDialog(null, "This coordinate was filled");
                continue;
            }
            else
            {
                board[coorİ][coorJ] = " O ";
                break;
            }
        }
    }

    /**
    Opens a TicTacToe game on the console
    */
    public void q1()
    {
        TicTacToe board = new TicTacToe();
        printAvailableCoordinates();
        printBoard();
        playGame();
    }
}
