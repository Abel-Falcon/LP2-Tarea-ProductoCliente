package pe.edu.upeu.producto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.producto.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{
	
}
