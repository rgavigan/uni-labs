#include <stdio.h>
int main(void) {
    int numDays, startDay;
    printf("Enter number of days in month:\n");
    scanf("%d", &numDays);
    printf("Enter starting day of the week (1=Sun, 7=Sat):\n");
    scanf("%d", &startDay);

    int curDay = 1;
    int position = 0;
    // Handle spaces before starting day
    int numBefore = (startDay - 1) / 2;
    for (int i = 0; i <= numBefore; i++) {
        printf("   ");
        position += 1;
    }

    while (curDay <= numDays) {
        if (position % 7 == 0) {
            printf("\n");
        }
        printf("%2d ", curDay);
        curDay += 1;
        position += 1;
    }
}