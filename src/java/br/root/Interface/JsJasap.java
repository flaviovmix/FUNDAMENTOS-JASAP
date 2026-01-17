package br.root.Interface;

import br.root.AppConfig;

public class JsJasap {
    
    public static String toHtml() {
        StringBuilder aux = new StringBuilder();
        String r = AppConfig.assetVersion();
        
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
        
        return aux.toString();
    }
    
}
