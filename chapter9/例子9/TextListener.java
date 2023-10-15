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
     //�ո����ֺͷ���(!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~)��ɵ�������ʽ:
      String regex="[\\s\\d\\p{Punct}]+"; 
      String words[]=str.split(regex); 
      Arrays.sort(words);      //���ֵ����С��������
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
