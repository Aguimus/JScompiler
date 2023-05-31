/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ALexico;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;
import java.util.ArrayList;

public class ventanaAnalizador extends javax.swing.JFrame {

    public ventanaAnalizador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonAnalisis = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Resultado = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAnalizarLex = new javax.swing.JTextArea();
        btnArchivo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BotonAnalisis1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAnalizarSin = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        Borrar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonAnalisis.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BotonAnalisis.setText("Análisis Léxico");
        BotonAnalisis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAnalisisActionPerformed(evt);
            }
        });

        Resultado.setColumns(20);
        Resultado.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Resultado.setRows(5);
        jScrollPane1.setViewportView(Resultado);

        txtAnalizarLex.setColumns(20);
        txtAnalizarLex.setRows(5);
        jScrollPane2.setViewportView(txtAnalizarLex);

        btnArchivo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnArchivo.setText("Abrir archivo");
        btnArchivo.setToolTipText("");
        btnArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("ANALIZADOR LEXICO DE JAVASCRIPT");

        BotonAnalisis1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BotonAnalisis1.setText("Análisis Sintactico");
        BotonAnalisis1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAnalisis1ActionPerformed(evt);
            }
        });

        txtAnalizarSin.setColumns(20);
        txtAnalizarSin.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtAnalizarSin.setRows(5);
        jScrollPane3.setViewportView(txtAnalizarSin);
        txtAnalizarSin.getAccessibleContext().setAccessibleName("");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("ANALIZADOR SINTACTICA DE JAVASCRIPT");
        jLabel2.setToolTipText("");

        Borrar1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Borrar1.setText("Borrar");
        Borrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Borrar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BotonAnalisis1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Borrar1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAnalisis1)
                    .addComponent(Borrar1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonAnalisis)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnArchivo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAnalisis)
                    .addComponent(btnArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Nodo aux = new Nodo();
    public Lexema aux1 = new Lexema();
    public ArrayList<Nodo> tokens = new ArrayList<>();
    public ArrayList<Lexema> listaLexemas = new ArrayList<>();
    public int contador = 0;
    public boolean nuevaVar = false;
    public boolean string = false;

    private void analizarLexico() throws IOException {
        int cont = 1;
        int contCom = 0;
        String expr = (String) Resultado.getText();
        Lexer lexicos = new Lexer(new StringReader(expr));
        String resultado = "LINEA " + cont + "\t\tSIMBOLO\n";
        while (true) {
            Tokens token = lexicos.yylex();
            if (token == null) {
                txtAnalizarLex.setText(resultado);
                return;
            }
            aux1.lex = lexicos.lexemas;
            aux1.posicion = cont - 1;
            listaLexemas.add(aux1);
            aux1 = new Lexema();
            switch (token) {
                case Linea:
                    cont++;
                    resultado += "LINEA " + cont + "\n";
                    tokens.add(aux);
                    aux = new Nodo();
                    nuevaVar = false;
                    string=false;
                    break;
                case Comillas:
                    resultado += "  <Comillas>\t\t" + lexicos.lexemas + "\n";
                    if (contCom == 0) {
                        string = true;
                        contCom++;
                    } else {
                        contCom = 0;
                    }
                    break;
                case Cadena:
                    resultado += "  <Tipo de dato>\t" + lexicos.lexemas + "\n";
                    break;
                case T_dato:
                    resultado += "  <Reservada T_dato>\t" + lexicos.lexemas + "\n";
                    nuevaVar = true;
                    cont++;
                    break;
                case Igual:
                    resultado += "  <Operador igual>\t" + lexicos.lexemas + "\n";
                    break;
                case Suma:
                    resultado += "  <Operador suma>\t" + lexicos.lexemas + "\n";
                    break;
                case Resta:
                    resultado += "  <Operador resta>\t" + lexicos.lexemas + "\n";
                    break;
                case Multiplicacion:
                    resultado += "  <Operador multiplicacion>\t" + lexicos.lexemas + "\n";
                    break;
                case Division:
                    resultado += "  <Operador division>\t" + lexicos.lexemas + "\n";
                    break;
                case Parentesis_abrir:
                    resultado += "  <Parentesis de apertura>\t" + lexicos.lexemas + "\n";
                    break;
                case Parentesis_cerrar:
                    resultado += "  <Parentesis de cierre>\t" + lexicos.lexemas + "\n";
                    break;
                case Llave_abrir:
                    resultado += "  <Llave de apertura>\t" + lexicos.lexemas + "\n";
                    break;
                case Llave_cerrar:
                    resultado += "  <Llave de cierre>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_relacional:
                    resultado += "  <Operador relacional>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_atribucion:
                    resultado += "  <Operador de atribucion>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_incremento:
                    resultado += "  <Operador de incremento/decremento>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Op_logico:
                    resultado += "  <Operador logico>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Op_booleano:
                    resultado += "  <Valor booleano>\t" + lexicos.lexemas + "\n";
                    if (nuevaVar) {
                        aux.valor = lexicos.lexemas;
                        tokens.add(aux);
                        aux = new Nodo();
                        nuevaVar = false;
                    }
                    break;
                case Corchete_abrir:
                    resultado += "  <Corchete de apertura>\t" + lexicos.lexemas + "\n";
                    break;
                case Corchete_cerrar:
                    resultado += "  <Corchete de cierre>\t" + lexicos.lexemas + "\n";
                    break;
                case If:
                    resultado += "  <Reservada if>\t" + lexicos.lexemas + "\n";
                    break;
                case Else:
                    resultado += "  <Reservada else>\t" + lexicos.lexemas + "\n";
                    break;
                case Do:
                    resultado += "  <Reservada do>\t" + lexicos.lexemas + "\n";
                    break;
                case While:
                    resultado += "  <Reservada while>\t" + lexicos.lexemas + "\n";
                    break;
                case Console:
                    resultado += "  <Reservada console>\t" + lexicos.lexemas + "\n";
                    break;
                case Log:
                    resultado += "  <Reservada log>\t" + lexicos.lexemas + "\n";
                    break;
                case Function:
                    resultado += "  <Reservada function>\t" + lexicos.lexemas + "\n";
                    break;
                case For:
                    resultado += "  <Reservada for>\t" + lexicos.lexemas + "\n";
                    break;
                case Prompt:
                    resultado += "  <Reservada prompt>\t" + lexicos.lexemas + "\n";
                    break;
                case Switch:
                    resultado += "  <Reservada switch>\t" + lexicos.lexemas + "\n";
                    break;
                case Case:
                    resultado += "  <Reservada case>\t" + lexicos.lexemas + "\n";
                    break;
                case Void:
                    resultado += "  <Reservada void>\t" + lexicos.lexemas + "\n";
                    break;
                case Punto:
                    resultado += "  <Reservada punto>\t" + lexicos.lexemas + "\n";
                    break;
                case Coma:
                    resultado += "  <Reservada coma>\t" + lexicos.lexemas + "\n";
                    break;
                case P_coma:
                    resultado += "  <Punto y coma>\t" + lexicos.lexemas + "\n";
                    break;
                case Identificador:
                    if (string) {
                        resultado += "  <String>\t\t" + lexicos.lexemas + "\n";
                        string = false;
                        if (nuevaVar) {
                            aux.valor = lexicos.lexemas;
                            tokens.add(aux);
                            aux = new Nodo();
                            nuevaVar = false;
                        }
                    } else {
                        resultado += "  <Identificador>\t\t" + lexicos.lexemas + "\n";
                        if (nuevaVar) {
                            aux.id = lexicos.lexemas;
                        }
                    }
                    break;
                case Numero:
                    resultado += "  <Numero>\t\t" + lexicos.lexemas + "\n";
                    if (nuevaVar) {
                        aux.valor = lexicos.lexemas;
                        tokens.add(aux);
                        aux = new Nodo();
                        nuevaVar = false;
                    }
                    break;
                case Error:
                    resultado += "  <Simbolo no definido>\n";
                    break;
                default:
                    resultado += "  < " + lexicos.lexemas + " >\n";
                    break;
            }
        }

    }

    public void a() {
        for (int i = 0; i < listaLexemas.size(); i++) {
            System.out.println(listaLexemas.get(i).lex);
        }
    }

    private void aSemantico() {

        for (int i = 0; i < listaLexemas.size(); i++) {
            //buscar si hay variables de operacion
            if (listaLexemas.get(i).lex.equals("+") || listaLexemas.get(i).lex.equals("-") || listaLexemas.get(i).lex.equals("*")
                    || listaLexemas.get(i).lex.equals("/") || listaLexemas.get(i).lex.equals("+=") || listaLexemas.get(i).lex.equals("-=")
                    || listaLexemas.get(i).lex.equals("*=") || listaLexemas.get(i).lex.equals("/=")) {
                
                //caso operar numero-booleano o booleano-numero
                if (((listaLexemas.get(i + 1).lex.equals("true") || listaLexemas.get(i + 1).lex.equals("false")) && esNumero(listaLexemas.get(i - 1).lex)) || 
                        ((listaLexemas.get(i - 1).lex.equals("true") || listaLexemas.get(i - 1).lex.equals("false")) && esNumero(listaLexemas.get(i + 1).lex))) {
                        txtAnalizarSin.setText(txtAnalizarSin.getText() + "\nError semántico, operación de tipos de datos incompatibles en la linea " + listaLexemas.get(i).posicion);
                }//caso de que se opere un identificador con un numero || numero identificador

                else if (esNumero(listaLexemas.get(i + 1).lex)||esNumero(listaLexemas.get(i - 1).lex)) {
                    for (Nodo e : tokens) {
                        if (e.id.equals(listaLexemas.get(i - 1).lex)||e.id.equals(listaLexemas.get(i + 1).lex)) {
                            if (!e.valor.equals("false") || !e.valor.equals("true")) {

                                txtAnalizarSin.setText(txtAnalizarSin.getText() + "\nError semántico, operación de tipos de datos incompatibles en la linea " + listaLexemas.get(i).posicion);
                            }
                        }
                    }
                } //caso que se opere un identificador con un booleano o booleano con identificador
                else if (listaLexemas.get(i + 1).lex.equals("true") || listaLexemas.get(i + 1).lex.equals("false") ||listaLexemas.get(i - 1).lex.equals("true") || listaLexemas.get(i - 1).lex.equals("false")) {
                    for (Nodo e : tokens) {
                        if (e.id.equals(listaLexemas.get(i - 1).lex)||e.id.equals(listaLexemas.get(i + 1).lex)) {
                            if (esNumero(e.valor)) {
                                txtAnalizarSin.setText(txtAnalizarSin.getText() + "\nError semántico, operación de tipos de datos incompatibles en la linea " + listaLexemas.get(i).posicion);
                            }
                        }
                    }
                } //caso que se opere un identificador con un string || string con identificador
                else if (listaLexemas.get(i + 1).lex.equals("\"") || listaLexemas.get(i - 1).lex.equals("\"")) {
                    //System.out.println("siuu");
                    if (!(listaLexemas.get(i).lex.equals("+"))) {
                        txtAnalizarSin.setText(txtAnalizarSin.getText() + "\nError semántico, operación de tipos de datos incompatibles en la linea " + listaLexemas.get(i).posicion);
                    } /*else {    SI SE LE PUEDE SUMAR UN BOOLEANO A UN STRING XD
                        for (Nodo e : tokens) {
                            if (e.id.equals(listaLexemas.get(i - 1).lex)) {
                                if (e.valor.equals("true") || e.valor.equals("false")) {
                                    txtAnalizarSin.setText(txtAnalizarSin.getText() + "\nError semántico, operación de tipos de datos incompatibles en la linea " + listaLexemas.get(i).posicion);
                                }
                            }
                        }
                    }*/
                } //caso que se opere entre 2 identificadores
                else {
                    String aux1 = ""; //guarda el dato del identificador en i-1
                    String aux2 = ""; //guarda el dato del identificador en i+1
                    for (Nodo e : tokens) {
                        if (e.id.equals(listaLexemas.get(i - 1).lex)) {
                            aux1 = e.valor;
                        }
                        if (e.id.equals(listaLexemas.get(i + 1).lex)) {
                            aux2 = e.valor;
                        }
                    }
                    if (((aux1.equals("true") || aux1.equals("false")) && esNumero(aux2)) || ((aux2.equals("true") || aux2.equals("false")) && esNumero(aux1))) {
                        txtAnalizarSin.setText(txtAnalizarSin.getText() + "\nError semántico, operación de tipos de datos incompatibles en la linea " + listaLexemas.get(i).posicion);
                    }
                }
            }
            
            // el resto de operadores
            /*
            if ((listaLexemas.get(i).lex.equals(">=") || listaLexemas.get(i).lex.equals("<=") || listaLexemas.get(i).lex.equals(">")
                    || listaLexemas.get(i).lex.equals("<")) && !(esNumero(listaLexemas.get(i-1).lex) && esNumero(listaLexemas.get(i+1).lex))){
                txtAnalizarSin.setText(txtAnalizarSin.getText() + "\nError semántico, operación de tipos de datos incompatibles en la linea " + listaLexemas.get(i).posicion);
                if(esNumero(listaLexemas.get(i-1).lex) || esNumero(listaLexemas.get(i+1).lex)){
                    for (Nodo e : tokens) {
                        if (e.id.equals(listaLexemas.get(i - 1).lex)) {
                            if (!esNumero(e.valor))
                              txtAnalizarSin.setText(txtAnalizarSin.getText() + "\nError semántico, operación de tipos de datos incompatibles en la linea " + listaLexemas.get(i).posicion);  
                        } else if(e.id.equals(listaLexemas.get(i - 1).lex)){
                            if (!esNumero(e.valor))
                              txtAnalizarSin.setText(txtAnalizarSin.getText() + "\nError semántico, operación de tipos de datos incompatibles en la linea " + listaLexemas.get(i).posicion);
                        }
                    }
                }
            }*/ //toy pendejo, esto no da error en javascript xD
        }

        /*for (Lexema e : listaLexemas) {
            System.out.println(e.lex);
        }*/
        tokens.clear();
        listaLexemas.clear();
    }

    public static boolean esNumero(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void BotonAnalisisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAnalisisActionPerformed
        try {
            analizarLexico();
            aSemantico();
            BotonAnalisis.setEnabled(false);
        } catch (IOException ex) {
            Logger.getLogger(ventanaAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotonAnalisisActionPerformed

    private void btnArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoActionPerformed

        JFileChooser escoger = new JFileChooser();
        escoger.showOpenDialog(null);
        File arc = new File(escoger.getSelectedFile().getAbsolutePath());

        try {
            String ST = new String(Files.readAllBytes(arc.toPath()));
            Resultado.setText(ST);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ventanaAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ventanaAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnArchivoActionPerformed

    private void Borrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Borrar1ActionPerformed
        txtAnalizarLex.setText(null);
        txtAnalizarSin.setText(null);
        tokens.clear();
        listaLexemas.clear();
        BotonAnalisis.setEnabled(true);
    }//GEN-LAST:event_Borrar1ActionPerformed

    private void BotonAnalisis1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAnalisis1ActionPerformed
        String ST = (String) Resultado.getText();
        Sintax s = new Sintax(new LexerCup(new StringReader(ST)));

        try {
            s.parse();
            txtAnalizarSin.setText("No se encontraron errores de sintaxis");
            txtAnalizarSin.setForeground(new Color(25, 111, 61));
            aSemantico();
            BotonAnalisis.setEnabled(true);
        } catch (Exception ex) {
            Symbol sym = s.getS();
            txtAnalizarSin.setText("Error de sintaxis. Linea: " + (sym.right + 1) + ", columna: " + (sym.left + 1) + ", texto: \"" + sym.value + "\"");
            txtAnalizarSin.setForeground(Color.red);
            tokens.clear();
            listaLexemas.clear();
            BotonAnalisis.setEnabled(true);

        }
    }//GEN-LAST:event_BotonAnalisis1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventanaAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaAnalizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrar1;
    private javax.swing.JButton BotonAnalisis;
    private javax.swing.JButton BotonAnalisis1;
    private javax.swing.JTextArea Resultado;
    private javax.swing.JButton btnArchivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtAnalizarLex;
    private javax.swing.JTextArea txtAnalizarSin;
    // End of variables declaration//GEN-END:variables
}
