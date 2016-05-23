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
   
    
       UserBoard.getInstance().clearBoard();
	
}
}

