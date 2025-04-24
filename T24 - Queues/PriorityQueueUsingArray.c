#include<stdio.h>
#include<stdlib.h>

#define MAX 100

typedef struct {
    int data;
    int priority;
}Element;

Element pq[MAX];
int size = 0;
int i;

void enqueue(int data, int priority) {
    if (size == MAX) {
        printf("\nQueue overflow\n");
        return;
    }
    for(i = size-1; i >= 0 && pq[i].priority > priority; i--) {
        pq[i+1] = pq[i];
    }
    i = i + 1;
    pq[i].data = data;
    pq[i].priority = priority;
    size++;
}

int dequeue() {
    if(size == 0) {
        printf("\nQueue underflow\n");
        return -1;
    }
    int data = pq[0].data;
    for(int i = 0; i < size-1; i++) {
        pq[i] = pq[i+1];
    }
    size--;
    return data;
}

int peek() {
    if(size == 0) {
        printf("\nQueue is empty\n");
        return -1;
    }
    return pq[0].data;
}

void display() {
    if(size == 0) {
        printf("\nQueue is empty\n");
        return;
    }
    printf("Queue elements (data, priority):\n");
    for (int i = 0; i < size; i++) {
        printf("(%d, %d) ", pq[i].data, pq[i].priority);
    }
    printf("\n");
}

int main() {
    int option, val;
    int data, priority;

    do {
        printf("\n****MAIN MENU****");
        printf("\n 1. Insert an element");
        printf("\n 2. Delete an element");
        printf("\n 3. PEEK");
        printf("\n 4. Display the queue");
        printf("\n 5. EXIT");
        printf("\n Enter your option: ");
        scanf("%d", &option);

        switch (option) {
            case 1:        
                printf("Enter the data to be inserted: ");
                scanf("%d", &data);
                printf("Enter its priority: ");
                scanf("%d", &priority);
                enqueue(data, priority);
                break;
            case 2:
                val = dequeue();
                if (val != -1)
                    printf("\nThe deleted element from queue is: %d\n", val);
                break;
            case 3:
                val = peek();
                if (val != -1)
                    printf("\nThe first value in queue is: %d\n", val);
                break;
            case 4:
                display();
                break;
        }
    } while (option != 5);

    return 0;
}