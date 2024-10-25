package pe.edu.upeu.producto.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.producto.dao.ClienteDao;
import pe.edu.upeu.producto.entity.Cliente;
import pe.edu.upeu.producto.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{
	@Autowired
	private ClienteDao clienteDao;
	@Override
	public Cliente create(Cliente c) {
		// TODO Auto-generated method stub
		return clienteDao.create(c);
	}

	@Override
	public Cliente update(Cliente c) {
		// TODO Auto-generated method stub
		return clienteDao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		clienteDao.delete(id);
	}

	@Override
	public Optional<Cliente> read(Long id) {
		// TODO Auto-generated method stub
		return clienteDao.read(id);
	}

	@Override
	public List<Cliente> readAll() {
		// TODO Auto-generated method stub
		return clienteDao.readAll();
	}

}
