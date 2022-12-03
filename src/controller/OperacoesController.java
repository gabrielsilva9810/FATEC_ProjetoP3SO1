package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import json.DadosBrutos;

public class OperacoesController {

	public OperacoesController() {
		super();
	}
	
	//------------ LENDO DIRETORIO ---------------
	public void lerDiretorio(String caminho, String arquivo) throws Exception{
		File arq = new File(caminho, arquivo);
		
		
		if (arq.exists() && arq.isFile()) {
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leFluxo = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leFluxo);
			String linha = buffer.readLine();
			
			while(linha != null) {				
				linha = buffer.readLine();
				//separarUnit(linha);
				System.out.println(linha);
				
				
//				DadosBrutos db = new DadosBrutos();
//				String[] vetorPalavras = linha.split(":");
//				System.err.println(vetorPalavras[1]);
//				db.name = vetorPalavras[1];
				
				
//				linha = buffer.readLine();
//				System.out.println(linha);
//				
//				
//				String[] vetPalavra = linha.split(":");
//				System.err.println(vetPalavra[0]);
//				db.unit = vetPalavra[0];
//				
				//System.out.println(db);
				
			}
			
			buffer.close();
			leFluxo.close();
			fluxo.close();
		}		
	}
	
	//----------------------- SEPARANDO UNIT ---------------------------
	public void separarUnit(String linha) {
		if(linha.contains("name")) {
			DadosBrutos db = new DadosBrutos();
			String[] vetorPalavras = linha.split(":");
			System.err.println(vetorPalavras[1]);
			db.name = vetorPalavras[1];
			System.out.println(db);
		}
		
	}

}

	

