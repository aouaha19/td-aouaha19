package fr.dauphine.ja.aouamehafsa.td00;

import java.util.ArrayList;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class PrimeCollection 
{
	private ArrayList<Integer> numbers;
	
	public PrimeCollection(){
		numbers= new ArrayList();
	}
		
	public void initRandom(int n, int m){
		
		Random rand = new Random();
		int x=0;
		
		for(int i=0;i<n;i++){
			//Random rand = new Random(); ou ici si veut créer un nvl objet en memoire à chaque fois 
			x=rand.nextInt(m+1);
			if(x!=0) numbers.add(x);
	
		}
	}
		
	private boolean isPrime(int p){
		if(p==1) return false;
		for (int x=2;x<=Math.sqrt(p);x++){
			
			if(p%x==0) {
				
				return false;//il y a un div ou if(p%x == 0)
			}
		}
	return true;
	}
	
	public void printPrimes(){
		for( Integer i: numbers){
			
			if(isPrime(i)) {
				System.out.println(i+" est premier \n");
			}
		}
	}
}
