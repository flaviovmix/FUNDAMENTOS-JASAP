package br.root.dashboard.layout;

public class DashboardLayout {
    
    private final Header header = new Header();
    private final BarraLateral barraLateral = new BarraLateral();
    private final Conteudo conteudo = new Conteudo();
    private final Footer footer = new Footer();
        
    public String toHtml() throws Exception {
        
        StringBuilder aux = new StringBuilder();

        aux.append("<div id=\"header\">\n");
        aux.append(header.toHtml());
        aux.append("</div>\n");

        aux.append("<div class=\"layout\">\n");
        
            aux.append("<div id=\"barra-lateral\">\n");
            aux.append(barraLateral.toHtml());
            aux.append("</div>\n");
            
            aux.append("<main class=\"main-content\" id=\"main\" >\n");
            aux.append(conteudo.toHtml());
            aux.append("</main>\n");
            
            aux.append("<div id=\"footer\">\n");
            aux.append(footer.toHtml());
            aux.append("</div>\n");
            
        aux.append(" </div>\n");
        
        return aux.toString();
    } 
    
}