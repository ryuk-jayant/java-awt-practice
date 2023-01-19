#include<stdio.h>
#define size 5//can choose size of stack hear
struct stack{
   int a[size],my_front;
}s;
// Push operation....
void push(){
    int item;
    printf("Enter item to be pushed:  ");
            scanf("%d", &item);
        s.a[++s.my_front] = item;

}
// Pop operation....
int pop(){
    return s.a[s.my_front--];
}
// Display operation....
void display(){
    int i;
    printf("\nThe stack contains: ");
    for(i = s.my_front; i>=0; i--){
        printf("\n%d", s.a[i]);
    }
}
// Peep operation....
void peep(){
    printf("\n\tmy_front : %d", s.my_front);
    printf("\n\tValue at top : %d",s.a[s.my_front]);
}
void change(int row, int new_element){
    int i;
    s.a[row-1]=new_element;
    for(i = s.my_front; i>=0; i--){
        printf("\n%d", s.a[i]);
    }
    
}
int main(){
    s.my_front = -1;//indicates null
    int item, choice, row, new_element;
    do{
        printf("\n     1. Push\n     2. Pop\n     3. Display\n     4. Peep\n     5. Change\n     6. Exit\n");
        printf("\n  Enter your choice: ");
        scanf("%d", &choice);
        switch(choice){
        case 1:
            if(s.my_front >= size-1){
                 printf("Stack overflow..\n");
                 break;
            }
             push();
            break;
        case 2:
            if(s.my_front == -1){
                printf("....Stack underflow..\n");
                break;
            }
            pop();
            break;
        case 3:
            display();
            break;
        case 4:
            peep();
            break;
        case 5:
            printf("\n\tEnter row no : ");
            scanf("%d",&row);
            printf("\n\tEnter new element: ");
            scanf("%d", &new_element);
            change(row, new_element );
            break;
        case 6:
            return 0;
        }
    }while(choice != 6);
    return 0;
}