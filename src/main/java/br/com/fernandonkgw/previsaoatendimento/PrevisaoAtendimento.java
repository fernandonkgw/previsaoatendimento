package br.com.fernandonkgw.previsaoatendimento;

import java.util.Calendar;

public class PrevisaoAtendimento {

	private final Calendar dataAprovacao;
	private final Integer prazoEmDiasUteis;
	private final String cepUnidade;

	public PrevisaoAtendimento(Calendar dataAprovacao, Integer prazoEmDiasUteis, String cepUnidade) {
		this.dataAprovacao = dataAprovacao;
		this.prazoEmDiasUteis = prazoEmDiasUteis;
		this.cepUnidade = cepUnidade;
	}

	public Calendar getDataAprovacao() {
		return dataAprovacao;
	}

	public Integer getPrazoEmDiasUteis() {
		return prazoEmDiasUteis;
	}

	public String getCepUnidade() {
		return cepUnidade;
	}

	public Calendar getDataPrevistaDiasCorridos() {
		Calendar dataPrevistaEmDiasCorridos = (Calendar) this.dataAprovacao.clone();
		dataPrevistaEmDiasCorridos.add(Calendar.DAY_OF_MONTH, this.prazoEmDiasUteis);
		dataPrevistaEmDiasCorridos.set(Calendar.HOUR_OF_DAY, 23);
		dataPrevistaEmDiasCorridos.set(Calendar.MINUTE, 59);
		dataPrevistaEmDiasCorridos.set(Calendar.SECOND, 59);
		
		return dataPrevistaEmDiasCorridos;
	}


}
