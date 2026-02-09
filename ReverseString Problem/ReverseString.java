// Program 20
// ReverseString Problem

class ReverseString{
 public static void main(String[] a){
  String s = "java" , r="";
  for(int i=s.length()-1; i>=0; i--){
    r+=s.charAt(i);
  }
  System.out.print(r);
 }
}
