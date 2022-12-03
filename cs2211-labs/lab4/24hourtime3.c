#include <stdio.h>
#include <stdlib.h>

int main(void) {
    int status = 1;
    while (status) {
        int hour, minute;
        // Read 24-hour time
        printf("Enter a 24-hour time: ");
        scanf("%d:%d", &hour, &minute);

        // Display 12-hour time [commented out]
        /*
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
        */

        // Create arrays for comparisons to time since midnight
        int timesSinceMidnight[8] = {480, 583, 679, 767, 840, 945, 1140, 1305};
        char* departures[8] = {
            "8:00 a.m.", "9:43 a.m.", "11:19a.m.", "12:47 p.m.",
            "2:00 p.m.", "3:45 p.m.", "7:00 p.m.", "9:45 p.m."
        };
        char* arrivals[8] = {
            "10:16 a.m.", "11:52 a.m.", "1:31 p.m.", "3:00 p.m.",
            "4:08 p.m.", "5:55 p.m.", "9:20 p.m.", "11:58 p.m."
        };

        int index = 0;
        int timeSince = (hour * 60) + minute;
        int timeDiff = 24 * 60;
        int goodIndex;

        while (timeDiff > abs(timesSinceMidnight[index] - timeSince)) {
            timeDiff = abs(timesSinceMidnight[index] - timeSince);
            goodIndex = index;
            index += 1;
        }

        printf("Closest departure time is %s, arriving at %s\n", departures[goodIndex], arrivals[goodIndex]);
        printf("Enter 1 to continue or 0 to quit: ");
        scanf("%d", &status);
    }
}