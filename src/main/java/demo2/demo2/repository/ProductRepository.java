package demo2.demo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import demo2.demo2.entity.product;
import java.util.List;

public interface ProductRepository extends JpaRepository<product,Long> {
	List<product> findByItem(String item);
}
