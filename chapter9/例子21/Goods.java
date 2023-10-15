public class Goods{
    String name;
    double price;
    Goods(String n,double p){
       name=n;
       price = p;
    }
    public String toString() { //返回对象的String表示
       return name;
    }
}