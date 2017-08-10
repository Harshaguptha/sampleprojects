package com.syncoms.exception;

public class Input {
public void wrongInput() throws WrongInputException{
	throw new WrongInputException("Wrong input");
}
}
