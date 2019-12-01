/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Morador;
import Model.Republica;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marilia
 */
public class ValidaT {
    
    @Test
    public void testMorador() throws Exception {
        Morador morador;
        Valida instance = new Valida();
        
        try {
            morador = new Morador(0, 200.00, "Maria", "Silva", "maria.silva123@gmail.com", "maria.silva", "maria123", new Republica(0, "Rep10", "Rua XV de Novembro", 1230, "Centro", "Cornélio Procópio", "Paraná"));
            instance.validaMorador(morador);
        } catch(Exception e) {
            fail(e.getMessage());
        }  
    }
    
    @Test
    public void testNomeNulo() throws Exception {
        Morador morador;
        Valida instance = new Valida();
        
        try {
            morador = new Morador(0, 200.00, "", "Silva", "maria.silva123@gmail.com", "maria.silva", "maria123", new Republica(0, "Rep10", "Rua XV de Novembro", 1230, "Centro", "Cornélio Procópio", "Paraná"));
            instance.validaMorador(morador);
            fail();
        } catch(Exception e) {
            assertEquals("Campo Nulo", e.getMessage());
        }  
    }
    
    @Test
    public void testSobrenomeNulo() throws Exception {
        Morador morador;
        Valida instance = new Valida();
        
        try {
            morador = new Morador(0, 200.00, "Maria", "", "maria.silva123@gmail.com", "maria.silva", "maria123", new Republica(0, "Rep10", "Rua XV de Novembro", 1230, "Centro", "Cornélio Procópio", "Paraná"));
            instance.validaMorador(morador);
            fail();
        } catch(Exception e) {
            assertEquals("Campo Nulo", e.getMessage());
        }  
    }
    
    @Test
    public void testEmailNulo() throws Exception {
        Morador morador;
        Valida instance = new Valida();
        
        try {
            morador = new Morador(0, 200.00, "Maria", "Silva", "", "maria.silva", "maria123", new Republica(0, "Rep10", "Rua XV de Novembro", 1230, "Centro", "Cornélio Procópio", "Paraná"));
            instance.validaMorador(morador);
            fail();
        } catch(Exception e) {
            assertEquals("Campo Nulo", e.getMessage());
        }  
    }
    
    @Test
    public void testLoginNulo() throws Exception {
        Morador morador;
        Valida instance = new Valida();
        
        try {
            morador = new Morador(0, 200.00, "Maria", "Silva", "maria.silva123@gmai.com", "", "maria123", new Republica(0, "Rep10", "Rua XV de Novembro", 1230, "Centro", "Cornélio Procópio", "Paraná"));
            instance.validaMorador(morador);
            fail();
        } catch(Exception e) {
            assertEquals("Campo Nulo", e.getMessage());
        }  
    }
    
    @Test
    public void testSenhaNulo() throws Exception {
        Morador morador;
        Valida instance = new Valida();
        
        try {
            morador = new Morador(0, 200.00, "Maria", "Silva", "maria.silva123@gmai.com", "maria.silva", "", new Republica(0, "Rep10", "Rua XV de Novembro", 1230, "Centro", "Cornélio Procópio", "Paraná"));
            instance.validaMorador(morador);
            fail();
        } catch(Exception e) {
            assertEquals("Campo Nulo", e.getMessage());
        }  
    }
    
    @Test
    public void testRepNulo() throws Exception {
        Morador morador;
        Valida instance = new Valida();
        
        try {
            morador = new Morador(0, 200.00, "Maria", "Silva", "maria.silva123@gmai.com", "maria.silva", "senha123", null);
            instance.validaMorador(morador);
            
        } catch(Exception e) {
            fail(e.getMessage());
        }  
    }
    
    @Test
    public void testNomePequeno() throws Exception {
        Morador morador;
        Valida instance = new Valida();
        
        try {
            morador = new Morador(0, 200.00, "M", "Silva", "maria.silva@gmail.com", "maria.silva", "maria123", new Republica(0, "Rep10", "Rua XV de Novembro", 1230, "Centro", "Cornélio Procópio", "Paraná"));
            instance.validaMorador(morador);
            fail();
        } catch(Exception e) {
            assertEquals("Campo muito pequeno", e.getMessage());
        }  
    }
    
    @Test
    public void testSobrenomePequeno() throws Exception {
        Morador morador;
        Valida instance = new Valida();
        
        try {
            morador = new Morador(0, 200.00, "Maria", "S", "maria.silva@gmail.com", "maria.silva", "maria123", new Republica(0, "Rep10", "Rua XV de Novembro", 1230, "Centro", "Cornélio Procópio", "Paraná"));
            instance.validaMorador(morador);
            fail();
        } catch(Exception e) {
            assertEquals("Campo muito pequeno", e.getMessage());
        }  
    }
    
