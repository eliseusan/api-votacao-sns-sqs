package academy.wakanda.wakacop.sessaovotacao.application.service;

import academy.wakanda.wakacop.sessaovotacao.application.api.*;

import java.util.UUID;

public interface SessaoVotacaoService {
    SessaoAberturaResponse abresessao(SessaoAberturaRequest sessaoAberturaRequest);

    VotoResponse recebeVoto(UUID idSessao, VotoRequest novoVoto);

    ResultadoSessaoResponse obtemResultado(UUID idSessao);
}
