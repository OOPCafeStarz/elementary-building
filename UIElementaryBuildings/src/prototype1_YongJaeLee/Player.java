/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype1_YongJaeLee;

import prototype1.*;

/**
 *
 * @author YongJae
 */
public class Player {

    public static Player p = new Player();
    private int getCol = UserBoard.getInstance().getColcnt();
    private int getRow = UserBoard.getInstance().getRowcnt();

    private Player() {

    }

    public static Player getinstance() {
        return p;
    }

    public void BlockPut() {

        for (int i = 0; i < MinQueue.getInstance().getIndex(); i++) {
            if (UserBoard.getInstance().getRowcnt() >= 8) {
                return;
            }
            if (UserBoard.getInstance().getColcnt() >= 4) {
                return;
            }
            if (MinQueue.getInstance().getQueue()[i].equals("→")) {
                getCol++;
                getRow = 0;
            } else {
                UserBoard.getInstance().getBoard()[7 - getRow][getCol] = MinQueue.getInstance().getQueue()[i];
//                jTable1.setValueAt(q[i], 7-rowcnt, colcnt);
//                rowcnt++;
                getRow++;
            }
        }
        
        for(int i=0; i<UserBoard.USER_BOARD_ROW; i++)
        {
            for(int j=0; i<UserBoard.USER_BOARD_COL; j++)
            {
                if(UserBoard.getInstance().getBoard()[i][j].equals("■"))
                    GameViewAndControl.getInstance().getjTable1().setValueAt("■", i, j);
            }
        }

    }

}
