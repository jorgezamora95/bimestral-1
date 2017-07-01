/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rocko.bimestral;

import org.springframework.stereotype.Repository;
import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author T-
 */
@Repository
public interface RepositorioTarjeta extends CrudRepository<Tarjeta, Long> {
    
}
