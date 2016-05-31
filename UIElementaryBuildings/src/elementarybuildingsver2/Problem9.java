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
public class Problem9 extends Problem{
    private static Problem9 p;

    private Problem9() {

        String[][] ans9 = {
            {"", "", "", "", "", "", "", ""},
            {"", "△", "△", "△", "△", "△", "△", ""},
            {"", "■", "■", "■", "■", "■", "■", ""},
            {"", "□", "□", "□", "□", "□", "□", ""},
            {"", "■", "■", "■", "■", "■", "■", ""},
            {"", "□", "□", "□", "□", "□", "□", ""},
            {"", "■", "■", "■", "■", "■", "■", ""},
            {"", "□", "□", "□", "□", "□", "□", ""}
        };

        setBoard(ans9);
    }

    public static Problem9 getInstance() {
        if (p == null) {
            p = new Problem9();
        }

        return p;
    }

}
