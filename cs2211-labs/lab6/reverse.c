# Lab 6

## Part 1 - Modify Reverse.c

- Used SIZE definition inside of a macro to loop SIZE times, scanning for array input and reversing it

```c
/* Reverses a series of numbers */
 
#include <stdio.h>
 
#define N 10
#define SIZE ((int) (sizeof(a) / sizeof(a[0])))
 
int main(void)
{
  int a[N], i;
 
  printf("Enter %d numbers: ", SIZE);
  for (i = 0; i < SIZE; i++)
    scanf("%d", &a[i]);
 
  printf("In reverse order:");
  for (i = SIZE - 1; i >= 0; i--)
    printf(" %d", a[i]);
  printf("\n");
 
  return 0;
}
```

![Screen Shot 2022-10-16 at 10.08.54 AM.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/824fa58f-1720-4924-a66d-315ea7f4332f/Screen_Shot_2022-10-16_at_10.08.54_AM.png)

## Part 2 - Day of the Year Function

- Returns day of the year given a month, day, and year, handling cases of leap years. Used switch case for each month because it was the simplest way to approach it.

```c
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
```

![Screen Shot 2022-10-16 at 10.08.10 AM.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6a626233-e23f-4d63-9ba0-30a3081d468a/Screen_Shot_2022-10-16_at_10.08.10_AM.png)