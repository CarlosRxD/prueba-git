#include <stdio.h>
int main(int argc, char **argv)
{
    int i;
    int j;
    int x = 0;
    int n;
    scanf("%d", &n);
    while (x < n)
    {
        for (i = 1; i <= n; i++)
        {
            printf("%d", i);
        }
        printf("\n");
        x++;
        if (x == n)
        {
            break;
        }

        for (j = n; j >= 1; j--)
        {
            printf("%d", j);
        }
        x++;
        printf("\n");
        if (x == n)
        {
            break;
        }
    }
    return 0;
}