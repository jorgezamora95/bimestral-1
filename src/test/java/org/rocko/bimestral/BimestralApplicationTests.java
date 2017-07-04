package org.rocko.bimestral;


import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
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
    RepositorioSalaCine repoSalaCine;
    RepositorioTarjeta repoTarjeta;
    RepositorioBoleto repoBoleto;
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
       
       //@Test
       public void borrar () throws Exception{
           repoDireccion.delete(1L);
           assertNull(repoDireccion.findOne(1L));
       }
       
       
       //repositorio tarjeta
       
       //@Test
       public void probarInsertTarjeta() throws Exception{
           
           Tarjeta tarjeta=repoTarjeta.save(new Tarjeta("credito", 1000F,new Date()));
           assertEquals(new Long(1L),tarjeta.getIdTarjeta());
           
       }
       
       //@Test
       public void probarBuscarIdTarjeta() throws Exception{
           Tarjeta tarjeta=repoTarjeta.findOne(1L);
                   assertEquals("credito",tarjeta.getTipo());
       }
       
       //@Test
       public void probarBuscarTodosTarjeta() throws Exception{
           ArrayList<Tarjeta> Tarjeta=(ArrayList< Tarjeta>) repoTarjeta.findAll();
           assertEquals(1, Tarjeta.size());
       }
       
      // @Test
       public void probarActualizarTarjeta() throws Exception{
          Tarjeta tarjeta=repoTarjeta.save(new Tarjeta(1L,"credito",1000F,new Date()));
          assertEquals("debito",tarjeta.getTipo());
       }
       
       //@Test
       public void borrarTarjeta () throws Exception{
           repoTarjeta.delete(1L);
           assertNull(repoTarjeta.findOne(1L));
       }
       
       //// repositorio salacine
       
        //@Test
       public void probarInsertSalaCine() throws Exception{
           
           SalaCine salaCine=repoSalaCine.save(new SalaCine("batman", "clasificacion b", 50));
           assertEquals(new Long(1L),salaCine.getIdSala());
           
       }
       
       //@Test
       public void probarBuscarporIdSalaCine() throws Exception{
           SalaCine salaCine=repoSalaCine.findOne(1L);
                   assertEquals("batman",salaCine.getTituloPelicula());
       }
       
       //@Test
       public void probarBuscarTodosSalaCine() throws Exception{
           ArrayList<SalaCine> salaCine=(ArrayList< SalaCine>) repoSalaCine.findAll();
           assertEquals(1, salaCine.size());
       }
       
      // @Test
       public void probarActualizarSalaCine() throws Exception{
          SalaCine salaCine=repoSalaCine.save(new SalaCine(1L,"superman","clasificacion a",70));
          assertEquals("batman",salaCine.getTituloPelicula());
       }
       
       //@Test
       public void borrarSalaCine () throws Exception{
           repoSalaCine.delete(1L);
           assertNull(repoSalaCine.findOne(1L));
       }
       
       //// repositorio boleto
       
        //@Test
       public void probarInsertBoleto() throws Exception{
           
           Boleto boleto=repoBoleto.save(new Boleto(1L, 50F));
           assertEquals(new Long(1L),boleto.getIdBoleto());
           
       }
       
       //@Test
       public void probarBuscarporIdBoleto() throws Exception{
           Boleto boleto=repoBoleto.findOne(1L);
                   assertEquals(50F,boleto.getCostoBoleto());
       }
       
       //@Test
       public void probarBuscarTodosBoleto() throws Exception{
           ArrayList<Boleto> boleto=(ArrayList< Boleto>) repoBoleto.findAll();
           assertEquals(1, boleto.size());
       }
       
      // @Test
       public void probarActualizarBoleto() throws Exception{
          Boleto boleto=repoBoleto.save(new Boleto(1L,2L,70F));
          assertEquals(1L,boleto.getIdBoleto());
       }
       
       //@Test
       public void borrarBoleto () throws Exception{
           repoBoleto.delete(1L);
           assertNull(repoBoleto.findOne(1L));
       }
        
       
}
