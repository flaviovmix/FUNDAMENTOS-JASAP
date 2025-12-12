package br.root;

public class Page {
    
    public String toHtml(String corpo){
        StringBuilder aux = new StringBuilder();
        
        //aux.append("<!DOCTYPE html>\n");
        aux.append("<html>\n");
        aux.append("<head>\n");
        aux.append("	<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
        aux.append("	<meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\n");
        aux.append("	<title>Aula1</title>\n");
        aux.append("</head>\n");
        
        aux.append("<script src=\"res/vendors/jquery/jquery-3.6.0.min.js\" type=\"text/javascript\"></script>\n");
        aux.append("<script src=\"res/vendors/jquery/jquery-ui.min.js\" type=\"text/javascript\"></script>\n");
        aux.append("<script src=\"res/scripts/jquery/jquery-ui-ptBr.js\" type=\"text/javascript\"></script>\n");
        
        aux.append("<script src=\"res/js/XTLib.js\" type=\"text/javascript\"></script>\n");
        aux.append("<script src=\"res/js/XTLibJqueryV1.js\" type=\"text/javascript\"></script>\n");
        aux.append("<script src=\"res/js/jasapJquery.js\" type=\"text/javascript\"></script>\n");
            
        aux.append("<body>\n");
        aux.append(corpo);
        aux.append("</body>\n");
        
        aux.append("<script language=\"JavaScript\">\n");
        aux.append("</script>\n");
        
        aux.append("<iframe name=\"IFR_UPLOAD\" style=\"position:absolute;top:0;left:0;height:0;width:0;\" frameborder=\"0\" width=\"0\" height=\"0\"></iframe>\n");
        
        aux.append("</html>\n");
        
        return aux.toString();
    }
    
}
