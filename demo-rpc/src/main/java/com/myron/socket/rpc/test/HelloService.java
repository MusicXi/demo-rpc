package com.myron.socket.rpc.test;

public interface HelloService {
	String sayHi(String name);
	int plus(int x, int y);
	void makeError() throws Exception;
}
