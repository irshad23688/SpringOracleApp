package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import com.met.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
}
