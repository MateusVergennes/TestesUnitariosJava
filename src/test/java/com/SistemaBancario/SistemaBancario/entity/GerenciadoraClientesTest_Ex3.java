package com.SistemaBancario.SistemaBancario.entity;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;

public class GerenciadoraClientesTest_Ex3 {

	private GerenciadoraClientes gerClientes;

	@Test
	public void testPesquisaCliente() {

		/* ========== Montagem do cen�rio ========== */
		
		// criando alguns clientes
		Cliente cliente01 = new Cliente(1, "Gustavo Farias", 31, "gugafarias@gmail.com", 1, true);
		Cliente cliente02 = new Cliente(2, "Felipe Augusto", 34, "felipeaugusto@gmail.com", 1, true);
		
		// inserindo os clientes criados na lista de clientes do banco
		List<Cliente> clientesDoBanco = new ArrayList<>();
		clientesDoBanco.add(cliente01);
		clientesDoBanco.add(cliente02);
		
		gerClientes = new GerenciadoraClientes(clientesDoBanco);

		/* ========== Execu��o ========== */
		Cliente cliente = gerClientes.pesquisaCliente(1);
		
		/* ========== Verifica��es ========== */
		assertThat(cliente.getId(), is(1));
		
	}
	
	@Test
	public void testRemoveCliente() {

		/* ========== Montagem do cen�rio ========== */
		
		// criando alguns clientes
		Cliente cliente01 = new Cliente(1, "Gustavo Farias", 31, "gugafarias@gmail.com", 1, true);
		Cliente cliente02 = new Cliente(2, "Felipe Augusto", 34, "felipeaugusto@gmail.com", 1, true);
		
		// inserindo os clientes criados na lista de clientes do banco
		List<Cliente> clientesDoBanco = new ArrayList<>();
		clientesDoBanco.add(cliente01);
		clientesDoBanco.add(cliente02);
		
		gerClientes = new GerenciadoraClientes(clientesDoBanco);
		
		/* ========== Execu��o ========== */
		boolean clienteRemovido = gerClientes.removeCliente(2);
		
		/* ========== Verifica��es ========== */
		assertThat(clienteRemovido, is(true));
		assertThat(gerClientes.getClientesDoBanco().size(), is(1));
		assertNull(gerClientes.pesquisaCliente(2));
		
	}
	
}
