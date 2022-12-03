#include <stdio.h>
int main(void) {
    int numArray[4];
    printf("Enter four integers:\n");
    scanf( "%d %d %d %d", &(numArray[0]), &(numArray[1]), &(numArray[2]), &(numArray[3]));
    int minVal = 1000000;
    int maxVal = -1000000;
    for (int i = 0; i < 4; i++) {
        if (numArray[i] < minVal) {
            minVal = numArray[i];
        }
        if (numArray[i] > maxVal) {
            maxVal = numArray[i];
        }
    }
    printf("Largest: %d\n", maxVal);
    printf("Smallest: %d\n", minVal);
}