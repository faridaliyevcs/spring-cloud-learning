package com.faridaliyev.microservices.filter;

import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
import org.slf4j.Logger;

@Component
public class LogginFilter implements GlobalFilter {

    private Logger logger = LoggerFactory.getLogger(LogginFilter.class);

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        logger.info("Path of the request recieved:" + exchange.getRequest().getPath());

        return chain.filter(exchange);
    }
}
