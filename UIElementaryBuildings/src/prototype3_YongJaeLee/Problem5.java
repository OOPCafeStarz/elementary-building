/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype3_YongJaeLee;

import elementarybuildingsver2.*;

/**
 *
 * @author user
 */
public class Problem5 extends Problem {

    private static Problem5 p;

    private Problem5() {

        String[][] ans5 = {
            {"△", "○", "△", "○", "○", "☆", "☆", "○"},
            {"○", "■", "○", "■", "★", "■", "■", "★"},
            {"□", "▲", "□", "▲", "□", "★", "★", "□"},
            {"★", "□", "★", "□", "□", "□", "□", "□"},
            {"○", "☆", "○", "☆", "○", "☆", "☆", "○"},
            {"□", "□", "□", "□", "★", "■", "■", "★"},
            {"○", "■", "○", "■", "△", "□", "□", "△"},
            {"□", "▲", "□", "▲", "□", "□", "□", "□"},
        };

        setBoard(ans5);
    }

    public static Problem5 getInstance() {
        if (p == null) {
            p = new Problem5();
        }

        return p;
    }

}
