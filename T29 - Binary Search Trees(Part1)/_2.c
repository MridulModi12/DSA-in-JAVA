#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

typedef struct Node {
    int data;
    struct Node* left;
    struct Node* right;
}Node;

Node* createNode(int data) {
    Node* newNode = (Node*)malloc(sizeof(Node));
    newNode->data = data;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

Node* insert(Node *root, int data) {
    if(root == NULL) {
        root = createNode(data);
        return root;
    }
    if(data < root->data) {
        root->left = insert(root->left, data);
    } else {
        root->right = insert(root->right, data);
    }
    return root;
}

bool search(Node* root, int key) {
    if(root == NULL) {
        return false;
    }
    if(root->data == key) {
        return true;
    }
    if(key < root->data) {
        return search(root->left, key);
    } else {
        return search(root->right, key);
    }
}

int main() {
    int values[] = {5, 1, 3, 4, 2, 7};
    Node* root = NULL;
    int n = sizeof(values) / sizeof(values[0]);
    for(int i = 0; i < n; i++) {
        root = insert(root, values[i]);
    }
    if(search(root, 14)) {
        printf("found");
    } else {
        printf("not found");
    }
}