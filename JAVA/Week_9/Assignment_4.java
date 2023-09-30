import java.util.*;
import java.util.Scanner;
public class Question94{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
// Declare necessary variables

String a[] = new String[5];

char r[][] = new char[5][5];

int i,j,k=0;
// Input 5x5 2D Array using Scanner Class
for(j=0; j<5; j++)
  a[j] = sc.nextLine();
// Perform the reflection operation
for( i=0; i<5; i++)
  for( j=4,k=0; j>=0; j--,k++)
  r[i][k] = a[i].charAt(j);
// Output 5x5 2D Reflection Array
  for(i=0; i<5; i++)
{
  for(k=0; k<5; k++)
    System.out.print(r[i][k]);
  System.out.println();

}
   } // The main() method ends here
} // The main class ends here
