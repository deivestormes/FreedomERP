GRANT EXECUTE ON PROCEDURE EQMOVPRODATEQSP TO TRIGGER EQMOVPRODTGAD;
GRANT EXECUTE ON PROCEDURE EQMOVPRODATEQSP TO TRIGGER EQMOVPRODTGAI;
GRANT EXECUTE ON PROCEDURE EQMOVPRODATEQSP TO TRIGGER EQMOVPRODTGAU;
GRANT UPDATE ON TABLE EQLOTE TO PROCEDURE EQMOVPRODATEQSP;
GRANT SELECT,UPDATE ON TABLE EQPRODUTO TO PROCEDURE EQMOVPRODATEQSP;
GRANT UPDATE ON TABLE EQSALDOPROD TO PROCEDURE EQMOVPRODATEQSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODCKCPSP TO TRIGGER EQMOVPRODTGAI;
GRANT EXECUTE ON PROCEDURE EQMOVPRODCKCPSP TO TRIGGER EQMOVPRODTGAU;
GRANT SELECT ON TABLE EQPRODUTO TO PROCEDURE EQMOVPRODCKCPSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODCSLDSP TO PROCEDURE EQMOVPRODCKTMSP;
GRANT SELECT ON TABLE EQTIPOMOV TO PROCEDURE EQMOVPRODCKTMSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODCKUTMSP TO PROCEDURE EQMOVPRODUSP;
GRANT SELECT ON TABLE EQTIPOMOV TO PROCEDURE EQMOVPRODCKUTMSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODCSLDSP TO PROCEDURE EQMOVPRODISP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODCSLDSP TO PROCEDURE EQMOVPRODPRCSLDSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODCSLDSP TO PROCEDURE EQMOVPRODUSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODCKTMSP TO PROCEDURE EQMOVPRODCSLDSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODDSP TO PROCEDURE EQMOVPRODIUDSP;
GRANT DELETE ON TABLE EQMOVPROD TO PROCEDURE EQMOVPRODDSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODPRCSLDSP TO PROCEDURE EQMOVPRODDSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODRETCODSP TO PROCEDURE EQMOVPRODDSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODSLDSP TO PROCEDURE EQMOVPRODDSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODISP TO PROCEDURE EQMOVPRODIUDSP;
GRANT INSERT ON TABLE EQMOVPROD TO PROCEDURE EQMOVPRODISP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODCSLDSP TO PROCEDURE EQMOVPRODISP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODPRCSLDSP TO PROCEDURE EQMOVPRODISP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODSEQSP TO PROCEDURE EQMOVPRODISP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODSLDSP TO PROCEDURE EQMOVPRODISP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODIUDSP TO TRIGGER CPITCOMPRATGAD;
GRANT EXECUTE ON PROCEDURE EQMOVPRODIUDSP TO TRIGGER CPITCOMPRATGAI;
GRANT EXECUTE ON PROCEDURE EQMOVPRODIUDSP TO TRIGGER CPITCOMPRATGAU;
GRANT EXECUTE ON PROCEDURE EQMOVPRODIUDSP TO TRIGGER EQINVPRODTGAD;
GRANT EXECUTE ON PROCEDURE EQMOVPRODIUDSP TO TRIGGER EQINVPRODTGAI;
GRANT EXECUTE ON PROCEDURE EQMOVPRODIUDSP TO TRIGGER EQINVPRODTGAU;
GRANT EXECUTE ON PROCEDURE EQMOVPRODIUDSP TO TRIGGER VDITVENDATGAD;
GRANT EXECUTE ON PROCEDURE EQMOVPRODIUDSP TO TRIGGER VDITVENDATGAI;
GRANT EXECUTE ON PROCEDURE EQMOVPRODIUDSP TO TRIGGER VDITVENDATGAU;
GRANT EXECUTE ON PROCEDURE EQMOVPRODDSP TO PROCEDURE EQMOVPRODIUDSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODISP TO PROCEDURE EQMOVPRODIUDSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODUSP TO PROCEDURE EQMOVPRODIUDSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODPRCSLDSP TO PROCEDURE EQMOVPRODDSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODPRCSLDSP TO PROCEDURE EQMOVPRODISP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODPRCSLDSP TO PROCEDURE EQMOVPRODUSP;
GRANT SELECT,UPDATE ON TABLE EQMOVPROD TO PROCEDURE EQMOVPRODPRCSLDSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODCSLDSP TO PROCEDURE EQMOVPRODPRCSLDSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODRETCODSP TO PROCEDURE EQMOVPRODDSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODRETCODSP TO PROCEDURE EQMOVPRODUSP;
GRANT SELECT ON TABLE EQMOVPROD TO PROCEDURE EQMOVPRODRETCODSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODSEQSP TO PROCEDURE EQMOVPRODISP;
GRANT EXECUTE ON PROCEDURE SGRETFILIAL TO PROCEDURE EQMOVPRODSEQSP;
GRANT EXECUTE ON PROCEDURE SPGERANUM TO PROCEDURE EQMOVPRODSEQSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODSLDSP TO PROCEDURE EQMOVPRODDSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODSLDSP TO PROCEDURE EQMOVPRODISP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODSLDSP TO PROCEDURE EQMOVPRODUSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODSLDSP TO PROCEDURE EQRELINVPRODSP;
GRANT SELECT ON TABLE EQMOVPROD TO PROCEDURE EQMOVPRODSLDSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODUSP TO PROCEDURE EQMOVPRODIUDSP;
GRANT SELECT ON TABLE EQMOVPROD TO PROCEDURE EQMOVPRODUSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODCKUTMSP TO PROCEDURE EQMOVPRODUSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODCSLDSP TO PROCEDURE EQMOVPRODUSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODPRCSLDSP TO PROCEDURE EQMOVPRODUSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODRETCODSP TO PROCEDURE EQMOVPRODUSP;
GRANT EXECUTE ON PROCEDURE EQMOVPRODSLDSP TO PROCEDURE EQMOVPRODUSP;
GRANT EXECUTE ON PROCEDURE PVADICMOVCAIXASP01 TO PROCEDURE PVSEQMOVCAIXASP;
GRANT SELECT ON PPLISTAOPVW01 TO ROLE "ADM";
GRANT SELECT ON EQCONFESTOQVW01 TO ROLE "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE, REFERENCES ON FNRESTRICAO TO ROLE "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE, REFERENCES ON FNTIPORESTR TO ROLE "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE ON FNTIPOCOB TO ROLE "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE ON FNCARTCOB TO ROLE "ADM";
GRANT EXECUTE ON PROCEDURE SGCALCVENCSP TO PROCEDURE FNGERAITRECEBERSP01;
GRANT DELETE, INSERT, SELECT, UPDATE ON SGFERIADO TO PROCEDURE SGCALCVENCSP;
GRANT DELETE, INSERT, SELECT, UPDATE ON EQCLIFOR TO ROLE "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE ON PPTIPOANALISE TO ROLE "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE ON PPESTRUANALISE TO ROLE "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE ON PPOPCQ TO ROLE "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE ON PPOPACAOCORRET TO ROLE "ADM";
GRANT EXECUTE ON PROCEDURE PPGERAOPCQ TO ROLE "ADM";
GRANT SELECT ON PPESTRUFASE TO PROCEDURE PPGERAOPCQ;
GRANT SELECT ON PPOP TO PROCEDURE PPGERAOPCQ;
GRANT SELECT ON PPESTRUTURA TO PROCEDURE PPGERAOPCQ;
GRANT INSERT ON PPOPCQ TO PROCEDURE PPGERAOPCQ;

