package br.root;

public class Page {
    
    public String toHtml(String corpo){
        StringBuilder aux = new StringBuilder();
        long r = System.currentTimeMillis();

        aux.append("<!DOCTYPE html>\n");
        aux.append("<html lang=\"pt-br\">\n");
        aux.append("<head>\n");
        aux.append("<meta charset=\"utf-8\">\n");
        aux.append("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
        aux.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
        aux.append("<title>Aula1</title>\n");

        // 1) CSS de terceiros
        aux.append("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
        aux.append("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css\">\n");
        aux.append("<link rel=\"stylesheet\" href=\"https://code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css\">\n");
        
        // 1) CSS do projeto
        aux.append("<link rel=\"stylesheet\" href=\"./assets/css/index-claro.css?r="+r+"\">\n");
        aux.append("<link rel=\"stylesheet\" href=\"./assets/css/normalize.css?r="+r+"\">\n");
        aux.append("<link rel=\"stylesheet\" href=\"./assets/css/sidebar.css?r="+r+"\">\n");
        aux.append("<link rel=\"stylesheet\" href=\"./assets/css/dashboard.css?r="+r+"\">\n");
        aux.append("<link rel=\"stylesheet\" href=\"./assets/css/contatos.css?r="+r+"\">\n");
        
        aux.append("</head>\n");

        aux.append("<body>\n");
        
        aux.append(corpo);

        // 1) jQuery
        aux.append("<script src=\"res/vendors/jquery/jquery-3.6.0.min.js\"></script>\n");
        aux.append("<script src=\"res/vendors/jquery/jquery-ui.min.js\"></script>\n");
        aux.append("<script src=\"res/scripts/jquery/jquery-ui-ptBr.js\"></script>\n");

        // 2) Bootstrap
        aux.append("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\"></script>\n");

        // 3) Scripts Jasap
        aux.append("<script src=\"res/js/XTLib.js?r="+r+"\"></script>\n");
        aux.append("<script src=\"res/js/XTLibJqueryV1.js?r="+r+"\"></script>\n");
        aux.append("<script src=\"res/js/jasapJquery.js?r="+r+"\"></script>\n");
        aux.append("<script src=\"res/js/validate.js?r="+r+"\"></script>\n");
        aux.append("<script src=\"res/vendors/sweetalert/sweetalert.js?r="+r+"\"></script>\n");

        // 3) Scripts Projeto        
        aux.append("<script src=\"./assets/js/menu-usuario.js?r="+r+"\"></script>\n");
        aux.append("<script src=\"./assets/js/sidebar.js?r="+r+"\"></script>\n");

        aux.append("</body>\n");
        aux.append("</html>\n");

        return aux.toString();
    }

    
}
