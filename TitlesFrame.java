import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TitlesFrame extends JFrame {
   public TitlesFrame() {
      this.initUI();
   }
   
   // initialize the program window

   private void initUI() {
      this.setTitle("Кривые фигуры");
      this.setDefaultCloseOperation(3);
      this.add(new TitlesPanel(78));
      this.setSize(350, 350);
      this.setLocationRelativeTo((Component)null);
   }
   
   // setting the window size and its name

   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            TitlesFrame ps = new TitlesFrame();
            ps.setVisible(true);
            // program launch rules
         }
      });
   }
}
