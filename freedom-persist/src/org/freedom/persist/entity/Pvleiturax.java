package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Pvleiturax generated by hbm2java
 */
public class Pvleiturax implements java.io.Serializable {

	private PvleituraxId id;
	private BigDecimal tt01;
	private BigDecimal tt02;
	private BigDecimal tt03;
	private BigDecimal tt04;
	private BigDecimal tt05;
	private BigDecimal tt06;
	private BigDecimal tt07;
	private BigDecimal tt08;
	private BigDecimal tt09;
	private BigDecimal tt10;
	private BigDecimal tt11;
	private BigDecimal tt12;
	private BigDecimal tt13;
	private BigDecimal tt14;
	private BigDecimal tt15;
	private BigDecimal tt16;
	private BigDecimal tisencao;
	private BigDecimal tnincidencia;
	private BigDecimal tsubstituicao;
	private BigDecimal tn1;
	private BigDecimal tn2;
	private BigDecimal tn3;
	private BigDecimal tn4;
	private BigDecimal tn5;
	private BigDecimal tn6;
	private BigDecimal tn7;
	private BigDecimal tn8;
	private BigDecimal tn9;
	private BigDecimal tsangria;
	private BigDecimal tsuprimento;
	private BigDecimal tgtotal;
	private BigDecimal aliq01;
	private BigDecimal aliq02;
	private BigDecimal aliq03;
	private BigDecimal aliq04;
	private BigDecimal aliq05;
	private BigDecimal aliq06;
	private BigDecimal aliq07;
	private BigDecimal aliq08;
	private BigDecimal aliq09;
	private BigDecimal aliq10;
	private BigDecimal aliq11;
	private BigDecimal aliq12;
	private BigDecimal aliq13;
	private BigDecimal aliq14;
	private BigDecimal aliq15;
	private BigDecimal aliq16;
	private BigDecimal vlrcontabillx;
	private BigDecimal vlrbasecalclx;
	private Integer numcanclx;
	private Integer numredlx;
	private BigDecimal vlrcanclx;
	private BigDecimal vlrdesclx;
	private BigDecimal contalx;
	private BigDecimal vlroutrosreclx;
	private Integer ultcupomlx;
	private Integer primcupomlx;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Pvleiturax() {
	}

