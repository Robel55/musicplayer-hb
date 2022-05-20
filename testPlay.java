
package musicplaye;

import java.io.*;
import javax.swing.JLabel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import java.io.File;


public class testPlay {
    String path;
    String filess;
    String currentsong;
    String currentNode;
    long length;
   FileInputStream FIS;
   BufferedInputStream BIS;
   public Player player;
   
   public String file;
   String name;
    public File[] myFile;
    public long location;
    public long total_length;
    private File sa;
    String j;
    
    public void select(){
    JLabel labelMusic= new JLabel();    
    JFileChooser chooser=new JFileChooser();
    
    chooser.setMultiSelectionEnabled(true);
    
    int Value= chooser.showOpenDialog(null);
    if(Value==JFileChooser.APPROVE_OPTION){
        myFile=chooser.getSelectedFiles();
       for(File file:myFile){
           j=file.getAbsolutePath();
           System.out.println(j);
           
       }
        String song=myFile+"";
        name= chooser.getSelectedFile().getName();
        
        
        
    }
    }
    public String getMusic()
    {
     return name;   
    }
       
    public void play(){
        try {
      FileInputStream FIS = new FileInputStream(j);
      BufferedInputStream BIS = new BufferedInputStream(FIS);
      player= new Player(BIS);
      file=myFile+"";
            try {
                total_length=FIS.available();
            } catch (IOException ex) {
       
            }
    } catch (FileNotFoundException ex) {
           }  catch (JavaLayerException ex) {
              
           }
   new Thread(){
   @Override
   public void run(){
     try{
     player.play();
    } catch (JavaLayerException ex) {
                    
                }
            }
        }.start();
        }
      public void Stop(){
          player.close();
      }
      public void pause(){
          if(player!=null){
              try {
                   int pause= FIS.available();
                  player.close();
              } catch (Exception ex) {
                  Logger.getLogger(testPlay.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
        
         }
   
              
      
          

      


    
    

}