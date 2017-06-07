package org.rocko.bimestral;


import java.sql.Statement;
import java.util.ArrayList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BimestralApplicationTests {

    @Autowired
    RepositorioDireccion repoDireccion;
	@Test
	public void contextLoads() {
	}

       @Test
       public void probarSuma() throws Exception{
           int suma=2+2;
           assertEquals(4, suma);
       }
       
       //@Test
       public void probarInsertDireccion() throws Exception{
           
           Direccion dir=repoDireccion.save(new Direccion(777, "calle 13", 55130L, "Ecatepec"));
           assertEquals(new Long(1L),dir.getId());
           
       }
       
       //@Test
       public void probarBuscarporId() throws Exception{
           Direccion dir=repoDireccion.findOne(1L);
                   assertEquals("Ecatepec",dir.getMunicipio());
       }
       
       //@Test
       public void probarBuscarTodos() throws Exception{
           ArrayList<Direccion> dir=(ArrayList< Direccion>) repoDireccion.findAll();
           assertEquals(1, dir.size());
       }
       
      // @Test
       public void probarActualizar() throws Exception{
          Direccion dir=repoDireccion.save(new Direccion(1l,1,"rod",55155L,"Morelos"));
          assertEquals("rod",dir.getCalle());
       }
       
       @Test
       public void borrar () throws Exception{
           repoDireccion.delete(1L);
           assertNull(repoDireccion.findOne(1L));
       }
}
