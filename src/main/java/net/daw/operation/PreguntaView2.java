/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.operation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.daw.helper.Contexto;

/**
 *
 * @author rafa
 */
public class PreguntaView2 implements Operation {

    @Override
    public Object execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Contexto oContexto = (Contexto) request.getAttribute("contexto");
        oContexto.setVista("jsp/pregunta/list.jsp");
        oContexto.setClase("pregunta");
        oContexto.setMetodo("list");
        oContexto.setFase("1");
        PreguntaList1 oOperacion = new PreguntaList1();
        return oOperacion.execute(request, response);
    }
}
