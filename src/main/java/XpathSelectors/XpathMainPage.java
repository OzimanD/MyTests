package XpathSelectors;

import java.security.PublicKey;

public class XpathMainPage {
    public String HeaderMain="/html/body/div/div[1]/div/header/div/div[1]/div[1]/nav/ul/li[1]/a";
    public String HeaderMainB="/html/body/div/div[1]/div/header/div/div[1]/div[1]/nav/ul/li[1]/a"
;    public String HeaderNews="/html/body/div/div[1]/div/header/div/div[1]/div[1]/nav/ul/li[2]/a";
    public String CheackNews="/html/body/div/div[1]/main/section/h1";
    public String ElementsI= "/html/body/div[1]/div[1]/main/div/div/section[2]/div/p[1]/span[2]/span";
    public String GetElemetsI="/html/body/div[1]/div[2]/div";
    public String HeaderLogo="/html/body/div/div[1]/div/header/div/div[1]/div[1]/a/img";
    public String HeaderAboutBitbon="/html/body/div/div[1]/div/header/div/div[1]/div[1]/nav/ul/li[3]/a";
    public String HeaderProviding="/html/body/div/div[1]/div/header/div/div[1]/div[1]/nav/ul/li[4]/a";
    public String AuditAndStatistic="/html/body/div/div[1]/div/header/div/div[1]/div[1]/nav/ul/li[5]/a";



    public static String News () {
        String login = "/html/body/div/div[1]/div/header/div/div[1]/div[1]/nav/ul/li[2]/a";
        return login;
    }
}
