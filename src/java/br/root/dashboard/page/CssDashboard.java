package br.root.dashboard.page;

import br.root.AppConfig;

public class CssDashboard {

    public static String toHtml() {
        
        String r = AppConfig.assetVersion();
        StringBuilder aux = new StringBuilder();
        aux.append("<link rel=\"stylesheet\" href=\"./assets/css/index-claro.css?v="+r+"\">\n");
        aux.append("<link rel=\"stylesheet\" href=\"./assets/css/normalize.css?v="+r+"\">\n");
        aux.append("<link rel=\"stylesheet\" href=\"./assets/css/sidebar.css?v="+r+"\">\n");    
        aux.append("<link rel=\"stylesheet\" href=\"./assets/css/dashboard.css?v="+r+"\">\n");
        aux.append("<link rel=\"stylesheet\" href=\"./assets/css/contatos.css?v="+r+"\">\n");        
        return aux.toString();
    }
}