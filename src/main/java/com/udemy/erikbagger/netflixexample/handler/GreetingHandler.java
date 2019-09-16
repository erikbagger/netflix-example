package com.udemy.erikbagger.netflixexample.handler;

import org.springframework.stereotype.Component;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.springframework.web.reactive.function.BodyInserters;

import reactor.core.publisher.Mono;

@Component
public class GreetingHandler {

    public Mono<ServerResponse> hello(ServerRequest request) {
		return ServerResponse.ok()
        .contentType(MediaType.APPLICATION_JSON)
		.body(BodyInserters.fromObject("Hello world using Spring 5!"));
	}
}