package br.root.home;

import br.jasap.core.Effect;
import br.jasap.core.JasapAct;
import br.jasap.effect.Response;
import br.root.Interface.Page;
import br.root.dashboard.page.CssDashboard;
import br.root.dashboard.page.DashboardTemplate;
import br.root.dashboard.page.JsDashboard;

public abstract class Dashboard extends JasapAct {

    public Dashboard() {
    }
    
    public static class Interface extends Dashboard {
        @Override
        public Effect execute() throws Exception {
            DashboardTemplate dashboard = new DashboardTemplate();
            Page pagina = new Page();
            pagina.setCss(CssDashboard.toHtml());
            pagina.setJs(JsDashboard.toHtml());
            getOutput().write(pagina.toHtml(dashboard.toHtml(), "Titulo da Página"));
            return new Response();
        }   
    }
    
}
