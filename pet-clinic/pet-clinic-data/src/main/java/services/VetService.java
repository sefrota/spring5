package services;

import model.Vet;

import java.util.Set;

/**
 * Created by sergioletras on 09/02/19.
 */
public interface VetService {

    Vet findById(Long id);

    Set<Vet> findAll();

    Vet save(Vet vet);
}
