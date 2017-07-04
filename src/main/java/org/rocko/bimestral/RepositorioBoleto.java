/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rocko.bimestral;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.io.Serializable;
/**
 *
 * @author Sony
 */
@Repository
public interface RepositorioBoleto extends CrudRepository <Boleto,Long> {
    
}
