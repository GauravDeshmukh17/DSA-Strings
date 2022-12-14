// PRINTING OF PALINDROM STRING

/*package com.company;
import java.util.*;

public class Main {

    public static boolean isPalindrom(String str){

        int left=0;
        int right=str.length()-1;

        while(left<right){

            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        String str=scn.next();

        for(int si=0;si<str.length();si++){
            for(int ei=si;ei<str.length();ei++){
                if(isPalindrom(str.substring(si,ei+1))){
                    System.out.println(str.substring(si,ei+1));
                }
            }
        }

    }
}*/

//------------------------------------------------------------------------------------------------------

// COMPRESS STRING

/*package com.company;

import java.util.Scanner;

public class Main{

    public static String compress1(String str){

        String comp1=""+str.charAt(0);
        for(int i=0;i<str.length();i++){
            if(comp1.charAt(comp1.length()-1)!=str.charAt(i)){
                comp1=comp1+str.charAt(i);
            }
        }
        return comp1;
    }

    public static String compress2(String str){

        String comp2=""+str.charAt(0);
        int count=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }
            else{
                if(count>1){
                    comp2=comp2+count+str.charAt(i);
                    count=1;
                }
                else{
                    comp2+=str.charAt(i);
                }
            }
        }

        if(count>1){
            comp2=comp2+count;
        }

        return comp2;
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        String str=scn.next();

        String c1=compress1(str);
        String c2=compress2(str);
        System.out.println(c1);
        System.out.println(c2);
    }

}*/

//------------------------------------------------------------------------------------------------------

// TCS TEST QUESTION

package com.company;

import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int d=scn.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=scn.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i]=scn.nextInt();
        }

        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j< arr1.length;j++){

                if((arr1[i]-arr1[j]<d && arr1[i]-arr1[j]>=0) || (arr1[j]-arr1[i]<d && arr1[j]-arr1[i]>=0)){
                    int sum=arr2[i]+arr2[j];
                    if(sum>max){
                        max=sum;
                    }
                }

            }
        }

        if(max==Integer.MIN_VALUE){
            for(int i=0;i<n;i++){
                if(max<arr2[i]){
                    max=arr2[i];
                }
            }
        }

        System.out.println(max);
    }
}
