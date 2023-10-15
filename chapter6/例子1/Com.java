public interface Com { 
    public static final int MAX = 100;  //等价写法：int MAX=100;
    public abstract void on();   //等价写法：void on();
    public abstract float sum(float x ,float y);
    default int max(int a,int b) {   //default方法
        outPutJava();  //调用接口中的private方法
        return a>b?a:b;
    }
    public static void f() {
       System.out.println("注意是从Java SE 8开始的");
    }
    private void outPutJava(){
       System.out.println("Java");
    }
}


