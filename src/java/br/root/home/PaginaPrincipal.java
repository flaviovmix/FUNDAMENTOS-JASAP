package br.root.home;

import br.jasap.core.Effect;
import br.jasap.core.JasapAct;
import br.jasap.effect.Response;
import br.root.Page;

public abstract class PaginaPrincipal extends JasapAct {

    public PaginaPrincipal() {
        
    }
    
    public static class OlaMundo extends PaginaPrincipal {
        @Override
        public Effect execute() throws Exception {
            Page pagina = new Page();
            getOutput().write( pagina.toHtml("Olá Mundo"));
            return new Response();
        }   
    }
    
}
