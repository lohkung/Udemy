package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	    Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();
        
        Bird s = new Bird("test") {
			
			@Override
			public void fly() {
				// TODO Auto-generated method stub
				
			}
		};
		s.breathe();
		s.eat();

        Parrot parrot = new Parrot("Australian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
