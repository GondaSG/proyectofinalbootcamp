package com.sistemabancario.product.clients;
import com.sistemabancario.product.clients.model.Cliente;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class ClientsImpl implements IClients {
    @Override
    public Flux<Cliente> getClientByTipNum(String tipo, String doc) {
        WebClient webClient = WebClient.create("http://localhost:8084");
        Cliente client = new Cliente();
        client.setTipoDocumento(tipo);
        client.setNumeroDocumento(doc);

        Flux<Cliente> cliente = webClient.post()
                .uri("/cliente/getClientByDocument/")
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .body(Mono.just(client), Cliente.class)
                .retrieve()
                .bodyToFlux(Cliente.class);
        System.out.println("cliente : " + cliente.toString());

        return cliente;
    }
}