	public Pvleiturax(PvleituraxId id, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Pvleiturax(PvleituraxId id, BigDecimal tt01, BigDecimal tt02,
			BigDecimal tt03, BigDecimal tt04, BigDecimal tt05, BigDecimal tt06,
			BigDecimal tt07, BigDecimal tt08, BigDecimal tt09, BigDecimal tt10,
			BigDecimal tt11, BigDecimal tt12, BigDecimal tt13, BigDecimal tt14,
			BigDecimal tt15, BigDecimal tt16, BigDecimal tisencao,
			BigDecimal tnincidencia, BigDecimal tsubstituicao, BigDecimal tn1,
			BigDecimal tn2, BigDecimal tn3, BigDecimal tn4, BigDecimal tn5,
			BigDecimal tn6, BigDecimal tn7, BigDecimal tn8, BigDecimal tn9,
			BigDecimal tsangria, BigDecimal tsuprimento, BigDecimal tgtotal,
			BigDecimal aliq01, BigDecimal aliq02, BigDecimal aliq03,
			BigDecimal aliq04, BigDecimal aliq05, BigDecimal aliq06,
			BigDecimal aliq07, BigDecimal aliq08, BigDecimal aliq09,
			BigDecimal aliq10, BigDecimal aliq11, BigDecimal aliq12,
			BigDecimal aliq13, BigDecimal aliq14, BigDecimal aliq15,
			BigDecimal aliq16, BigDecimal vlrcontabillx,
			BigDecimal vlrbasecalclx, Integer numcanclx, Integer numredlx,
			BigDecimal vlrcanclx, BigDecimal vlrdesclx, BigDecimal contalx,
			BigDecimal vlroutrosreclx, Integer ultcupomlx, Integer primcupomlx,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt) {
		this.id = id;
		this.tt01 = tt01;
		this.tt02 = tt02;
		this.tt03 = tt03;
		this.tt04 = tt04;
		this.tt05 = tt05;
		this.tt06 = tt06;
		this.tt07 = tt07;
		this.tt08 = tt08;
		this.tt09 = tt09;
		this.tt10 = tt10;
		this.tt11 = tt11;
		this.tt12 = tt12;
		this.tt13 = tt13;
		this.tt14 = tt14;
		this.tt15 = tt15;
		this.tt16 = tt16;
		this.tisencao = tisencao;
		this.tnincidencia = tnincidencia;
		this.tsubstituicao = tsubstituicao;
		this.tn1 = tn1;
		this.tn2 = tn2;
		this.tn3 = tn3;
		this.tn4 = tn4;
		this.tn5 = tn5;
		this.tn6 = tn6;
		this.tn7 = tn7;
		this.tn8 = tn8;
		this.tn9 = tn9;
		this.tsangria = tsangria;
		this.tsuprimento = tsuprimento;
		this.tgtotal = tgtotal;
		this.aliq01 = aliq01;
		this.aliq02 = aliq02;
		this.aliq03 = aliq03;
		this.aliq04 = aliq04;
		this.aliq05 = aliq05;
		this.aliq06 = aliq06;
		this.aliq07 = aliq07;
		this.aliq08 = aliq08;
		this.aliq09 = aliq09;
		this.aliq10 = aliq10;
		this.aliq11 = aliq11;
		this.aliq12 = aliq12;
		this.aliq13 = aliq13;
		this.aliq14 = aliq14;
		this.aliq15 = aliq15;
		this.aliq16 = aliq16;
		this.vlrcontabillx = vlrcontabillx;
		this.vlrbasecalclx = vlrbasecalclx;
		this.numcanclx = numcanclx;
		this.numredlx = numredlx;
		this.vlrcanclx = vlrcanclx;
		this.vlrdesclx = vlrdesclx;
		this.contalx = contalx;
		this.vlroutrosreclx = vlroutrosreclx;
		this.ultcupomlx = ultcupomlx;
		this.primcupomlx = primcupomlx;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public PvleituraxId getId() {
		return this.id;
	}

	public void setId(PvleituraxId id) {
		this.id = id;
	}

	public BigDecimal getTt01() {
		return this.tt01;
	}

	public void setTt01(BigDecimal tt01) {
		this.tt01 = tt01;
	}

	public BigDecimal getTt02() {
		return this.tt02;
	}

	public void setTt02(BigDecimal tt02) {
		this.tt02 = tt02;
	}

	public BigDecimal getTt03() {
		return this.tt03;
	}

	public void setTt03(BigDecimal tt03) {
		this.tt03 = tt03;
	}

	public BigDecimal getTt04() {
		return this.tt04;
	}

	public void setTt04(BigDecimal tt04) {
		this.tt04 = tt04;
	}

	public BigDecimal getTt05() {
		return this.tt05;
	}

	public void setTt05(BigDecimal tt05) {
		this.tt05 = tt05;
	}

	public BigDecimal getTt06() {
		return this.tt06;
	}

	public void setTt06(BigDecimal tt06) {
		this.tt06 = tt06;
	}

	public BigDecimal getTt07() {
		return this.tt07;
	}

	public void setTt07(BigDecimal tt07) {
		this.tt07 = tt07;
	}

	public BigDecimal getTt08() {
		return this.tt08;
	}

	public void setTt08(BigDecimal tt08) {
		this.tt08 = tt08;
	}

	public BigDecimal getTt09() {
		return this.tt09;
	}

	public void setTt09(BigDecimal tt09) {
		this.tt09 = tt09;
	}

	public BigDecimal getTt10() {
		return this.tt10;
	}

	public void setTt10(BigDecimal tt10) {
		this.tt10 = tt10;
	}

	public BigDecimal getTt11() {
		return this.tt11;
	}

	public void setTt11(BigDecimal tt11) {
		this.tt11 = tt11;
	}

	public BigDecimal getTt12() {
		return this.tt12;
	}

	public void setTt12(BigDecimal tt12) {
		this.tt12 = tt12;
	}

	public BigDecimal getTt13() {
		return this.tt13;
	}

	public void setTt13(BigDecimal tt13) {
		this.tt13 = tt13;
	}

	public BigDecimal getTt14() {
		return this.tt14;
	}

	public void setTt14(BigDecimal tt14) {
		this.tt14 = tt14;
	}

	public BigDecimal getTt15() {
		return this.tt15;
	}

	public void setTt15(BigDecimal tt15) {
		this.tt15 = tt15;
	}

	public BigDecimal getTt16() {
		return this.tt16;
	}

	public void setTt16(BigDecimal tt16) {
		this.tt16 = tt16;
	}

	public BigDecimal getTisencao() {
		return this.tisencao;
	}

	public void setTisencao(BigDecimal tisencao) {
		this.tisencao = tisencao;
	}

	public BigDecimal getTnincidencia() {
		return this.tnincidencia;
	}

	public void setTnincidencia(BigDecimal tnincidencia) {
		this.tnincidencia = tnincidencia;
	}

	public BigDecimal getTsubstituicao() {
		return this.tsubstituicao;
	}

	public void setTsubstituicao(BigDecimal tsubstituicao) {
		this.tsubstituicao = tsubstituicao;
	}

	public BigDecimal getTn1() {
		return this.tn1;
	}

	public void setTn1(BigDecimal tn1) {
		this.tn1 = tn1;
	}

	public BigDecimal getTn2() {
		return this.tn2;
	}

	public void setTn2(BigDecimal tn2) {
		this.tn2 = tn2;
	}

	public BigDecimal getTn3() {
		return this.tn3;
	}

	public void setTn3(BigDecimal tn3) {
		this.tn3 = tn3;
	}

	public BigDecimal getTn4() {
		return this.tn4;
	}

	public void setTn4(BigDecimal tn4) {
		this.tn4 = tn4;
	}

	public BigDecimal getTn5() {
		return this.tn5;
	}

	public void setTn5(BigDecimal tn5) {
		this.tn5 = tn5;
	}

	public BigDecimal getTn6() {
		return this.tn6;
	}

	public void setTn6(BigDecimal tn6) {
		this.tn6 = tn6;
	}

	public BigDecimal getTn7() {
		return this.tn7;
	}

	public void setTn7(BigDecimal tn7) {
		this.tn7 = tn7;
	}

	public BigDecimal getTn8() {
		return this.tn8;
	}

	public void setTn8(BigDecimal tn8) {
		this.tn8 = tn8;
	}

	public BigDecimal getTn9() {
		return this.tn9;
	}

	public void setTn9(BigDecimal tn9) {
		this.tn9 = tn9;
	}

	public BigDecimal getTsangria() {
		return this.tsangria;
	}

	public void setTsangria(BigDecimal tsangria) {
		this.tsangria = tsangria;
	}

	public BigDecimal getTsuprimento() {
		return this.tsuprimento;
	}

	public void setTsuprimento(BigDecimal tsuprimento) {
		this.tsuprimento = tsuprimento;
	}

	public BigDecimal getTgtotal() {
		return this.tgtotal;
	}

	public void setTgtotal(BigDecimal tgtotal) {
		this.tgtotal = tgtotal;
	}

	public BigDecimal getAliq01() {
		return this.aliq01;
	}

	public void setAliq01(BigDecimal aliq01) {
		this.aliq01 = aliq01;
	}

	public BigDecimal getAliq02() {
		return this.aliq02;
	}

	public void setAliq02(BigDecimal aliq02) {
		this.aliq02 = aliq02;
	}

	public BigDecimal getAliq03() {
		return this.aliq03;
	}

	public void setAliq03(BigDecimal aliq03) {
		this.aliq03 = aliq03;
	}

	public BigDecimal getAliq04() {
		return this.aliq04;
	}

	public void setAliq04(BigDecimal aliq04) {
		this.aliq04 = aliq04;
	}

	public BigDecimal getAliq05() {
		return this.aliq05;
	}

	public void setAliq05(BigDecimal aliq05) {
		this.aliq05 = aliq05;
	}

	public BigDecimal getAliq06() {
		return this.aliq06;
	}

	public void setAliq06(BigDecimal aliq06) {
		this.aliq06 = aliq06;
	}

	public BigDecimal getAliq07() {
		return this.aliq07;
	}

	public void setAliq07(BigDecimal aliq07) {
		this.aliq07 = aliq07;
	}

	public BigDecimal getAliq08() {
		return this.aliq08;
	}

	public void setAliq08(BigDecimal aliq08) {
		this.aliq08 = aliq08;
	}

	public BigDecimal getAliq09() {
		return this.aliq09;
	}

	public void setAliq09(BigDecimal aliq09) {
		this.aliq09 = aliq09;
	}

	public BigDecimal getAliq10() {
		return this.aliq10;
	}

	public void setAliq10(BigDecimal aliq10) {
		this.aliq10 = aliq10;
	}

	public BigDecimal getAliq11() {
		return this.aliq11;
	}

	public void setAliq11(BigDecimal aliq11) {
		this.aliq11 = aliq11;
	}

	public BigDecimal getAliq12() {
		return this.aliq12;
	}

	public void setAliq12(BigDecimal aliq12) {
		this.aliq12 = aliq12;
	}

	public BigDecimal getAliq13() {
		return this.aliq13;
	}

	public void setAliq13(BigDecimal aliq13) {
		this.aliq13 = aliq13;
	}

	public BigDecimal getAliq14() {
		return this.aliq14;
	}

	public void setAliq14(BigDecimal aliq14) {
		this.aliq14 = aliq14;
	}

	public BigDecimal getAliq15() {
		return this.aliq15;
	}

	public void setAliq15(BigDecimal aliq15) {
		this.aliq15 = aliq15;
	}

	public BigDecimal getAliq16() {
		return this.aliq16;
	}

	public void setAliq16(BigDecimal aliq16) {
		this.aliq16 = aliq16;
	}

	public BigDecimal getVlrcontabillx() {
		return this.vlrcontabillx;
	}

	public void setVlrcontabillx(BigDecimal vlrcontabillx) {
		this.vlrcontabillx = vlrcontabillx;
	}

	public BigDecimal getVlrbasecalclx() {
		return this.vlrbasecalclx;
	}

	public void setVlrbasecalclx(BigDecimal vlrbasecalclx) {
		this.vlrbasecalclx = vlrbasecalclx;
	}

	public Integer getNumcanclx() {
		return this.numcanclx;
	}

	public void setNumcanclx(Integer numcanclx) {
		this.numcanclx = numcanclx;
	}

	public Integer getNumredlx() {
		return this.numredlx;
	}

	public void setNumredlx(Integer numredlx) {
		this.numredlx = numredlx;
	}

	public BigDecimal getVlrcanclx() {
		return this.vlrcanclx;
	}

	public void setVlrcanclx(BigDecimal vlrcanclx) {
		this.vlrcanclx = vlrcanclx;
	}

	public BigDecimal getVlrdesclx() {
		return this.vlrdesclx;
	}

	public void setVlrdesclx(BigDecimal vlrdesclx) {
		this.vlrdesclx = vlrdesclx;
	}

	public BigDecimal getContalx() {
		return this.contalx;
	}

	public void setContalx(BigDecimal contalx) {
		this.contalx = contalx;
	}

	public BigDecimal getVlroutrosreclx() {
		return this.vlroutrosreclx;
	}

	public void setVlroutrosreclx(BigDecimal vlroutrosreclx) {
		this.vlroutrosreclx = vlroutrosreclx;
	}

	public Integer getUltcupomlx() {
		return this.ultcupomlx;
	}

	public void setUltcupomlx(Integer ultcupomlx) {
		this.ultcupomlx = ultcupomlx;
	}

	public Integer getPrimcupomlx() {
		return this.primcupomlx;
	}

	public void setPrimcupomlx(Integer primcupomlx) {
		this.primcupomlx = primcupomlx;
	}

	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

}
