package com.flora.java8;

public class Man extends Father implements Filial,Spoony{
	public void help() {
		System.out.println("我该救谁呢");
	}

}
class Father{
	public void help() {
		System.out.println("help my wife");
	}
}
interface Filial {// 孝顺的 
	default void help() { 
		System.out.println("老妈，我来救你了"); 
		} 
	} 

interface Spoony {// 痴情的 
	default void help() {
		System.out.println("媳妇，别怕，我来了"); 
		} 
	}

