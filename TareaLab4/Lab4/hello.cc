// Simple Hello World
 
#include <iostream>
 int devolverRes(int ref[10], int num){
     for(int x=1;x<10;x++){
         ref[x]=x*num;
         std::cout << ref[x] << std::endl;
     }
 }
 int sumaArreglo(int ara[],int num){
     int res=0;
     for(int x=0;x<num;x++){

         res=res+ara[x];
     }
     std::cout << "Resultado Suma"<< std::endl;
              std::cout << res<< std::endl;
 }
  int mostrarArreglo(int ara[],int num){
     for(int x=0;x<num;x++){

       std::cout <<ara[x]<< std::endl;
     }
 }
 int sumaArregloPar(int ara[],int num){
     int res=0;
     for(int x=0;x<num;x+=2){

         res=res+ara[x];
     }
     std::cout << "Resultado Pares"<< std::endl;
              std::cout << res<< std::endl;
 }
 int sumaArregloImpar(int ara[],int num){
     int res=0;
     for(int x=1;x<num;x+=2){
         res=res+ara[x];
     }
     std::cout << "Resultado Impares"<< std::endl;
              std::cout << res<< std::endl;
 }
 int ordenar(int ara[],int num){
     int orden[num];
     int temp;
        for (int i=1; i<num; i++){
            for (int j=0 ; j<num - 1; j++){
                 if (ara[j] > ara[j+1]){
                      temp = ara[j];
                    ara[j] = ara[j+1];
                    ara[j+1] = temp;
                 }
               
            }
          
             std::cout <<ara[i]<< std::endl;  
        }
         
       
     }
 
 
int main()
{
    int resultados[10];
  std::cout << "Hello World!" << std::endl;
  devolverRes(resultados,5);
  int n=6;
  int suma[n];
     for(int i=0;i<n;i++){
                 suma[i]=2+i; 
     }
sumaArreglo(suma,n);
std::cout << "Mostrando Arreglo" << std::endl;
mostrarArreglo(suma,n);
std::cout << "Longitud del arreglo" << std::endl;
std::cout << n<< std::endl;
sumaArregloPar(suma,n);
sumaArregloImpar(suma,n);
  std::cout <<"Ordenado"<< std::endl;  
ordenar(suma,n);
  return 0;
}