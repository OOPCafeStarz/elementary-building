/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementarybuildingsver2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author MinGyu
 */
public class DBSaverAndLoader {
    private static final JFileChooser fc = new JFileChooser();
    public static void save(){
        int val = fc.showSaveDialog(GameWindow.getInstance());
        if (val == JFileChooser.APPROVE_OPTION) {
            // save the artwork
            try {

                FileOutputStream fs = new FileOutputStream(fc.getSelectedFile());
                ObjectOutputStream os = new ObjectOutputStream(fs);

                os.writeObject(DB.getInstance());

            } catch (IOException e) {
                JOptionPane.showMessageDialog(GameWindow.getInstance(),
                        "Cannot write to file " + fc.getSelectedFile().getName(),
                        "Save failed",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    public static void load(){
        if(DB.getInstance().getCurrentGameState()==Constants.GAME_STATE_RUN){
            JOptionPane.showMessageDialog(GameWindow.getInstance(),"ERROR MESSAGE",
                        "Do not load while game is running",
                        JOptionPane.ERROR_MESSAGE);
            return;
        }
        int val = fc.showOpenDialog(GameWindow.getInstance());

        if (val == JFileChooser.APPROVE_OPTION) {
            // load the artwork
            try {

                FileInputStream fs = new FileInputStream(fc.getSelectedFile());
                ObjectInputStream is = new ObjectInputStream(fs);

                // get shapes arraylist from the file
                Object o = is.readObject();

                if (o instanceof DB) {
                    //DB.getInstance().setContainerModules(((DB) o).getContainerModules());
                    //DB.getInstance().setCurrentContainerModuleIndex(((DB) o).getCurrentContainerModuleIndex());
                    DB.setDB((DB)o);
                } else {
                    JOptionPane.showMessageDialog(GameWindow.getInstance(),
                            "Wrong class type!",
                            "Open failed",
                            JOptionPane.ERROR_MESSAGE);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(GameWindow.getInstance(),
                        "Cannot open file " + fc.getSelectedFile().getName(),
                        "Open failed",
                        JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(GameWindow.getInstance(),
                        "File does not contain a class!",
                        "Open failed",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        for(int i=0; i<Constants.BOARD_ROW; i++){
            for(int j=0; j<Constants.BOARD_COL; j++){
                System.out.print(DB.getInstance().getAnswerBoard()[i][j]);
            }
            System.out.println();
        }
            QueueManager.showQueue();
            AnswerBoardManager.show();
            StopManager.getInstance().stop();
    }
}
