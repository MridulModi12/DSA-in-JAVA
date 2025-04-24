#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

typedef struct Node {
    int data;
    int priority;
    struct Node* next;
}Node;

Node *createNode(int data, int priority) {
    Node* newNode = (Node*)malloc(sizeof(Node));
    newNode->data = data;
    newNode->priority = priority;
    newNode->next = NULL;
    return newNode;
}

Node* enqueue(Node* head, int data, int priority) {
    
    Node* newNode = createNode(data, priority);
    if(head == NULL || head->priority > priority) {
        newNode->next = head;
        head = newNode;
    } else {
        Node* start = head;
        while(start->next != NULL && start->next->priority <= priority) {
            start = start->next;
        }
        newNode->next = start->next;
        start->next = newNode;
    }
    return head;
}

bool isEmpty(Node* head) {
    return head == NULL;
}

Node* dequeue(Node* head) {
    if(isEmpty(head)) {
        printf("The queue is empty.\n");
        return NULL;
    }
    Node* temp = head;
    head = head->next;
    free(temp);
    return head;
}

int peek(Node* head) {
    if(isEmpty(head)) {
        printf("The queue is empty.\n");
        return -1;
    }
    return head->data;
}

void display(Node* head) {
    if(isEmpty(head)) {
        printf("The queue is empty.\n");
        return;
    }
    Node* temp = head;
    while(temp != NULL) {
        printf("Data: %d, Priority: %d\n", temp->data, temp->priority);
        temp = temp->next;
    }
}

int main() {
    Node* pq = NULL;
    int choice, data, priority;

    printf("\nPriority Queue Menu:\n");
    printf("1. Insert an element\n");
    printf("2. Remove the highest priority element\n");
    printf("3. Display the queue\n");
    printf("4. Peek at the highest priority element\n");
    printf("5. Exit\n");

    while (1) {
        printf("Enter your choice: ");
        scanf(" %d", &choice);

        switch (choice) {
            case 1:
                printf("Enter the data: ");
                scanf(" %d", &data);
                printf("Enter the priority: ");
                scanf(" %d", &priority);
                pq = enqueue(pq, data, priority);
                break;
            case 2:
                pq = dequeue(pq);
                break;
            case 3:
                display(pq);
                break;
            case 4:
                if(isEmpty(pq)) {
                    printf("The queue is empty.\n");
                } else {
                    printf("Element with highest priority: %d\n", peek(pq));
                }
                break;
            case 5:
                exit(0);
            default:
                printf("Invalid choice. Please try again.\n");
        }
    }

    return 0;
}