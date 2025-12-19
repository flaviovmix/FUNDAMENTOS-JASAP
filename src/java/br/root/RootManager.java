package br.root;

import br.jasap.core.JasapRootManager; 
import br.root.app.home.HomeAction;
public class RootManager extends JasapRootManager {
    
    @Override
    public void config() throws Exception {
        regAction(HomeAction.Hello.class, "home.jsap");
        regAction(HomeAction.update.class);
        regAction(HomeAction.updateParametro.class);
        regAction(HomeAction.alteracaocomEval.class);
    }
    
    @Override
    public void sessionConfig() {
    }

    @Override
    public void configGlobalFilters() throws Exception {
    }

}