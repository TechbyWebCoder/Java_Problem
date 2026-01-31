// Program 11
// LeapYear Problem

class LeapYear{
 public static void main(String[] a){
  int y = 2030;
  System.out.print((y%4==0 && y%100!=0) ||  y%400==0);
 }
}
