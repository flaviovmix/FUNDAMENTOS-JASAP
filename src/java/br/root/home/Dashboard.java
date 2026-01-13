package br.root.home;

import br.jasap.core.Effect;
import br.jasap.core.JasapAct;
import br.jasap.effect.Response;
import br.root.Page;
import br.root.dashboard.layout.Layout;

public abstract class Dashboard extends JasapAct {

    public Dashboard() {
    }
    
    public static class Interface extends Dashboard {
        @Override
        public Effect execute() throws Exception {
            Layout layout = new Layout();
            Page pagina = new Page();
            getOutput().write( pagina.toHtml(layout.toHtml()));
            return new Response();
        }   
    }
    
}
