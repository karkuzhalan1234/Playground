#include<stdio.h>
int main()
{
  int dia;
  float r,a;
  scanf("%d",&dia);
  r=(float)dia/2;
  a=3.14*r*r;
  printf("%0.2f",a);
  return 0;
}