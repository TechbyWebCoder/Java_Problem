// Program 09
// Fibonacci Problem

class Fibonacci{
 public static void main(String[] a){
  int x=0,y=1;
  for(int i=0;i<5;i++){
   System.out.print(x+" ");
   int z=x+y;x=y;y=z;
  }
 }
}
