package br.root.dashboard.page;

public class BarraLateral {
    public String toHtml() {

        StringBuilder aux = new StringBuilder();
            aux.append("    <button class=\"menu-btn\" aria-label=\"Abrir menu\" aria-expanded=\"false\" aria-controls=\"mySidebar\"\n");
            aux.append("        onclick=\"toggleSidebar()\">\n");
            aux.append("        <i class=\"fas fa-bars\"><span class=\"menu-lateral\">Menu lateral</span></i>\n");
            aux.append("    </button>\n");
            
            aux.append("    <aside class=\"sidebar active\" id=\"mySidebar\" aria-hidden=\"true\">\n");
            aux.append("        <nav class=\"sidebar-nav\">\n");
            aux.append("            <a href=\"#\"><i class=\"fas fa-cog\"></i>Configuração</a>\n");
            aux.append("            <hr>\n");
            aux.append("            <a href=\"#\"><i class=\"fas fa-tachometer-alt\"></i> Dashboard</a>\n");
            aux.append("            <a href=\"#\"><i class=\"fas fa-tasks\"></i> Tarefas</a>\n");
            aux.append("            <a href=\"javascript:void(0)\" class=\"submenu-toggle\" onclick=\"toggleSubmenu('submenu-cardadventure', this)\"\n");
            aux.append("                aria-expanded=\"false\">\n");
            aux.append("                <span><i class=\"fas fa-id-card\"></i><span class=\"titilo-side-bar\">SubMenu</span></span>\n");
            aux.append("                <i class=\"fas fa-chevron-right caret\"></i>\n");
            aux.append("            </a>\n");
            aux.append("            <div id=\"submenu-cardadventure\" class=\"submenu\" hidden>\n");
            aux.append("                <a href=\"#\">Ítem 1</a>\n");
            aux.append("                <a href=\"#\">Ítem 2</a>\n");
            aux.append("            </div>\n");
            aux.append("        </nav>\n");
            aux.append("    </aside>\n");
        return aux.toString();
    }
}
