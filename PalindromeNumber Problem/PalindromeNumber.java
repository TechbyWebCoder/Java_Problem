// Program 14
// PalindromeNumber Problem

class PalindromeNumber{
 public static void main(String[] a){
  int n = 123241, t = n, r = 0;
  while(n!=0){
    r=r*10+n%10;
    n/=10;
  }
  System.out.print(t==r);
 }
}
