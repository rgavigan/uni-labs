#include <stdio.h>

int main() {
    int num1, num2, den1, den2;
    int numerator, denominator;
    printf("Enter two fractions separated by a plus sign: ");
    scanf("%d/%d+%d/%d", &num1, &den1, &num2, &den2);

    numerator = num1 * num2;
    denominator = den1 * den2;
    printf("The sum is %d/%d\n", numerator, denominator);
}