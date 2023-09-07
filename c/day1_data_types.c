#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int i = 4;
    double d = 4.0;
    char s[] = "HackerRank ";

    
    // Declare second integer, double, and String variables.
    int num;
    double deci_num;
    char str[]="is the best place to learn and practice coding!";
    char string_result[100];
    // Read and save an integer, double, and String to your variables.
     num=12;
     deci_num=4.0;
     strcpy(string_result,s);
    // Print the sum of both integer variables on a new line.
    printf("%d\n",num+i);
    // Print the sum of the double variables on a new line.
    printf("%.1f\n",deci_num+i);
    // Concatenate and print the String variables on a new line
    // The 's' variable above should be printed first.
     printf("%s",strcat(string_result,str));
    return 0;
}
