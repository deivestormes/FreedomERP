UPDATE VDCLIENTE SET DDDCLI = SUBSTRING(FONECLI FROM 1 FOR 4),
                     FONECLI=LTRIM(SUBSTRING(FONECLI FROM 5 FOR 10))
                     WHERE DDDCLI IS NULL AND strlen(RTRIM(FONECLI))>8;
UPDATE VDCLIENTE SET DDDFAXCLI=DDDCLI;

UPDATE VDCLIENTE SET DDDFONECOB=LTRIM(SUBSTRING(FONECOB FROM 1 FOR 4)),
                     FONECOB=LTRIM(SUBSTRING(FONECOB FROM 5 FOR 10))
                     WHERE DDDFONECOB IS NULL AND strlen(RTRIM(FONECOB))>8;

UPDATE VDCLIENTE SET DDDFONEENT=LTRIM(SUBSTRING(FONEENT FROM 1 FOR 4)),
                     FONEENT=LTRIM(SUBSTRING(FONEENT FROM 5 FOR 10))
                     WHERE DDDFONEENT IS NULL AND strlen(RTRIM(FONEENT))>8;

UPDATE VDCLIENTE SET DDDFAXCOB=DDDFONECOB,
                     DDDFAXENT=DDDFONEENT;


UPDATE CPFORNECED SET DDDFONEFOR=SUBSTRING(FONEFOR FROM 1 FOR 4),
                      FONEFOR=LTRIM(SUBSTRING(FONEFOR FROM 5 FOR 10))
                      WHERE DDDFONEFOR IS NULL AND strlen(RTRIM(FONEFOR))>8;

UPDATE CPFORNECED SET DDDFAXFOR=DDDFONEFOR;

UPDATE VDVENDEDOR SET DDDFONEVEND=SUBSTRING(FONEVEND FROM 1 FOR 4),
                      FONEVEND=LTRIM(SUBSTRING(FONEVEND FROM 5 FOR 10))
                      WHERE DDDFONEVEND IS NULL AND strlen(RTRIM(FONEVEND))>8;

UPDATE VDVENDEDOR SET DDDFAXVEND=DDDFONEVEND;

UPDATE vdtransp SET DDDFONETRAN=SUBSTRING(FONETRAN FROM 1 FOR 4),
                      FONETRAN=LTRIM(SUBSTRING(FONETRAN FROM 5 FOR 10))
                      WHERE DDDFONETRAN IS NULL AND strlen(RTRIM(FONETRAN))>8;

UPDATE VDTRANSP SET DDDFAXTRAN=DDDFONETRAN;

COMMIT WORK;



