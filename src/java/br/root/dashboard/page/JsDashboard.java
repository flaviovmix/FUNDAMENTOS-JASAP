package br.root.dashboard.page;

import br.root.AppConfig;

public class JsDashboard {

    public static String toHtml() {
        
        StringBuilder aux = new StringBuilder();
        String r = AppConfig.assetVersion();
        
        aux.append("<script src=\"./assets/js/menu-usuario.js?r="+r+"\"></script>\n");
        aux.append("<script src=\"./assets/js/sidebar.js?r="+r+"\"></script>\n");      
        
        return aux.toString();
    }
    
}