package com.consumer.api.bean;

import com.consumer.api.response.EnderecoResponse;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;

@Component("enderecoBean")
@Scope("request")
public class EnderecoBean {

    private EnderecoResponse endereco;

    @PostConstruct
    public void init() {
        endereco = new EnderecoResponse();
        endereco.setCep("88104-200");
        endereco.setLogradouro("Rua Assis Brasil");
        endereco.setComplemento("");
        endereco.setUnidade("");
        endereco.setBairro("Ponta de Baixo");
        endereco.setLocalidade("São José");
        endereco.setUf("SC");
        endereco.setEstado("Santa Catarina");
        endereco.setRegiao("Sul");
        endereco.setIbge("4216602");
        endereco.setGia("");
        endereco.setDdd("48");
        endereco.setSiafi("8327");
    }

    public EnderecoResponse getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoResponse endereco) {
        this.endereco = endereco;
    }
}