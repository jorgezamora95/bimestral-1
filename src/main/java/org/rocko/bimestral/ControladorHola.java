/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rocko.bimestral;

//crossOrigin para aplicaciones distribuidas (n-ramas)
import java.util.ArrayList;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin
public class ControladorHola {

    //1er parametro mapeo, segundo es el metodo, tercer parametro headers(formato de respuesta)
@RequestMapping(value="/hola/{mensaje}",method=RequestMethod.GET,headers={"Accept=application/vnd.ms-excel"})
public String saludar(@PathVariable String mensaje){
    String algo="bienvenido " + mensaje;
    return algo;
}
@RequestMapping(value="/usuario",method=RequestMethod.GET,headers={"Accept=application/json"})
    public ArrayList<Usuario> obtener(){
        
        Usuario u1= new Usuario("Rocko","r",26);
        Usuario u2= new Usuario("Leonidas","Leo",2);
        ArrayList<Usuario> usuarios = new ArrayList<>();
        
        usuarios.add (u1);
        usuarios.add(u2);
        return usuarios;
    }


}
