package itau.api.ApiJava.medico;

import itau.api.ApiJava.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaotroMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
