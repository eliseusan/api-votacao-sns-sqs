package academy.wakanda.wakacop.pauta.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pauta")
public interface PautaAPI {
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public PautaCadastraResponse cadastraPauta(@RequestBody NovaPautaRequest novaPauta);
}
