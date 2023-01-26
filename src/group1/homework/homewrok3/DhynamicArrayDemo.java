package group1.homework.homewrok3;

public class DhynamicArrayDemo {
   private int [] array = new int[10];
   private int size = 0;
    public void add (int value){
         if (size == array.length - 1){
          extand();
         }else {
             array[size] = value;
             size++;
         }

     }

    private void extand (){
         int [] tmp = new int[array.length + 10];
         for (int i = 0; i < size; i++) {
             tmp[i] = array[i];
         }
         array = tmp;
     }
    public void printArray(){
         for (int i = 0; i < size; i++) {
             System.out.print(array[i] + " ");

         }
     }

}
