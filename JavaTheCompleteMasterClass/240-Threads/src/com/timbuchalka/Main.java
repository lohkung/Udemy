package com.timbuchalka;

import static com.timbuchalka.ThreadColor.ANSI_GREEN;
import static com.timbuchalka.ThreadColor.ANSI_PURPLE;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE+"Hello from the main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();
  
        
//        new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				
//			}
//		});
//
//        new Thread() {
//            public void run() {
//                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
//            }
//        }.start();

        System.out.println(ANSI_PURPLE+"Hello again from the main thread.");


    }
}
