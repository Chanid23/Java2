public class Dog implements Comparable<Dog> {
     int weight;
     public int compareTo(Dog m){
        if(weight>m.weight)
           return 1;
        else if(weight == m.weight)
           return 0;
        else
           return -1;
     }
     public static void main(String args[]){
         Dog dog1 = new Dog();
         Dog dog2 = new Dog();
         dog1.weight = 20;
         dog2.weight = 25; 
         System.out.println(dog1.compareTo(dog2));
     }
}
