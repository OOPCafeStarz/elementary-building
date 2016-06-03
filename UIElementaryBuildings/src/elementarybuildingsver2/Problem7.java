/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementarybuildingsver2;

/**
 *
 * @author user
 */
public class Problem7 extends Problem {

    private static Problem7 p;

    private Problem7() {

        String[][] ans7 = {
            {"", "●", "●", "", "", "●", "●", ""},
            {"", "■", "■", "", "", "★", "★", ""},
            {"", "□", "□", "", "", "□", "□", ""},
            {"", "□", "□", "", "", "□", "□", ""},
            {"", "□", "□", "", "", "□", "□", ""},
            {"", "□", "□", "", "", "□", "□", ""},
            {"▲", "□", "□", "▲", "▲", "□", "□", "▲"},
            {"△", "■", "■", "△", "△", "■", "■", "△"}
        };

        setBoard(ans7);
    }

    public static Problem7 getInstance() {
        if (p == null) {
            p = new Problem7();
        }

        return p;
    }
}
