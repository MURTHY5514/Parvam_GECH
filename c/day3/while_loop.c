#include <stdio.h>
int main()
{
    /**
     * while loop:
     * ===========
     *
     * syntax:
     * =======
     *
     * ini
     * while(condition){
     *      //code
     *      inc/dec
     * }
     */

    // to calculate the sum of n natural no using while.
    // 3 ---> 1+2+3
    int num, sum = 0, i = 0;
    printf("Enter a number: \n");
    scanf("%d", &num);

    while (i <= num)
    {
        sum = sum + i;
        i++;
    }

    printf("Sum of %d natural number is : %d", num, sum);
}