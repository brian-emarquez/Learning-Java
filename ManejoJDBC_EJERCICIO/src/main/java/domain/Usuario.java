package domain;

public class Usuario {
    private int if_persona;
    private String useranem;
    private String password;

    public Usuario() {
    }

    public Usuario(String useranem, String password) {
        this.useranem = useranem;
        this.password = password;
    }
    
    public Usuario(int if_persona, String useranem, String password) {
        this.if_persona = if_persona;
        this.useranem = useranem;
        this.password = password;
    }
    
    public int getIf_persona() {
        return if_persona;
    }

    public void setIf_persona(int if_persona) {
        this.if_persona = if_persona;
    }

    public String getUseranem() {
        return useranem;
    }

    public void setUseranem(String useranem) {
        this.useranem = useranem;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" + "if_persona=" + if_persona + ", useranem=" + useranem + ", password=" + password + '}';
    }
    
}
