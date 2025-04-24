#include<stdio.h>

void printArr(int arr[], int n) {
    for(int i = 0; i < n; i++) {
        printf("%d", arr[i]);
        if(i < n-1) {
            printf(", ");
        }
    }
}

void heapify(int arr[], int n, int i) {  //to convert to max heap
    int c1 = 2*i + 1;
    int c2 = 2*i + 2;
    int maxIdx = i;
    if(c1 < n && arr[c1] > arr[maxIdx]) {
        maxIdx = c1;
    }
    if(c2 < n && arr[c2] > arr[maxIdx]) {
        maxIdx = c2;
    }
    if(maxIdx != i) {
        int temp = arr[maxIdx];
        arr[maxIdx] = arr[i];
        arr[i] = temp;
        heapify(arr, n, maxIdx);
    }
}

void heapSort(int arr[], int n) {
    //convert to max heap to sort in ascending order
    //heapify the non leaf nodes 
    for(int i = n/2; i >= 0; i--) {
        heapify(arr, n, i);  //heapify takes root as a param, here i is the root
    }
    //push largest at end
    for(int i = n-1; i >= 0; i--) {
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;
        heapify(arr, i, 0);  
    }
}

int main() {
    int arr[] = {1, 2, 4, 5, 3};
    int size = sizeof(arr)/sizeof(arr[0]);
    heapSort(arr, size);
    printArr(arr, size);
    return 0;
}