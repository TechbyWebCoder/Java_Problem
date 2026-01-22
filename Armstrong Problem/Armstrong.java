// Program 02
// Armstrong Problem

class Armstrong{
 public static void main(String[] a){
  int n=153,t=n,s=0;
  while(n!=0){
    int r=n%10;
    s+=r*r*r;
    n/=10;}
  System.out.print(s==t);
 }
}
