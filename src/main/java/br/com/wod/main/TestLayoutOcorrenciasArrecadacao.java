package br.com.wod.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.wod.entity.LayoutOcorrenciasArrecadacao;

public class TestLayoutOcorrenciasArrecadacao {

	public static void main(String[] args) {

		String path = "C:\\temp\\layout_ocorrencia_arrecadacao.txt";
		
		List<String> test = new ArrayList<String>();
		
		List<LayoutOcorrenciasArrecadacao> list = new ArrayList<LayoutOcorrenciasArrecadacao>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while (line != null) {
				
				test.add(line);
				
				line = br.readLine();
			}
			
			// Inicial -1 final +1
			for (String s : test) {
				LayoutOcorrenciasArrecadacao layoutOcorrenciasArrecadacao = new LayoutOcorrenciasArrecadacao();
				
				String tipoRegistro = s.substring(0, 1); 
				layoutOcorrenciasArrecadacao.setTipoRegistro(tipoRegistro);
				
				String instalacao = s.substring(1, 12);
				layoutOcorrenciasArrecadacao.setInstalacao(instalacao);
				
				String identificacao = s.substring(11, 32);
				layoutOcorrenciasArrecadacao.setIdentificacao(identificacao);
				
				String valorArrecadado = s.substring(31, 47);
				layoutOcorrenciasArrecadacao.setValorArrecadado(valorArrecadado);
				
				String codigoDoItem = s.substring(46, 53);
				layoutOcorrenciasArrecadacao.setCodigoDoItem(codigoDoItem);
				
				String dataVencimento = s.substring(52, 61);
				layoutOcorrenciasArrecadacao.setDataVencimento(dataVencimento);
				
				String dataPagamento = s.substring(60, 69);
				layoutOcorrenciasArrecadacao.setDataPagamento(dataPagamento);
				
				String codigoServico = s.substring(68, 70);
				layoutOcorrenciasArrecadacao.setCodigoServico(codigoServico);
				
				String dtEstornoArrecadacao = s.substring(69, 78);
				layoutOcorrenciasArrecadacao.setDtEstornoArrecadacao(dtEstornoArrecadacao);
				
				String empresa = s.substring(77, 82);
				layoutOcorrenciasArrecadacao.setEmpresa(empresa);
				
				String mesFaturamento = s.substring(81, 92);
				layoutOcorrenciasArrecadacao.setMesFaturamento(mesFaturamento);
				
				String nDocImpressao = s.substring(91, 108);
				layoutOcorrenciasArrecadacao.setNDocImpressao(nDocImpressao);
				
				String parcela = s.substring(107, 138);
				layoutOcorrenciasArrecadacao.setParcela(parcela);
				
				String pnDoConsumidor = s.substring(137, 148);
				layoutOcorrenciasArrecadacao.setPnDoConsumidor(pnDoConsumidor);
				
				String filler = s.substring(147, 150);
				layoutOcorrenciasArrecadacao.setFiller(filler);
				
				list.add(layoutOcorrenciasArrecadacao);
			}
			
			for (LayoutOcorrenciasArrecadacao p : list) {
				System.out.println(p.toString());
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}