package pe.edu.upeu.producto.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.producto.dao.ProductoDao;
import pe.edu.upeu.producto.entity.Producto;
import pe.edu.upeu.producto.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService{
	@Autowired
	private ProductoDao productoDao;
	@Override
	public Producto create(Producto p) {
		// TODO Auto-generated method stub
		return productoDao.create(p);
	}

	@Override
	public Producto update(Producto p) {
		// TODO Auto-generated method stub
		return productoDao.update(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		productoDao.delete(id);
	}

	@Override
	public Optional<Producto> read(Long id) {
		// TODO Auto-generated method stub
		return productoDao.read(id);
	}

	@Override
	public List<Producto> readAll() {
		// TODO Auto-generated method stub
		return productoDao.readAll();
	}
	
	

}
