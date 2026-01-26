// Program 06
// Duplicate Problem

class Duplicate{
 public static void main(String[] a){
  int[] x={1,2,3,2};
  for(int i=0;i<x.length;i++)
   for(int j=i+1;j<x.length;j++)
    if(x[i]==x[j]) System.out.print(x[i]);
 }
}
