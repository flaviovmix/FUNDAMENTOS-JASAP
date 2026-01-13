package br.root;

import br.jasap.core.JasapRootManager;
import br.root.home.Dashboard;
public class RootManager extends JasapRootManager {
    
    @Override
    public void config() throws Exception {
        regAction(Dashboard.Interface.class, "home.jsap");
    }
    
    @Override
    public void sessionConfig() {
    }

    @Override
    public void configGlobalFilters() throws Exception {
    }

}