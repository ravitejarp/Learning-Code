package com.ravi.job;

public class GpsSpeed {
    
    public static int gps(int s, double[] x) {
        double small=(x[1]-x[0])*(3600/s);
        System.out.println(small);
        for(int i=0;i<x.length-1;i++){
        	System.out.println((x[i+1]-x[i])*(3600/s));
        if((x[i+1]-x[i])*(3600/s)>small)
          small=(x[i+1]-x[i])*(3600/s);        
        }
    System.out.println("=================");
    return (int) Math.floor(small);
    }
    
}