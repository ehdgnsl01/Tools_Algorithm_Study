## 🔗 문제 링크
[문제2438](https://www.acmicpc.net/problem/2557)


## ✨ 수도 코드

```
줄과 별이 될 i, j 선언

for (i는 0부터 5미만 까지) {
       for (j는 0부터 i까지)
              “*” 출력
       줄바꿈
      }
}
```


## 📚 전체 코드

```
#include <stdio.h>
void main() {
   int i, j;
   for (i=0; i<5; i++) {
          for (j=0; j<=i; j++)
                 printf("*");
          printf("\n");
   }
}
```

## 📚 새롭게 알게된 내용

이중for문을 알게되었다.
