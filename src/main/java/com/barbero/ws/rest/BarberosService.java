package com.barbero.ws.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.barbero.ws.dao.BarberoDao;
import com.barbero.ws.vo.BarberoVo;




@RestController
@RequestMapping("/servicio")
public class BarberosService {
	
	@Autowired(required=true)
	private BarberoDao barberoDao;
	
	@GetMapping("hola")
	public String saludo() {
	    return"holi!!!";
	}
	
	
	// http:// localhost:8080/servicio/barbero
	@GetMapping("barbero")
	public ResponseEntity<BarberoVo>getBarbero(
	            @RequestParam(value="id",defaultValue="0")String id){
		
		BarberoVo Barbero=barberoDao.consultarPersonaIndividual(id);
		if(Barbero == null){
			Barbero=new BarberoVo();
		}
		return ResponseEntity.ok(Barbero);
		
	}
	
	// http:// localhost:8080/servicio/barbero?id=1
	
	


}
