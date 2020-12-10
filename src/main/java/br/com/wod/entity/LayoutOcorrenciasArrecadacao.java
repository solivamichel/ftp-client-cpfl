package br.com.wod.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LayoutOcorrenciasArrecadacao {
	
	private String tipoRegistro;
	
    private String instalacao;
    
    private String identificacao;
    
    private String valorArrecadado;
    
    private String codigoDoItem;
    
    private String dataVencimento;
    
    private String dataPagamento;
    
    private String codigoServico;
    
    private String dtEstornoArrecadacao;
    
    private String empresa;
    
    private String mesFaturamento;
   
    private String nDocImpressao;
  
    private String parcela;
  
    private String pnDoConsumidor;
 
    private String filler;
}
