/* Generated by IB DB Comparer v.1.15.Beta.  23/10/2007 11:11:58 */
/* Server Version: WI-V6.3.4.4910 Firebird 1.5.  ODS Version: 10.1. */

SET NAMES NONE;

SET SQL DIALECT 3;

CONNECT '/opt/firebird/dados/vazio.fdb' USER 'SYSDBA' PASSWORD 'masterkey';

/* Create Primary Key... */
ALTER TABLE "ATATENDENTE" ADD CONSTRAINT "ATATENDENTEPK" PRIMARY KEY ("CODATEND","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "ATATENDIMENTO" ADD CONSTRAINT "ATATENDIMENTOPK" PRIMARY KEY ("CODATENDO","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "ATATENDIMENTOORC" ADD CONSTRAINT "ATATENDIMENTOORCPK" PRIMARY KEY ("CODATENDO","CODFILIAL","CODEMP","CODORC","TIPOORC","CODFILIALOC","CODEMPOC");
COMMIT WORK;
ALTER TABLE "ATATRIBUICAO" ADD CONSTRAINT "ATATRIBUICAOPK" PRIMARY KEY ("CODATRIB","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "ATCONVATRIB" ADD CONSTRAINT "ATCONVATRIBPK" PRIMARY KEY ("CODCONV","SEQCONVATRIB","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "ATCONVATRIBTB" ADD CONSTRAINT "ATCONVATRIBTB" PRIMARY KEY ("CODITTB","CODTB","CODFILIALTB","CODEMPTB","SEQCONVATRIB","CODCONV","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "ATCONVENIADO" ADD CONSTRAINT "ATCONVENIADOPK" PRIMARY KEY ("CODCONV","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "ATENCAMINHADOR" ADD CONSTRAINT "ATENCAMINHADORPK" PRIMARY KEY ("CODENC","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "ATSETOR" ADD CONSTRAINT "ATSETORPK" PRIMARY KEY ("CODSETAT","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "ATSETORATENDENTE" ADD CONSTRAINT "ATSETORATENDENTEPK" PRIMARY KEY ("CODSETAT","CODFILIAL","CODEMP","CODATEND","CODFILIALAE","CODEMPAE");
COMMIT WORK;
ALTER TABLE "ATTIPOATEND" ADD CONSTRAINT "ATTIPOATENDPK" PRIMARY KEY ("CODTPATEND","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "ATTIPOATENDO" ADD CONSTRAINT "ATTIPOATENDOPK" PRIMARY KEY ("CODTPATENDO","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "ATTIPOATENDOSETOR" ADD CONSTRAINT "ATTIPOATENDOSETORPK" PRIMARY KEY ("CODSETAT","CODFILIALST","CODEMPST","CODTPATENDO","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "ATTIPOCONV" ADD CONSTRAINT "ATTIPOCONVPK" PRIMARY KEY ("CODTPCONV","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "CPCOMPRA" ADD CONSTRAINT "CPCOMPRAPK" PRIMARY KEY ("CODCOMPRA","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "CPCOMPRAVENDA" ADD CONSTRAINT "CPCOMPRAVENDAPK" PRIMARY KEY ("CODITCOMPRA","CODCOMPRA","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "CPCOTACAO" ADD CONSTRAINT "CPCOTACAOPK" PRIMARY KEY ("CODSOL","CODITSOL","CODCOT","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "CPEQUIVCFOP" ADD CONSTRAINT "CPEQUIVCFOPPK" PRIMARY KEY ("CODNAT","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "CPFORNECED" ADD CONSTRAINT "CPFORNECEDPK" PRIMARY KEY ("CODFOR","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "CPITCOMPRA" ADD CONSTRAINT "CPITCOMPRAPK" PRIMARY KEY ("CODITCOMPRA","CODCOMPRA","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "CPITSOLICITACAO" ADD CONSTRAINT "CPITSOLICITACAOPK" PRIMARY KEY ("CODSOL","CODITSOL","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "CPITSUMSOL" ADD CONSTRAINT "PK_CPITSUMSOL" PRIMARY KEY ("CODITSOL","CODSOL","CODFILIALSC","CODEMPSC","CODSUMSOL","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "CPPRODFOR" ADD CONSTRAINT "CPPRODFORPK" PRIMARY KEY ("CODFOR","CODPROD","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "CPRATEIO" ADD CONSTRAINT "CPRATEIOPK" PRIMARY KEY ("CODCOMPRA","SEQRATEIO","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "CPSOLICITACAO" ADD CONSTRAINT "CPSOLICITACAOPK" PRIMARY KEY ("CODSOL","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "CPSUMSOL" ADD CONSTRAINT "CPSUMSOLPK" PRIMARY KEY ("CODSUMSOL","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "CPTABFOR" ADD CONSTRAINT "CPTABFORPK" PRIMARY KEY ("REFPRODTFOR","CODFOR","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "CPTIPOFOR" ADD CONSTRAINT "CPTIPOFORPK" PRIMARY KEY ("CODTIPOFOR","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "EQALMOX" ADD CONSTRAINT "EQALMOXPK" PRIMARY KEY ("CODALMOX","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "EQALMOXFILIAL" ADD CONSTRAINT "EQALMOXFILIALPK" PRIMARY KEY ("CODALMOX","CODFILIAL","CODEMP","CODFILIALAF","CODEMPAF");
COMMIT WORK;
ALTER TABLE "EQCODALTPROD" ADD CONSTRAINT "EQCODALTPRODPK" PRIMARY KEY ("CODALTPROD","CODPROD","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "EQFATCONV" ADD CONSTRAINT "EQFATCONVPK" PRIMARY KEY ("CODUNID","CODPROD","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "EQGRUPO" ADD CONSTRAINT "EQGRUPOPK" PRIMARY KEY ("CODGRUP","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "EQINVPROD" ADD CONSTRAINT "EQINVPRODPK" PRIMARY KEY ("CODINVPROD","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "EQITMODGRADE" ADD CONSTRAINT "EQITMODGRADEPK" PRIMARY KEY ("CODITMODG","CODMODG","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "EQITRMA" ADD CONSTRAINT "EQITRMAPK" PRIMARY KEY ("CODRMA","CODITRMA","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "EQITSIMILAR" ADD CONSTRAINT "EQITSIMILARPK" PRIMARY KEY ("CODPROD","CODFILIALPD","CODEMPPD","CODSIM","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "EQLANCTOEXP" ADD CONSTRAINT "EQLANCTOEXPPK" PRIMARY KEY ("CODLEXP","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "EQLOTE" ADD CONSTRAINT "EQLOTEPK" PRIMARY KEY ("CODLOTE","CODPROD","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "EQMARCA" ADD CONSTRAINT "EQMARCAPK" PRIMARY KEY ("CODMARCA","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "EQMODGRADE" ADD CONSTRAINT "EQMODGRADEPK" PRIMARY KEY ("CODMODG","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "EQMODLOTE" ADD CONSTRAINT "EQMODLOTEPK" PRIMARY KEY ("CODMODLOTE","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "EQMOVEXP" ADD CONSTRAINT "EQMOVEXPPK" PRIMARY KEY ("CODMOVEXP","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "EQMOVPROD" ADD CONSTRAINT "EQMOVPRODPK" PRIMARY KEY ("CODMOVPROD","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "EQPRODACESSO" ADD CONSTRAINT "EQPRODACESSOPK" PRIMARY KEY ("CODPROD","CODPA","TIPOPA","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "EQPRODPLAN" ADD CONSTRAINT "EQPRODPLANPK" PRIMARY KEY ("CODPROD","CODFILIAL","CODEMP","SEQPP");
COMMIT WORK;
ALTER TABLE "EQPRODUTO" ADD CONSTRAINT "EQPRODUTOPK" PRIMARY KEY ("CODPROD","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "EQRMA" ADD CONSTRAINT "EQRMAPK" PRIMARY KEY ("CODRMA","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "EQRMAAL" ADD CONSTRAINT "EQRMAALPK" PRIMARY KEY ("CODRMA","TIPORMAAL","CODFILIAL","CODEMP","IDUSU","CODFILIALUU","CODEMPUU");
COMMIT WORK;
ALTER TABLE "EQSALDOLOTE" ADD CONSTRAINT "EQSALDOLOTEPK" PRIMARY KEY ("CODLOTE","CODPROD","CODFILIAL","CODEMP","CODALMOX","CODFILIALAX","CODEMPAX");
COMMIT WORK;
ALTER TABLE "EQSALDOPROD" ADD CONSTRAINT "EQSALDOPRODPK" PRIMARY KEY ("CODPROD","CODFILIAL","CODEMP","CODALMOX","CODFILIALAX","CODEMPAX");
COMMIT WORK;
ALTER TABLE "EQSIMILAR" ADD CONSTRAINT "EQSIMILARPK" PRIMARY KEY ("CODSIM","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "EQTIPOEXP" ADD CONSTRAINT "EQTIPOEXPPK" PRIMARY KEY ("CODTIPOEXP","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "EQTIPOMOV" ADD CONSTRAINT "EQTIPOMOVPK" PRIMARY KEY ("CODTIPOMOV","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "EQTIPOMOVUSU" ADD CONSTRAINT "EQTIPOMOVUSUPK" PRIMARY KEY ("CODTIPOMOV","CODFILIAL","CODEMP","IDUSU","CODFILIALUS","CODEMPUS");
COMMIT WORK;
ALTER TABLE "EQUNIDADE" ADD CONSTRAINT "EQUNIDADEPK" PRIMARY KEY ("CODUNID","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "EQVARGRADE" ADD CONSTRAINT "EQVARGRADEPK" PRIMARY KEY ("CODVARG","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "FNBANCO" ADD CONSTRAINT "FNBANCOPK" PRIMARY KEY ("CODBANCO","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "FNCARTCOB" ADD CONSTRAINT "FNCARTCOBPK" PRIMARY KEY ("CODCARTCOB","CODFILIAL","CODEMP","CODBANCO","CODFILIALBO","CODEMPBO");
COMMIT WORK;
ALTER TABLE "FNCC" ADD CONSTRAINT "FNCCPK" PRIMARY KEY ("CODCC","ANOCC","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "FNCONTA" ADD CONSTRAINT "FNCONTAPK" PRIMARY KEY ("NUMCONTA","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "FNCONTAUSU" ADD CONSTRAINT "FNCONTAUSUPK" PRIMARY KEY ("NUMCONTA","CODFILIAL","CODEMP","IDUSU","CODFILIALUS","CODEMPUS");
COMMIT WORK;
ALTER TABLE "FNCOTMOEDA" ADD CONSTRAINT "FNCOTMOEDAPK" PRIMARY KEY ("DATACOT","CODMOEDA","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "FNFBNCLI" ADD CONSTRAINT "FNFBNCLIPK" PRIMARY KEY ("CODCLI","CODFILIAL","CODEMP","CODBANCO","CODFILIALBO","CODEMPBO","CODFILIALPF","CODEMPPF","TIPOFEBRABAN");
COMMIT WORK;
ALTER TABLE "FNFBNCODRET" ADD CONSTRAINT "FNFBNCODRETPK" PRIMARY KEY ("CODRET","TIPOFEBRABAN","CODBANCO","CODFILIALBO","CODEMPBO","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "FNFBNREC" ADD CONSTRAINT "FNFBNRECPK" PRIMARY KEY ("CODREC","NPARCITREC","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "FNHISTPAD" ADD CONSTRAINT "FNHISTPADPK" PRIMARY KEY ("CODHIST","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "FNITMODBOLETO" ADD CONSTRAINT "FNITMODBOLETOPK" PRIMARY KEY ("CODMODBOL","CODFILIAL","CODEMP","CODBANCO","CODFILIALBO","CODEMPBO","CODCARTCOB","CODFILIALCB","CODEMPCB");
COMMIT WORK;
ALTER TABLE "FNITPAGAR" ADD CONSTRAINT "FNITPAGARPK" PRIMARY KEY ("NPARCPAG","CODPAG","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "FNITRECEBER" ADD CONSTRAINT "FNITRECEBERPK" PRIMARY KEY ("NPARCITREC","CODREC","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "FNITTBJUROS" ADD CONSTRAINT "FNITTBJUROSPK" PRIMARY KEY ("CODTBJ","MESITTBJ","ANOITTBJ","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "FNLANCA" ADD CONSTRAINT "FNLANCAPK" PRIMARY KEY ("CODLANCA","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "FNLIBCRED" ADD CONSTRAINT "FNLIBCREDPK" PRIMARY KEY ("CODLCRED","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "FNMODBOLETO" ADD CONSTRAINT "FNMODBOLETOPK" PRIMARY KEY ("CODMODBOL","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "FNMOEDA" ADD CONSTRAINT "FNMOEDAPK" PRIMARY KEY ("CODMOEDA","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "FNPAGAR" ADD CONSTRAINT "FNPAGARPK" PRIMARY KEY ("CODPAG","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "FNPAGTOCOMI" ADD CONSTRAINT "FNPAGTOCOMIPK" PRIMARY KEY ("CODPCOMI","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "FNPARCPAG" ADD CONSTRAINT "FNPARCPAGPK" PRIMARY KEY ("NROPARCPAG","CODPLANOPAG","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "FNPLANEJAMENTO" ADD CONSTRAINT "FNPLANEJAMENTOPK" PRIMARY KEY ("CODPLAN","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "FNPLANOPAG" ADD CONSTRAINT "FNPLANOPAGPK" PRIMARY KEY ("CODPLANOPAG","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "FNRECEBER" ADD CONSTRAINT "FNRECEBERPK" PRIMARY KEY ("CODREC","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "FNSALDOLANCA" ADD CONSTRAINT "FNSALDOLANCAPK" PRIMARY KEY ("DATASL","CODFILIALPN","CODEMPPN","CODPLAN","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "FNSUBLANCA" ADD CONSTRAINT "FNSUBLANCAPK" PRIMARY KEY ("CODSUBLANCA","CODLANCA","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "FNTBJUROS" ADD CONSTRAINT "FNTBJUROSPK" PRIMARY KEY ("CODTBJ","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "FNTIPOCOB" ADD CONSTRAINT "FNTIPOCOBPK" PRIMARY KEY ("CODTIPOCOB","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "FNTIPOCRED" ADD CONSTRAINT "FNTIPOCREDPK" PRIMARY KEY ("CODTPCRED","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "LFCLFISCAL" ADD CONSTRAINT "LFCLFISCALPK" PRIMARY KEY ("CODFISC","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "LFITCLFISCAL" ADD CONSTRAINT "LFITCLFISCAL" PRIMARY KEY ("CODEMP","CODFILIAL","CODFISC","CODITFISC");
COMMIT WORK;
ALTER TABLE "LFITNATOPER" ADD CONSTRAINT "LFITNATOPER" PRIMARY KEY ("CODITNATOPER","CODNAT","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "LFITREGRAFISCAL" ADD CONSTRAINT "LFITREGRAFISCALPK" PRIMARY KEY ("CODNAT","CODREGRA","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "LFLIVROFISCAL" ADD CONSTRAINT "LFLIVROFISCALPK" PRIMARY KEY ("CODLF","ANOMESLF","TIPOLF","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "LFMENSAGEM" ADD CONSTRAINT "LFMENSAGEMPK" PRIMARY KEY ("CODMENS","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "LFMODNOTA" ADD CONSTRAINT "LFMODNOTAPK" PRIMARY KEY ("CODMODNOTA","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "LFNATOPER" ADD CONSTRAINT "LFNATOPERPK" PRIMARY KEY ("CODNAT","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "LFREGRAFISCAL" ADD CONSTRAINT "LFREGRAFISCALPK" PRIMARY KEY ("CODREGRA","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "LFSERIE" ADD CONSTRAINT "LFSERIEPK" PRIMARY KEY ("SERIE","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "LFTABICMS" ADD CONSTRAINT "LFTABICMSPK" PRIMARY KEY ("UFTI","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "LFTIPOFISCCLI" ADD CONSTRAINT "LFTIPOFISCCLIPK" PRIMARY KEY ("CODFISCCLI","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "LFTRATTRIB" ADD CONSTRAINT "LFTRATTRIBPK" PRIMARY KEY ("CODTRATTRIB","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "PPDISTRIB" ADD CONSTRAINT "PPDISTRIBPK" PRIMARY KEY ("CODPROD","CODFILIAL","CODEMP","SEQEST","SEQEF","CODPRODDE","CODFILIALDE","CODEMPDE","SEQDE","SEQESTDE","CODFASE","CODFILIALFS","CODEMPFS");
COMMIT WORK;
ALTER TABLE "PPESTRUFASE" ADD CONSTRAINT "PPESTRUFASEPK" PRIMARY KEY ("CODPROD","SEQEST","SEQEF","CODFILIAL","CODEMP","CODFASE","CODFILIALFS","CODEMPFS");
COMMIT WORK;
ALTER TABLE "PPESTRUTURA" ADD CONSTRAINT "PPESTRUTURAPK" PRIMARY KEY ("CODPROD","SEQEST","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "PPFASE" ADD CONSTRAINT "PPFASEPK" PRIMARY KEY ("CODFASE","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "PPITESTRUTURA" ADD CONSTRAINT "PPITESTRUTURAPK" PRIMARY KEY ("CODPROD","SEQEST","SEQITEST","CODFILIAL","CODEMP","SEQEF","CODFASE","CODFILIALFS","CODEMPFS");
COMMIT WORK;
ALTER TABLE "PPITOP" ADD CONSTRAINT "PPITOPPK" PRIMARY KEY ("CODOP","SEQOP","SEQITOP","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "PPOP" ADD CONSTRAINT "PPOPPK" PRIMARY KEY ("CODOP","SEQOP","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "PPOPFASE" ADD CONSTRAINT "PPOPFASEPK" PRIMARY KEY ("CODOP","SEQOP","SEQOF","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "PPRECURSO" ADD CONSTRAINT "PPRECURSOPK" PRIMARY KEY ("CODRECP","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "PPTIPOREC" ADD CONSTRAINT "PPTIPORECPK" PRIMARY KEY ("CODTPREC","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "PVCAIXA" ADD CONSTRAINT "PVCAIXAPK" PRIMARY KEY ("CODCAIXA","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "PVCAIXAIMP" ADD CONSTRAINT "PVCAIXAIMPPK" PRIMARY KEY ("CODIMP","CODCAIXA","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "PVLEITURAX" ADD PRIMARY KEY ("CODEMP","CODFILIAL","CODCAIXA","DTLX");
COMMIT WORK;
ALTER TABLE "PVMOVCAIXA" ADD CONSTRAINT "PVMOVCAIXAPK" PRIMARY KEY ("NROMOV","DTAMOV","CODCAIXA","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "PVSEQMOVCAIXA" ADD CONSTRAINT "PVSEQMOVCAIXA" PRIMARY KEY ("DTAMOV","CODCAIXA","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "PVSEQUENCIA" ADD CONSTRAINT "PK_PVSEQUENCIA" PRIMARY KEY ("CODEMP","CODFILIAL","CODCAIXA");
COMMIT WORK;
ALTER TABLE "RHDEPTO" ADD CONSTRAINT "RHDEPTOPK" PRIMARY KEY ("CODDEP","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "RHEMPREGADO" ADD CONSTRAINT "RHEMPREGADOPK" PRIMARY KEY ("MATEMPR","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "RHFUNCAO" ADD CONSTRAINT "RHFUNCAOPK" PRIMARY KEY ("CODFUNC","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "RHTURNO" ADD CONSTRAINT "RHTURNOPK" PRIMARY KEY ("CODTURNO","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SGACESSOEU" ADD CONSTRAINT "SGACESSOEUPK" PRIMARY KEY ("CODFILIALFL","CODEMPFL","IDUSU","CODEMP","CODFILIAL");
COMMIT WORK;
ALTER TABLE "SGACESSOMG" ADD CONSTRAINT "SGACESSOMGPK" PRIMARY KEY ("CODMENU","CODMODU","CODSIS","IDGRPUSU","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SGACESSOMU" ADD CONSTRAINT "SGACESSOMUPK" PRIMARY KEY ("CODMENU","CODMODU","CODSIS","IDUSU","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SGAGENDA" ADD CONSTRAINT "SGAGENDAPK" PRIMARY KEY ("CODAGE","TIPOAGE","CODAGD","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SGAGENTE" ADD CONSTRAINT "SGAGENTEPK" PRIMARY KEY ("CODAGE","TIPOAGE","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SGATRIBUICAO" ADD CONSTRAINT "SGATRIBUICAOPK" PRIMARY KEY ("IDATRIB","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SGATRIBUSU" ADD CONSTRAINT "SGATRIBUSUPK" PRIMARY KEY ("IDUSU","CODFILIALUU","CODEMPUU","IDATRIB","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SGCIDADE" ADD CONSTRAINT "PK_SGCIDADE" PRIMARY KEY ("CODCID");
COMMIT WORK;
ALTER TABLE "SGCONEXAO" ADD CONSTRAINT "SGCONEXAOPK" PRIMARY KEY ("NRCONEXAO");
COMMIT WORK;
ALTER TABLE "SGEMPRESA" ADD CONSTRAINT "SGEMPRESAPK" PRIMARY KEY ("CODEMP");
COMMIT WORK;
ALTER TABLE "SGEQVCLIFOR" ADD CONSTRAINT "SGEQVCLIFORPK" PRIMARY KEY ("CODCLI","CODFILIALCL","CODEMPCL","CODFOR","CODFILIALFR","CODEMPFR");
COMMIT WORK;
ALTER TABLE "SGESTACAO" ADD CONSTRAINT "SGESTACAOPK" PRIMARY KEY ("CODEST","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SGESTACAOIMP" ADD CONSTRAINT "SGESTACAOIMPPK" PRIMARY KEY ("CODEST","NROIMP","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SGFILIAL" ADD CONSTRAINT "SGFILIALPK" PRIMARY KEY ("CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SGFLUXO" ADD CONSTRAINT "SGFLUXOPK" PRIMARY KEY ("CODFLUXO","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SGGATILHO" ADD CONSTRAINT "SGGATILHOPK" PRIMARY KEY ("CODOBJ","DISPGAT","CODEMP");
COMMIT WORK;
ALTER TABLE "SGGRAUINST" ADD CONSTRAINT "SGGRAUINSTPK" PRIMARY KEY ("CODGRI","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SGGRPUSU" ADD CONSTRAINT "SGGRPUSUPK" PRIMARY KEY ("IDGRPUSU","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SGIMPRESSORA" ADD CONSTRAINT "SGIMPRESSORAPK" PRIMARY KEY ("CODIMP","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SGITFLUXO" ADD CONSTRAINT "SGITFLUXOPK" PRIMARY KEY ("CODFLUXO","SEQITFLUXO","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SGITPREFERE6" ADD CONSTRAINT "SGITPREFERE6PK" PRIMARY KEY ("CODBANCO","TIPOFEBRABAN","CODFILIALBO","CODEMPBO","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SGITPROCESSO" ADD CONSTRAINT "SGITPROCESSOPK" PRIMARY KEY ("CODPROC","SEQITPROC","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SGITTABELA" ADD CONSTRAINT "SGITTABELAPK" PRIMARY KEY ("CODITTB","CODTB","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SGLOG" ADD CONSTRAINT "SGLOGPK" PRIMARY KEY ("CODLOG","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SGMENU" ADD CONSTRAINT "SGMENUPK" PRIMARY KEY ("CODMENU","CODMODU","CODSIS");
COMMIT WORK;
ALTER TABLE "SGMENUOBJ" ADD CONSTRAINT "SGMENUOBJOK" PRIMARY KEY ("CODMENU","CODMODU","CODSIS","IDOBJ","CODEMP");
COMMIT WORK;
ALTER TABLE "SGMODETIQUETA" ADD CONSTRAINT "SGMODETIQUETAPK" PRIMARY KEY ("CODMODETIQ","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SGMODULO" ADD CONSTRAINT "SGMODULOPK" PRIMARY KEY ("CODMODU","CODSIS");
COMMIT WORK;
ALTER TABLE "SGOBJETO" ADD CONSTRAINT "SGOBJETOPK" PRIMARY KEY ("IDOBJ","CODEMP");
COMMIT WORK;
ALTER TABLE "SGOBJETOTB" ADD CONSTRAINT "SGOBJETOTBPK" PRIMARY KEY ("CODTB","CODFILIALTB","CODEMPTB","IDOBJ","CODEMP");
COMMIT WORK;
ALTER TABLE "SGPAIS" ADD CONSTRAINT "SGPAISPK" PRIMARY KEY ("CODPAIS");
COMMIT WORK;
ALTER TABLE "SGPAPEL" ADD CONSTRAINT "SGPAPELPK" PRIMARY KEY ("CODPAPEL","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SGPREFERE1" ADD CONSTRAINT "SGPREFERE1PK" PRIMARY KEY ("CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SGPREFERE2" ADD CONSTRAINT "PKSGPREFERE2" PRIMARY KEY ("CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SGPREFERE4" ADD CONSTRAINT "SGPREFERE4PK" PRIMARY KEY ("CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SGPREFERE5" ADD CONSTRAINT "SGPREFERE5PK" PRIMARY KEY ("CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SGPREFERE6" ADD CONSTRAINT "SGPREFERE6PK" PRIMARY KEY ("CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SGPROCESSO" ADD CONSTRAINT "SGPROCESSOPK" PRIMARY KEY ("CODPROC","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SGSEQUENCIA" ADD CONSTRAINT "SGSEQUENCIAPK" PRIMARY KEY ("SGTAB","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SGSISTEMA" ADD CONSTRAINT "SGSISTEMAPK" PRIMARY KEY ("CODSIS");
COMMIT WORK;
ALTER TABLE "SGTABELA" ADD CONSTRAINT "SGTABELAPK" PRIMARY KEY ("CODTB","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SGTAREFA" ADD CONSTRAINT "SGTAREFAPK" PRIMARY KEY ("CODTAREFA","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SGTIPOAGENDA" ADD CONSTRAINT "PK_SGTIPOAGENDA" PRIMARY KEY ("CODEMP","CODFILIAL","CODTIPOAGD");
COMMIT WORK;
ALTER TABLE "SGTRATARET" ADD CONSTRAINT "SGTRATARETPK" PRIMARY KEY ("CODPROC","CODTRATRET","SEQITPROC","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SGUSUARIO" ADD CONSTRAINT "SGUSUARIOPK" PRIMARY KEY ("IDUSU","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SGVARIAVEL" ADD CONSTRAINT "SGVARIAVELPK" PRIMARY KEY ("IDVAR","IDCON");
COMMIT WORK;
ALTER TABLE "SVAVALIACAO" ADD CONSTRAINT "SVAVALIACAOPK" PRIMARY KEY ("CODOS","CODITOS","CODAVAL","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SVEXECUCAO" ADD CONSTRAINT "SVEXECUCAOPK" PRIMARY KEY ("CODOS","CODITOS","CODEXEC","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SVITOS" ADD CONSTRAINT "SVITOSPK" PRIMARY KEY ("CODOS","CODITOS","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "SVOS" ADD CONSTRAINT "SVOSPK" PRIMARY KEY ("CODOS","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "TKATIVIDADE" ADD CONSTRAINT "TKATIVIDADEPK" PRIMARY KEY ("CODATIV","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "TKCONTATO" ADD CONSTRAINT "TKCONTATOPK" PRIMARY KEY ("CODCTO","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "TKCTOATIV" ADD CONSTRAINT "TKCTOATIVPK" PRIMARY KEY ("CODCTO","CODFILIAL","CODEMP","CODATIV","CODFILIALAV","CODEMPAV");
COMMIT WORK;
ALTER TABLE "TKHISTORICO" ADD CONSTRAINT "TKHISTORICOPK" PRIMARY KEY ("CODHISTTK","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "TKSETORCTO" ADD CONSTRAINT "TKSETORCTOPK" PRIMARY KEY ("CODSETORCTO","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "TKTIPOIMP" ADD CONSTRAINT "TKTIPOIMPPK" PRIMARY KEY ("CODTPIMP","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "VDAUXVENDA" ADD CONSTRAINT "VDAUXVENDAPK" PRIMARY KEY ("CODVENDA","CODAUXV","TIPOVENDA","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "VDCLASCLI" ADD CONSTRAINT "VDCLASCLIPK" PRIMARY KEY ("CODCLASCLI","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "VDCLCOMIS" ADD CONSTRAINT "VDCLCOMISPK" PRIMARY KEY ("CODCLCOMIS","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "VDCLIAUTP" ADD CONSTRAINT "VDCLIAUTPPK" PRIMARY KEY ("CODCLI","CODAUTP","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "VDCLICOMPL" ADD CONSTRAINT "VDCLICOMPLPK" PRIMARY KEY ("CODCLI","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "VDCLICONTAS" ADD CONSTRAINT "VDCLICONTASPK" PRIMARY KEY ("CODCLI","CODFILIAL","CODEMP","CONTA");
COMMIT WORK;
ALTER TABLE "VDCLIENTE" ADD CONSTRAINT "VDCLIENTEPK" PRIMARY KEY ("CODCLI","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "VDCLIENTEFOR" ADD CONSTRAINT "VDCLIENTEFORPK" PRIMARY KEY ("CODCLI","CODFILIAL","CODEMP","CODFOR","CODFILIALFR","CODEMPFR");
COMMIT WORK;
ALTER TABLE "VDCLIIMOV" ADD CONSTRAINT "VDCLIIMOVPK" PRIMARY KEY ("CODCLI","CODFILIAL","CODEMP","CODIMOV");
COMMIT WORK;
ALTER TABLE "VDCLIMETAVEND" ADD CONSTRAINT "VDCLIMETAVENDPK" PRIMARY KEY ("CODCLI","CODFILIAL","CODEMP","ANOMETAVEND");
COMMIT WORK;
ALTER TABLE "VDCLIREFC" ADD CONSTRAINT "VDCLIREFCPK" PRIMARY KEY ("CODCLI","CODREFC","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "VDCLIREFP" ADD CONSTRAINT "VDCLIREFPPK" PRIMARY KEY ("CODCLI","CODREFP","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "VDCLISOCIOS" ADD CONSTRAINT "VDCLISOCIOSPK" PRIMARY KEY ("CODCLI","CODFILIAL","CODEMP","NOMESOCIO");
COMMIT WORK;
ALTER TABLE "VDCLITERRA" ADD CONSTRAINT "VDCLITERRAPK" PRIMARY KEY ("CODCLI","CODFILIAL","CODEMP","CODTERRA");
COMMIT WORK;
ALTER TABLE "VDCLIVEIC" ADD CONSTRAINT "VDCLIVEICPK" PRIMARY KEY ("PLACAVEIC","CODCLI","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "VDCOMISSAO" ADD CONSTRAINT "VDCOMISSAOPK" PRIMARY KEY ("CODCOMI","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "VDFOTOPROD" ADD CONSTRAINT "VDFOTOPRODPK" PRIMARY KEY ("CODFOTOPROD","CODPROD","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "VDFRETEVD" ADD CONSTRAINT "VDFRETEVDPK" PRIMARY KEY ("CODVENDA","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "VDITKIT" ADD CONSTRAINT "VDITKITPK" PRIMARY KEY ("CODKIT","SEQITKIT","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "VDITORCAMENTO" ADD CONSTRAINT "VDITORCAMENTOPK" PRIMARY KEY ("CODORC","CODITORC","TIPOORC","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "VDITROMANEIO" ADD CONSTRAINT "VDITROMANEIO" PRIMARY KEY ("CODITROMA","CODROMA","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "VDITVENDA" ADD CONSTRAINT "VDITVENDAPK" PRIMARY KEY ("CODVENDA","CODITVENDA","TIPOVENDA","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "VDKIT" ADD CONSTRAINT "VDKITPK" PRIMARY KEY ("CODKIT","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "VDOBSCLI" ADD CONSTRAINT "VDOBSCLIPK" PRIMARY KEY ("CODCLI","SEQOBSCLI","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "VDORCAMENTO" ADD CONSTRAINT "VDORCAMENTOPK" PRIMARY KEY ("CODORC","TIPOORC","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "VDPRAZOENT" ADD CONSTRAINT "VDPRAZOENTPK" PRIMARY KEY ("CODPE","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "VDPRECOPROD" ADD CONSTRAINT "VDPRECOPRODPK" PRIMARY KEY ("CODPRECOPROD","CODPROD","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "VDROMANEIO" ADD CONSTRAINT "VDROMANEIOPK" PRIMARY KEY ("CODROMA","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "VDSETOR" ADD CONSTRAINT "VDSETORPK" PRIMARY KEY ("CODSETOR","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "VDSTATUSORC" ADD CONSTRAINT "VDSTATUSORCPK" PRIMARY KEY ("CODORC","TIPOORC","CODFILIAL","CODEMP","CODITTB","CODTB","CODFILIALTB","CODEMPTB");
COMMIT WORK;
ALTER TABLE "VDTABPRECO" ADD CONSTRAINT "VDTABPRECOPK" PRIMARY KEY ("CODTAB","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "VDTEF" ADD CONSTRAINT "VDTEFPK" PRIMARY KEY ("CODVENDA","NSUTEF","TIPOVENDA","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "VDTIPOCLI" ADD CONSTRAINT "VDTIPOCLIPK" PRIMARY KEY ("CODTIPOCLI","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "VDTRANSP" ADD CONSTRAINT "VDTRANSPPK" PRIMARY KEY ("CODTRAN","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "VDVENDA" ADD CONSTRAINT "VDVENDAPK" PRIMARY KEY ("CODVENDA","TIPOVENDA","CODFILIAL","CODEMP");
COMMIT WORK;
ALTER TABLE "VDVENDAORC" ADD CONSTRAINT "VDVENDAORCPK" PRIMARY KEY ("CODVENDA","CODITVENDA","TIPOVENDA","CODFILIAL","CODEMP","CODORC","CODITORC","TIPOORC","CODFILIALOR","CODEMPOR");
COMMIT WORK;
ALTER TABLE "VDVENDEDOR" ADD CONSTRAINT "VDVENDEDORPK" PRIMARY KEY ("CODVEND","CODFILIAL","CODEMP");
COMMIT WORK;
/* (c) 1998-2002 by Boris Loboda, barry@audit.kharkov.com */