    @Test
    public void testLoginPequeno() throws Exception {
        Morador morador;
        Valida instance = new Valida();
        
        try {
            morador = new Morador(0, 200.00, "Maria", "Silva", "maria.silva.gmail.com", "m.s", "maria123", new Republica(0, "Rep10", "Rua XV de Novembro", 1230, "Centro", "Cornélio Procópio", "Paraná"));
            instance.validaMorador(morador);
            fail();
        } catch(Exception e) {
            assertEquals("Campo muito pequeno", e.getMessage());
        }  
    }
    
    @Test
    public void testSenhaPequena() throws Exception {
        Morador morador;
        Valida instance = new Valida();
        
        try {
            morador = new Morador(0, 200.00, "Maria", "Silva", "maria.silva@gmail.com", "maria.silva", "123", new Republica(0, "Rep10", "Rua XV de Novembro", 1230, "Centro", "Cornélio Procópio", "Paraná"));
            instance.validaMorador(morador);
            fail();
        } catch(Exception e) {
            assertEquals("Campo muito pequeno", e.getMessage());
        }  
    }
    
    @Test
    public void testNomeGrande() throws Exception {
        Morador morador;
        Valida instance = new Valida();
        
        try {
            morador = new Morador(0, 200.00, "MariaMariaMariaMariaMariaMariaMariaMariaMariaMariaM", "Silva", "maria.silva@gmail.com", "maria.silva", "maria123", new Republica(0, "Rep10", "Rua XV de Novembro", 1230, "Centro", "Cornélio Procópio", "Paraná"));
            instance.validaMorador(morador);
            fail();
        } catch(Exception e) {
            assertEquals("Campo excede o tamanho", e.getMessage());
        }  
    }
    
    @Test
    public void testSobrenomeGrande() throws Exception {
        Morador morador;
        Valida instance = new Valida();
        
        try {
            morador = new Morador(0, 200.00, "Maria", "SilvaSilvaSilvaSilvaSilvaSilvaSilvaSilvaSilvaSilvaS", "maria.silva@gmail.com", "maria.silva", "maria123", new Republica(0, "Rep10", "Rua XV de Novembro", 1230, "Centro", "Cornélio Procópio", "Paraná"));
            instance.validaMorador(morador);
            fail();
        } catch(Exception e) {
            assertEquals("Campo excede o tamanho", e.getMessage());
        }  
    }
    
    @Test
    public void testEmailGrande() throws Exception {
        Morador morador;
        Valida instance = new Valida();
        
        try {
            morador = new Morador(0, 200.00, "Maria", "Silva", "mariamariamariamariamariamariamariamariamariamaria@gmail.com", "maria.silva", "maria123", new Republica(0, "Rep10", "Rua XV de Novembro", 1230, "Centro", "Cornélio Procópio", "Paraná"));
            instance.validaMorador(morador);
            fail();
        } catch(Exception e) {
            assertEquals("Campo excede o tamanho", e.getMessage());
        }  
    }
    
    @Test
    public void testLoginGrande() throws Exception {
        Morador morador;
        Valida instance = new Valida();
        
        try {
            morador = new Morador(0, 200.00, "Maria", "Silva", "maria.silva@gmail.com", "maria.silvasilvasilvasilvasilvasilvasilvasilvasilvasilva", "maria123", new Republica(0, "Rep10", "Rua XV de Novembro", 1230, "Centro", "Cornélio Procópio", "Paraná"));
            instance.validaMorador(morador);
            fail();
        } catch(Exception e) {
            assertEquals("Campo excede o tamanho", e.getMessage());
        }  
    }
    
    @Test
    public void testSenhaGrande() throws Exception {
        Morador morador;
        Valida instance = new Valida();
        
        try {
            morador = new Morador(0, 200.00, "Maria", "Silva", "maria.silva@gmail.com", "maria.silva", "012345678901234567", new Republica(0, "Rep10", "Rua XV de Novembro", 1230, "Centro", "Cornélio Procópio", "Paraná"));
            instance.validaMorador(morador);
            fail();
        } catch(Exception e) {
            assertEquals("Campo excede o tamanho", e.getMessage());
        }  
    }
    
    @Test
    public void testSimboloNome() throws Exception {
        Morador morador;
        Valida instance = new Valida();
        
        try {
            morador = new Morador(0, 200.00, "Maria%", "Silva", "maria.silva@gmail.com", "maria.silva", "maria123", new Republica(0, "Rep10", "Rua XV de Novembro", 1230, "Centro", "Cornélio Procópio", "Paraná"));
            instance.validaMorador(morador);
            fail();
        } catch(Exception e) {
            assertEquals("Campo possui simbolos", e.getMessage());
        }  
    }
    
    @Test
    public void testSimboloSobrenome() throws Exception {
        Morador morador;
        Valida instance = new Valida();
        
        try {
            morador = new Morador(0, 200.00, "Maria", "Silva%", "maria.silva@gmail.com", "maria.silva", "maria123", new Republica(0, "Rep10", "Rua XV de Novembro", 1230, "Centro", "Cornélio Procópio", "Paraná"));
            instance.validaMorador(morador);
            fail();
        } catch(Exception e) {
            assertEquals("Campo possui simbolos", e.getMessage());
        }  
    }
    
