package br.root;

import javax.servlet.ServletContext;

public final class AppConfig {

    private static boolean useTimestamp;
    private static String versaoFixa;

    private AppConfig() {}

    public static void init(ServletContext ctx) {
        String ts = ctx.getInitParameter("USE_TIMESTAMP");
        useTimestamp = "true".equalsIgnoreCase(ts);

        String version = ctx.getInitParameter("ASSET_VERSION");
        if (version != null && !version.trim().isEmpty()) {
            versaoFixa = version.trim();
        } else {
            versaoFixa = "default";
        }
    }

    public static String assetVersion() {
        
        boolean versaoDinamica = useTimestamp;
        String versao;

        if (versaoDinamica) {
            versao = Long.toString(System.currentTimeMillis());
        } else {
            versao = versaoFixa;
        }
        return versao;
    }
}
