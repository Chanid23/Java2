public interface Com { 
    public static final int MAX = 100;  //�ȼ�д����int MAX=100;
    public abstract void on();   //�ȼ�д����void on();
    public abstract float sum(float x ,float y);
    default int max(int a,int b) {   //default����
        outPutJava();  //���ýӿ��е�private����
        return a>b?a:b;
    }
    public static void f() {
       System.out.println("ע���Ǵ�Java SE 8��ʼ��");
    }
    private void outPutJava(){
       System.out.println("Java");
    }
}


