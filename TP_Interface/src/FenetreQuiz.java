
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author romai
 */
public class FenetreQuiz extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FenetreQuiz.class.getName());

    /**
     * Creates new form Interface
     */
    int score=0;
    int compteur=0;
    int indexQuestionCourante = 0;
 
    public void afficherQuestionCourante(){
         Question q = questions.get(indexQuestionCourante);
           lblQuestion.setText(q.getIntitule());
           
          btnRep1.setText(q.getProposition1());
          btnRep2.setText(q.getProposition2());
          btnRep3.setText(q.getProposition3());
          btnRep4.setText(q.getProposition4());
          
          btnRep1.setEnabled(true);
          btnRep2.setEnabled(true);
          btnRep3.setEnabled(true); 
          btnRep4.setEnabled(true);
         

         
    }
    ArrayList<Question> questions = new ArrayList<>(); 

    public FenetreQuiz() {
        
questions.add(new Question("Capitale de la France ?", "Rome", "Berlin", "Paris", "Madrid", 3));
questions.add(new Question("Capitale de l’Espagne ?", "Barcelone", "Madrid", "Séville", "Valence", 2));
questions.add(new Question("Capitale de l’Allemagne ?", "Berlin", "Munich", "Hambourg", "Francfort", 1));
questions.add(new Question("Capitale de l’Italie ?", "Rome", "Milan", "Venise", "Turin", 1));
questions.add(new Question("Capitale du Portugal ?", "Lisbonne", "Porto", "Braga", "Faro", 1));

questions.add(new Question("Capitale du Royaume-Uni ?", "Manchester", "Liverpool", "Édimbourg", "Londres", 4));
questions.add(new Question("Capitale de la Suisse ?", "Zurich", "Genève", "Berne", "Bâle", 3));
questions.add(new Question("Capitale de la Belgique ?", "Bruges", "Bruxelles", "Liège", "Anvers", 2));
questions.add(new Question("Capitale des Pays-Bas ?", "Rotterdam", "Amsterdam", "La Haye", "Utrecht", 2));
questions.add(new Question("Capitale du Danemark ?", "Oslo", "Stockholm", "Copenhague", "Helsinki", 3));

questions.add(new Question("Capitale de la Suède ?", "Malmö", "Stockholm", "Göteborg", "Uppsala", 2));
questions.add(new Question("Capitale de la Norvège ?", "Oslo", "Bergen", "Trondheim", "Stavanger", 1));
questions.add(new Question("Capitale de la Finlande ?", "Tampere", "Helsinki", "Turku", "Oulu", 2));
questions.add(new Question("Capitale de l’Islande ?", "Reykjavik", "Akureyri", "Selfoss", "Vik", 1));
questions.add(new Question("Capitale de l’Irlande ?", "Cork", "Dublin", "Galway", "Limerick", 2));

questions.add(new Question("Capitale de la Russie ?", "Moscou", "Saint-Pétersbourg", "Kazan", "Sotchi", 1));
questions.add(new Question("Capitale de la Turquie ?", "Istanbul", "Ankara", "Izmir", "Antalya", 2));
questions.add(new Question("Capitale de la Grèce ?", "Athènes", "Thessalonique", "Patras", "Heraklion", 1));
questions.add(new Question("Capitale de la Bulgarie ?", "Varna", "Plovdiv", "Sofia", "Burgas", 3));
questions.add(new Question("Capitale de la Roumanie ?", "Bucarest", "Cluj", "Timisoara", "Iasi", 1));

questions.add(new Question("Capitale des États-Unis ?", "New York", "Washington D.C.", "Chicago", "Boston", 2));
questions.add(new Question("Capitale du Canada ?", "Toronto", "Ottawa", "Vancouver", "Montréal", 2));
questions.add(new Question("Capitale du Mexique ?", "Monterrey", "México", "Guadalajara", "Puebla", 2));
questions.add(new Question("Capitale du Brésil ?", "Rio", "Brasilia", "São Paulo", "Salvador", 2));
questions.add(new Question("Capitale de l’Argentine ?", "Buenos Aires", "Córdoba", "Rosario", "Mendoza", 1));

questions.add(new Question("Capitale du Chili ?", "Valparaiso", "Santiago", "Concepción", "Arica", 2));
questions.add(new Question("Capitale du Pérou ?", "Arequipa", "Cusco", "Lima", "Trujillo", 3));
questions.add(new Question("Capitale de la Colombie ?", "Medellín", "Bogotá", "Cali", "Cartagena", 2));
questions.add(new Question("Capitale du Venezuela ?", "Maracaibo", "Caracas", "Valencia", "Barquisimeto", 2));
questions.add(new Question("Capitale de Cuba ?", "Santiago", "Havana", "Varadero", "Matanzas", 2));

questions.add(new Question("Capitale du Maroc ?", "Casablanca", "Marrakech", "Rabat", "Fès", 3));
questions.add(new Question("Capitale de l’Algérie ?", "Oran", "Alger", "Annaba", "Constantine", 2));
questions.add(new Question("Capitale de la Tunisie ?", "Sfax", "Sousse", "Tunis", "Bizerte", 3));
questions.add(new Question("Capitale de l’Égypte ?", "Alexandrie", "Gizeh", "Port-Saïd", "Le Caire", 4));
questions.add(new Question("Capitale de l’Afrique du Sud ?", "Le Cap", "Pretoria", "Johannesburg", "Durban", 2));

questions.add(new Question("Capitale du Nigeria ?", "Lagos", "Abuja", "Kano", "Ibadan", 2));
questions.add(new Question("Capitale du Kenya ?", "Mombasa", "Nairobi", "Kisumu", "Eldoret", 2));
questions.add(new Question("Capitale de l’Éthiopie ?", "Gondar", "Mékele", "Addis-Abeba", "Dire Dawa", 3));
questions.add(new Question("Capitale du Ghana ?", "Kumasi", "Accra", "Tamale", "Tema", 2));
questions.add(new Question("Capitale du Sénégal ?", "Dakar", "Saint-Louis", "Thiès", "Ziguinchor", 1));

questions.add(new Question("Capitale de la Chine ?", "Shanghai", "Pékin", "Shenzhen", "Wuhan", 2));
questions.add(new Question("Capitale du Japon ?", "Kyoto", "Osaka", "Tokyo", "Nagoya", 3));
questions.add(new Question("Capitale de l’Inde ?", "Mumbai", "Delhi", "New Delhi", "Bangalore", 3));
questions.add(new Question("Capitale de la Corée du Sud ?", "Busan", "Séoul", "Incheon", "Daegu", 2));
questions.add(new Question("Capitale de l’Indonésie ?", "Jakarta", "Surabaya", "Bali", "Medan", 1));

questions.add(new Question("Capitale de l’Australie ?", "Sydney", "Melbourne", "Canberra", "Perth", 3));
questions.add(new Question("Capitale de la Nouvelle-Zélande ?", "Queenstown", "Wellington", "Auckland", "Christchurch", 2));
questions.add(new Question("Capitale des Philippines ?", "Cebu", "Manille", "Davao", "Luzon", 2));
questions.add(new Question("Capitale de la Thaïlande ?", "Phuket", "Chiang Mai", "Bangkok", "Pattaya", 3));
questions.add(new Question("Capitale du Vietnam ?", "Hô-Chi-Minh-Ville", "Hanoi", "Hue", "Da Nang", 2));
    

        initComponents();
        lblQuestion.setVisible(true);
        
    }
            
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblQuestion = new javax.swing.JLabel();
        btnRep2 = new javax.swing.JButton();
        btnRep1 = new javax.swing.JButton();
        btnRep3 = new javax.swing.JButton();
        btnRep4 = new javax.swing.JButton();
        lblFeedback = new javax.swing.JLabel();
        btnSuivant = new javax.swing.JButton();
        lblScore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblQuestion.setFont(new java.awt.Font("Avenir Next Cyr", 0, 24)); // NOI18N
        lblQuestion.setText("Capitales");
        getContentPane().add(lblQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        btnRep2.setFont(new java.awt.Font("Avenir Next Cyr", 0, 14)); // NOI18N
        btnRep2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRep2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRep2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 190, 30));

        btnRep1.setFont(new java.awt.Font("Avenir Next Cyr", 0, 14)); // NOI18N
        btnRep1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRep1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRep1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 190, 30));

        btnRep3.setFont(new java.awt.Font("Avenir Next Cyr", 0, 14)); // NOI18N
        btnRep3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRep3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRep3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 190, 30));

        btnRep4.setFont(new java.awt.Font("Avenir Next Cyr", 0, 14)); // NOI18N
        btnRep4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRep4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRep4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 190, 30));

        lblFeedback.setFont(new java.awt.Font("Avenir Next Cyr", 0, 14)); // NOI18N
        getContentPane().add(lblFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 120, -1));

        btnSuivant.setFont(new java.awt.Font("Avenir Next Cyr", 0, 14)); // NOI18N
        btnSuivant.setText("Suivant");
        btnSuivant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuivantActionPerformed(evt);
            }
        });
        getContentPane().add(btnSuivant, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        lblScore.setFont(new java.awt.Font("Avenir Next Cyr", 0, 14)); // NOI18N
        lblScore.setText("Score : 0");
        getContentPane().add(lblScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRep2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRep2ActionPerformed
        lblQuestion.setVisible(true);
        
       
           int numeroChoisi = 2;
    Question q = questions.get(indexQuestionCourante);

    if (numeroChoisi == q.getIndexBonneReponse()) {
        lblFeedback.setText("Bonne réponse");
        score++;
        
    } else {
        lblFeedback.setText("Mauvaise réponse");
    }
    btnRep1.setEnabled(false);
    btnRep2.setEnabled(false);
    btnRep3.setEnabled(false);
    btnRep4.setEnabled(false);
        
       
    }//GEN-LAST:event_btnRep2ActionPerformed

    private void btnRep1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRep1ActionPerformed
    int numeroChoisi = 1;          
    Question q = questions.get(indexQuestionCourante);   

    if (numeroChoisi == q.getIndexBonneReponse()) {
        lblFeedback.setText("Bonne réponse");   
        score++;
    } else {
        lblFeedback.setText("Mauvaise réponse");
    }

 
    btnRep1.setEnabled(false);
    btnRep2.setEnabled(false);
    btnRep3.setEnabled(false);
    btnRep4.setEnabled(false);
    }//GEN-LAST:event_btnRep1ActionPerformed

    private void btnRep3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRep3ActionPerformed
    
    int numeroChoisi = 3;
    Question q = questions.get(indexQuestionCourante);

    if (numeroChoisi == q.getIndexBonneReponse()) {
        lblFeedback.setText("Bonne réponse");
        score++;
        
    } else {
        lblFeedback.setText("Mauvaise réponse");
    }
    
    btnRep1.setEnabled(false);
    btnRep2.setEnabled(false);
    btnRep3.setEnabled(false);
    btnRep4.setEnabled(false);
    }//GEN-LAST:event_btnRep3ActionPerformed

    private void btnRep4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRep4ActionPerformed
    
     int numeroChoisi = 4;
    Question q = questions.get(indexQuestionCourante);

    if (numeroChoisi == q.getIndexBonneReponse()) {
        lblFeedback.setText("Bonne réponse");
        score++;
        
    } else {
        lblFeedback.setText("Mauvaise réponse");
    }   
        
    btnRep1.setEnabled(false);
    btnRep2.setEnabled(false);
    btnRep3.setEnabled(false);
    btnRep4.setEnabled(false);
    }//GEN-LAST:event_btnRep4ActionPerformed

    private void btnSuivantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuivantActionPerformed
        indexQuestionCourante++; 

    if (indexQuestionCourante < questions.size()) {
        afficherQuestionCourante(); 
        lblFeedback.setText("");
        lblScore.setText("Score :"+ score);
    } else {
        
        btnSuivant.setEnabled(false); 
        btnRep1.setEnabled(false);
        btnRep2.setEnabled(false);
        btnRep3.setEnabled(false);
        btnRep4.setEnabled(false);
    }
    }//GEN-LAST:event_btnSuivantActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FenetreQuiz().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRep1;
    private javax.swing.JButton btnRep2;
    private javax.swing.JButton btnRep3;
    private javax.swing.JButton btnRep4;
    private javax.swing.JButton btnSuivant;
    private javax.swing.JLabel lblFeedback;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JLabel lblScore;
    // End of variables declaration//GEN-END:variables
}

