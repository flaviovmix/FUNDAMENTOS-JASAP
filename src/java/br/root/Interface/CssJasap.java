package br.root.Interface;

public class CssJasap {
    
    public static String toHtml() {
        StringBuilder aux = new StringBuilder();
        
        aux.append("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
        aux.append("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css\">\n");
        aux.append("<link rel=\"stylesheet\" href=\"https://code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css\">\n");
        
        return aux.toString();
    }
    
}
