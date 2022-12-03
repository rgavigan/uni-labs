#include <stdio.h>
#include <stdlib.h>

int main(void) {
    int hour, minute;
    // Read 24-hour time
    printf("Enter a 24-hour time: ");
    scanf("%d:%d", &hour, &minute);

    // Display 12-hour time [commented out]
    printf("Equivalent 12-hour time: ");
    int twelveHour;
    if (hour <= 12) {
        twelveHour = hour;
    }
    else {
        twelveHour = hour - 12;
    }
    if (hour < 12) {
        printf("%d:%02d AM\n", twelveHour, minute);
    }
    else {
        printf("%d:%02d PM\n", twelveHour, minute);
    }
}