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
{	for(int i=0;i<8;i++)
	{
		for(int j=0;j<4;j++)
		{
			UserBoard.getInstance().getBoard()[i][j]=" ";
		}
	}

for(int i=0;i<8;i++)
{
	for(int j=0;j<4;j++)
	{
		GameViewAndControl.getInstance().getjTable1().setValueAt(UserBoard.getInstance().getBoard()[i][j], i, j);
	}
}
	
}
}

