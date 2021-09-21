package javaclassgit.classAnimal;
/**
 *
 * @author agustinDev
 */
public class FocalFossa {
    
    private String usuarioNombre;
    private String usuarioApellido;

    public FocalFossa() {
    }

    public FocalFossa(String usuarioNombre, String usuarioApellido) {
        this.usuarioNombre = usuarioNombre;
        this.usuarioApellido = usuarioApellido;
    }

    public String getUsuarioNombre() {
        return usuarioNombre;
    }

    public void setUsuarioNombre(String usuarioNombre) {
        this.usuarioNombre = usuarioNombre;
    }

    public String getUsuarioApellido() {
        return usuarioApellido;
    }

    public void setUsuarioApellido(String usuarioApellido) {
        this.usuarioApellido = usuarioApellido;
    }

    @Override
    public String toString() {
        return "FocalFossa{" + "usuarioNombre=" + usuarioNombre + ", usuarioApellido=" + usuarioApellido + '}';
    }
    
    
} 
