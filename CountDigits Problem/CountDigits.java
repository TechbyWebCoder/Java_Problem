// Program 05
// CountDigits Problem

class CountDigits{
 public static void main(String[] a){
  int n=1234,c=0;
  while(n!=0){
    c++;
    n/=10;
    }
  System.out.print(c);
 }
}
