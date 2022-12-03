#include <stdio.h>
#include <math.h>

int main() {
    long double x;
    long long int answer;

    printf("Enter a value for x: ");
    scanf("%Lf", &x);

    answer = (3 * (pow(x, 5)) + (2 * (pow(x, 4))) - (5 * (pow(x, 3))) - (pow(x, 2)) + (7 * x) - 6);

    printf("Your answer is: %lld\n", answer);
}