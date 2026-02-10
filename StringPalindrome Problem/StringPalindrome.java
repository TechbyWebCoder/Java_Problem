// Program 21
// StringPalindrome Problem

class StringPalindrome{
 public static void main(String[] a){
  String s = "madam", r="";

  for(int i =s.length()-1; i>=0; i--){
    r+=s.charAt(i);
  }
  System.out.println(s.equals(r));
 }
}
