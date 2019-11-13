
package View;
import Model.Morador;
import Model.Republica;

public class Valida {

    public void validaNull(String campo) throws Exception{
	if (campo == null) {
		throw new Exception("Campo Nulo");
	}
}

    public void validaTamMax(String campo) throws Exception{
	if (campo.length() > 50){
		throw new Exception("Campo excede o tamanho");
	}
}

    public void validaTamMin(String campo) throws Exception{
	if (campo.length() < 5){
		throw new Exception("Campo muito pequeno");
	}
}

    public void validaSimb(String campo) throws Exception{
	if(!campo.matches("[a-zA-Z]*")){
        throw new Exception("Campo possui simbolos");
    }
}

    public void validaCamposMorador (Morador morador) throws Exception{
	validaNull(morador.getNome());
	validaNull(morador.getSobreNome());
	validaNull(morador.getEmail());
	validaNull(morador.getLogin());
	validaNull(morador.getSenha());
	validaNull(morador.getRepublica().toString());

	validaTamMax(morador.getNome());
	validaTamMax(morador.getSobreNome());
	validaTamMax(morador.getEmail());
	validaTamMax(morador.getLogin());
	validaTamMax(morador.getSenha());
	validaTamMax(morador.getRepublica().toString());

	validaTamMin(morador.getNome());
	validaTamMin(morador.getSobreNome());
	validaTamMin(morador.getEmail());
	validaTamMin(morador.getLogin());
	validaTamMin(morador.getSenha());
	validaTamMin(morador.getRepublica().toString());

	validaSimb(morador.getNome());
	validaSimb(morador.getSobreNome());

    }

    public void validaCamposRep(Republica rep) throws Exception{
	validaNull(rep.getNome());
	validaNull(rep.getEndereco());
	validaNull(String.valueOf(rep.getNumero()));
	validaNull(rep.getBairro());
	validaNull(rep.getCidade());
	validaNull(rep.getEstado());

        validaTamMax(rep.getNome());
	validaTamMax(rep.getEndereco());
	validaTamMax(String.valueOf(rep.getNumero()));
	validaTamMax(rep.getBairro());
	validaTamMax(rep.getCidade());
	validaTamMax(rep.getEstado());
        
        validaTamMin(rep.getNome());
	validaTamMin(rep.getEndereco());
	validaTamMin(String.valueOf(rep.getNumero()));
	validaTamMin(rep.getBairro());
	validaTamMin(rep.getCidade());
	validaTamMin(rep.getEstado());
        
        validaSimb(rep.getNome());
	validaSimb(rep.getEndereco());
	validaSimb(String.valueOf(rep.getNumero()));
	validaSimb(rep.getBairro());
	validaSimb(rep.getCidade());
	validaSimb(rep.getEstado());

    }
}
