// Program 04
// BubbleSort Problem

class BubbleSort{
 public static void main(String[] a){
  int [] x={5,4,3,2,1};
  for(int i=0; i<x.length; i++){
    for(int j =0; j<x.length-1; j++){
        if(x[j]>x[j+1]){
            int t =x[j];
            x[j] = x[j+1];
            x[j+1] = t;
        }
    }
  }
  for(int i:x){
    System.out.print(i+" ");
  }
 }
}
