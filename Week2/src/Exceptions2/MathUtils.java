/*
 * Nama : Kayis Shalahuddin
 * NIM : 191524047
 * Pertemuan : Week-
 */
package Exceptions2;

/**
 *
 * @author Kayis
 */
// **************************************************************** 
// MathUtils.java 
// 
// Provides static mathematical utility functions. 
// 
// **************************************************************** 
public class MathUtils 
{
    //------------------------------------------------------------- 
    // Returns the factorial of the argument given 
    //------------------------------------------------------------- 
    public static int factorial(int n) 
    { 
        int fac = 1; 
        for (int i=n; i>0; i--) 
            fac *= i; 
        return fac; 
    } 
}
