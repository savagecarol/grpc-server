package com.server.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class ServerApplication
{
	public static void main(String[] args)
	{
		System.out.println("rest server : localhost : 8080");
		System.out.println("grpc server : localhost : 9090");
		SpringApplication.run(ServerApplication.class, args);
	}



//		new Thread(new Runnable() {
//			public void run() {
//				System.out.println("grpc server : localhost : 9090");
//				Server server = ServerBuilder
//						.forPort(9090)
//						.addService(new MyServiceImpl()).build();
//				try {
//					server.start();
//					server.awaitTermination();
//				}
//				catch (Exception e)
//				{
//					System.out.println(e);
//				}
//			}
//		}).start();
//




//		new Thread(new Runnable() {
//			public void run() {
//				System.out.println("rest server : localhost : 8080");
//				SpringApplication.run(ServerApplication.class, args);
//			}
//		}).start();

}
