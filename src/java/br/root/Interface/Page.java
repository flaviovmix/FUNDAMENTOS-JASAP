package br.root.Interface;

public class Page {
    
    private String css;
    private String js;
    
    public String getCss() {
        return css;
    }

    public void setCss(String css) {
        this.css = css;
    }

    public String getJs() {
        return js;
    }

    public void setJs(String js) {
        this.js = js;
    }

    public String toHtml(String corpo, String titulo){
        StringBuilder aux = new StringBuilder();
        long r = System.currentTimeMillis();
        
            aux.append(PageTemplate.meta(titulo, getCss()));
            aux.append(corpo);
            aux.append(PageTemplate.fimPagina(getJs()));

        return aux.toString();
    }
    
}
