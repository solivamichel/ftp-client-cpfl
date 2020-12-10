package br.com.wod.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LayoutOcorrenciasIrregularidade {
	
	private String tipoRegistro;
	
	private String instalacao;
	
	private String identificacao;
	
	private String valorCobrar;
	
	private String codigoDoItem;
	
	private String irregularidade;
	
	private String dataVencimento;
	
	private String dataFaturamento;
	
	private String parcela;
	
	private String pnDoParceiro;
	
	private String brancos;
	
	private String empresa;
	
	private String mesReferenciaFaturamento;
	

	public LayoutOcorrenciasIrregularidade(String tipoRegistro, String instalacao, String identificacao,
			String valorCobrar, String codigoDoItem, String irregularidade, String dataVencimento,
			String dataFaturamento, String parcela, String pnDoParceiro, String brancos, String empresa,
			String mesReferenciaFaturamento) {
		this.tipoRegistro = tipoRegistro;
		this.instalacao = instalacao;
		this.identificacao = identificacao;
		this.valorCobrar = valorCobrar;
		this.codigoDoItem = codigoDoItem;
		this.irregularidade = irregularidade;
		this.dataVencimento = dataVencimento;
		this.dataFaturamento = dataFaturamento;
		this.parcela = parcela;
		this.pnDoParceiro = pnDoParceiro;
		this.brancos = brancos;
		this.empresa = empresa;
		this.mesReferenciaFaturamento = mesReferenciaFaturamento;
	}
}
