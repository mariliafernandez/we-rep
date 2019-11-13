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
public class ValidaTest {
    
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
    public void testSenhaNula() throws Exception {
        Morador morador;
        Valida instance = new Valida();
        
        try {
            morador = new Morador(0, 200.00, "Maria", "Silva", "", "maria.silva", "", new Republica(0, "Rep10", "Rua XV de Novembro", 1230, "Centro", "Cornélio Procópio", "Paraná"));
            instance.validaMorador(morador);
            fail();
        } catch(Exception e) {
            assertEquals("Campo Nulo", e.getMessage());
        }  
    }
    
    @Test
    public void testRepublicaNula() throws Exception {
        Morador morador;
        Valida instance = new Valida();
        
        try {
            morador = new Morador(0, 200.00, "Maria", "Silva", "", "maria.silva", "", null);
            instance.validaMorador(morador);
            fail();
        } catch(Exception e) {
            assertEquals("Campo Nulo", e.getMessage());
        }  
    }
    
    @Test
    public void testNomePequeno() throws Exception {
        Morador morador;
        Valida instance = new Valida();
        
        try {
            morador = new Morador(0, 200.00, "Mari", "Silva", "maria.silva.gmail.com", "maria.silva", "maria123", new Republica(0, "Rep10", "Rua XV de Novembro", 1230, "Centro", "Cornélio Procópio", "Paraná"));
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
            morador = new Morador(0, 200.00, "Maria", "Silv", "maria.silva.gmail.com", "maria.silva", "maria123", new Republica(0, "Rep10", "Rua XV de Novembro", 1230, "Centro", "Cornélio Procópio", "Paraná"));
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
            morador = new Morador(0, 200.00, "Mari", "Silva", "maria.silva.gmail.com", "m.s", "maria123", new Republica(0, "Rep10", "Rua XV de Novembro", 1230, "Centro", "Cornélio Procópio", "Paraná"));
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
            morador = new Morador(0, 200.00, "Mari", "Silva", "maria.silva.gmail.com", "maria.silva", "1234", new Republica(0, "Rep10", "Rua XV de Novembro", 1230, "Centro", "Cornélio Procópio", "Paraná"));
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
            //int id, String nome, String endereco, int numero, String bairro, String cidade, String estado
            rep = new Republica(0, "República X", "Rua XV de Novembro", 1202, "Centro", "Cornélio Procópio", "PR");
            instance.validaRepublica(rep);
            
        } catch(Exception e) {
            fail(e.getMessage());
        }  
    }
    
    @Test
    public void testNomeRepPequeno() throws Exception {
        Republica rep;
        Valida instance = new Valida();
        
        try {
            //int id, String nome, String endereco, int numero, String bairro, String cidade, String estado
            rep = new Republica(0, "Repu", "XV de Novembro", 1202, "Centro", "Cornélio Procópio", "PR");
            instance.validaRepublica(rep);
            fail();
        } catch(Exception e) {
            assertEquals("Campo muito pequeno", e.getMessage());
        }  
    }
    
    @Test
    public void testEnderecoPequeno() throws Exception {
        Republica rep;
        Valida instance = new Valida();
        
        try {
            //int id, String nome, String endereco, int numero, String bairro, String cidade, String estado
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
            //int id, String nome, String endereco, int numero, String bairro, String cidade, String estado
            rep = new Republica(0, "Republica X", "XV", 0, "Centro", "Cornélio Procópio", "PR");
            instance.validaRepublica(rep);
            fail();
        } catch(Exception e) {
            assertEquals("Campo muito pequeno", e.getMessage());
        }  
    }
    
    @Test
    public void testBairroPequeno() throws Exception {
        Republica rep;
        Valida instance = new Valida();
        
        try {
            //int id, String nome, String endereco, int numero, String bairro, String cidade, String estado
            rep = new Republica(0, "Republica X", "XV", 1202, "A", "Cornélio Procópio", "PR");
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
            //int id, String nome, String endereco, int numero, String bairro, String cidade, String estado
            rep = new Republica(0, "Republica X", "XV", 1202, "A", "CP", "PR");
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
            //int id, String nome, String endereco, int numero, String bairro, String cidade, String estado
            rep = new Republica(0, "Republica X", "XV", 1202, "Centro", "Cornélio Procópio", "P");
            instance.validaRepublica(rep);
            fail();
        } catch(Exception e) {
            assertEquals("Campo muito pequeno", e.getMessage());
        }  
    }
    
    
}
