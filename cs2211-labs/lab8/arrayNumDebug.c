#include <stdio.h>
#include <stdlib.h>

#define MAX_NUMBERS 5

void loadArray(int[]);

int main(void){
    int numbers[MAX_NUMBERS];
    printf("This program will ask you for %d numbers\n", MAX_NUMBERS);

    loadArray(numbers);
    for (int i = 0; i < MAX_NUMBERS; i++) {
        printf("  numbers[%d] = %d\n", i, numbers[i]);
    }
}

void loadArray(int myArray[]){
    /* initalize the array */
    for (int i = 0; i < MAX_NUMBERS; i++) {
        printf("Give me a number: ");
        scanf("%d", &myArray[i]);
    }
}