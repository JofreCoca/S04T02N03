package cat.itacademy.s04.t02.n03.repository;

import cat.itacademy.s04.t02.n03.model.Fruita;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface FruitaRepository extends MongoRepository<Fruita, Integer> {}
