// Program 16
// PrimeCheck Problem

class PrimeCheck{
 public static void main(String[] a){
  int n=9 , c=0;
  for(int i=1; i<=n; i++){
    if(n%i==0){
        c++;
    }
  }
  System.out.print(c==2);
 }
}
