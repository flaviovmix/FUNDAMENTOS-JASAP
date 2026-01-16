package br.root.dashboard.page;

public class CssDashboard {

    public static String toHtml() {
        StringBuilder aux = new StringBuilder();
        long r = System.currentTimeMillis();
        
            aux.append("<link rel=\"stylesheet\" href=\"./assets/css/index-claro.css?r="+r+"\">\n");
            aux.append("<link rel=\"stylesheet\" href=\"./assets/css/normalize.css?r="+r+"\">\n");
            aux.append("<link rel=\"stylesheet\" href=\"./assets/css/sidebar.css?r="+r+"\">\n");    
            aux.append("<link rel=\"stylesheet\" href=\"./assets/css/dashboard.css?r="+r+"\">\n");
            aux.append("<link rel=\"stylesheet\" href=\"./assets/css/contatos.css?r="+r+"\">\n");        
        
        return aux.toString();
    }
    
}