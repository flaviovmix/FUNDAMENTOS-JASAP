package br.root;

import java.util.Date;

public class Page {
    
    public String toHtml(String corpo){
        StringBuilder aux = new StringBuilder();
        
        Date atual = new Date();
        Long l = atual.getTime();
        
        aux.append("<!DOCTYPE html>\n");
        aux.append("<html lang=\"pt-br\">\n");
        aux.append("<head>\n");
        aux.append("	<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
        aux.append("	<meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\n");
        aux.append("\t<link rel=\"stylesheet\" href=\"assets/style.css\">\n");

        aux.append("	<title>Aula1</title>\n");
        aux.append("</head>\n");
        
        aux.append("<script src=\"res/vendors/jquery/jquery-3.6.0.min.js\" type=\"text/javascript\"></script>\n");
        aux.append("<script src=\"res/vendors/jquery/jquery-ui.min.js\" type=\"text/javascript\"></script>\n");
        aux.append("<script src=\"res/scripts/jquery/jquery-ui-ptBr.js\" type=\"text/javascript\"></script>\n");

        aux.append("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
        aux.append("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css\">\n");
        aux.append("<link rel=\"stylesheet\" href=\"https://code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css\">\n");
        
        aux.append("<script src=\"res/js/XTLib.js\" type=\"text/javascript\"></script>\n");
        aux.append("<script src=\"res/js/XTLibJqueryV1.js\" type=\"text/javascript\"></script>\n");
        aux.append("<script src=\"res/js/jasapJquery.js\" type=\"text/javascript\"></script>\n");
            
        aux.append("<body>\n");
        aux.append(corpo);

        aux.append("<script src=\"res/vendors/jquery/jquery-3.6.0.min.js\" type=\"text/javascript\"></script>\n");
        aux.append("<script src=\"res/vendors/jquery/jquery-ui.min.js\" type=\"text/javascript\"></script>\n");
        aux.append("<script src=\"res/js/XTLib.js?r="+l+"\" type=\"text/javascript\"></script>\n");
        aux.append("<script src=\"res/js/XTLibJqueryV1.js?r="+l+"\" type=\"text/javascript\"></script>\n");
        aux.append("<script src=\"res/js/jasapJquery.js?r="+l+"\" type=\"text/javascript\"></script>\n");
        aux.append("<script src=\"res/js/validate.js?r="+l+"\" type=\"text/javascript\"></script>\n");
        aux.append("<script src=\"res/vendors/sweetalert/sweetalert.js?r="+l+"\" type=\"text/javascript\"></script>\n");

        aux.append("<script ");
            aux.append("src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\" ");
            aux.append("integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\" ");
            aux.append("crossorigin=\"anonymous\">\n");
        aux.append("</script>");
        aux.append("</body>\n");
        
        aux.append("</html>\n");
        
        return aux.toString();
    }
    
}
