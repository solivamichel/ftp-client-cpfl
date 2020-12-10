package br.com.wod.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LayoutOcorrenciasFaturamento {

	private String tipoRegistro;
	
	private String instalacao;
	
	private String identificacao;
	
	private String valorCobrado;
	
	private String codigoDoItem;
	
	private String dataFaturamento;
	
	private String dataVencimento;
	
	private String empresa;
	
	private String pnDoParceiro;
	
	private String mesReferenciaFaturamento;
	
	private String parcela;
	
	private String pnDoConsumidor;
	
	private String filler;

	public LayoutOcorrenciasFaturamento(String tipoRegistro, String instalacao, String identificacao,
			String valorCobrado, String codigoDoItem, String dataFaturamento, String dataVencimento, String empresa,
			String pnDoParceiro, String mesReferenciaFaturamento, String parcela, String pnDoConsumidor,
			String filler) {
		this.tipoRegistro = tipoRegistro;
		this.instalacao = instalacao;
		this.identificacao = identificacao;
		this.valorCobrado = valorCobrado;
		this.codigoDoItem = codigoDoItem;
		this.dataFaturamento = dataFaturamento;
		this.dataVencimento = dataVencimento;
		this.empresa = empresa;
		this.pnDoParceiro = pnDoParceiro;
		this.mesReferenciaFaturamento = mesReferenciaFaturamento;
		this.parcela = parcela;
		this.pnDoConsumidor = pnDoConsumidor;
		this.filler = filler;
	}
}
