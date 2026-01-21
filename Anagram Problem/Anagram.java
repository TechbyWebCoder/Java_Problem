// Program 01
// Anagram Problem

import java.util.*;
class Anagram{
 public static void main(String[] a){
  char[] x="listen".toCharArray();
  char[] y="silent".toCharArray();
  Arrays.sort(x);
  Arrays.sort(y);
  System.out.print(Arrays.equals(x,y));
 }
}
