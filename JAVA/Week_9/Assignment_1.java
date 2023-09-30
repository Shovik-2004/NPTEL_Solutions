import java.util.*;
public class Question91{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine(); // Read as string, e.g., 5+6
// Declare and initialize the required variable(s)
int i=0; int j=0;
double k=0;
// Split the input string into character array

char s[] = input.toCharArray();

/*

Write your method to separate two operands

and operators and then perform the required operation.

*/

for(int a=0; a<s.length; a++){

  if(s[a]=='+')

  {

    i=Integer.parseInt(input.substring(0,a));

    j=Integer.parseInt(input.substring(a+1,s.length));

	k=(double)i+j;

  }

  else if(s[a]=='-')

  {
i=Integer.parseInt(input.substring(0,a));
    j=Integer.parseInt(input.substring(a+1,s.length));
	k=(double)i-j;
  }

  else if(s[a]=='*')
  {
	i=Integer.parseInt(input.substring(0,a));
    j=Integer.parseInt(input.substring(a+1,s.length));
	k=(double)i*j;
  }
  else if(s[a]=='/')
  {
	i=Integer.parseInt(input.substring(0,a));
    j=Integer.parseInt(input.substring(a+1,s.length));
	k=(double)i/j;
  }
}
// Print the output as stated in the question
System.out.print(input+" = "+Math.round(k));
  }
}
