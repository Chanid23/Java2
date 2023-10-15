import java.awt.event.*;
public class HandleListener implements ActionListener {
   WindowDocument view;
   public void setView(WindowDocument view) {
      this.view = view;
   }
   public void actionPerformed(ActionEvent e) {
      String str=e.getActionCommand(); 
      if(str.equals("copy"))
         view.showText.copy();
      else if(str.equals("cut"))
         view.showText.cut();
      else if(str.equals("paste"))
         view.showText.paste();
   }
}
