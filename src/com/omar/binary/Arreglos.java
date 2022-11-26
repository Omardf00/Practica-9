package com.omar.binary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arreglos {
	
	public static Integer[] generarArray(Integer n, Integer range) {
		Integer[] array = new Integer[n];
		
		for(Integer i = 0; i<array.length; i++) {
			array[i]=(int)(Math.random()*range+1);
		}
		
		return array;
	}
	
	public static List<Integer> impirmirArray(Integer[] array) {
		List<Integer> lista = new ArrayList<>();

		for(Integer i: array) {
			lista.add(array[i]);
		}
		
		return lista;
		
	}
	
	public static boolean comprobarArray(Integer[] array, int x) {
		Arrays.sort(array);
		int size = array.length;
		int middle = size/2;
		    
		if (array[middle] == x) {
		  return true;
		}
		else if (size == 1) {
		    return false;
		}
		else if (array[middle] > x) {
			return comprobarArray(Arrays.copyOfRange(array,0,middle),x);
		}
		else {
			return comprobarArray(Arrays.copyOfRange(array,middle+1,size),x);
		}
	}

}
