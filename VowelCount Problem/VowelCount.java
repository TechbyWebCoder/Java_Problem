// Program 24
// VowelCount Problem

class VowelCount{
 public static void main(String[] a){
  String s= "java" ;
  int c = 0;

  for(char ch: s.toCharArray()){
    if("aeiou".indexOf(ch)!=-1){
        c++;
    }
  }
  System.out.print(c);
 }
}
