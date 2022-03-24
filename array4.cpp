#include<iostream>
using namespace std;

int main(){
    int m, n , o , p ;

    cout<<"ENTER NUMBER OF ROWS AND COLUMNS OF FIRST MATRIX : ";
    cin>>m>>n;
    int one[m][n];
    cout<<"ENTER M*N ELEMENTS OF FIRST MATRIX : "<<endl;
    for(int i = 0 ; i<m ; i++)
    {
        for(int j = 0 ; j<n ; j++)
        {
            cin>>one[i][j];
        }
    }

    cout<<"ENTER NUMBER OF ROWS AND COLUMNS OF SECOND MATRIX : ";
    cin>>o>>p;

    if(n != o)
    {
        cerr<<"***ERROR***"<<endl<<"FOR MULTIPLICATION OF MATRIX , NUMBER OF COLUMNS OF FIRST MATRIX MUST BE EQUAL TO NUMBER OF ROWS ODF SECOND MATRIX "<<endl;
    }
    else
    {
        cout<<"ENTER O*P ELEMENTS OF SECOND MATRIX : "<<endl;
        int two[o][p];
    
    for(int i = 0 ; i<o ; i++)
    {
        for(int j = 0 ; j<p ; j++)
        {
            cin>>two[i][j];
        }
    }

    int product[m][p];
    
    cout<<"SO PRODUCT OF TWO MATRIX IS : "<<endl;
    
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < p; j++) {
            product[i][j] = 0;
 
            for (int k = 0; k < o; k++) {
                product[i][j] += one[i][k] * two[k][j];
            }
 
            cout << product[i][j] << " ";
        }
 
        cout << endl;
    }
    }
    return 0;
}