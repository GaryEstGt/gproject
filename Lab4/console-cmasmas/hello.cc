// Simple Hello World
 
#include <iostream>
int sumar(int,int);
int restar(int,int);
int multiplicar(int,int);
int dividir(int,int);
void sumapuntero(int,int,int*);
void restapuntero(int,int,int*);
void multiplicacionpuntero(int,int,int*);
void divisionpuntero(int,int,int*);

int main()
{
   int resultado;
   resultado=sumar(2,7) ;
  std::cout << "Programación Avanzada Gary Moran Primero por Valor" << std::endl;
  std::cout << resultado << std::endl;
  std::cout << restar(12,7) << std::endl;
  std::cout << multiplicar(2,7) << std::endl;
  std::cout << dividir(49,7) << std::endl;
  std::cout << "Por Referencia" << std::endl;
  sumapuntero(111,220,&resultado);
   std::cout << resultado << std::endl;
    restapuntero(1111,220,&resultado);
   std::cout << resultado << std::endl;
    multiplicacionpuntero(10,8,&resultado);
   std::cout << resultado << std::endl;
    divisionpuntero(111,11,&resultado);
   std::cout << resultado << std::endl;
  return 0;
}
int sumar(int a, int b){
   return a+b; 
}
int restar(int a, int b){
   return a-b; 
}
int multiplicar(int a, int b){
   return a*b; 
}
int dividir(int a, int b){
   return a/b; 
}
void sumapuntero(int a,int b, int* foo){
    *foo=a+b;
}
void restapuntero(int a,int b, int* foo){
    *foo=a-b;
}
void multiplicacionpuntero(int a,int b, int* foo){
    *foo=a*b;
}
void divisionpuntero(int a,int b, int* foo){
    *foo=a/b;
}
