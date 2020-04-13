//VINAYAK PATIL
//vinayakrit

/* left recursion program the production is in format E=E+T|T  
note: 
*/
#include<stdio.h>
#include<string.h>
#include<ctype.h>
int n=1,i=0,j=0,k=0;
char a[10][10],f[10];
 int main(){
   int i=0,z;
   char c,ch;
   
     printf("Enter the production:\n");
     for(i=0;i<n;i++)
        scanf("%s%c",a[i],&ch);
	

    
     c=a[0][0];
     if(a[0][2] == c)
     { 
       printf("Left recursion found: \n");
       printf("%c' -> ",c);
       for(k=3;k<strlen(a[0]) && a[0][k] != '|';k++)
       { 
	     printf("%c",a[0][k]);
	   } 
	   printf("%c' | e",c);
	   n=k; i=0;
	   printf("\n%c ->",c);
	   for(k=n+1; k<strlen(a[0]) && a[0][k]!='\0'; k++)
	   {
	   	printf("%c",a[0][k]);
	   }
	   printf("%c'",c);
	printf("\n");
     }
     else{
     	printf("No left recursion!!");
	 } 
      return 0;
   }
/*output:
Enter the production:
E=E+T|T
Left recursion found:
E' -> +TE' | e
E ->TE'
*/

//process to run  $ g++ left.cpp      $ ./a.out        


