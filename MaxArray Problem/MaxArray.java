// Program 13
// MaxArray Problem

class MaxArray{
 public static void main(String[] a){
  int [] x = {5,3,6,2};

  int m = x[0];
  for(int i:x){
    if(i>m){
        m=i;
    }
  }
  System.out.print(m);
 }
}
