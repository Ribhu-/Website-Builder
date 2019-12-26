// package com.sabre.as.aim;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AirportcountryMap {
	public static void main(String[] args) {
		String airports = "AAN,ABE,ABQ,ABX,ACC,ADD,ADL,AGP,AGS,AKL,ALA,ALB,ALG,ALH,AMD,AMI,AMM,AMS,ANC,ANU,APW,ARN,ASE,ASP,ATH,ATL,ATW,AUA,AUH,AUS,AVL,AVP,AYQ,BAH,BCN,BDA,BDB,BDL,BDO,BDS,BEG,BEY,BGI,BGW,BHE,BHM,BIL,BIS,BJX,BKI,BKK,BLQ,BLR,BME,BNA,BNE,BNK,BOG,BOI,BOM,BON,BOS,BPN,BQB,BRI,BRU,BSB,BSR,BTR,BTV,BUF,BWI,BWN,BZE,BZN,CAE,CAI,CAK,CAN,CBR,CCJ,CCK,CCS,CCU,CDG,CEB,CFS,CGK,CGN,CGP,CHA,CHC,CHO,CHS,CJB,CKG,CLE,CLT,CMB,CMH,CMN,CNJ,CNS,CNX,COK,COS,CPH,CPT,CRW,CSX,CTA,CTU,CUN,CVG,CZM,DAB,DAC,DAD,DAL,DAM,DAR,DAY,DCA,DCN,DEL,DEN,DFW,DKR,DLH,DME,DMM,DMS,DOH,DPS,DRW,DSM,DTW,DUB,DUD,DUS,DVO,DWC,DXB,EBB,EBL,ECP,EDI,EDL,EGE,ELP,EMD,EPR,EVN,EVV,EWR,EYW,EZE,FAI,FAR,FAY,FCA,FCO,FLL,FLR,FNT,FPO,FRA,FSD,FUK,GCM,GDL,GEG,GET,GIG,GIS,GLT,GND,GNV,GOA,GOT,GPT,GRB,GRR,GRU,GSO,GSP,GUA,GUM,GVA,HAM,HAN,HBA,HDN,HEL,HGH,HIR,HIS,HKG,HKK,HKT,HLZ,HND,HNL,HOU,HSV,HTI,HVB,HYD,IAD,IAH,ICN,ICT,IKA,ILM,IND,ISA,ISB,IST,IVC,JAC,JAI,JAN,JAX,JED,JFK,JIB,JNB,JNU,JOG,KAT,KBL,KCH,KEF,KGI,KHI,KIN,KIX,KKE,KLO,KMG,KNO,KNX,KOA,KRT,KTA,KTM,KUL,KWI,LAS,LAX,LCA,LEA,LEX,LFT,LGA,LGK,LHE,LHR,LIH,LIM,LIR,LIT,LOP,LOS,LST,MAA,MAD,MAN,MBJ,MCI,MCO,MCT,MCY,MDC,MDL,MDT,MDW,MED,MEL,MEM,MES,MEX,MGA,MHT,MIA,MKE,MKY,MLB,MLE,MLI,MNL,MOB,MOV,MQL,MRO,MSN,MSO,MSP,MSQ,MSY,MTJ,MTY,MUC,MXP,MYR,MZT,NAN,NAP,NAS,NBO,NCE,NGO,NPE,NPL,NRT,NSN,NTL,OAK,OGG,OKC,OMA,ONS,ONT,OOL,ORD,ORF,OSL,PAP,PBI,PBO,PDX,PEK,PEN,PER,PEW,PHE,PHL,PHX,PIT,PKU,PLM,PLS,PMO,PMR,PNH,PNS,POM,PPP,PPQ,PQQ,PRG,PSA,PSC,PSP,PTY,PUJ,PUS,PVD,PVG,PVR,PWM,RAP,RAR,RBA,RDU,REG,REP,RGN,RIC,RNO,ROA,ROB,ROC,ROK,ROR,ROT,RSW,RTB,RUH,RVT,SAH,SAL,SAN,SAP,SAT,SAV,SAW,SBN,SCL,SDF,SDQ,SEA,SEZ,SFO,SGF,SGN,SHJ,SHV,SIN,SJC,SJD,SJO,SJU,SKB,SLC,SMF,SNA,SNN,SOC,SPN,SRG,SRQ,STI,STL,STR,STT,STX,SUB,SUF,SVO,SXM,SYD,SYR,SZX,TBS,TBU,TGU,TIP,TIU,TLH,TLV,TMW,TPA,TPE,TRG,TRI,TRN,TRV,TSE,TSV,TUL,TUO,TUS,TVC,TXL,TYS,UIO,UPG,USM,UVF,VCE,VIE,VLI,VPS,VTZ,WAG,WHK,WKA,WLG,WRE,WSY,WSZ,WUH,WWI,XCH,XMB,XMN,XNA,XNB,YEG,YOW,YQR,YUL,YVR,YYC,YYZ,ZIH,ZLO,ZNE,ZQN,ZRH,ZYL";
		String countries = "AE,US,US,AU,GH,ET,AU,ES,US,NZ,KZ,US,DZ,AU,IN,ID,JO,NL,US,AG,WS,SE,US,AU,GR,US,US,AW,AE,US,US,US,AU,BH,ES,BM,AU,US,ID,IT,RS,LB,BB,IQ,NZ,US,US,US,MX,MY,TH,IT,IN,AU,US,AU,AU,CO,US,IN,AN,US,ID,AU,IT,BE,BR,IQ,US,US,US,US,BN,BZ,US,US,EG,US,CN,AU,IN,CC,VE,IN,FR,PH,AU,ID,DE,BD,US,NZ,US,US,IN,CN,US,US,LK,US,MA,AU,AU,TH,IN,US,DK,ZA,US,CN,IT,CN,MX,US,MX,US,BD,VN,US,SY,TZ,US,US,AU,IN,US,US,SN,US,RU,SA,SA,QA,ID,AU,US,US,IE,NZ,DE,PH,AE,AE,UG,IQ,US,GB,KE,US,US,AU,AU,AM,US,US,US,AR,US,US,US,US,IT,US,IT,US,BS,DE,US,JP,KY,MX,US,AU,BR,NZ,AU,GD,US,IT,SE,US,US,US,BR,US,US,GT,GU,CH,DE,VN,AU,US,FI,CN,SB,AU,HK,NZ,TH,NZ,JP,US,US,US,AU,AU,IN,US,US,KR,US,IR,US,US,AU,PK,TR,NZ,US,IN,US,US,SA,US,DJ,ZA,US,ID,NZ,AF,MY,IS,AU,PK,JM,JP,NZ,PH,CN,ID,AU,US,SD,AU,NP,MY,KW,US,US,CY,AU,US,US,US,MY,PK,GB,US,PE,CR,US,ID,NG,AU,IN,ES,GB,JM,US,US,OM,AU,ID,MM,US,US,SA,AU,US,ID,MX,NI,US,US,US,AU,US,MV,US,PH,US,AU,AU,NZ,US,US,US,BY,US,US,MX,DE,IT,US,MX,FJ,IT,BS,KE,FR,JP,NZ,NZ,JP,NZ,AU,US,US,US,US,AU,US,AU,US,US,NO,HT,US,AU,US,CN,MY,AU,PK,AU,US,US,US,ID,ID,TC,IT,NZ,KH,US,PG,AU,NZ,AU,CZ,IT,US,US,PA,DO,KR,US,CN,MX,US,US,CK,MA,US,IT,KH,MM,US,US,US,LR,US,AU,PW,NZ,US,HN,SA,AU,YE,SV,US,HN,US,US,TR,US,CL,US,DO,US,SC,US,US,VN,AE,US,SG,US,MX,CR,PR,KN,US,US,US,IE,ID,MP,ID,US,DO,US,DE,VI,VI,ID,IT,RU,AN,AU,US,CN,GE,TO,HN,LY,NZ,US,IL,AU,US,TW,NZ,US,IT,IN,KZ,AU,US,NZ,US,US,DE,US,EC,ID,TH,LC,IT,AT,VU,US,IN,NZ,NZ,NZ,NZ,NZ,AU,NZ,CN,AU,CX,AE,CN,US,AE,CA,CA,CA,CA,CA,CA,CA,MX,MX,AU,NZ,CH,BD";
		
		String outputFormat = "\"<countryCode>\": { \"cities\" : {\"<airportCode>\" : {}} }";
		String separator  =  ",";
		
		String [] airportsSplit = airports.split(",");
		String [] countriesSplit = countries.split(",");
		//System.out.println(airportsSplit);	
		Map<String, ArrayList<String>> airportcountryMapp = new HashMap<>();
		for (int i = 0; i < countriesSplit.length; i++) {
			if(airportcountryMapp.containsKey(countriesSplit[i])) {
				ArrayList<String> tempList = airportcountryMapp.get(countriesSplit[i]);
				tempList.add(airportsSplit[i]);
				airportcountryMapp.put(countriesSplit[i], tempList);
			}else {
				ArrayList<String> tempList = new ArrayList<String>();
				tempList.add(airportsSplit[i]);
				airportcountryMapp.put(countriesSplit[i], tempList);	
			}
			
		}
		
	
		for (String string : airportcountryMapp.keySet()) {
			
			System.out.print("\"" + string + "\": { \"cities\" : {" );
			ArrayList<String> tmp = airportcountryMapp.get(string);
			for (int i = 0; i < tmp.size(); i++) {
				if (i != 0) {
					System.out.print(",");
				}
				System.out.print("\"" +tmp.get(i) + "\" : {}" );
			}
			System.out.println("} },");
		}
	}
		
}
