package br.edu.up.sistemadevendas.service;

import java.util.List;

import br.edu.up.sistemadevendas.dao.Dao;
import br.edu.up.sistemadevendas.dao.FactoryDao;
import br.edu.up.sistemadevendas.entity.Cliente;

public class ClienteService {

	public void salvar(Cliente cliente) throws ServiceException {

		if (cliente.getIdade() == null || cliente.getIdade() < 18) {
			throw new ServiceException("A idade deve ser maior que 18");
		}

		Dao<Cliente> clienteDao = FactoryDao.createClienteDao();
		clienteDao.salvar(cliente);
		
	}

	public Cliente buscar(Integer i) {
		Dao<Cliente> clienteDao = FactoryDao.createClienteDao();
		return clienteDao.buscar(i);
	}

	public void alterar(Cliente cliente)  throws ServiceException {
		Dao<Cliente> clienteDao = FactoryDao.createClienteDao();
		clienteDao.alterar(cliente);		
	}

	public List<Cliente> listar() {
		Dao<Cliente> clienteDao = FactoryDao.createClienteDao();
		return clienteDao.listar();
	}

}
