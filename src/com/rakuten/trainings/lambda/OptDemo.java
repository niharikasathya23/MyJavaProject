package com.rakuten.trainings.lambda;

import java.util.Optional;

public class OptDemo {
	
	public static Optional<String> getMessage(int msgid){
		String[] mesg= {"hi","hello","how"};
		if(msgid<mesg.length) {
			return Optional.of(mesg[msgid]);
			
		}else {
			return Optional.empty();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m=getMessage(3).orElse("nothing");
		System.out.println(m.toUpperCase());

	}

}
