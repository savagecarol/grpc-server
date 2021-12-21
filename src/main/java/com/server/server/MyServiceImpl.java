package com.server.server;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.examples.lib.HelloReply;
import net.devh.boot.grpc.examples.lib.HelloRequest;
import net.devh.boot.grpc.examples.lib.MyServiceGrpc;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.web.bind.annotation.*;



@GrpcService
@RestController
public class MyServiceImpl extends MyServiceGrpc.MyServiceImplBase {
    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {

        long startTime = System.nanoTime();

        HelloReply reply = HelloReply.newBuilder()
                .setMessage("Hello " + request.getName())
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();


        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime / 1000000);

    }

    @GetMapping("{name}")
    public String sayRestHello(@PathVariable String name)
    {
        return "Hello " + name;
    }
}
