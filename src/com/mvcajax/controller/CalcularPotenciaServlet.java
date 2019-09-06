package com.mvcajax.controller;
import com.mvcajax.model.ClaseCalcular;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author Estefany Reynoso
 *@version 1.0
 *@since 06 Agosto 2019
 *esta clase hace uso de la claseCalcula para calcular potencia
 */
@WebServlet("/CalcularPotenciaServlet")
public class CalcularPotenciaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * este metodo cacha el valor de la base y del exponente en el frontend
     * 
     * request @param Es el objeto de mi servlet
     *response @param   Es el objeto request de mi servlet
     * @return No genera ningun valor en el resultado porque crea la salida en el objeto response
     * @see response.getWriter.append()
     */
	
    public CalcularPotenciaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		double base= Double.parseDouble(request.getParameter("txtBase"));
		double expo= Double.parseDouble(request.getParameter("txtExpo"));
		double potencia= ClaseCalcular.resultCalculo(base, expo);
		
		response.getWriter( ).append("la potencia es"+potencia);
				
	}

}
