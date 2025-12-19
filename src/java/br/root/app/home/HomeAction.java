package br.root.app.home;

import br.jasap.core.Effect;
import br.jasap.core.JasapAct;
import br.jasap.effect.Response;
import br.root.Page;

public abstract class HomeAction extends JasapAct {
    
    public HomeAction() {
        
    }

    public static class Hello extends HomeAction{

        @Override
        public Effect execute() throws Exception {
            
            Page pagina = new Page();
            
            StringBuilder aux = new StringBuilder();
            aux.append("<main>\n");
                aux.append("<div class=\"menu\">\n");

                    aux.append("<div>\n");
                        aux.append("<a href=\"#\" onclick=\""+ link(update.class).ajax() +"\">update</a>\n");
                        aux.append("<a href=\"#\" onclick=\"" + link(updateParametro.class).putInteger("valor", 100).ajax() + "\">update [100]</a>\n");
                        aux.append("<a href=\"#\" onclick=\"" + link(alteracaocomEval.class).ajax() + "\">eval</a>\n");
                        
                    aux.append("</div>\n");

                    aux.append("<div class=\"area-inputs\">\n");
                        aux.append("<input type=\"text\" placeholder=\"Input 1\">\n");
                        aux.append("<input type=\"text\" placeholder=\"Input 2\">\n");
                        aux.append("<a href=\"#\" class=\"btn-submit\">submit</a>\n");
                    aux.append("</div>\n");

                aux.append("</div>\n");
            
                aux.append("<div class=\"fundo-azul\">\n");
                    aux.append("<span id=\"area-azul\">...</span>\n");
                aux.append("</div>\n");
                aux.append("<div id=\"area-cronometro\" class=\"fundo-verde\">\n");
                    aux.append("<span id=\"cronometro\">00:00</span>\n");
                    aux.append("<a href=\"#\" onclick=\"document.getElementById('area-cronometro').style.backgroundColor = '#aaf08f'; return false;\">voltar a cor padrão</a>\n");
                aux.append("</div>\n");
            
            aux.append("</main>\n");
            aux.append("<script src=\"assets/cronometro.js\"></script>\n");

            
            getOutput().write( pagina.toHtml(aux.toString()));
            return new Response();
        }
    }
    
    public static class update extends HomeAction {
        @Override
        public Effect execute() throws Exception {
            
            StringBuilder aux = new StringBuilder();
            aux.append("CONTEÚDO ATUALIZADO");
            update("area-azul", aux.toString());
            return new Response();
            
        }
    }
    
    public static class updateParametro extends HomeAction {
        @Override
        public Effect execute() throws Exception {
            Integer valor = getInput().getInteger("valor");
            StringBuilder aux = new StringBuilder();
            aux.append("PARAMETRO RECEBIDO - " + valor);
            update("area-azul", aux.toString());
            return new Response();
            
        }
    }
    
    public static class alteracaocomEval extends HomeAction {
        @Override
        public Effect execute() throws Exception {
            eval("document.getElementById('area-cronometro').style.backgroundColor = '#ffd966';");
            return new Response();
        }
    }
}
