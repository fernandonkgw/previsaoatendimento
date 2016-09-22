package br.com.fernandonkgw.previsaoatendimento;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Test;

public class PrevisaoAtendimentoTest {

	@Test
	public void deveIncrementar3diasNaDataPrevistaEmDiasCorridos() {
		
		Calendar dataAprovacao = new GregorianCalendar(2016, 8, 5, 11, 23, 20);
		Integer prazoEmDiasUteis = 3;
		String cepUnidade = "05336010";
		PrevisaoAtendimento previsaoAtendimento = new PrevisaoAtendimento(dataAprovacao, prazoEmDiasUteis, cepUnidade);
		
		Calendar dataPrevistaEsperada = new GregorianCalendar(2016, 8, 8, 23, 59, 59);
		Assert.assertEquals(dataPrevistaEsperada, previsaoAtendimento.getDataPrevistaDiasCorridos());
	}

}
