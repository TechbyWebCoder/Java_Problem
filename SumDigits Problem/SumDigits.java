// Program 22
// SumDigits Problem

class SumDigits{
 public static void main(String[] a){
  int n=123456, s=0;
  while (n!=0) {
    s+=n%10;
    n/=10;
  }
  System.out.print(s);
 }
}
