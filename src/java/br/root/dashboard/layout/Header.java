package br.root.dashboard.layout;

public class Header {
    public String toHtml() {
            
        StringBuilder aux = new StringBuilder();
        
            aux.append("   <header>\n");
            aux.append("        <div class=\"container\">\n");
            aux.append("            <div id=\"cabecalho\"> \n");
            aux.append("            </div>\n");
            aux.append("\n");
            aux.append("\n");
            aux.append("            <div class=\"user-menu\">\n");
            aux.append("                <button class=\"user-btn\" aria-expanded=\"false\">\n");
            aux.append("                    <i class=\"fas fa-user-circle\"></i>\n");
            aux.append("                    <span class=\"user-name\"> usuario </span>\n");
            aux.append("                    <i class=\"fas fa-caret-down caret\"></i>\n");
            aux.append("                </button>\n");
            aux.append("\n");
            aux.append("                <div class=\"user-dropdown\" id=\"userDropdown\" hidden>\n");
            aux.append("                    <a href=\"#\">\n");
            aux.append("                        <i class=\"fas fa-user\"></i> <span class=\"opcoes-sub-menu\">Meu Perfil</span> </a>\n");
            aux.append("                    <a href=\"#\" onclick=\"openModalConfig(); return false;\">\n");
            aux.append("                        <i class=\"fas fa-cog\"></i> <span class=\"opcoes-sub-menu\">Configurações</span> </a>\n");
            aux.append("                    <a href=\"#\">\n");
            aux.append("                        <i class=\"fas fa-sign-out-alt\"></i><span class=\"opcoes-sub-menu\">Sair</span> </a>\n");
            aux.append("                </div>\n");
            aux.append("            </div>\n");
            aux.append("\n");
            aux.append("        </div>\n");
            aux.append("    </header>\n");
        
            return aux.toString();
    }
}
