/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementarybuildingsver2;

import java.io.Serializable;

/**
 *
 * @author user
 */
public abstract class Module implements Serializable{

    private String icon;

    public abstract void execute();

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }

}
