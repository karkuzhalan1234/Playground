#include<stdio.h>
int main()
{
	long int n,i,f=1;
  scanf("%ld",&n);
  for(i=1;i<=n;i++)
  {
    f*=i;
  }
  printf("%ld",f);
}