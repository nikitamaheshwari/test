package com.interview.exercise.business.optimizedsolution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//O(n) approach
public class Equillibrium {

	private int size; //Size of array
	private int[] data; //Array Name
	
	public Equillibrium(int[] data, int size) //Parameterised Constructor
	{
		this.data = data;
		this.size = size;
	}
	
	//Method to get Equillibrium Point in Account Transaction 
	public int getEquibiriumPoint(){ 
		int i;
		int sumofdata=0;
		int sumLeft=0;
		//Sum of all the elements in array 'data'
		for ( i=0;i<size;i++)
			sumofdata+=data[i];
			
		for( i=0;i<size;i++){	
				sumofdata-=data[i]; //sum = sum of elements at Left
			if(sumLeft==sumofdata)	//Equillibrium Condition(When Credit = debit)
				return i;
			
			sumLeft+=data[i]; //Add the element to Sum of left. 
		}
		return -1;
	}
	
	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int[] data = new int[size];
		String[] input = br.readLine().split(" ");
		for(int i =0;i<input.length;i++)
			data[i]= Integer.parseInt(input[i]);
		
		Equillibrium eq = new Equillibrium(data, size);
		int result = eq.getEquibiriumPoint();
		System.out.println("result "+result);
	}
}