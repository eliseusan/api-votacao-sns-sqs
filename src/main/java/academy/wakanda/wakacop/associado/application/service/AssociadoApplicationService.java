package academy.wakanda.wakacop.associado.application.service;

import academy.wakanda.wakacop.associado.infra.client.ConsultaCpfResponse;
import academy.wakanda.wakacop.associado.infra.client.SerproClientFeign;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class AssociadoApplicationService implements AssociadoService {
    private final SerproClientFeign serproClientFeign;
    @Override
    public void validaAssociadoAptoVoto(String cpfAssociado) {
        log.info("[start] AssociadoApplicationService - validaAssociadoAptoVoto");
        ConsultaCpfResponse consultaCpfResponse = serproClientFeign.consultaCPF(cpfAssociado);
        valida(consultaCpfResponse);
        log.info("[finish] AssociadoApplicationService - validaAssociadoAptoVoto");
    }

    private void valida(ConsultaCpfResponse consultaCpfResponse) {
        if(consultaCpfResponse.isInvalid()){
            throw new RuntimeException("CPF do associado Inválido");
        }
    }
}
