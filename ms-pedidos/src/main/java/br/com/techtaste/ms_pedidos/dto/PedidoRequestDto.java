package br.com.techtaste.ms_pedidos.dto;

import br.com.techtaste.ms_pedidos.model.ItemPedido;

import java.util.List;

// Ao cadastrar um novo pedido (request) só preciso informar o cpf e os itens do pedido
public record PedidoRequestDto(String cpf, List<ItemPedido> itens) {
}
