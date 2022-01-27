package com.micronaut;

import com.micronaut.symbol.Symbol;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.json.tree.JsonNode;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import jakarta.inject.Inject;

import java.util.stream.Stream;

@MicronautTest
class SymbolControllerTest {

    @Inject
    @Client("/symbol")
    HttpClient httpClient;

    @Test
    void works() {
        var response = httpClient.toBlocking().exchange("/", JsonNode.class);
    }

    void test(){
        var symbols = Stream.of("AAPL","MSFT", "GOOGL").map(Symbol::new).toList();
    }

}
