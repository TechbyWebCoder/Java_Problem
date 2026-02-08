// Program 19
// ReverseNumber Problem

class ReverseNumber{
 public static void main(String[] a){
  int n =54321, rev=0;
  while (n!=0) {
    rev = rev*10+n%10;
    n/=10;
  }
  System.out.println(rev);
 }
}
