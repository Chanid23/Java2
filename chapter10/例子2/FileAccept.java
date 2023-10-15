import java.io.FilenameFilter;
import java.io.File;
public class FileAccept implements FilenameFilter {
    private String extendName;
    public void setExtendName(String s) {
       extendName="."+s;
    }
    public boolean accept(File dir,String name) { //��д�ӿ��еķ���
       return name.endsWith(extendName);
    }
}
