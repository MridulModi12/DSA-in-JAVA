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

Node* findInorderSuccessor(Node* root) {
    while(root->left != NULL) {
        root = root->left;
    }
    return root;
}

Node* delete(Node* root, int data) {
    if(data < root->data) {
        root->left = delete(root->left, data);
    } else if(data > root->data) {
        root->right = delete(root->right, data);
    }
    else { //viola
        //case 1
        if(root->left == NULL && root->right == NULL) {
            return NULL;
        }
        //case 2
        if(root->left == NULL) {
            return root->right;
        } else if(root->right == NULL) {
            return root->left;
        }
        //case 3
        else {
            Node* IS = findInorderSuccessor(root->right);
            root->data = IS->data;
            root->right = delete(root, IS->data);
        }
    }
    return root;
}

int main() {
    int values[] = {5, 1, 3, 2, 4, 7};
    int n = sizeof(values) / sizeof(values[0]);
    Node* root = NULL;
    for(int i = 0; i < n; i++) {
        root = insert(root, values[i]);
    }
    inorder(root);
    printf("\n");

    root = delete(root, 2);
    inorder(root);
}