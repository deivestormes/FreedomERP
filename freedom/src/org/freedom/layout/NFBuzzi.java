 /**
 * @version 10/12/2003 <BR>
 * @author Setpoint Inform�tica Ltda./Marco Antonio Sanchez <BR>
 *
 * Projeto: Freedom <BR>
 * Pacote: leiautes <BR>
 * Classe: @(#)NFBuzzi.java <BR>
 * 
 * Este programa � licenciado de acordo com a LPG-PC (Licen�a P�blica Geral para Programas de Computador), <BR>
 * vers�o 2.1.0 ou qualquer vers�o posterior. <BR>
 * A LPG-PC deve acompanhar todas PUBLICA��ES, DISTRIBUI��ES e REPRODU��ES deste Programa. <BR>
 * Caso uma c�pia da LPG-PC n�o esteja dispon�vel junto com este Programa, voc� pode contatar <BR>
 * o LICENCIADOR ou ent�o pegar uma c�pia em: <BR>
 * Licen�a: http://www.lpg.adv.br/licencas/lpgpc.rtf <BR>
 * Para poder USAR, PUBLICAR, DISTRIBUIR, REPRODUZIR ou ALTERAR este Programa � preciso estar <BR>
 * de acordo com os termos da LPG-PC <BR> <BR>
 *
 * Layout da nota fiscal para a empresa Iswara Ltda.
 */
package org.freedom.layout;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Vector;

import org.freedom.componentes.ImprimeOS;
import org.freedom.funcoes.Funcoes;

public class NFBuzzi extends Leiaute {
  private BigDecimal bigSomaServ = new BigDecimal(0);
  private String sMensAdic="";
  private String sNumNota = ""; 
  
