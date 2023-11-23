package academy.wakanda.wakacop.associado.infra.client;

public interface SerproClientFeign {
    ConsultaCpfResponse consultaCPF(String cpfAssociado);
}
