#include<stdio.h>
int isvowel(char c)
{
  if(c=='A'||c=='E'||c=='I'||c=='O'||c=='u'||
     c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
  {
    return 0;
  }
}
  int main()
  {
  
  
  char str[100],i;
  scanf("%[^\n]s", str);
  
  for(i=0;str[i]!='\0';i++)
  {
    if(isvowel(str[i]))
    {
      printf("%c",str[i]);
    }
  }
  
  return 0;
}