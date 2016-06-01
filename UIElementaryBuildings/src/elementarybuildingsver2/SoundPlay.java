/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementarybuildingsver2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import javax.sound.sampled.*;

/**
 *
 * @author will9102002
 */
public class SoundPlay {

    public void playSound(String filename) {

        try {

            URL url = getClass().getResource(filename);

            File file = new File(url.getPath());

            final Clip clip = AudioSystem.getClip();

            clip.addLineListener(new LineListener() {

                @Override

                public void update(LineEvent event) {

                    //CLOSE, OPEN, START, STOP
                    if (event.getType() == LineEvent.Type.STOP) {
                        clip.close();
                    }

                }

            });

            clip.open(AudioSystem.getAudioInputStream(file));

            clip.start();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