GRANT EXECUTE ON PROCEDURE EQCUSTOPRODSP TO ROLE "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE ON PPTIPOANALISE TO ROLE "ADM";

GRANT EXECUTE ON PROCEDURE PPITOPSP02 TO ROLE "ADM";
GRANT EXECUTE ON PROCEDURE FNGERAITRECEBERSP01 TO ROLE "ADM";
GRANT EXECUTE ON PROCEDURE VDADICVENDAORCSP TO ROLE "ADM";
GRANT EXECUTE ON PROCEDURE VDADICITVENDAORCSP TO ROLE "ADM";

GRANT DELETE, INSERT, SELECT, UPDATE ON VDVENDACOMIS TO ROLE "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE ON VDREGRACOMIS TO ROLE "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE ON VDITREGRACOMIS TO ROLE "ADM";

GRANT SELECT, INSERT, UPDATE, DELETE ON PPFOTOMTAN TO ADM;

GRANT DELETE, INSERT, SELECT, UPDATE ON FNFBNCLI to ROLE "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE ON FNFBNCODRET to ROLE "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE ON FNFBNREC to ROLE "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE ON SGPREFERE6 to ROLE "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE ON FNCONTA to ROLE "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE ON SGITPREFERE6 to ROLE "ADM";
GRANT SELECT, DELETE, INSERT, UPDATE ON TABLE EQGUIATRAF TO ROLE ADM

GRANT EXECUTE ON PROCEDURE EQPRODUTOSP01 TO ROLE "ADM";


COMMIT WORK;
