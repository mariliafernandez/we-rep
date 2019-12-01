
package View;
import Model.Morador;
import Model.Republica;

public class Valida {

    public boolean validaNull(String campo) throws Exception{
	if (campo.equals("")) {
            throw new Exception("Campo Nulo");
	} else 
            return true;     
    }

    public boolean validaTamMax(String campo) throws Exception{
	if (campo.length() > 50){
            throw new Exception("Campo excede o tamanho");
	}
        else return true;
    }

    public boolean validaTamMin(String campo) throws Exception{
	if (campo.length() < 4){
            throw new Exception("Campo muito pequeno");
	}
        else return true;
    }

    public boolean validaSimb(String campo) throws Exception{
	if(!campo.matches("[a-zA-Z]*")){
            throw new Exception("Campo possui simbolos");
        }
        else return true;
    }
    
    public boolean validaEmail(String campo) throws Exception {
        if(!campo.matches("^[\\w\\.-]+@([\\w\\-]+\\.)+[a-zA-Z]{2,4}$")) {
            throw new Exception("Email inválido");
        }
        else return true;
    }
    
    public boolean validaTamMaxSenha(String campo) throws Exception{
        if(campo.length() < 15)
            return true;
        else throw new Exception("Campo excede o tamanho");
    }
    
    public boolean validaNumeroMax(int campo) throws Exception{
        if(campo < 9999)
            return true;
        else throw new Exception("Campo excede o tamanho");
    }
    
    public boolean validaNumeroMin(int campo) throws Exception{
        if(campo > 0)
            return true;
        else throw new Exception("Campo muito pequeno");
    }
    
    public boolean validaTamBairro(String campo) throws Exception{
        if(campo.length() > 2)
            return true;
        else throw new Exception("Campo muito pequeno");
    }
    
    public boolean validaTamEstado(String campo) throws Exception{
        if(campo.length() > 1)
            return true;
        else throw new Exception("Campo muito pequeno");
    }
    
    public void validaRepublica(Republica rep) throws Exception{
        validaNull(rep.getNome());
	validaNull(rep.getEndereco());
	validaNull(String.valueOf(rep.getNumero()));
	validaNull(rep.getBairro());
	validaNull(rep.getCidade());
	validaNull(rep.getEstado());

        validaTamMax(rep.getNome());
	validaTamMax(rep.getEndereco());
	validaTamMax(rep.getBairro());
	validaTamMax(rep.getCidade());
	validaTamMax(rep.getEstado());
        validaNumeroMax(rep.getNumero());
        validaNumeroMin(rep.getNumero());

        validaTamMin(rep.getNome());
	validaTamMin(rep.getEndereco());
        validaTamMin(rep.getCidade());
	validaTamBairro(rep.getBairro());
	validaTamEstado(rep.getEstado());
        
    }
    
    public void validaMorador(Morador morador) throws Exception {
        validaNull(morador.getNome());
	validaNull(morador.getSobreNome());
	validaNull(morador.getEmail());
	validaNull(morador.getLogin());
	validaNull(morador.getSenha());

	validaTamMax(morador.getNome());
	validaTamMax(morador.getSobreNome());
	validaTamMax(morador.getEmail());
	validaTamMax(morador.getLogin());
        validaTamMaxSenha(morador.getSenha());

	validaTamMin(morador.getNome());
	validaTamMin(morador.getSobreNome());
	validaTamMin(morador.getEmail());
	validaTamMin(morador.getLogin());
	validaTamMin(morador.getSenha());

	validaSimb(morador.getNome());
	validaSimb(morador.getSobreNome());
        
        validaEmail(morador.getEmail());
    }

}