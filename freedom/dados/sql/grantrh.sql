GRANT DELETE, INSERT, SELECT, UPDATE, REFERENCES ON RHAREA TO "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE, REFERENCES ON RHcandidato TO "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE, REFERENCES ON rhcandidatoatrib TO "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE, REFERENCES ON rhcandidatocurso TO "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE, REFERENCES ON rhcandidatofunc TO "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE, REFERENCES ON rhcurso TO "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE, REFERENCES ON rhdepto TO "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE, REFERENCES ON rhempregado TO "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE, REFERENCES ON rhempregador TO "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE, REFERENCES ON rhempregado TO "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE, REFERENCES ON rhfuncao TO "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE, REFERENCES ON rhnivelcurso TO "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE, REFERENCES ON rhturno TO "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE, REFERENCES ON rhVaga TO "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE, REFERENCES ON rhvagaatribquali TO "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE, REFERENCES ON rhvagaatribrest TO "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE, REFERENCES ON rhvagacandidato TO "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE, REFERENCES ON rhvagacurso TO "ADM";
GRANT DELETE, INSERT, SELECT, UPDATE, REFERENCES ON sgestcivil TO "ADM";
GRANT EXECUTE ON PROCEDURE RHLISTACANDVAGASP TO "ADM";
commit work;

