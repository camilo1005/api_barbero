package com.barbero.ws.utilidades;

import java.util.ArrayList;
import java.util.List;

import com.barbero.ws.vo.BarberoVo;

public class BarberosUtilidades {
	
	public final static int barbero=1;
	static int barber=0;
	
	public static List<BarberoVo> listaBarberos=new ArrayList<BarberoVo>();
	
	public static void datosAlmacenados() {
		if (barber==0) {
			listaBarberos.add(new BarberoVo(1, "camiloser2004@gmail.com", "1234", (long) 2, barbero, 18, "el camilo", "andres camilo", 
					"barberchop", "hola", "no hay", "18 de febrero", "M", "5", "armenia PT", 2));
		}
	}
	
	

}
