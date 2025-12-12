package br.root.app.home;

import br.jasap.core.Effect;
import br.jasap.core.JasapAct;
import br.jasap.effect.Response;

public abstract class HomeAction extends JasapAct {
    
    public HomeAction() {
        
    }

    public static class Hello extends HomeAction{

        @Override
        public Effect execute() throws Exception {
            System.out.println("mensagem no console");
            getInput().printParameters();
            getOutput().write("OLÁ MUNDO! <br> <a href=\"index.html\" >voltar</a>");
            return new Response();
        }
    }
    
}
