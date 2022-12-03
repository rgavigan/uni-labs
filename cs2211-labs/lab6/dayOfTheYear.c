#include <stdio.h>

int day_of_year(int month, int day, int year) {
    // Return in format MM/DD/YYYY
    
    // Handle February
    int febDays;
    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
        febDays = 29;
    }
    else {
        febDays = 28;
    }

    // Get day within month
    int result = day;

    // Find number of days in previous months in the year
    switch (month) 
    {
        case 1:
            break;
        case 2:
            result += 31;
            break;
        case 3:
            result += (31 + febDays);
            break;
        case 4:
            result += ((2*31) + febDays);
            break;
        case 5:
            result += ((2*31) + (1*30) + febDays);
            break;
        case 6:
            result += ((3*31) + (1*30) + febDays);
            break;
        case 7:
            result += ((3*31) + (2*30) + febDays);
            break;
        case 8:
            result += ((4*31) + (2*30) + febDays);
            break;
        case 9:
            result += ((5*31) + (2*30) + febDays);
            break;
        case 10:
            result += ((5*31) + (3*30) + febDays);
            break;
        case 11:
            result += ((6*31) + (3*30) + febDays);
            break;
        case 12:
            result += ((6*31) + (4*30) + febDays);
            break;
    }   
    return result;
}

int main(void) {
    int month, day, year;
    printf("Please provide a month, day, and year (integer format)\n");
    scanf("%d %d %d", &month, &day, &year);
    int res = day_of_year(month, day, year);
    printf("It is day number %d\n", res);
}