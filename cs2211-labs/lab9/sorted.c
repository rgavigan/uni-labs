#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int ARR_SIZE = 100;
int WORD_LEN = 20;

int cmp(const void *p1, const void *p2) {
    return strcmp(p1, p2);
}


int main(void) {
    // Initialize array of large size
    char arr[ARR_SIZE][WORD_LEN + 1]; // could also do char *arr[] and use pointers to save space
    int arr_len = 0;

    while (1) {
        printf("Enter word: ");
        // Use fgets to put input into array
        fgets(arr[arr_len], 21, stdin);
        if (strcmp(arr[arr_len], "\n") == 0) {
            break;
        }
        arr[arr_len][strcspn(arr[arr_len], "\n")] = 0;
        arr_len += 1;
        // Flush stdin so it does not carry over
        fflush(stdin);
    }

    // Print first and last word entered
    printf("First: %s\n", arr[0]);
    printf("Last: %s\n", arr[arr_len - 1]);
    
    // Sort array
    qsort(arr, arr_len, sizeof(*arr), cmp);
    printf("In sorted order: ");

    // Print sorted array
    for (int i = 0; i < arr_len; i++) {
        printf("%s ", arr[i]);
    }
    printf("\n");
}