#include <stdio.h>

int main() {
    
    int pp = 5;
    int qq = 7;
    int rr = 10;
    pp = rr + rr;
    for(int i = 2; i < 3; i++){
        qq = 2 ^ rr;
    }
    pp = (rr + 12) + qq;
    int c = pp + qq;
    printf("%d",c);
    return 0;
}
