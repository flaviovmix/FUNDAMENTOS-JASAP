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
            aux.append("OLÁ MUNDO!");
            aux.append("<br>");
            aux.append("<a href=\"" + link(sobre.class).getURL() + "\" >sobre | </a>");
            aux.append("<a href=\"index.html\" >voltar pra home</a>");
            
            System.out.println("mensagem no console");
            getInput().printParameters();
            getOutput().write( pagina.toHtml(aux.toString()));
            return new Response();
        }
    }
    
    public static class sobre extends HomeAction {
        @Override
        public Effect execute() throws Exception {
            
            StringBuilder aux = new StringBuilder();
            aux.append("pagina sobre!");
            aux.append("<br>");
            aux.append("<a href=\"index.html\" >voltar pra home | </a>");
            aux.append("<a href=\"" + link(Hello.class).getURL() + "\" >voltar</a>");
            
            System.out.println("passou na pagina sobre");
            getOutput().write(aux.toString());
            return new Response();
        }
    }
    
}
