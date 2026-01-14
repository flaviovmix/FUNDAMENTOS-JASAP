package br.root.Interface;

public class PageTemplate {
    public static String meta(String titulo, String cssProjeto) {
        StringBuilder aux = new StringBuilder();
            aux.append("<!DOCTYPE html>\n");
            aux.append("<html lang=\"pt-br\">\n");
            aux.append("<head>\n");
            aux.append("<meta charset=\"utf-8\">\n");
            aux.append("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
            aux.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
            aux.append("<title>" + titulo + "</title>\n");
            aux.append(CssJasap.toHtml());
            aux.append(cssProjeto);
            aux.append("</head>\n");
            aux.append("<body>\n");
        return aux.toString();
    }
    
    public static String fimPagina(String jsProjeto) {
        StringBuilder aux = new StringBuilder();
            aux.append(JsJasap.toHtml());
            aux.append(jsProjeto);
            aux.append("</body>\n");
            aux.append("</html>\n");
        return aux.toString();
    }   
}