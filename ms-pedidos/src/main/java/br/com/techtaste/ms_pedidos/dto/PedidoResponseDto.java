package br.com.techtaste.ms_pedidos.dto;

import br.com.techtaste.ms_pedidos.model.ItemPedido;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public record PedidoResponseDto(
        UUID id,
        br.com.techtaste.ms_pedidos.model.Status status,
        String cpf,
        List<ItemPedido> itens,
        BigDecimal valorTotal,
        LocalDate data) {
}
