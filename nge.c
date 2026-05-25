#include <stdio.h>
#include <stdlib.h>

struct stack{
    int *arr;
    int front;
    int size;
};

int isFull(struct stack *st){
    if(st->front == st->size - 1){
        return 1;
    }
    return 0;
}

int isEmpty(struct stack *st){
    if(st->front == -1){
        return 1;
    }
    return 0;
}

void push(struct stack *st , int element){
    //st->arr[++st->front] = element;
    if(!isFull(st)){
        st->arr[++st->front] = element;
    }else{
        printf("Stack overflow\n");
    }
}

int pop(struct stack *st){
    if(!isEmpty(st)){
        return st->arr[st->front--];
    }
    return -1;
}

int peek(struct stack *st){
    if(!isEmpty(st)){
        return st->arr[st->front];
    }
    return -1;
}

int nge(struct stack *st , int element){
    while(!isEmpty(st) && peek(st) <= element){
        pop(st);
    }
    if(isEmpty(st)){
        return -1;
    }
    return(peek(st));
}

int main(){
    int len ;
    printf("Enter the length of array : ");
    scanf("%d",&len);
    int element[len];

    struct stack *st = (struct stack*)malloc(sizeof(struct stack)) ;
    st->arr = (int*)malloc(len * sizeof(int));
    st->front = -1;
    st->size = len;

    printf("Enter the element : ");
    for(int i = 0; i < len; i++){
        scanf("%d",&element[i]);
    }

    //int nextGreater[len];

    //we use i = len - 1 instead of 0 because nge search the right to left and stack work on LIFO princple,So first valuse push in last.
    for(int i = len - 1; i >= 0; i--){
        //nextGreater[i] = nge(st , element[i]);
        push(st , element[i]);
    }

    // comment code for automatically find next greater element for all element.
/*
    for(int i = 0; i < len; i++){
        printf("%d  ->  %d\n",element[i],nextGreater[i]);
    }
*/

    int key;
    printf("Enter the key to find next greater element : ");
    scanf("%d",&key);

    printf("%d",nge(st, key));

    return 0;
}



//2 5 3 6 7 4 8 1
//1 8 4 7 6 3 5 2