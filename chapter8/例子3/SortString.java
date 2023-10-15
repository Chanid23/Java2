public class SortString {
   public static void sort(String a[]) {
      int count=0; 
      for(int i=0;i<a.length-1;i++) {
          int saveMinIndex = i;
          for(int j=i+1;j<a.length;j++) { 
              if(a[j].compareTo(a[saveMinIndex])<0) {
                  saveMinIndex = j;
              }
          } 
          String temp=a[i];
          a[i]=a[saveMinIndex];
          a[saveMinIndex]=temp;
      }
   }
}