  public boolean imprimir(ResultSet rs,ResultSet rsRec,ImprimeOS imp) {
    Calendar cHora = Calendar.getInstance();
    boolean bRetorno;
    int iNumNota = 0;
    int iProd = 0;
	int iServ = 0;
	String sTipoTran="";
    boolean bFat = true;
    boolean bTotalizou = false;
    boolean bjatem = false;
    Vector vValores = new Vector();
    Vector vDescServ = new Vector();
    Vector vClfisc = new Vector();
    Vector vSigla = new Vector();
    String sCodfisc = "";
    String sSigla = "";   
    String[] sNat = new String[4];
    String[] sVencs = new String[6];
    String[] sVals = new String[6];
    String[] sDuplics = new String[6];
    String[] sMatObs = null;
    
   

    
//	String sFiscAdic = "";
	bigSomaServ = new BigDecimal(0);
	//	String[] sMarcs = {"\"","\"\"","\"\"\"","\"\"\"\""}; //Tipos de Marcs. 
//	String[] sMarcs2 = {"*","**","***","****"}; //Tipos de Marcs.
	String sHora = Funcoes.strZero(""+cHora.get(Calendar.HOUR_OF_DAY),2)+":"+Funcoes.strZero(""+cHora.get(Calendar.MINUTE),2)+":"+Funcoes.strZero(""+cHora.get(Calendar.SECOND),2);
    try {
      imp.limpaPags();
      boolean bNat = true;
//      Vector vServ = new Vector();
  //    int iServAtual = 0;
      vClfisc.addElement("");
      while (rs.next()) {

         iNumNota = rs.getInt("DocVenda");
         if (iNumNota==0) {
            sNumNota = "000000";
         } 
         else {
            sNumNota = Funcoes.strZero(""+iNumNota,6);
         }
         for (int i=0; i<6; i++) {
           if (bFat) {
             if (rsRec.next()) {
               sDuplics[i] = sNumNota+"/"+rsRec.getInt("NPARCITREC");
               sVencs[i] = Funcoes.sqlDateToStrDate(rsRec.getDate("DtVencItRec"));
               sVals[i] = Funcoes.strDecimalToStrCurrency(12,2,rsRec.getString("VlrParcItRec"));
             }
             else {
               bFat = false;
               sDuplics[i] = "********";
               sVencs[i] = "********";
               sVals[i] = "********";
             }
           }
          
         }

         if (bNat) {
           sNat[0] = rs.getString("DescNat");
           sNat[1] = Funcoes.setMascara(rs.getString("CodNat"),"#.##");
           sMatObs = Funcoes.strToStrArray(rs.getString("ObsVenda") != null ? rs.getString("ObsVenda") : "",3);
           bNat = false;
         }
         if (imp.pRow()==0) {        	 
		   imp.say(imp.pRow()+2,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,90,"X");
		   imp.say(imp.pRow()+0,124,sNumNota);
		   imp.say(imp.pRow()+5,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,6,sNat[0]);
           imp.say(imp.pRow()+0,46,sNat[1]);
           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,6,rs.getInt("CodCli")+" - "+rs.getString("RazCli"));
           imp.say(imp.pRow()+0,90,rs.getString("CpfCli") != null ? Funcoes.setMascara(rs.getString("CpfCli"),"###.###.###-##") : Funcoes.setMascara(rs.getString("CnpjCli"),"##.###.###/####-##")) ;
           imp.say(imp.pRow()+0,125,Funcoes.sqlDateToStrDate(rs.getDate("DtEmitVenda")));
           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,6,Funcoes.copy(rs.getString("EndCli"),0,50).trim()+", "+(rs.getString("NumCli") != null ? Funcoes.copy(rs.getString("NumCli"),0,6).trim() : "").trim()+" - "+(rs.getString("ComplCli") != null ? Funcoes.copy(rs.getString("ComplCli"),0,9).trim() : "").trim());
           imp.say(imp.pRow()+0,76,rs.getString("BairCli")!=null ? Funcoes.copy(rs.getString("BairCli"),0,15) : "");
           imp.say(imp.pRow()+0,106,Funcoes.setMascara(rs.getString("CepCli"),"#####-###"));
           imp.say(imp.pRow()+0,125,Funcoes.sqlDateToStrDate(rs.getDate("DtSaidaVenda")));
           imp.say(imp.pRow()+1,0,"");
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
           imp.say(imp.pRow()+0,6,rs.getString("CidCli"));
           imp.say(imp.pRow()+0,50,(rs.getString("DDDCli") != null ? "("+rs.getString("DDDCli")+")" : "")+(rs.getString("FoneCli") != null ? Funcoes.setMascara(rs.getString("FoneCli").trim(),"####-####") : ""));
           imp.say(imp.pRow()+0,83,rs.getString("UfCli"));
           imp.say(imp.pRow()+0,90,rs.getString("RgCli") != null ? rs.getString("RgCli") : rs.getString("InscCli"));
           imp.say(imp.pRow()+0,125,sHora);

           imp.say(imp.pRow()+5,0,""+imp.comprimido());		
           
           imp.say(imp.pRow()+0,8,sVals[0]);            
           imp.say(imp.pRow()+0,36,sVencs[0]);             

           imp.say(imp.pRow()+0,55,sVals[1]);
           imp.say(imp.pRow()+0,83,sVencs[1]);             

           imp.say(imp.pRow()+0,102,sVals[2]);
           imp.say(imp.pRow()+0,130,sVencs[2]);             
           
           imp.say(imp.pRow()+1,0,""+imp.comprimido());
             
           imp.say(imp.pRow()+0,8,sVals[3]);            
           imp.say(imp.pRow()+0,36,sVencs[3]);             

           imp.say(imp.pRow()+0,55,sVals[4]);
           imp.say(imp.pRow()+0,83,sVencs[4]);             

           imp.say(imp.pRow()+0,102,sVals[5]);
           imp.say(imp.pRow()+0,130,sVencs[5]);             
		   
		 //  imp.say(imp.pRow()+0,05,rs.getString("CidCob"));	   
		 //  imp.say(imp.pRow()+0,40,rs.getString("EndCob") != null ? rs.getString("EndCob").trim()+", " + (rs.getString("NumCob") != null ? rs.getString("NumCob") : "") : "");
		   
		  // String sValorTotLiqVenda = Extenso.extenso(rs.getDouble("VlrLiqVenda"),"real","reais","centavo","centavos").toUpperCase(); 
		//   imp.say(imp.pRow()+1,3,sValorTotLiqVenda);
           imp.say(imp.pRow()+3,0,"");
         }
         
         if (!rs.getString("TipoProd").equals("S")) {
            imp.say(imp.pRow()+1,0,""+imp.comprimido());            
            imp.say(imp.pRow()+0,8,rs.getString("CodProd"));             
            Vector vDesc = Funcoes.strToVectorSilabas(rs.getString("ObsItVenda")==null || rs.getString("ObsItVenda").equals("") ? (rs.getString("DescProd").trim()):rs.getString("ObsItVenda"),46);
            String sDesc = "";
            for (int iConta=0;( (iConta < 20) && (vDesc.size()>iConta) );iConta++){
            	if (!vDesc.elementAt(iConta).toString().equals(""))
            		sDesc = vDesc.elementAt(iConta).toString();
            	else
            		sDesc = "";
            	if (iConta > 0)
            	  imp.say(imp.pRow()+1,0,""+imp.comprimido());
            	imp.say(imp.pRow()+0,16, sDesc);
                iProd = iProd+vDesc.size();
                
                sMensAdic = rs.getString(5) != null ? rs.getString(5).trim() : "";
            }
            sCodfisc = (rs.getString("CodFisc")!=null ? rs.getString("CodFisc") : "");
           
    		if(!sCodfisc.equals("")){
    			for(int i=0;i<vClfisc.size();i++){
    				if(vClfisc.elementAt(i)!=null){
    					if(sCodfisc.equals((String)vClfisc.elementAt(i))){
        					bjatem = true;
        					sSigla = ""+(char)(64 + i);
    					}
        				else{
        					bjatem = false;
        				}
    				}
    			}
    			if(!bjatem){
    				vClfisc.addElement(sCodfisc);
    				sSigla = ""+(char)(63 + vClfisc.size());
    				vSigla.addElement(sSigla + " = " + sCodfisc);
    			}
    		}

            imp.say(imp.pRow()+0,69,Funcoes.copy(rs.getString("OrigFisc"),0,1)+Funcoes.copy(rs.getString("CodTratTrib"),0,2));
            imp.say(imp.pRow()+0,73,sSigla);

            imp.say(imp.pRow()+0,79,rs.getString("CodUnid").substring(0,4));
            imp.say(imp.pRow()+0,82,""+rs.getDouble("QtdItVenda"));
            imp.say(imp.pRow()+0,92,Funcoes.strDecimalToStrCurrency(8,2,""+((new BigDecimal(rs.getDouble("VlrLiqItVenda"))).divide(new BigDecimal(rs.getDouble("QtdItVenda")),2,BigDecimal.ROUND_HALF_UP))));
            imp.say(imp.pRow()+0,106,Funcoes.strDecimalToStrCurrency(13,2,rs.getString("VlrLiqItVenda")));
            imp.say(imp.pRow()+0,122,""+rs.getDouble("PercICMSItVenda"));
            //imp.say(imp.pRow()+0,120,""+rs.getDouble("PercIPIItvenda"));
		    //imp.say(imp.pRow()+0,126,Funcoes.strDecimalToStrCurrency(7,2,rs.getString("VlrIPIItvenda")));
         }
        else {
            Vector vDesc = new Vector();
            vDesc.addElement(Funcoes.strToVectorSilabas(rs.getString("ObsItVenda")==null || rs.getString("ObsItVenda").equals("") ? (rs.getString("DescProd").trim()):rs.getString("ObsItVenda"),45)); 
            vDesc.addElement(Funcoes.strDecimalToStrCurrency(13,2,rs.getString("VlrLiqItVenda"))); 
            if (vDesc!=null) {
            	vDescServ.addElement(vDesc.clone());
         	}

         	bigSomaServ = bigSomaServ.add(new BigDecimal(rs.getDouble("VlrLiqItVenda")));
         	
         	iServ = iServ+vDescServ.size();
            
         }
         
         if (!bTotalizou) {
         
           vValores.addElement(rs.getString("VlrBaseICMSVenda")); //0
           vValores.addElement(rs.getString("VlrICMSVenda")); //1
           vValores.addElement(""+
           		rs.getBigDecimal("VlrLiqVenda").subtract(
           				rs.getBigDecimal("VlrFreteVenda")).subtract(
           						rs.getBigDecimal("VlrAdicVenda")).subtract(
           								rs.getBigDecimal("VlrIPIVenda"))); // 2
           //           vValores.addElement(rs.getString("VlrLiqVenda"));//2
           vValores.addElement(rs.getString("VlrFreteVenda"));//3
           vValores.addElement(rs.getString("VlrAdicVenda"));//4
           vValores.addElement(rs.getString("VlrIPIVenda"));//5
           vValores.addElement(rs.getString("VlrLiqVenda"));//6
           vValores.addElement(rs.getString("RazTran"));//7
           vValores.addElement(rs.getString("TipoFreteVD"));//8
           vValores.addElement(rs.getString("PlacaFreteVD"));//9
           vValores.addElement(rs.getString("UfFreteVD"));      //10   
           sTipoTran = rs.getString("TipoTran");
           vValores.addElement(sTipoTran);//11
           vValores.addElement(rs.getString("CnpjCli"));//12
           vValores.addElement(rs.getString("CnpjTran"));   //13         
           vValores.addElement(rs.getString("EndTran")!=null?rs.getString("EndTran"):"");//14
           
           if (sTipoTran.equals("C")){
             vValores.addElement("");//15
             vValores.addElement("");//16
             vValores.addElement("");//17
             vValores.addElement(""); //18
           }
           else {
           	vValores.addElement(rs.getString("NumTran")!=null?rs.getString("NumTran"):"");//15
           	vValores.addElement(rs.getString("CidTran")!=null?rs.getString("CidTran"):"");//16
           	vValores.addElement(rs.getString("UfTran")!=null?rs.getString("UfTran"): "");//17
           	vValores.addElement(rs.getString("InscTran")!=null?rs.getString("InscTran"):""); //18
           }
           
           vValores.addElement(rs.getString("QtdFreteVD"));//19
           vValores.addElement(rs.getString("EspFreteVD"));//20
           vValores.addElement(rs.getString("MarcaFreteVD"));//21
           vValores.addElement(rs.getString("PesoBrutVD"));//22
           vValores.addElement(rs.getString("PesoLiqVD"));//23
           vValores.addElement(rs.getString("VlrIssVenda"));//24
           vValores.addElement(rs.getString("CodVend"));//25
           if (rs.getString("NomeVend")==null)
              vValores.addElement(Funcoes.replicate(" ",25)); // 26
           else 
              vValores.addElement(rs.getString("NomeVend")+Funcoes.replicate(" ",25-rs.getString("NomeVend").length()));
           bTotalizou = true;
         } 
         
      }
      imp.say(imp.pRow()+1,0,""+imp.comprimido());
      imp.say(imp.pRow()+0,16,"CLASSIFICACAO FISCAL");
      int pos = 1;
      for(int i=0;i<vSigla.size();i++){
    	  if(pos==1){
    		  imp.say(imp.pRow()+1,16,(String)vSigla.elementAt(i));
    		  pos = 2;
    	  }
    	  else{
    		  imp.say(imp.pRow()+0,35,(String)vSigla.elementAt(i));
    		  pos = 1;
        	  iProd++;
    	  }
      }
     
