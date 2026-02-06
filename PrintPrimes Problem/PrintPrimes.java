// Program 17
// PrintPrimes Problem

class PrintPrimes{
 public static void main(String[] a){
  for(int n=2; n<=20; n++){
    int c = 0;
    for(int i =1; i<=n; i++){
        if(n%i==0){
            c++;
        }
    }
    if(c==2){
        System.out.print(n+" ");
    }
  }
 }
}
