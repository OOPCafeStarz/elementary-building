/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype1_LeeHojeong;


    
    

public class Player {

private static Player p =new Player();
private Player(){};
public static Player getInstance()
{
 return p;	
}

public void delete()
{	
        String[][] board = new String[8][4];
    for(int i=0;i<8;i++)
	{
		for(int j=0;j<4;j++)
		{
			board[i][j]=" ";
		}
	}
    
       UserBoard.getInstance().setBoard(board);
	
}
}

