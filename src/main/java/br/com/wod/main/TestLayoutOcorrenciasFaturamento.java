package br.com.wod.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.wod.entity.LayoutOcorrenciasFaturamento;

public class TestLayoutOcorrenciasFaturamento {

	public static void main(String[] args) {

		String path = "C:\\temp\\layout_ocorrencia_faturamento.txt";
		
		List<String> test = new ArrayList<String>();
		
		List<LayoutOcorrenciasFaturamento> list = new ArrayList<LayoutOcorrenciasFaturamento>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while (line != null) {
				
				test.add(line);
				
				line = br.readLine();
			}
			
			// Inicial -1 final +1
			for (String s : test) {
				LayoutOcorrenciasFaturamento layoutOcorrenciasFaturamento = new LayoutOcorrenciasFaturamento();
				
				String tipoRegistro = s.substring(0, 1); 
				layoutOcorrenciasFaturamento.setTipoRegistro(tipoRegistro);
				
				String instalacao = s.substring(1, 12);
				layoutOcorrenciasFaturamento.setInstalacao(instalacao);
				
				String identificacao = s.substring(11, 32);
				layoutOcorrenciasFaturamento.setIdentificacao(identificacao);
				
				String valorCobrado = s.substring(31, 47);
				layoutOcorrenciasFaturamento.setValorCobrado(valorCobrado);
				
				String codigoDoItem = s.substring(46, 53);
				layoutOcorrenciasFaturamento.setCodigoDoItem(codigoDoItem);
				
				String dataFaturamento = s.substring(52, 61);
				layoutOcorrenciasFaturamento.setDataFaturamento(dataFaturamento);
				
				String dataVencimento = s.substring(60, 69);
				layoutOcorrenciasFaturamento.setDataVencimento(dataVencimento);
				
				String empresa = s.substring(68, 73);
				layoutOcorrenciasFaturamento.setEmpresa(empresa);
				
				String pnDoParceiro = s.substring(72, 83);
				layoutOcorrenciasFaturamento.setPnDoParceiro(pnDoParceiro);
				
				String mesReferenciaFaturamento = s.substring(82, 89);
				layoutOcorrenciasFaturamento.setMesReferenciaFaturamento(mesReferenciaFaturamento);
				
				String parcela = s.substring(88, 119);
				layoutOcorrenciasFaturamento.setParcela(parcela);
				
				String pnDoConsumidor = s.substring(118, 129);
				layoutOcorrenciasFaturamento.setPnDoConsumidor(pnDoConsumidor);
				
				String filler = s.substring(128, 150);
				layoutOcorrenciasFaturamento.setFiller(filler);
				
				list.add(layoutOcorrenciasFaturamento);
			}
			
			for (LayoutOcorrenciasFaturamento p : list) {
				System.out.println(p.toString());
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}