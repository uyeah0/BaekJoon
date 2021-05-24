#include<iostream>
using namespace std;

int main(){
    int n[9];
    for(int i =0; i < 9; i++){
        cin >> n[i];
    }
    int max, maxCnt;
    max = n[0];
    maxCnt = 1;
    for(int i =1; i < 9; i++){
        if(max < n[i]){
            max = n[i];
            maxCnt = i+1;
        }
    }
    cout << max << endl;
    cout << maxCnt << endl;
    return 0;
}