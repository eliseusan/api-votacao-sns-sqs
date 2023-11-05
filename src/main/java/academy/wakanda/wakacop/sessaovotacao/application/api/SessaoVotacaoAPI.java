package academy.wakanda.wakacop.sessaovotacao.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sessaovotacao")
public interface SessaoVotacaoAPI {
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    SessaoAberturaResponse abreSessao(@RequestBody SessaoAberturaRequest sessaoAberturaRequest);
}
