#include <stdio.h>
int sum_array(const int a[], int size)
{
    int sum = 0;
    int *p;
    
    for (p = &a[0]; p < &a[size]; p++) {
        sum += *p;
    }
    return sum;
}

// To execute sum_array
int main(void) {
    int a[5] = {1,2,3,4,5};
    int res = sum_array(a, 5);
    printf("%d\n", res);
}