/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serie1;

/**
 *
 * @author garya
 */
public class CodigoCesar {
    /**
     * Alfabetos a evaluar
     */
    String alfabetoMin="abcdefghijklmnñopqrstuvwxyz";
    String alfabetoMax="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
    /**
     * Cifra en base al alfabeto pueso arriba
     * @param frase
     * @param distancia
     * @return frase cifrada
     */
    public String cifrarCesar(String frase,int distancia){
        int tamaño=frase.length();
        String fraseRes="";
        char[] letras=new char[tamaño];
        for (int i = 0; i < tamaño; i++) {
            letras[i]=frase.charAt(i);
            for (int j = 0; j < alfabetoMin.length(); j++) {
                if(alfabetoMin.charAt(j)==letras[i]){
                    fraseRes+=alfabetoMin.charAt(j+distancia);
                }
                else if(alfabetoMax.charAt(j)==letras[i]){
                    fraseRes+=alfabetoMax.charAt(j+distancia);
                }
            }
        }
        return fraseRes;
    }
    /**
     * cifra en base al alfabeto que propone el usuario
     * @param frase
     * @param alfabeto
     * @param distancia
     * @return 
     */
    public String cifrarCesae(String frase, String alfabeto, int distancia){
                String fraseRes="";
        if(alfabeto.length()<frase.length()){
            System.out.println("El alfabeto debe ser mayor");
        }else{
           int tamaño=frase.length();
        char[] letras=new char[tamaño];
        for (int i = 0; i < tamaño; i++) {
            letras[i]=frase.charAt(i);
            for (int j = 0; j < alfabeto.length(); j++) {
                if(alfabeto.charAt(j)==letras[i]){
                    fraseRes+=alfabeto.charAt(j+distancia);
                }
            }
        } 
        }
         
        return fraseRes;
    }
}
