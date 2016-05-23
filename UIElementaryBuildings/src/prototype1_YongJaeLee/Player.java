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
    private int Col = UserBoard.getInstance().getColcnt();
    private int Row = UserBoard.getInstance().getRowcnt();

    private Player() {

    }

    public static Player getinstance() {
        return p;
    }

    public void BlockPut() {

        // UserBoard.getInstance().initialBoard();
        for (int i = 0; i < MinQueue.getInstance().getIndex(); i++) {
            if (UserBoard.getInstance().getRowcnt() >= 8) {
                return;
            }
            if (UserBoard.getInstance().getColcnt() >= 4) {
                return;
            }
            if (MinQueue.getInstance().getQueue()[i].equals("→")) {
                Col++;
                Row = 0;
            } else {
                UserBoard.getInstance().getBoard()[7 - Row][Col] = MinQueue.getInstance().getQueue()[i];
//                jTable1.setValueAt(q[i], 7-rowcnt, colcnt);
//                rowcnt++;
                Row++;
            }

            UserBoard.getInstance().setRowcnt(Row);
            UserBoard.getInstance().setColcnt(Col);
        }

        for (int i = 0; i < UserBoard.USER_BOARD_ROW; i++) {
            for (int j = 0; j < UserBoard.USER_BOARD_COL; j++) {
                if (UserBoard.getInstance().getBoard()[i][j].equals("■")) {
                    GameViewAndControl.getInstance().getjTable1().setValueAt(UserBoard.getInstance().getBoard()[i][j], i, j);
                }
            }
        }

    }

    public void delete() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                UserBoard.getInstance().getBoard()[i][j] = " ";
                 GameViewAndControl.getInstance().getjTable1().setValueAt(UserBoard.getInstance().getBoard()[i][j], i, j);
            }
        }
        
        Row = 0;
        Col = 0;
        UserBoard.getInstance().setRowcnt(0);
        UserBoard.getInstance().setColcnt(0);

    }
}