    @Test
    public void testRepublica() throws Exception {
        Republica rep;
        Valida instance = new Valida();
        
        try {
            rep = new Republica(0, "República X", "Rua XV de Novembro", 1202, "Centro", "Cornélio Procópio", "PR");
            instance.validaRepublica(rep);
            
        } catch(Exception e) {
            fail(e.getMessage());
        }  
    }
    
    @Test
    public void testNomeRepNulo() throws Exception {
        Republica rep;
        Valida instance = new Valida();
        
        try {
            //int id, String nome, String endereco, int numero, String bairro, String cidade, String estado
            rep = new Republica(0, "", "XV de Novembro", 1202, "Centro", "Cornélio Procópio", "PR");
            instance.validaRepublica(rep);
            fail();
        } catch(Exception e) {
            assertEquals("Campo Nulo", e.getMessage());
        }  
    }
   
    @Test
    public void testEnderecoNulo() throws Exception {
        Republica rep;
        Valida instance = new Valida();
        
        try {
            //int id, String nome, String endereco, int numero, String bairro, String cidade, String estado
            rep = new Republica(0, "República X", "", 1202, "Centro", "Cornélio Procópio", "PR");
            instance.validaRepublica(rep);
            fail();
        } catch(Exception e) {
            assertEquals("Campo Nulo", e.getMessage());
        }  
    }
    
    @Test
    public void testBairroNulo() throws Exception {
        Republica rep;
        Valida instance = new Valida();
        
        try {
            rep = new Republica(0, "República X", "XV de Novembro", 1202, "", "Cornélio Procópio", "PR");
            instance.validaRepublica(rep);
            fail();
        } catch(Exception e) {
            assertEquals("Campo Nulo", e.getMessage());
        }  
    }
    
    @Test
    public void testCidadeNulo() throws Exception {
        Republica rep;
        Valida instance = new Valida();
        
        try {
            rep = new Republica(0, "República X", "XV de Novembro", 1202, "Centro", "", "PR");
            instance.validaRepublica(rep);
            fail();
        } catch(Exception e) {
            assertEquals("Campo Nulo", e.getMessage());
        }  
    }
    
    @Test
    public void testEstadoNulo() throws Exception {
        Republica rep;
        Valida instance = new Valida();
        
        try {
            rep = new Republica(0, "República X", "XV de Novembro", 1202, "Centro", "Cornélio Procópio", "");
            instance.validaRepublica(rep);
            fail();
        } catch(Exception e) {
            assertEquals("Campo Nulo", e.getMessage());
        }  
    }
    
    @Test
    public void testEnderecoPequeno() throws Exception {
        Republica rep;
        Valida instance = new Valida();
        
        try {
            rep = new Republica(0, "Republica X", "XV", 1202, "Centro", "Cornélio Procópio", "PR");
            instance.validaRepublica(rep);
            fail();
        } catch(Exception e) {
            assertEquals("Campo muito pequeno", e.getMessage());
        }  
    }
    
    @Test
    public void testNumeroPequeno() throws Exception {
        Republica rep;
        Valida instance = new Valida();
        
        try {
            rep = new Republica(0, "Republica X", "XV de Novembro", 0, "Centro", "Cornélio Procópio", "PR");
            instance.validaRepublica(rep);
            fail();
        } catch(Exception e) {
            assertEquals("Campo muito pequeno", e.getMessage());
        }  
    }
    
    @Test
    public void testNumeroGrande() throws Exception {
        Republica rep;
        Valida instance = new Valida();
        
        try {
            rep = new Republica(0, "Republica X", "XV de Novembro", 9999, "Centro", "Cornélio Procópio", "PR");
            instance.validaRepublica(rep);
            fail();
        } catch(Exception e) {
            assertEquals("Campo excede o tamanho", e.getMessage());
        }  
    }
    
    @Test
    public void testBairroPequeno() throws Exception {
        Republica rep;
        Valida instance = new Valida();
        
        try {
            rep = new Republica(0, "Republica X", "XV de Novembro", 1202, "A", "Cornélio Procópio", "PR");
            instance.validaRepublica(rep);
            fail();
        } catch(Exception e) {
            assertEquals("Campo muito pequeno", e.getMessage());
        }  
    }
    
    @Test
    public void testCidadePequeno() throws Exception {
        Republica rep;
        Valida instance = new Valida();
        
        try {
            rep = new Republica(0, "Republica X", "XV de Novembro", 1202, "Centro", "CP", "PR");
            instance.validaRepublica(rep);
            fail();
        } catch(Exception e) {
            assertEquals("Campo muito pequeno", e.getMessage());
        }  
    }
    
    @Test
    public void testEstadoPequeno() throws Exception {
        Republica rep;
        Valida instance = new Valida();
        
        try {
            rep = new Republica(0, "Republica X", "XV de Novembro", 1202, "Centro", "Cornélio Procópio", "P");
            instance.validaRepublica(rep);
            fail();
        } catch(Exception e) {
            assertEquals("Campo muito pequeno", e.getMessage());
        }  
    }
    
    
}
