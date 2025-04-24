#include<stdio.h>
#include<stdlib.h>

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

Node* insert(Node *root, int value) {
    if(root == NULL) {
        root = createNode(value);
        return root;
    }
    if(value < root->data) {
        root->left = insert(root->left, value);
    } else {
        root->right = insert(root->right, value);
    }
    return root;
}

void inorder(Node* root) {
    if(root == NULL) {
        return;
    }
    inorder(root->left);
    printf("%d ", root->data);
    inorder(root->right);
}

int main() {
    int values[] = {5, 1, 3, 2, 4, 7};
    int n = sizeof(values) / sizeof(values[0]);
    Node* root = NULL;
    for(int i = 0; i < n; i++) {
        root = insert(root, values[i]);
    }
    inorder(root);
}