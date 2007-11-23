CONNECT TO FREEDOM USER DB2ADMIN;

ALTER TABLE FREEDOM.ATATENDENTE ADD CONSTRAINT ATATENDENTEPK PRIMARY KEY (CODATEND,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.ATATENDIMENTO ADD CONSTRAINT ATATENDIMENTOPK PRIMARY KEY (CODATENDO,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.ATATENDIMENTOORC ADD CONSTRAINT ATATENDIMENTOORCPK PRIMARY KEY (CODATENDO,CODFILIAL,CODEMP,CODORC,TIPOORC,CODFILIALOC,CODEMPOC);
COMMIT WORK;
ALTER TABLE FREEDOM.ATATRIBUICAO ADD CONSTRAINT ATATRIBUICAOPK PRIMARY KEY (CODATRIB,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.ATCONVATRIB ADD CONSTRAINT ATCONVATRIBPK PRIMARY KEY (CODCONV,SEQCONVATRIB,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.ATCONVATRIBTB ADD CONSTRAINT ATCONVATRIBTB PRIMARY KEY (CODITTB,CODTB,CODFILIALTB,CODEMPTB,SEQCONVATRIB,CODCONV,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.ATCONVENIADO ADD CONSTRAINT ATCONVENIADOPK PRIMARY KEY (CODCONV,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.ATENCAMINHADOR ADD CONSTRAINT ATENCAMINHADORPK PRIMARY KEY (CODENC,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.ATSETOR ADD CONSTRAINT ATSETORPK PRIMARY KEY (CODSETAT,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.ATSETORATENDENTE ADD CONSTRAINT ATSETORATENDENTEPK PRIMARY KEY (CODSETAT,CODFILIAL,CODEMP,CODATEND,CODFILIALAE,CODEMPAE);
COMMIT WORK;
ALTER TABLE FREEDOM.ATTIPOATEND ADD CONSTRAINT ATTIPOATENDPK PRIMARY KEY (CODTPATEND,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.ATTIPOATENDO ADD CONSTRAINT ATTIPOATENDOPK PRIMARY KEY (CODTPATENDO,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.ATTIPOATENDOSETOR ADD CONSTRAINT ATTIPOATENDOSETOPK PRIMARY KEY (CODSETAT,CODFILIALST,CODEMPST,CODTPATENDO,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.ATTIPOCONV ADD CONSTRAINT ATTIPOCONVPK PRIMARY KEY (CODTPCONV,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.CPCOMPRA ADD CONSTRAINT CPCOMPRAPK PRIMARY KEY (CODCOMPRA,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.CPCOMPRAVENDA ADD CONSTRAINT CPCOMPRAVENDAPK PRIMARY KEY (CODITCOMPRA,CODCOMPRA,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.CPCOTACAO ADD CONSTRAINT CPCOTACAOPK PRIMARY KEY (CODSOL,CODITSOL,CODCOT,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.CPEQUIVCFOP ADD CONSTRAINT CPEQUIVCFOPPK PRIMARY KEY (CODNAT,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.CPFORNECED ADD CONSTRAINT CPFORNECEDPK PRIMARY KEY (CODFOR,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.CPITCOMPRA ADD CONSTRAINT CPITCOMPRAPK PRIMARY KEY (CODITCOMPRA,CODCOMPRA,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.CPITSOLICITACAO ADD CONSTRAINT CPITSOLICITACAOPK PRIMARY KEY (CODSOL,CODITSOL,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.CPITSUMSOL ADD CONSTRAINT PK_CPITSUMSOL PRIMARY KEY (CODITSOL,CODSOL,CODFILIALSC,CODEMPSC,CODSUMSOL,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.CPPRODFOR ADD CONSTRAINT CPPRODFORPK PRIMARY KEY (CODFOR,CODPROD,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.CPRATEIO ADD CONSTRAINT CPRATEIOPK PRIMARY KEY (CODCOMPRA,SEQRATEIO,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.CPSOLICITACAO ADD CONSTRAINT CPSOLICITACAOPK PRIMARY KEY (CODSOL,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.CPSUMSOL ADD CONSTRAINT CPSUMSOLPK PRIMARY KEY (CODSUMSOL,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.CPTABFOR ADD CONSTRAINT CPTABFORPK PRIMARY KEY (REFPRODTFOR,CODFOR,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.CPTIPOFOR ADD CONSTRAINT CPTIPOFORPK PRIMARY KEY (CODTIPOFOR,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.EQALMOX ADD CONSTRAINT EQALMOXPK PRIMARY KEY (CODALMOX,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.EQALMOXFILIAL ADD CONSTRAINT EQALMOXFILIALPK PRIMARY KEY (CODALMOX,CODFILIAL,CODEMP,CODFILIALAF,CODEMPAF);
COMMIT WORK;
ALTER TABLE FREEDOM.EQCODALTPROD ADD CONSTRAINT EQCODALTPRODPK PRIMARY KEY (CODALTPROD,CODPROD,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.EQFATCONV ADD CONSTRAINT EQFATCONVPK PRIMARY KEY (CODUNID,CODPROD,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.EQGRUPO ADD CONSTRAINT EQGRUPOPK PRIMARY KEY (CODGRUP,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.EQINVPROD ADD CONSTRAINT EQINVPRODPK PRIMARY KEY (CODINVPROD,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.EQITMODGRADE ADD CONSTRAINT EQITMODGRADEPK PRIMARY KEY (CODITMODG,CODMODG,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.EQITRMA ADD CONSTRAINT EQITRMAPK PRIMARY KEY (CODRMA,CODITRMA,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.EQITSIMILAR ADD CONSTRAINT EQITSIMILARPK PRIMARY KEY (CODPROD,CODFILIALPD,CODEMPPD,CODSIM,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.EQLANCTOEXP ADD CONSTRAINT EQLANCTOEXPPK PRIMARY KEY (CODLEXP,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.EQLOTE ADD CONSTRAINT EQLOTEPK PRIMARY KEY (CODLOTE,CODPROD,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.EQMARCA ADD CONSTRAINT EQMARCAPK PRIMARY KEY (CODMARCA,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.EQMODGRADE ADD CONSTRAINT EQMODGRADEPK PRIMARY KEY (CODMODG,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.EQMODLOTE ADD CONSTRAINT EQMODLOTEPK PRIMARY KEY (CODMODLOTE,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.EQMOVEXP ADD CONSTRAINT EQMOVEXPPK PRIMARY KEY (CODMOVEXP,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.EQMOVPROD ADD CONSTRAINT EQMOVPRODPK PRIMARY KEY (CODMOVPROD,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.EQPRODACESSO ADD CONSTRAINT EQPRODACESSOPK PRIMARY KEY (CODPROD,CODPA,TIPOPA,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.EQPRODPLAN ADD CONSTRAINT EQPRODPLANPK PRIMARY KEY (CODPROD,CODFILIAL,CODEMP,SEQPP);
COMMIT WORK;
ALTER TABLE FREEDOM.EQPRODUTO ADD CONSTRAINT EQPRODUTOPK PRIMARY KEY (CODPROD,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.EQRMA ADD CONSTRAINT EQRMAPK PRIMARY KEY (CODRMA,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.EQRMAAL ADD CONSTRAINT EQRMAALPK PRIMARY KEY (CODRMA,TIPORMAAL,CODFILIAL,CODEMP,IDUSU,CODFILIALUU,CODEMPUU);
COMMIT WORK;
ALTER TABLE FREEDOM.EQSALDOLOTE ADD CONSTRAINT EQSALDOLOTEPK PRIMARY KEY (CODLOTE,CODPROD,CODFILIAL,CODEMP,CODALMOX,CODFILIALAX,CODEMPAX);
COMMIT WORK;
ALTER TABLE FREEDOM.EQSALDOPROD ADD CONSTRAINT EQSALDOPRODPK PRIMARY KEY (CODPROD,CODFILIAL,CODEMP,CODALMOX,CODFILIALAX,CODEMPAX);
COMMIT WORK;
ALTER TABLE FREEDOM.EQSIMILAR ADD CONSTRAINT EQSIMILARPK PRIMARY KEY (CODSIM,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.EQTIPOEXP ADD CONSTRAINT EQTIPOEXPPK PRIMARY KEY (CODTIPOEXP,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.EQTIPOMOV ADD CONSTRAINT EQTIPOMOVPK PRIMARY KEY (CODTIPOMOV,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.EQTIPOMOVUSU ADD CONSTRAINT EQTIPOMOVUSUPK PRIMARY KEY (CODTIPOMOV,CODFILIAL,CODEMP,IDUSU,CODFILIALUS,CODEMPUS);
COMMIT WORK;
ALTER TABLE FREEDOM.EQUNIDADE ADD CONSTRAINT EQUNIDADEPK PRIMARY KEY (CODUNID,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.EQVARGRADE ADD CONSTRAINT EQVARGRADEPK PRIMARY KEY (CODVARG,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.FNBANCO ADD CONSTRAINT FNBANCOPK PRIMARY KEY (CODBANCO,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.FNCARTCOB ADD CONSTRAINT FNCARTCOBPK PRIMARY KEY (CODCARTCOB,CODFILIAL,CODEMP,CODBANCO,CODFILIALBO,CODEMPBO);
COMMIT WORK;
ALTER TABLE FREEDOM.FNCC ADD CONSTRAINT FNCCPK PRIMARY KEY (CODCC,ANOCC,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.FNCONTA ADD CONSTRAINT FNCONTAPK PRIMARY KEY (NUMCONTA,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.FNCONTAUSU ADD CONSTRAINT FNCONTAUSUPK PRIMARY KEY (NUMCONTA,CODFILIAL,CODEMP,IDUSU,CODFILIALUS,CODEMPUS);
COMMIT WORK;
ALTER TABLE FREEDOM.FNCOTMOEDA ADD CONSTRAINT FNCOTMOEDAPK PRIMARY KEY (DATACOT,CODMOEDA,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.FNFBNCLI ADD CONSTRAINT FNFBNCLIPK PRIMARY KEY (CODCLI,CODFILIAL,CODEMP,CODBANCO,CODFILIALBO,CODEMPBO,CODFILIALPF,CODEMPPF,TIPOFEBRABAN);
COMMIT WORK;
ALTER TABLE FREEDOM.FNFBNCODRET ADD CONSTRAINT FNFBNCODRETPK PRIMARY KEY (CODRET,TIPOFEBRABAN,CODBANCO,CODFILIALBO,CODEMPBO,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.FNFBNREC ADD CONSTRAINT FNFBNRECPK PRIMARY KEY (CODREC,NPARCITREC,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.FNHISTPAD ADD CONSTRAINT FNHISTPADPK PRIMARY KEY (CODHIST,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.FNITMODBOLETO ADD CONSTRAINT FNITMODBOLETOPK PRIMARY KEY (CODMODBOL,CODFILIAL,CODEMP,CODBANCO,CODFILIALBO,CODEMPBO,CODCARTCOB,CODFILIALCB,CODEMPCB);
COMMIT WORK;
ALTER TABLE FREEDOM.FNITPAGAR ADD CONSTRAINT FNITPAGARPK PRIMARY KEY (NPARCPAG,CODPAG,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.FNITRECEBER ADD CONSTRAINT FNITRECEBERPK PRIMARY KEY (NPARCITREC,CODREC,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.FNITTBJUROS ADD CONSTRAINT FNITTBJUROSPK PRIMARY KEY (CODTBJ,MESITTBJ,ANOITTBJ,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.FNLANCA ADD CONSTRAINT FNLANCAPK PRIMARY KEY (CODLANCA,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.FNLIBCRED ADD CONSTRAINT FNLIBCREDPK PRIMARY KEY (CODLCRED,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.FNMODBOLETO ADD CONSTRAINT FNMODBOLETOPK PRIMARY KEY (CODMODBOL,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.FNMOEDA ADD CONSTRAINT FNMOEDAPK PRIMARY KEY (CODMOEDA,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.FNPAGAR ADD CONSTRAINT FNPAGARPK PRIMARY KEY (CODPAG,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.FNPAGTOCOMI ADD CONSTRAINT FNPAGTOCOMIPK PRIMARY KEY (CODPCOMI,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.FNPARCPAG ADD CONSTRAINT FNPARCPAGPK PRIMARY KEY (NROPARCPAG,CODPLANOPAG,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.FNPLANEJAMENTO ADD CONSTRAINT FNPLANEJAMENTOPK PRIMARY KEY (CODPLAN,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.FNPLANOPAG ADD CONSTRAINT FNPLANOPAGPK PRIMARY KEY (CODPLANOPAG,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.FNRECEBER ADD CONSTRAINT FNRECEBERPK PRIMARY KEY (CODREC,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.FNSALDOLANCA ADD CONSTRAINT FNSALDOLANCAPK PRIMARY KEY (DATASL,CODFILIALPN,CODEMPPN,CODPLAN,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.FNSUBLANCA ADD CONSTRAINT FNSUBLANCAPK PRIMARY KEY (CODSUBLANCA,CODLANCA,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.FNTBJUROS ADD CONSTRAINT FNTBJUROSPK PRIMARY KEY (CODTBJ,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.FNTIPOCOB ADD CONSTRAINT FNTIPOCOBPK PRIMARY KEY (CODTIPOCOB,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.FNTIPOCRED ADD CONSTRAINT FNTIPOCREDPK PRIMARY KEY (CODTPCRED,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.LFCLFISCAL ADD CONSTRAINT LFCLFISCALPK PRIMARY KEY (CODFISC,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.LFITCLFISCAL ADD CONSTRAINT LFITCLFISCAL PRIMARY KEY (CODEMP,CODFILIAL,CODFISC,CODITFISC);
COMMIT WORK;
ALTER TABLE FREEDOM.LFITNATOPER ADD CONSTRAINT LFITNATOPER PRIMARY KEY (CODITNATOPER,CODNAT,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.LFITREGRAFISCAL ADD CONSTRAINT LFITREGRAFISCALPK PRIMARY KEY (CODNAT,CODREGRA,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.LFLIVROFISCAL ADD CONSTRAINT LFLIVROFISCALPK PRIMARY KEY (CODLF,ANOMESLF,TIPOLF,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.LFMENSAGEM ADD CONSTRAINT LFMENSAGEMPK PRIMARY KEY (CODMENS,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.LFMODNOTA ADD CONSTRAINT LFMODNOTAPK PRIMARY KEY (CODMODNOTA,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.LFNATOPER ADD CONSTRAINT LFNATOPERPK PRIMARY KEY (CODNAT,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.LFREGRAFISCAL ADD CONSTRAINT LFREGRAFISCALPK PRIMARY KEY (CODREGRA,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.LFSERIE ADD CONSTRAINT LFSERIEPK PRIMARY KEY (SERIE,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.LFTABICMS ADD CONSTRAINT LFTABICMSPK PRIMARY KEY (UFTI,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.LFTIPOFISCCLI ADD CONSTRAINT LFTIPOFISCCLIPK PRIMARY KEY (CODFISCCLI,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.LFTRATTRIB ADD CONSTRAINT LFTRATTRIBPK PRIMARY KEY (CODTRATTRIB,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.PPDISTRIB ADD CONSTRAINT PPDISTRIBPK PRIMARY KEY (CODPROD,CODFILIAL,CODEMP,SEQEST,SEQEF,CODPRODDE,CODFILIALDE,CODEMPDE,SEQDE,SEQESTDE,CODFASE,CODFILIALFS,CODEMPFS);
COMMIT WORK;
ALTER TABLE FREEDOM.PPESTRUFASE ADD CONSTRAINT PPESTRUFASEPK PRIMARY KEY (CODPROD,SEQEST,SEQEF,CODFILIAL,CODEMP,CODFASE,CODFILIALFS,CODEMPFS);
COMMIT WORK;
ALTER TABLE FREEDOM.PPESTRUTURA ADD CONSTRAINT PPESTRUTURAPK PRIMARY KEY (CODPROD,SEQEST,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.PPFASE ADD CONSTRAINT PPFASEPK PRIMARY KEY (CODFASE,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.PPITESTRUTURA ADD CONSTRAINT PPITESTRUTURAPK PRIMARY KEY (CODPROD,SEQEST,SEQITEST,CODFILIAL,CODEMP,SEQEF,CODFASE,CODFILIALFS,CODEMPFS);
COMMIT WORK;
ALTER TABLE FREEDOM.PPITOP ADD CONSTRAINT PPITOPPK PRIMARY KEY (CODOP,SEQOP,SEQITOP,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.PPOP ADD CONSTRAINT PPOPPK PRIMARY KEY (CODOP,SEQOP,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.PPOPFASE ADD CONSTRAINT PPOPFASEPK PRIMARY KEY (CODOP,SEQOP,SEQOF,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.PPRECURSO ADD CONSTRAINT PPRECURSOPK PRIMARY KEY (CODRECP,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.PPTIPOREC ADD CONSTRAINT PPTIPORECPK PRIMARY KEY (CODTPREC,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.PVCAIXA ADD CONSTRAINT PVCAIXAPK PRIMARY KEY (CODCAIXA,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.PVCAIXAIMP ADD CONSTRAINT PVCAIXAIMPPK PRIMARY KEY (CODIMP,CODCAIXA,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.PVLEITURAX ADD PRIMARY KEY (CODEMP,CODFILIAL,CODCAIXA,DTLX);
COMMIT WORK;
ALTER TABLE FREEDOM.PVMOVCAIXA ADD CONSTRAINT PVMOVCAIXAPK PRIMARY KEY (NROMOV,DTAMOV,CODCAIXA,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.PVSEQMOVCAIXA ADD CONSTRAINT PVSEQMOVCAIXA PRIMARY KEY (DTAMOV,CODCAIXA,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.PVSEQUENCIA ADD CONSTRAINT PK_PVSEQUENCIA PRIMARY KEY (CODEMP,CODFILIAL,CODCAIXA);
COMMIT WORK;
ALTER TABLE FREEDOM.RHDEPTO ADD CONSTRAINT RHDEPTOPK PRIMARY KEY (CODDEP,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.RHEMPREGADO ADD CONSTRAINT RHEMPREGADOPK PRIMARY KEY (MATEMPR,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.RHFUNCAO ADD CONSTRAINT RHFUNCAOPK PRIMARY KEY (CODFUNC,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.RHTURNO ADD CONSTRAINT RHTURNOPK PRIMARY KEY (CODTURNO,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGACESSOEU ADD CONSTRAINT SGACESSOEUPK PRIMARY KEY (CODFILIALFL,CODEMPFL,IDUSU,CODEMP,CODFILIAL);
COMMIT WORK;
ALTER TABLE FREEDOM.SGACESSOMG ADD CONSTRAINT SGACESSOMGPK PRIMARY KEY (CODMENU,CODMODU,CODSIS,IDGRPUSU,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGACESSOMU ADD CONSTRAINT SGACESSOMUPK PRIMARY KEY (CODMENU,CODMODU,CODSIS,IDUSU,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGAGENDA ADD CONSTRAINT SGAGENDAPK PRIMARY KEY (CODAGE,TIPOAGE,CODAGD,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGAGENTE ADD CONSTRAINT SGAGENTEPK PRIMARY KEY (CODAGE,TIPOAGE,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGATRIBUICAO ADD CONSTRAINT SGATRIBUICAOPK PRIMARY KEY (IDATRIB,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGATRIBUSU ADD CONSTRAINT SGATRIBUSUPK PRIMARY KEY (IDUSU,CODFILIALUU,CODEMPUU,IDATRIB,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGCIDADE ADD CONSTRAINT PK_SGCIDADE PRIMARY KEY (CODCID);
COMMIT WORK;
ALTER TABLE FREEDOM.SGCONEXAO ADD CONSTRAINT SGCONEXAOPK PRIMARY KEY (NRCONEXAO);
COMMIT WORK;
ALTER TABLE FREEDOM.SGEMPRESA ADD CONSTRAINT SGEMPRESAPK PRIMARY KEY (CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGEQVCLIFOR ADD CONSTRAINT SGEQVCLIFORPK PRIMARY KEY (CODCLI,CODFILIALCL,CODEMPCL,CODFOR,CODFILIALFR,CODEMPFR);
COMMIT WORK;
ALTER TABLE FREEDOM.SGESTACAO ADD CONSTRAINT SGESTACAOPK PRIMARY KEY (CODEST,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGESTACAOIMP ADD CONSTRAINT SGESTACAOIMPPK PRIMARY KEY (CODEST,NROIMP,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGFILIAL ADD CONSTRAINT SGFILIALPK PRIMARY KEY (CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGFLUXO ADD CONSTRAINT SGFLUXOPK PRIMARY KEY (CODFLUXO,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGGATILHO ADD CONSTRAINT SGGATILHOPK PRIMARY KEY (CODOBJ,DISPGAT,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGGRAUINST ADD CONSTRAINT SGGRAUINSTPK PRIMARY KEY (CODGRI,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGGRPUSU ADD CONSTRAINT SGGRPUSUPK PRIMARY KEY (IDGRPUSU,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGIMPRESSORA ADD CONSTRAINT SGIMPRESSORAPK PRIMARY KEY (CODIMP,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGITFLUXO ADD CONSTRAINT SGITFLUXOPK PRIMARY KEY (CODFLUXO,SEQITFLUXO,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGITPREFERE6 ADD CONSTRAINT SGITPREFERE6PK PRIMARY KEY (CODBANCO,TIPOFEBRABAN,CODFILIALBO,CODEMPBO,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGITPROCESSO ADD CONSTRAINT SGITPROCESSOPK PRIMARY KEY (CODPROC,SEQITPROC,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGITTABELA ADD CONSTRAINT SGITTABELAPK PRIMARY KEY (CODITTB,CODTB,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGLOG ADD CONSTRAINT SGLOGPK PRIMARY KEY (CODLOG,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGMENU ADD CONSTRAINT SGMENUPK PRIMARY KEY (CODMENU,CODMODU,CODSIS);
COMMIT WORK;
ALTER TABLE FREEDOM.SGMENUOBJ ADD CONSTRAINT SGMENUOBJOK PRIMARY KEY (CODMENU,CODMODU,CODSIS,IDOBJ,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGMODETIQUETA ADD CONSTRAINT SGMODETIQUETAPK PRIMARY KEY (CODMODETIQ,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGMODULO ADD CONSTRAINT SGMODULOPK PRIMARY KEY (CODMODU,CODSIS);
COMMIT WORK;
ALTER TABLE FREEDOM.SGOBJETO ADD CONSTRAINT SGOBJETOPK PRIMARY KEY (IDOBJ,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGOBJETOTB ADD CONSTRAINT SGOBJETOTBPK PRIMARY KEY (CODTB,CODFILIALTB,CODEMPTB,IDOBJ,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGPAIS ADD CONSTRAINT SGPAISPK PRIMARY KEY (CODPAIS);
COMMIT WORK;
ALTER TABLE FREEDOM.SGPAPEL ADD CONSTRAINT SGPAPELPK PRIMARY KEY (CODPAPEL,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGPREFERE1 ADD CONSTRAINT SGPREFERE1PK PRIMARY KEY (CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGPREFERE2 ADD CONSTRAINT PKSGPREFERE2 PRIMARY KEY (CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGPREFERE4 ADD CONSTRAINT SGPREFERE4PK PRIMARY KEY (CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGPREFERE5 ADD CONSTRAINT SGPREFERE5PK PRIMARY KEY (CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGPREFERE6 ADD CONSTRAINT SGPREFERE6PK PRIMARY KEY (CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGPROCESSO ADD CONSTRAINT SGPROCESSOPK PRIMARY KEY (CODPROC,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGSEQUENCIA ADD CONSTRAINT SGSEQUENCIAPK PRIMARY KEY (SGTAB,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGSISTEMA ADD CONSTRAINT SGSISTEMAPK PRIMARY KEY (CODSIS);
COMMIT WORK;
ALTER TABLE FREEDOM.SGTABELA ADD CONSTRAINT SGTABELAPK PRIMARY KEY (CODTB,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGTAREFA ADD CONSTRAINT SGTAREFAPK PRIMARY KEY (CODTAREFA,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGTIPOAGENDA ADD CONSTRAINT PK_SGTIPOAGENDA PRIMARY KEY (CODEMP,CODFILIAL,CODTIPOAGD);
COMMIT WORK;
ALTER TABLE FREEDOM.SGTRATARET ADD CONSTRAINT SGTRATARETPK PRIMARY KEY (CODPROC,CODTRATRET,SEQITPROC,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGUSUARIO ADD CONSTRAINT SGUSUARIOPK PRIMARY KEY (IDUSU,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SGVARIAVEL ADD CONSTRAINT SGVARIAVELPK PRIMARY KEY (IDVAR,IDCON);
COMMIT WORK;
ALTER TABLE FREEDOM.SVAVALIACAO ADD CONSTRAINT SVAVALIACAOPK PRIMARY KEY (CODOS,CODITOS,CODAVAL,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SVEXECUCAO ADD CONSTRAINT SVEXECUCAOPK PRIMARY KEY (CODOS,CODITOS,CODEXEC,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SVITOS ADD CONSTRAINT SVITOSPK PRIMARY KEY (CODOS,CODITOS,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.SVOS ADD CONSTRAINT SVOSPK PRIMARY KEY (CODOS,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.TKATIVIDADE ADD CONSTRAINT TKATIVIDADEPK PRIMARY KEY (CODATIV,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.TKCONTATO ADD CONSTRAINT TKCONTATOPK PRIMARY KEY (CODCTO,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.TKCTOATIV ADD CONSTRAINT TKCTOATIVPK PRIMARY KEY (CODCTO,CODFILIAL,CODEMP,CODATIV,CODFILIALAV,CODEMPAV);
COMMIT WORK;
ALTER TABLE FREEDOM.TKHISTORICO ADD CONSTRAINT TKHISTORICOPK PRIMARY KEY (CODHISTTK,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.TKSETORCTO ADD CONSTRAINT TKSETORCTOPK PRIMARY KEY (CODSETORCTO,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.TKTIPOIMP ADD CONSTRAINT TKTIPOIMPPK PRIMARY KEY (CODTPIMP,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.VDAUXVENDA ADD CONSTRAINT VDAUXVENDAPK PRIMARY KEY (CODVENDA,CODAUXV,TIPOVENDA,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.VDCLASCLI ADD CONSTRAINT VDCLASCLIPK PRIMARY KEY (CODCLASCLI,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.VDCLCOMIS ADD CONSTRAINT VDCLCOMISPK PRIMARY KEY (CODCLCOMIS,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.VDCLIAUTP ADD CONSTRAINT VDCLIAUTPPK PRIMARY KEY (CODCLI,CODAUTP,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.VDCLICOMPL ADD CONSTRAINT VDCLICOMPLPK PRIMARY KEY (CODCLI,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.VDCLICONTAS ADD CONSTRAINT VDCLICONTASPK PRIMARY KEY (CODCLI,CODFILIAL,CODEMP,CONTA);
COMMIT WORK;
ALTER TABLE FREEDOM.VDCLIENTE ADD CONSTRAINT VDCLIENTEPK PRIMARY KEY (CODCLI,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.VDCLIENTEFOR ADD CONSTRAINT VDCLIENTEFORPK PRIMARY KEY (CODCLI,CODFILIAL,CODEMP,CODFOR,CODFILIALFR,CODEMPFR);
COMMIT WORK;
ALTER TABLE FREEDOM.VDCLIIMOV ADD CONSTRAINT VDCLIIMOVPK PRIMARY KEY (CODCLI,CODFILIAL,CODEMP,CODIMOV);
COMMIT WORK;
ALTER TABLE FREEDOM.VDCLIMETAVEND ADD CONSTRAINT VDCLIMETAVENDPK PRIMARY KEY (CODCLI,CODFILIAL,CODEMP,ANOMETAVEND);
COMMIT WORK;
ALTER TABLE FREEDOM.VDCLIREFC ADD CONSTRAINT VDCLIREFCPK PRIMARY KEY (CODCLI,CODREFC,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.VDCLIREFP ADD CONSTRAINT VDCLIREFPPK PRIMARY KEY (CODCLI,CODREFP,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.VDCLISOCIOS ADD CONSTRAINT VDCLISOCIOSPK PRIMARY KEY (CODCLI,CODFILIAL,CODEMP,NOMESOCIO);
COMMIT WORK;
ALTER TABLE FREEDOM.VDCLITERRA ADD CONSTRAINT VDCLITERRAPK PRIMARY KEY (CODCLI,CODFILIAL,CODEMP,CODTERRA);
COMMIT WORK;
ALTER TABLE FREEDOM.VDCLIVEIC ADD CONSTRAINT VDCLIVEICPK PRIMARY KEY (PLACAVEIC,CODCLI,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.VDCOMISSAO ADD CONSTRAINT VDCOMISSAOPK PRIMARY KEY (CODCOMI,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.VDFOTOPROD ADD CONSTRAINT VDFOTOPRODPK PRIMARY KEY (CODFOTOPROD,CODPROD,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.VDFRETEVD ADD CONSTRAINT VDFRETEVDPK PRIMARY KEY (CODVENDA,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.VDITKIT ADD CONSTRAINT VDITKITPK PRIMARY KEY (CODKIT,SEQITKIT,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.VDITORCAMENTO ADD CONSTRAINT VDITORCAMENTOPK PRIMARY KEY (CODORC,CODITORC,TIPOORC,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.VDITROMANEIO ADD CONSTRAINT VDITROMANEIO PRIMARY KEY (CODITROMA,CODROMA,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.VDITVENDA ADD CONSTRAINT VDITVENDAPK PRIMARY KEY (CODVENDA,CODITVENDA,TIPOVENDA,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.VDKIT ADD CONSTRAINT VDKITPK PRIMARY KEY (CODKIT,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.VDOBSCLI ADD CONSTRAINT VDOBSCLIPK PRIMARY KEY (CODCLI,SEQOBSCLI,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.VDORCAMENTO ADD CONSTRAINT VDORCAMENTOPK PRIMARY KEY (CODORC,TIPOORC,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.VDPRAZOENT ADD CONSTRAINT VDPRAZOENTPK PRIMARY KEY (CODPE,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.VDPRECOPROD ADD CONSTRAINT VDPRECOPRODPK PRIMARY KEY (CODPRECOPROD,CODPROD,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.VDROMANEIO ADD CONSTRAINT VDROMANEIOPK PRIMARY KEY (CODROMA,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.VDSETOR ADD CONSTRAINT VDSETORPK PRIMARY KEY (CODSETOR,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.VDSTATUSORC ADD CONSTRAINT VDSTATUSORCPK PRIMARY KEY (CODORC,TIPOORC,CODFILIAL,CODEMP,CODITTB,CODTB,CODFILIALTB,CODEMPTB);
COMMIT WORK;
ALTER TABLE FREEDOM.VDTABPRECO ADD CONSTRAINT VDTABPRECOPK PRIMARY KEY (CODTAB,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.VDTEF ADD CONSTRAINT VDTEFPK PRIMARY KEY (CODVENDA,NSUTEF,TIPOVENDA,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.VDTIPOCLI ADD CONSTRAINT VDTIPOCLIPK PRIMARY KEY (CODTIPOCLI,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.VDTRANSP ADD CONSTRAINT VDTRANSPPK PRIMARY KEY (CODTRAN,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.VDVENDA ADD CONSTRAINT VDVENDAPK PRIMARY KEY (CODVENDA,TIPOVENDA,CODFILIAL,CODEMP);
COMMIT WORK;
ALTER TABLE FREEDOM.VDVENDAORC ADD CONSTRAINT VDVENDAORCPK PRIMARY KEY (CODVENDA,CODITVENDA,TIPOVENDA,CODFILIAL,CODEMP,CODORC,CODITORC,TIPOORC,CODFILIALOR,CODEMPOR);
COMMIT WORK;
ALTER TABLE FREEDOM.VDVENDEDOR ADD CONSTRAINT VDVENDEDORPK PRIMARY KEY (CODVEND,CODFILIAL,CODEMP);
COMMIT WORK;
