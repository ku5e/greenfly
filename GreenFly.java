/**
 *
 * @author ku5e

This is a recursive Java version of the file found https://github.com/amoswachanga/greenfly/edit/master/GreenFly.java.
Thanks to @amoswachanga for developing the Java version of the code.

 */
    /**
     * @param args the command line arguments
     */
    /**
     * Question 1: The Greenfly Problem
Write a Java program to solve the following problem. 

Greenfly can reproduce asexually. After one week of life a lone female can produce eight offspring a day. 
Starting at the beginning of day 1 with a single mature female, how many greenfly could there be by the end of day 28? It may be assumed that:
:There are no deaths
:All offspring are females
Note that at the end of day 1 there will be 9 greenfly (original + 8 offspring). 
At the end of day 7 there will be 57 greenfly (original + 8 × 7 offspring). 
At the end of day 8 there will be 129 greenfly (original + 8 × 8 offspring + 64 offspring from the daughters produced on day 1).
* 
* Day (1-7) = NumberOfParent(s) + (8 offspring * NumberofDay(s))
* Day 8 = NumberOfParent(s) + (8 offspring * NumberofDay(s))
* Day 1 = 1+(1*8) = 9
* Day 2 = 1+(2*8) = 17
* Day 3 = 1+(3*8) =  25
* Day 4 = 1+(4*8) = 33
* Day 7 = 1+(7*8) = 57
* Day 8 = 9*8+57 = ((1+(1*8)) * 8) + 57 = 129
* Day 9 = 17*8+129 =((1+(2*8)) * 8) + 129 = 265
* 
     * @param days
     */
    
class GreenFly {
	public static void main(String[] args) {
		int days = 28;
		System.out.println("There will be " + greenFly(days) + " at the end of " + days + " days.");
	}
	public static int greenFly(int days){
		if(days > 0){
			return greenFly(days - 1) + (greenFly(days - 7) * 8);
		}else{
			return 1;
		}
	}
}
