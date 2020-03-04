import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * Date: Oct 14-2015
 * Creating a window to initialize the program
 * @author John
 * @version 1.52
 */
public class TitlesFrame extends JFrame {
   public TitlesFrame() {
      this.initUI();
   }
   


   /**
 * Сreation of window parameters dimensions, name
 */
private void initUI() {
      this.setTitle("Кривые фигуры");
      this.setDefaultCloseOperation(3);
      this.add(new TitlesPanel(78));
      this.setSize(350, 350);
      this.setLocationRelativeTo((Component)null);
   }
   


   /**
 * @param args
 * Program launch rules
 */
public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            TitlesFrame ps = new TitlesFrame();
            ps.setVisible(true);
           
         }
      });
   }
}
