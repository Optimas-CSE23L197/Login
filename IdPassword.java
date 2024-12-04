package Login;

import java.util.HashMap;

public class IdPassword {
    HashMap<String,String> logininfo = new HashMap<String,String>();

    IdPassword() {
        logininfo.put("Animesh144", "Animesh123");
        logininfo.put("Animesh145", "Animesh1234");
        logininfo.put("Animesh146", "Animesh12345");
    }

    protected HashMap getLogininfo() {
        return logininfo;
    }
    
}
