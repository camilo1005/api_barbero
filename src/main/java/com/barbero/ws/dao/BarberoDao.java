package com.barbero.ws.dao;

import org.springframework.stereotype.Service;

import com.barbero.ws.utilidades.BarberosUtilidades;
import com.barbero.ws.vo.BarberoVo;

@Service
public class BarberoDao {
	
	private BarberoDao() {
		BarberosUtilidades.datosAlmacenados();

	}

	public BarberoVo consultarPersonaIndividual(String id) {
		BarberoVo barberoVo=null;
		for (BarberoVo b : BarberosUtilidades.listaBarberos){
			if (b.getId()==1) {
				barberoVo=new BarberoVo();
				barberoVo.setId(b.getId());	
				barberoVo.setEmail(b.getEmail());
				barberoVo.setPassword(b.getPassword());
				barberoVo.setCellphonebarber(b.getCellphonebarber());
				barberoVo.setTypeCount(b.getTypeCount());
				barberoVo.setAge(b.getAge());
				barberoVo.setNickname(b.getNickname());
				barberoVo.setLasname(b.getLasname());
				barberoVo.setNamebarber(b.getNamebarber());
				barberoVo.setDescription(b.getDescription());
				barberoVo.setCertificates(b.getCertificates());
				barberoVo.setDate_of_birth(b.getDate_of_birth());
				barberoVo.setGender(b.getGender());
				barberoVo.setQualification(b.getQualification());
				barberoVo.setCity(b.getCity());
				barberoVo.setLinked_barbershops(b.getLinked_barbershops());
			}
		}
		
		
		
		
		return barberoVo;
	}

	

	


}
