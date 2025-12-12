package br.root;

import br.jasap.core.JasapRootManager; 
import br.root.app.home.HomeAction;
public class RootManager extends JasapRootManager {
    
    @Override
    public void config() throws Exception {
        regAction(HomeAction.Hello.class, "home.jsap");
    }
    
    @Override
    public void sessionConfig() {
    }

    @Override
    public void configGlobalFilters() throws Exception {
    }

}
