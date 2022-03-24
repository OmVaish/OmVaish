#include <iostream>

using namespace std;

void compute_factors(int num)
{
    int i=1;
    while(i<=num)
    {
        if(num%i==0)
        {
            cout<<i<<" ";
        }
        i++;
    }
    return;
}

bool prime(int numb){
    for (int i = 2; i<=numb/2; i++){
        if (numb%i==0) return false;
    }
    return true;
}

void compute_prime_factors(int num)
{
    int i=2;
    while(i<=num)
    {
        if(num%i==0)
        {
            if (prime(i)) cout<<i<<" ";
        }
        i++;
    }
    return;
    
}



int main()
{
    int num;
    cout<<"Enter a number: ";
    cin>>num;
    cout<<"\n";
    cout<<"Factors are: " ;
    compute_factors(num);
    cout<<endl;
    cout<<"Prime Factors are: " ;
    compute_prime_factors(num);

    return 0;
}