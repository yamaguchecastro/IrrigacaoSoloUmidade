package br.com.teste.Irrigacao;

public class IrrigacaoSolo {
	
	
	public static void main(String[] args) {
		
			int FinoArgila = (61);
			int MediaArgila = (61);
			int GrosseiroArenosa = (61);
			
		if (FinoArgila > 80 && FinoArgila < 100)
		 {
			System.out.println(("Umidade Solo Fino Argila " + (FinoArgila) + " Irrigação não necessaria"));
		 }
		if (FinoArgila > 60 && FinoArgila < 80)
		{
		System.out.println(("Umidade Solo Fino Argila " + (FinoArgila) + " Irrigação a ser aplicada"));
		}
			
		 if
		(FinoArgila < 60 )
	 {
		System.out.println(("Umidade Solo Fino Argila " + (FinoArgila) + " Umidade do solo perigosamente baixa!"));
		}
	    
				 
		 
		 if (MediaArgila > 88 && MediaArgila < 100)
		 {
			System.out.println(("Umidade Solo Medio Argila: " + (MediaArgila) + " Irrigação não necessaria"));
		}
		 
		 if (MediaArgila > 70 && MediaArgila < 88)
		 {
			System.out.println(("Umidade Solo Medio Argila: " + (MediaArgila) + " Irrigação a ser aplicada"));
		}
		
		 if (MediaArgila < 88)
		 {
			System.out.println(("Umidade Solo Medio Argila: " + (MediaArgila) + " Umidade do solo perigosamente baixa!"));
		}
		 
		 
		 if (GrosseiroArenosa > 90 && GrosseiroArenosa < 100)
		 {
			System.out.println(("Umidade Solo Grosseiro Arenoso: " + (GrosseiroArenosa) + " Irrigação não necessaria"));
		}
		
		 if (GrosseiroArenosa > 80 && GrosseiroArenosa < 90)
		 {
			System.out.println(("Umidade Solo Grosseiro Arenoso: " + (GrosseiroArenosa) + " Irrigação a ser aplicada"));
		}
		
		 if (GrosseiroArenosa < 80)
		 {
			System.out.println(("Umidade Solo Grosseiro Arenoso: " + (GrosseiroArenosa) + " Umidade do solo perigosamente baixa!"));
		}
	


}
}
