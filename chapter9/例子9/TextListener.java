import javax.swing.event.DocumentListener;
import javax.swing.event.DocumentEvent;
import java.util.Arrays;
public class TextListener implements DocumentListener {
   WindowDocument view;
   public void setView(WindowDocument view) {
      this.view = view;
   }
   public void changedUpdate(DocumentEvent e) {
      String str=view.inputText.getText(); 
     //空格、数字和符号(!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~)组成的正则表达式:
      String regex="[\\s\\d\\p{Punct}]+"; 
      String words[]=str.split(regex); 
      Arrays.sort(words);      //按字典序从小到大排序
      view.showText.setText(null); 
      for(int i=0;i<words.length;i++)
         view.showText.append(words[i]+",");
   }
   public void removeUpdate(DocumentEvent e) { 
      changedUpdate(e);
   }
   public void insertUpdate(DocumentEvent e) { 
      changedUpdate(e);
   }
}
