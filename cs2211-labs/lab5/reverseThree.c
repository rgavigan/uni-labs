#include <stdio.h>

int main() {
    char char1, char2, char3;
    printf("Enter a three-digit number: ");
    scanf("%c%c%c", &char1, &char2, &char3);

    printf("The reversal is: %c%c%c\n", char3, char2, char1);
}