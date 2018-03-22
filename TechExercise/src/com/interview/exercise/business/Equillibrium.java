package com.interview.exercise.business;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//O(n2) approach
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
		int i,j;
		//
		for ( i=0;i<size;i++){
			int sumLeft=0;		
			int sumRight=0;
			for( j=0;j<i;j++){	
				sumLeft+=data[j]; 
			}
			for( j=i+1;j<size;j++){
				sumRight+=data[j];
			}
			if(sumLeft==sumRight){	//Equillibrium Condition
				return i;
			}
		}
		return 1;
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
