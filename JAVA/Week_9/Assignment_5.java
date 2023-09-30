import java.util.Scanner;
public class Question95{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
// Declare the 5X5 2D array to store the input

String a[] = new String[5];

int i,j;

char matrix[][] = new char[5][5];
// Input 2D Array using Scanner Class and check data validity
for(i=0; i<5; i++)
  a[i] = sc.nextLine();
// Perform the Flip-Flop Operation
for(i=0; i<5; i++)
{
  char[] chararray = a[i].toCharArray();
  for(j=0; j<5; j++)
    matrix[i][j] = chararray[j];
}
// Output the 2D Flip-Flop Array
for(i=0; i<5; i++)
{
  for(j=0; j<5; j++)
  {
    if(matrix[i][j]=='0')
      System.out.print('1');
    else
      System.out.print('0');
  }
    System.out.println();
}
   } // The main() ends here
} // The main class ends here
