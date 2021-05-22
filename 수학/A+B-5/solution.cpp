#include><iostream>
using namespace std;

int main(){
    int a,b;
    for(;;){
        cin >> a;
        cin >> b;
        if(a == 0){
            break;
        } else {
            cout << a+b<<endl;
        }
    }
    return 0;
}
