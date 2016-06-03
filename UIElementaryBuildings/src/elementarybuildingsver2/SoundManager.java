/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementarybuildingsver2;

/**
 *
 * @author will9102002
 */
public class SoundManager {
    
  private static SoundManager musicman;
    
  private SoundManager(){}
    
   SoundPlay bs= new SoundPlay();
   SoundPlay ms = new SoundPlay();
   SoundPlay cs = new SoundPlay();
   SoundPlay succs = new SoundPlay();
   SoundPlay ds = new SoundPlay();
   SoundPlay dirs = new SoundPlay();
   SoundPlay wds = new SoundPlay();
   SoundPlay stgs= new SoundPlay();
    public void playButtonSound()
    {
        bs.playSound("z_Button.wav");
    }
    public void playModuleSound()
    {
        ms.playSound("z_module.wav");
    }
    public void playClearSound()
    {
        cs.playSound("z_clear.wav");
    }
    public void playSuccessSound()
    {
        succs.playSound("z_Accept.wav");
    }
    public void playDeleteSound()
    {
        ds.playSound("z_delete.wav");
    }
    public void playDirectionSound()
    {
        dirs.playSound("z_direction.wav");
    }
    public void playWaterdropSound()
    {
        wds.playSound("z_waterDrop.wav");
    }
    public void playStage()
    {
        stgs.playSound("z_stage.wav");
    }
    
  public static SoundManager getInstance() {
        if (musicman == null) {
            musicman = new SoundManager();
        }

        return musicman;
    }  
    
    
}
