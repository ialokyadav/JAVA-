#include <stdio.h>
/*
int factorial(int x){
    if(x == 1 || x == 0){
        return 1;
    }
    return x * factorial(x-1);
}
int main(){
    int x;
    scanf("%d",&x);
    printf("Factorial of %d : %d",x,factorial(x));
    return 0;
}
    */

int main(){
    int x;
    int fact = 1;
    scanf("%d",&x);
    if(x == 0 || x == 1){
        fact = 1;
    }else{
        for(int i = x; i > 0; i--){
            fact *= i;
        }
    }
    //printf("Factorial of %d : %d",x,factorial(x));
    printf("Factorial of %d : %d",x , fact);
    return 0;
}