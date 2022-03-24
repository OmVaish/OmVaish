#include<iostream>
#include<cmath>
using namespace std;
int main(){
    
    string operation ;
    cout<<"**********************************************************************************"<<endl;
    cout<<"                        HELLO ! MYSELF OM . "<<endl<<endl ;
    cout <<" THIS IS A SIMPLE CALCULATOR FOR DOING OPERATIONS ON TWO NUMBERS ONLY "<<endl;
    cout<<"NOTE : YOU CAN WRITE SUM , DIFFERENCE , PRODUCT , QUOTIENT , POWER  and  REMAINDER  . "<<endl;
    cout<<"IF YOU WANT TO KNOW SQUARE ROOT THEN YOU CAN SIMPLY WRITE SQRT "<<endl ;
    cout<<"**********************************************************************************"<<endl;
    cout<<"WHICH OPERATION DO YOU WANT TO DO ? "<<endl;
    cout<<"YOUR ANSWER : "<<endl;
    cin>>operation ;
    float num1,num2;
    int x , y ;
    
    if (operation =="sum"|| operation == "Sum"||operation == " SUM "){
        cout<<"NUM1 : "<<endl ;
        cin>> num1  ;
        cout<<"NUM2 : "<<endl ;
        cin>> num2  ;
        cout<<"SUM IS : "<<num1 + num2 <<endl<<endl;
    }
    else

    if (operation == "difference"||operation == "Difference"||operation == "DIFFERENCE"){
        cout<<"NUM1 : "<<endl ;
        cin>> num1  ;
        cout<<"NUM2 : "<<endl ;
        cin>> num2  ;
        cout<<"DIFFERENCE IS : "<<  num1 - num2 <<endl<<endl ;
    }
    else 
    
    if (operation == "SQRT"||operation == "Sqrt"||operation == "sqrt"){
        cout<<"NUM : "<<endl ;
        cin>>num1 ;
        cout<<"SQUARE ROOT IS : "<<sqrt(num1)<<endl<<endl;
    }
    else

    if (operation == "POWER"||operation == "power"||operation == "Power"){
        cout<<"NUM : "<<endl;
        cin>>num1;
       cout<<"RAISED UPTO WHICH POWER(natural number) : "<<endl;
       cin>>x;
       cout<<"ANSWER IS "<<pow(num1,x)<<endl;
    }
    else

     if (operation == "product"||operation == "Product"||operation == "PRODUCT"){
        cout<<"NUM1 : "<<endl ;
        cin>> num1  ;
        cout<<"NUM2 : "<<endl ;
        cin>> num2  ;
        cout<<"PRODUCT IS : "<< num1*num2 <<endl<<endl ; 
    }
    else
             
    if (operation == "quotient"||operation == "Quotient"||operation == "QUOTIENT"){
        cout<<"NUM1 : "<<endl ;
        cin>> num1  ;
        cout<<"NUM2 : "<<endl ;
        cin>> num2  ;
        cout<<"QUOTIENT IS : "<< num1/num2 <<endl<<endl ;
    }
    else 
              
    if (operation == "remainder"||operation == "Remainder"||operation == "REMAINDER"){
        cout<<"NUM1 : "<<endl ;
        cin>>num1;
        cout<<"NUM2 : "<<endl ;
        cin>>num2 ;
        cout<<"REMAINDER (int) IS : "<<num1 - num2 *int(num1/num2) <<endl <<endl;
    }
    else
        cout<<"PLEASE CHECK NOTE AND TRY AGAIN "<< endl ;
    
    
    cout<<"THANK YOU :)" ;
    return 0;
}

