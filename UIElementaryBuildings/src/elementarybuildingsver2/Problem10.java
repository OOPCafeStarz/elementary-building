/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementarybuildingsver2;

/**
 *
 * @author MinGyu
 */
public class Problem10 extends Problem{
    private static Problem10 p;

    private Problem10() {
        
        String[][] ans10 = {
            {"", "", "", "", "", "", "", ""},
            {"■", "", "", "△", "", "", "■", ""},
            {"★", "■", "▲", "△", "▲", "■", "★", ""},
            {"☆", "☆", "■", "□", "■", "☆", "☆", ""},
            {"□", "■", "□", "■", "□", "■", "□", ""},
            {"■", "□", "■", "□", "■", "□", "■", ""},
            {"□", "■", "□", "■", "□", "■", "□", ""},
            {"■", "□", "■", "■", "■", "□", "■", ""}
        };

        setBoard(ans10);
    }
    
    
    public static Problem10 getInstance() {
        if (p == null) {
            p = new Problem10();
        }

        return p;
    }
    
}
