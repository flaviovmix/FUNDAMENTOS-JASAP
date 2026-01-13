package br.root;

import br.jasap.core.JasapRootManager;
import br.root.home.PaginaPrincipal;
public class RootManager extends JasapRootManager {
    
    @Override
    public void config() throws Exception {
        regAction(PaginaPrincipal.OlaMundo.class, "home.jsap");
    }
    
    @Override
    public void sessionConfig() {
    }

    @Override
    public void configGlobalFilters() throws Exception {
    }

}