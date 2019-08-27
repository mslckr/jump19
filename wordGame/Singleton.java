package com.collabora.wordGame;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {

	private static Singleton firstInstance = null;
	
	//Not going to implement that entire array of letters...
	String[] remLetters = {"a","a","a","d","e","e","e","e","g","i",
			"i","i","l","n","n","o","o","o","r","r","s","t","t","u"};
	
	private LinkedList<String> letterList = new LinkedList<String>
	(Arrays.asList(remLetters));
	
	static boolean firstThread =true;
	
	private Singleton() { }
	
	public static Singleton getInstance() {
		
		if(firstInstance == null) {
			
			if(firstThread) {
				
				firstThread = false;
				
				Thread.currentThread();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			synchronized(Singleton.class) {
				
				if(firstInstance==null) {
					firstInstance = new Singleton();
					
					Collections.shuffle(firstInstance.letterList);
				}
			}
			
			firstInstance = new Singleton();
			
			Collections.shuffle(firstInstance.letterList);
		}
		
		return firstInstance;
		
		
	}
	
	public LinkedList<String> getLetterList(){
		return firstInstance.letterList;
	}
	
	public LinkedList<String> getTiles(int howManyTiles){
		LinkedList<String> tilesToSend = new LinkedList<String>();
		
		for(int i = 0; i <= howManyTiles;i++) {
			
			tilesToSend.add(firstInstance.letterList.remove(0));
		}
		
		return tilesToSend;
	}

}
