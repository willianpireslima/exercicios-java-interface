package pacoteclasse_09_tela;

public class Classe_09_Tela extends javax.swing.JFrame {

    public Classe_09_Tela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Verificacao");

        jLabel2.setText("Dia Da Semana");

        jLabel3.setText("0");

        jLabel4.setText("0");

        jLabel5.setText("0");

        jLabel6.setText("0");

        jLabel7.setText("/");

        jLabel8.setText("/");

        jLabel9.setText("/");

        jLabel10.setText("/");

        jLabel11.setText("Diferenca");

        jLabel12.setText("0");

        jLabel13.setText("Diferenca Entre Datas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)))
                        .addComponent(jLabel1))
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        static class Data   {

    private int dia, mes ,ano;
	
    void   setData    (int AuxDia,int AuxMes,int AuxAno) {
	
	dia = AuxDia;
	mes = AuxMes;
	ano = AuxAno;
    }

    int getDia () {
        return dia;
    }
    
    int getMes () {
        return mes;
    }
    
    int getAno () {
        return ano;
    }
    
    String  validaData () {

    if ( (dia >  0    && dia < 32) &&
	 (mes  >  0   && mes  < 13) &&
         (ano >  1900 && ano < 2040) ) {
         
        return "Data Valida";
    }
	
    return "Data Inalida";
    }



    String  DeterminaDiaSemana() {
	
    // Formula para o dia da semana
    //Dia + Chave do mês + Chave do ano - Maior múltiplo de 7 = Dia da semana
	
    int ChaveDoMes=0,ChaveDoAno=0,MaiorMultiploDeSete=0;
	
    // chave do mes
	
    switch (dia) {
		
	case 1:
            ChaveDoMes = 1; 
	break;
		
	case 2:
            ChaveDoMes = 4; 
        break;
		
	case 3:
            ChaveDoMes = 4; 
        break;
		
	case 4:
            ChaveDoMes = 0; 
	break;
		
	case 5:
            ChaveDoMes = 2; 
	break;
		
	case 6:
            ChaveDoMes =5; 
	break;
		
	case 7:
            ChaveDoMes = 0; 
	break;
		
	case 8:
            ChaveDoMes = 3; 
	break;
		
	case 9:
            ChaveDoMes = 6; 
	break;
		
	case 10:
            ChaveDoMes = 1;
        break;
		
	case 11:	
            ChaveDoMes = 4; 
            break;
		
	case 12:
                ChaveDoMes = 6; 
            break;		
	}
	
    //chave do ano
	
    ChaveDoAno = ano / 4;
    ChaveDoAno = ChaveDoAno + (ano % 7);
    ChaveDoAno = ChaveDoAno % 7;
	
    // maior mulltipo de 7
	
    for (int i = 0; i < dia+ ChaveDoMes + ChaveDoAno; i++) {
		
	if ( i % 7 == 0 ) 
            MaiorMultiploDeSete = i;
	}
	
    // retornar o dia da semana
	
    int Formula = (dia + ChaveDoMes + ChaveDoAno) - MaiorMultiploDeSete;
	
    String DiaDaSemana ="";
	
    switch (Formula) {
		
	case 1:
            DiaDaSemana = "Domingo";
        break;
		
        case 2:
            DiaDaSemana = "Segunda-feira";
        break;
		
	case 3:
            DiaDaSemana = "Terca-feira"; 
	break;
		
	case 4:
            DiaDaSemana = "Quarta-feira"; 
	break;
		
	case 5:
            DiaDaSemana = "Quinta-feira"; 
	break;
		
	case 6:
            DiaDaSemana = "Sexta-feira";
	break;
		
	case 0:
            DiaDaSemana = "Sabado";
	break;
			
				
	}
	
		
    return DiaDaSemana;
    }
	

    int calculaDiasEntreDatas(int dia1,int mes1,int ano1, int dia2,int mes2,int ano2) {

	
    int diaTotalAno=0,diaTotalMes=0,i=0;

    // Pega os dias entre ano1 e ano2
    for(i = ano1; i < ano2; i++){ 

        // verifica se ano é bissexto ou não
        if(i % 4 == 0){
            diaTotalAno += 366;
        } else {
            diaTotalAno += 365;
        }
    }

    if (mes1 > mes2) {
	
        for(i =mes1 ; i < mes2; i++){ 
            diaTotalMes +=30;  
        }
		
	for(i =mes1 ; i < mes2; i = i + 2 ){ 
            diaTotalMes +=1;  
    	}
    }

   else
	{
	  
	for(i =mes2 ; i < mes1; i++){ 
            diaTotalMes +=30;  
    	} 
   	   
	for(i =mes2 ; i < mes1; i = i + 2 ){ 
            diaTotalMes +=1;  
    	} 
    }	  	
	
    // a diferença entre os meses
	
    if (mes1 > mes2) {
		
	diaTotalAno = diaTotalAno + diaTotalMes;
    }
    else
	{
	diaTotalAno = diaTotalAno - diaTotalMes;
    }
	
    // a diferença entre os anos
	
    if (dia1 > dia2) {
		
	diaTotalAno = diaTotalAno + (dia1 - dia2);
    }
	
    else
	{
	diaTotalAno = diaTotalAno + (dia2 - dia1);
    }
		
    return diaTotalAno ;
    }
  
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
    Data[] obj = new Data[3];  
    
     for (int i = 0; i < obj.length; i++) {
        obj[i] = new Data();
    }
    
    try{
      obj[0].setData(Integer.parseInt(jTextField1.getText()), 
                   Integer.parseInt(jTextField2.getText()), 
                   Integer.parseInt(jTextField3.getText()));
     
    jLabel3.setText(obj[0].validaData());
    jLabel5.setText(obj[0].DeterminaDiaSemana());
    
    obj[1].setData(Integer.parseInt(jTextField4.getText()), 
                   Integer.parseInt(jTextField5.getText()), 
                   Integer.parseInt(jTextField6.getText()));

    jLabel4.setText(obj[1].validaData());
    jLabel6.setText(obj[1].DeterminaDiaSemana());
    
    jLabel12.setText(Integer.toString(obj[2].calculaDiasEntreDatas(
                                                      obj[0].getDia (),
                                                      obj[0].getMes (),
                                                      obj[0].getAno (), 
                                                      obj[1].getDia (), 
                                                      obj[1].getMes (),
                                                      obj[1].getAno ())));    
        
        
    } catch (NumberFormatException exception){
    }
     
  
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Classe_09_Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
