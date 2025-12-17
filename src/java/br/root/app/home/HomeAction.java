package br.root.app.home;

import br.jasap.core.Effect;
import br.jasap.core.JasapAct;
import br.jasap.effect.Response;
import br.root.Page;

public abstract class HomeAction extends JasapAct {
    
    public HomeAction() {
        
    }

    public static class Hello extends HomeAction{

        @Override
        public Effect execute() throws Exception {
            
            Page pagina = new Page();
            
            StringBuilder aux = new StringBuilder();
            
            aux.append("<main>\n");
                aux.append("<div class=\"menu\">\n");

                    aux.append("<div>\n");

                        aux.append("<a href=\""+ link(metodo.class).getURL() +"\">link</a>\n");
                        aux.append("<a href=\""+ link(metodo.class).getURL() +"\">eval</a>\n");
                        aux.append("<a href=\""+ link(metodo.class).getURL() +"\">submit</a>\n");
                        aux.append("<a href=\""+ link(metodo.class).getURL() +"\">update</a>\n");
                    aux.append("</div>\n");

                    aux.append("<div>\n");
                        aux.append("<input type=\"text\" placeholder=\"Input 1\">\n");
                        aux.append("<input type=\"text\" placeholder=\"Input 2\">\n");
                        aux.append("<a href=\"#\">submit</a>\n");
                    aux.append("</div>\n");

                aux.append("</div>\n");
            
                aux.append("<div class=\"fundo-azul\">\n");
                    aux.append("<span id=\"area-azul\"></span>\n");
                aux.append("</div>\n");
                aux.append("<div class=\"fundo-verde\">\n");
                    aux.append("<span id=\"cronometro\">00:00</span>\n");
                aux.append("</div>\n");
            
            aux.append("</main>\n");
            aux.append("<script src=\"assets/cronometro.js\"></script>\n");

            
            getOutput().write( pagina.toHtml(aux.toString()));
            return new Response();
        }
    }
    
    public static class metodo extends HomeAction {
        @Override
        public Effect execute() throws Exception {
            
            return new Response();
        }
    }
    
}
