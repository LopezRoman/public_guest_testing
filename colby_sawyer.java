/* 
 Java Project
	Takes in an integer arg that w
*/

public class colby_sawyer{
// Method A
// Integer input
// Takes integer input and decrements followed by todays date
// Use recursion
// Format: {int}: {todays_date},
// DO NOT USE PRINTLN
public static void methodA(int x){
  // if x > 1
  // Exit Case
  // if x == 1
  if(x >= 1){
    //DateTime
    String date = "8/16/2023";
    // Method B Call
    String square = methodB(x);
    String total = String.valueOf(x) + ":\t" + date + ",\t" + square;
    System.out.println(total);
    int y = x - 1;
    methodA(y);
  }
}

// Method B
// Takes integer and prints square
// Format: {int} ^ 2 = x
public static String methodB(int x){
  int square = x*x;
  return String.valueOf(x) + " ^ 2 = " + String.valueOf(square);
}


// Main
// Decrement number and pass to A followed by B
public static void main(String[] args){

  // Take user input; typecast to integer
  String number = args[0];
  //System.out.print(number);
  int x = Integer.valueOf(number);
  // Call Method A
  methodA(x);

}
}
