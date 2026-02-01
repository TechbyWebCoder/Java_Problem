// Program 12
// LinearSearch Problem

class LinearSearch{
 public static void main(String[] a){
  int [] x ={1,4,5,7,3};
  int k = 7;
  for(int i : x){
    if(i==k){
        System.out.print("Found");
        return;
    }
  }
  System.out.print("Not Found");
 }
}
