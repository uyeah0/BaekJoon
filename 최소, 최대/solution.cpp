#include<iostream>
using namespace std;

int main(){
    int len,min,max;
    cin >> len;
    int n[len];
    for(int i = 0; i < len; i++){
        cin >> n[i];
    }
    min = n[0];
    max = n[0];
    for(int i =1; i < len; i++){
        if(n[i] < min) min = n[i];
        else if(n[i] > max) max = n[i];
    }
    cout << min << " " << max;
    return 0;
}