      if (imp.pRow()<36) {    	
      	imp.say(imp.pRow()+1,0,""+imp.comprimido());
      	for (int i=0;i<3;i++) {
      		imp.say(imp.pRow()+1,0,""+imp.comprimido());
      		imp.say(imp.pRow()+0,23,sMatObs[i]);
      	}
      }
     /* if (vDescServ.size()>0) {           
      	impServ(vDescServ,bigSomaServ,vValores.elementAt(24).toString(),imp);                  
      } */     
      impTotais(imp,vValores);
      imp.fechaGravacao();
      bRetorno = true;
      if (iProd>20) {
      	Funcoes.mensagemInforma(null,"Podem haver erros na impress�o da nota fiscal."+"\n"+"Produtos ultrapassam vinte linhas!");      	
      }
      /*if (iServ>4) {
      	Funcoes.mensagemInforma(null,"Podem haver erros na impress�o da nota fiscal."+"\n"+"Servicos ultrapassam quatro linhas!");
      }*/
    }
    catch ( SQLException err ) {
      Funcoes.mensagemErro(null,"Erro ao consultar tabela de Venda!"+err.getMessage());      
      bRetorno = false;
    }
    return bRetorno;
  }

  private void impTotais(ImprimeOS imp,Vector vValores){
  	    try {	
  	      for (int i=0;(imp.pRow()<45);i++) {
          	imp.say(imp.pRow()+1,0,"");
          }

  	      imp.say(imp.pRow()+1,0,""+imp.comprimido());
  	      imp.say(imp.pRow()+0,6,Funcoes.strDecimalToStrCurrency(20,2,vValores.elementAt(0).toString()));
  	      imp.say(imp.pRow()+0,35,Funcoes.strDecimalToStrCurrency(20,2,vValores.elementAt(1).toString()));
  	      imp.say(imp.pRow()+0,117,Funcoes.strDecimalToStrCurrency(20,2,vValores.elementAt(2).toString()));
  	      imp.say(imp.pRow()+2,0,""+imp.comprimido());
  	      imp.say(imp.pRow()+0,6,Funcoes.strDecimalToStrCurrency(20,2,vValores.elementAt(3).toString()));
  	      imp.say(imp.pRow()+0,65,Funcoes.strDecimalToStrCurrency(20,2,vValores.elementAt(4).toString()));
  	      imp.say(imp.pRow()+0,90,Funcoes.strDecimalToStrCurrency(20,2,vValores.elementAt(5).toString()));
  	      imp.say(imp.pRow()+0,117,Funcoes.strDecimalToStrCurrency(20,2,vValores.elementAt(6).toString()));
  	      imp.say(imp.pRow()+3,0,""+imp.comprimido());
  	        	        	       	      	      
  	      imp.say(imp.pRow()+0,8,vValores.elementAt(7).toString());
  	      imp.say(imp.pRow()+0,80,vValores.elementAt(8).toString().equals("C") ? "1" : "2");
  	      imp.say(imp.pRow()+0,87,vValores.elementAt(9).toString());
  	      imp.say(imp.pRow()+0,103,vValores.elementAt(10).toString());
  	      
  	      String sTipoTran = vValores.elementAt(11).toString();
  	      if (sTipoTran==null) sTipoTran = "T";
  	      
  	      if ( sTipoTran.equals("C") ){
  	      	imp.say(imp.pRow()+0,118,"");
  	      	
  	      }
  	      else {
  	      	imp.say(imp.pRow()+0,118,Funcoes.setMascara(vValores.elementAt(13).toString() != null ? vValores.elementAt(13).toString() : "","##.###.###/####-##")); 
  	      }
  	       imp.say(imp.pRow()+1,0,""+imp.comprimido());
  	     // imp.say(imp.pRow()+0,2,Funcoes.copy(vValores.elementAt(11).toString(),0,42)+", "+Funcoes.copy(vValores.elementAt(12).toString(),0,6));
  	      
  	      
  	      imp.say(imp.pRow()+1,0,"");
  	      imp.say(imp.pRow()+0,8,vValores.elementAt(14).toString().trim());
  	     // imp.say(imp.pRow()+0,50,vValores.elementAt(15).toString());
  	      imp.say(imp.pRow()+0,68,vValores.elementAt(16).toString().trim());
  	      imp.say(imp.pRow()+0,102,vValores.elementAt(17).toString().trim());
          imp.say(imp.pRow()+0,121,vValores.elementAt(18).toString());
  	        	      
  	      imp.say(imp.pRow()+1,0,"");
  	      imp.say(imp.pRow()+1,0,""+imp.comprimido());
  	      
  	      imp.say(imp.pRow()+0,8,vValores.elementAt(19).toString());
  	      imp.say(imp.pRow()+0,25,vValores.elementAt(20).toString());
  	      imp.say(imp.pRow()+0,48,vValores.elementAt(21).toString());
  	      imp.say(imp.pRow()+0,103,vValores.elementAt(22).toString());
  	      imp.say(imp.pRow()+0,128,vValores.elementAt(23).toString());
  	      
  	      imp.say(imp.pRow()+1,0,""+imp.comprimido());
  		  imp.say(imp.pRow()+1,0,""+imp.comprimido());
  		  
  		  Vector vObs = Funcoes.quebraLinha(Funcoes.stringToVector(sMensAdic),37);
     	  for (int i=0; i<vObs.size(); i++) {
	           imp.say(imp.pRow()+1,0,""+imp.comprimido());
	           imp.say(imp.pRow()+0,5,vObs.elementAt(i).toString());
	           if(i==0)
	        	   imp.say(imp.pRow()+0,43,"Vendedor: "+vValores.elementAt(25).toString());
	           if(i==1)
	        	   imp.say(imp.pRow()+0,43,vValores.elementAt(26).toString().substring(0,20));
     	  }
  		 /* String[] sMatObs = Funcoes.strToStrArray(sMensAdic,5);
  		  imp.say(imp.pRow()+1,0,"");
  		  imp.say(imp.pRow()+0,6,sMatObs[0]);
  		  imp.say(imp.pRow()+0,43,"Vendedor: "+vValores.elementAt(25).toString());
  		  imp.say(imp.pRow()+1,0,"");
  		  imp.say(imp.pRow()+0,6,sMatObs[1]);
  		  imp.say(imp.pRow()+0,43,vValores.elementAt(26).toString().substring(0,20));
  		  imp.say(imp.pRow()+1,0,"");
  		  imp.say(imp.pRow()+0,6,sMatObs[2]);
  		  imp.say(imp.pRow()+1,0,"");
  		  imp.say(imp.pRow()+0,6,sMatObs[3]);
  		  imp.say(imp.pRow()+1,0,"");
  		  imp.say(imp.pRow()+0,6,sMatObs[4]);*/
  		  
  		  imp.say(imp.pRow()+7,0,""+imp.comprimido());
 		  imp.say(imp.pRow()+0,128,sNumNota);
  		  imp.say(imp.pRow()+3,0,""+imp.comprimido());
 		  
  		  
  		  //imp.say(imp.pRow()+0,45,"Cod.Vendedor: "+vValores.elementAt(25).toString());
  		  
  		  

  		  imp.setPrc(0,0);
  	    }
  	    catch (Exception e) {
  	    	e.printStackTrace();
  	    }  		  
  }

}


