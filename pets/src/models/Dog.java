package com.codingdojo.pets.src.models;

public class Dog extends Animal {

	public Dog(String name, String breed, double weight) {
		super(name, breed, weight);
	}
	public String showAffection() {
		if(this.weight<30) {
			return this.name+" hopped into your lap and cuddled you.";
		} else {
			return this.name+" curled up next to you";
		}
	}
}