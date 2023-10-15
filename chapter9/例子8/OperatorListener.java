import java.awt.event.*;
public class OperatorListener implements ItemListener,ActionListener {
     NumberView view;
     public void setView(NumberView view) {
         this.view = view;
     }
     public void itemStateChanged(ItemEvent e)  {
         String fuhao = view.choiceFuhao.getSelectedItem().toString();
         view.computer.setFuhao(fuhao);
     }
     public void actionPerformed(ActionEvent e) {
         String fuhao = view.choiceFuhao.getSelectedItem().toString();
         view.computer.setFuhao(fuhao);
     }
}
