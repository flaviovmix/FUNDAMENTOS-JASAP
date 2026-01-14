package br.root.dashboard.layout;

public class JsDashboard {

    public static String toHtml() {
        StringBuilder aux = new StringBuilder();
        long r = System.currentTimeMillis();
        
        aux.append("<script src=\"./assets/js/menu-usuario.js?r="+r+"\"></script>\n");
        aux.append("<script src=\"./assets/js/sidebar.js?r="+r+"\"></script>\n");      
        
        return aux.toString();
    }
    
}
