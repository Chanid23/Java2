import java.io.File;
public class Example10_2 {
   public static void main(String args[]) {
      File javaDir = new File("java");
      System.out.println(javaDir.isDirectory());
      boolean boo = javaDir.mkdir();//�ڵ�ǰĿ¼�½���java��Ŀ¼
      if(boo) {
         System.out.println("�½���Ŀ¼ "+javaDir.getName()); 
      }
      File dirFile = new File(".");//dirFile�ǵ�ǰĿ¼
      System.out.println("ȫ���ļ��������ļ��У�:");
      String fileName[] = dirFile.list();
      if(fileName == null){
         System.out.println("û���ļ�");
      }
      else {
         for(String name:fileName) {
            System.out.println(name);
         }
      }
      FileAccept fileAccept = new FileAccept();
      fileAccept.setExtendName("java");
      System.out.println("�����г�javaԴ�ļ�:");
      File file[] = dirFile.listFiles(fileAccept);
      if(file == null){
          System.out.println("û��javaԴ�ļ�");
      }
      else {
         for(File f:file) {
             System.out.println(f.getName());
         }
      }
   }
}
