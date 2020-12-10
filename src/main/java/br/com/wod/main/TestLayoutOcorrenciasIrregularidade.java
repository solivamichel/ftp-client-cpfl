package br.com.wod.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.wod.entity.LayoutOcorrenciasIrregularidade;

public class TestLayoutOcorrenciasIrregularidade {

	public static void main(String[] args) {

//		String path = "C:\\temp\\eeee_nnnnnnnnnn_aaaammdd_hhmmss.txt";
		
		String path = "C:\\Users\\Soliva\\Documents\\CPFL\\CPFL_0715184732_20200810_120000.txt";
		
		List<String> test = new ArrayList<String>();
		
		List<LayoutOcorrenciasIrregularidade> list = new ArrayList<LayoutOcorrenciasIrregularidade>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while (line != null) {
				
				test.add(line);
				
				line = br.readLine();
			}	
			// Inicial -1 final +1
			for (String s : test) {
				LayoutOcorrenciasIrregularidade layoutOcorrenciasIrregularidade = new LayoutOcorrenciasIrregularidade();
				
				String tipoRegistro = s.substring(0, 1);
				layoutOcorrenciasIrregularidade.setTipoRegistro(tipoRegistro);
				
				String instalacao = s.substring(1, 12);
				layoutOcorrenciasIrregularidade.setInstalacao(instalacao);
				
				String identificacao = s.substring(11, 32);
				layoutOcorrenciasIrregularidade.setIdentificacao(identificacao);
				
				String valorCobrar = s.substring(31, 47);
				layoutOcorrenciasIrregularidade.setValorCobrar(valorCobrar);
				
				String codigoDoItem = s.substring(46, 53);
				layoutOcorrenciasIrregularidade.setCodigoDoItem(codigoDoItem);
				
				String irregularidade = s.substring(52, 55);
				layoutOcorrenciasIrregularidade.setIrregularidade(irregularidade);
				
				String dataVencimento = s.substring(54, 63);
				layoutOcorrenciasIrregularidade.setDataVencimento(dataVencimento);
				
				String dataFaturamento = s.substring(62, 71);
				layoutOcorrenciasIrregularidade.setDataFaturamento(dataFaturamento);
				
				String parcela = s.substring(70, 101);
				layoutOcorrenciasIrregularidade.setParcela(parcela);
				
				String pnDoParceiro = s.substring(100, 112);
				layoutOcorrenciasIrregularidade.setPnDoParceiro(pnDoParceiro);
				
				String brancos = s.substring(111, 135);
				layoutOcorrenciasIrregularidade.setBrancos(brancos);
				
				String empresa = s.substring(134, 139);
				layoutOcorrenciasIrregularidade.setEmpresa(empresa);
				
				String mesReferenciaFaturamento = s.substring(138, 145);
				layoutOcorrenciasIrregularidade.setMesReferenciaFaturamento(mesReferenciaFaturamento);
				
				list.add(layoutOcorrenciasIrregularidade);
			}
			
			for (LayoutOcorrenciasIrregularidade p : list) {
				System.out.println(p.toString());
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}