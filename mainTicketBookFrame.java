
import javax.swing.JOptionPane;
import java.sql.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kunal
 */
public class mainTicketBookFrame extends javax.swing.JFrame {

    int count=0, movierate=0, seatrate=0, foodrate=0, total=0;
    String foodtype = "Food/Beverages", seattype = "Select Ticket Type";
    
    public mainTicketBookFrame() {
        initComponents();
        setLocationRelativeTo(null);
        clear();
        

        dillbecharadatails.setText("Director: Mukesh Chhabra\n" + "Adapted from: The Fault in Our Stars\n" + "Production company: Fox Star Studios");
        Tanajidatails.setText("Tanhaji, a Maratha warrior, is Shivaji Maharaj's trusted lieutenant. When the Mughals invade and conquer Kondhana fort, he sets out to reclaim it for his king and country.\n"
                + "Release date: 10 January 2020 (India)\n"
                + "Director: Om Raut\n"
                + "Box office: est. ₹367.65 crore\n"
                + "Producers: Ajay Devgn, Bhushan Kumar, Krishan Kumar");
        Angregimediumdatails.setText("Though Champak initially disapproves, he eventually does everything in his power while going through a series of hilarious mishaps to fulfil his daughter's dream of going to London to study further.\n"
                + "Release date: 13 March 2020 (India)\n"
                + "Director: Homi Adajania\n"
                + "Box office: est. ₹13.54 crore\n"
                + "Producers: Dinesh Vijan, Jyoti Deshpande");
        lakkydatails.setText("Luckee is a young and innocent boy who desperately tries to impress and win the heart of his crush, Jiya, during an annual college trip.\n"
                + "Initial release: 7 December 2018\n"
                + "Director: Sanjay Jadhav\n"
                + "Editor: Apurva Motiwale\n"
                + "Language: Marathi language");
        Gunjansaxenadatails.setText("The life of Air Force pilot, Gunjan Saxena, the first Indian female pilot in combat.\n"
                + "Initial release: 12 August 2020\n"
                + "Director: Sharan Sharma\n"
                + "Producers: Karan Johar, Hiroo Johar, Apoorva Mehta\n"
                + "Production companies: Dharma Productions, Essel Vision Productions, Zee Studios\n"
                + "Screenplay: Nikhil Malhotra, Sharran Kumar");
        sadak2datails.setText("Sadak 2 is a 2020 Indian film directed by Mahesh Bhatt and produced by Mukesh Bhatt under their banner Vishesh Films. The film is the sequel to the 1991 film Sadak. The sequel stars Sanjay Dutt, Pooja Bhatt, Alia Bhatt and Aditya Roy Kapur. The film marks Mahesh Bhatt's return as a director after 20 years. Wikipedia\n"
                + "Release date: 10 July 2020 (India)\n"
                + "Director: Mahesh Bhatt\n"
                + "Screenplay: Mahesh Bhatt, Pushpdeep Bhardhwaj, Raj Kumar Bhutani, Shagufta Rafique\n"
                + "Producers: Mahesh Bhatt, Mukesh Bhatt");
        khudahafizdatails.setText("Khuda Haafiz is a 2020 Indian Hindi-language action thriller film written and directed by Faruk Kabir and produced by Kumar Mangat Pathak and Abhishek Pathak under Panorama Studios. It stars Vidyut Jammwal and Shivaleeka Oberoi, with Annu Kapoor, Aahana Kumra and Shiv Panditt in supporting roles. Wikipedia\n"
                + "Initial release: 14 August 2020\n"
                + "Director: Faruk Kabir\n"
                + "Production company: Panorama Studios\n"
                + "Screenplay: Faruk Kabir, Zaheer Abass Qureshi");

    }
    void set_false()
    {
        dillbecharaposter.setEnabled(false);
        dillbecharadatails.setEnabled(false);
        gunjansaxenaposter.setEnabled(false);
        Gunjansaxenadatails.setEnabled(false);
        lakkyposter.setEnabled(false);
        lakkydatails.setEnabled(false);
        agrejimeadiumposter.setEnabled(false);
        Angregimediumdatails.setEnabled(false);
        tanjiposter.setEnabled(false);
        Tanajidatails.setEnabled(false);
        sadak2datails.setEnabled(false);
        khudahafizdatails.setEnabled(false);
        sadak2poster.setEnabled(false);
        khudahafisposter.setEnabled(false);
    //    TicketTypeComboBox.setEnabled(false);
        TicketCount.setEnabled(true);

    }  
    boolean validationCheck()
    {
        boolean temp;
        if (TicketCount.getValue().equals(0)||seattype.equals("Select Ticket Type")||foodtype.equals("Food/Beverages")||user_name.equals(null)||user_number.equals(null)) 
          temp = false;      
        else
            temp= true;
        return  temp;
    }
    void calcuation()
    {              
        total = (movierate * count) + ( seatrate +  foodrate);
        TotalTicketPriceLabel.setText("" + total + " Rs");                      
    }            
    
    void ticketCountCalculation()
    {
        count = (int) TicketCount.getValue();
      //  TicketTypeComboBox.setEnabled(true);           
        TicketCountLabel.setText("" + TicketCount.getValue()+"* "+movierate);
    }
    void clear() {
        count = 0;
        foodrate = 0 ; 
        seatrate = 0;
        dillbecharaposter.setEnabled(true);
        dillbecharadatails.setEnabled(true);
        gunjansaxenaposter.setEnabled(true);
        lakkyposter.setEnabled(true);
        lakkydatails.setEnabled(true);
        Gunjansaxenadatails.setEnabled(true);
        agrejimeadiumposter.setEnabled(true);
        Angregimediumdatails.setEnabled(true);
        tanjiposter.setEnabled(true);
        Tanajidatails.setEnabled(true);
        sadak2datails.setEnabled(true);
        khudahafizdatails.setEnabled(true);
        sadak2poster.setEnabled(true);
        khudahafisposter.setEnabled(true);

        //TicketCount.setValue("1");
        TicketTypeComboBox.setSelectedItem("Select Ticket Type");
        FoodBeveragesComboBox.setSelectedItem("Food/Beverages");
        movienameLabel.setText(null);
        movierateLabel.setText(null);
        TicketCountLabel.setText(null);
        foodPriceLabel.setText(null);
        seattypeLabel.setText(null);
        TotalTicketPriceLabel.setText(null);
        
        TicketCount.setEnabled(false);
        TicketTypeComboBox.setEnabled(false);
        FoodBeveragesComboBox.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        agrejimeadiumposter = new javax.swing.JLabel();
        tanjiposter = new javax.swing.JLabel();
        gunjansaxenaposter = new javax.swing.JLabel();
        dillbecharaposter = new javax.swing.JLabel();
        sadak2poster = new javax.swing.JLabel();
        lakkyposter = new javax.swing.JLabel();
        khudahafisposter = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TicketCount = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        TotalTicketPriceLabel = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        movienameLabel = new javax.swing.JLabel();
        TicketCountLabel = new javax.swing.JLabel();
        movierateLabel = new javax.swing.JLabel();
        seattypeLabel = new javax.swing.JLabel();
        foodPriceLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        sadak2datails = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        dillbecharadatails = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        Angregimediumdatails = new javax.swing.JTextPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        Tanajidatails = new javax.swing.JTextPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        lakkydatails = new javax.swing.JTextPane();
        jScrollPane13 = new javax.swing.JScrollPane();
        Gunjansaxenadatails = new javax.swing.JTextPane();
        jScrollPane14 = new javax.swing.JScrollPane();
        khudahafizdatails = new javax.swing.JTextPane();
        FoodBeveragesComboBox = new javax.swing.JComboBox<>();
        TicketTypeComboBox = new javax.swing.JComboBox<>();
        PaymentButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        newButton = new javax.swing.JButton();
        user_no = new javax.swing.JLabel();
        user_number = new javax.swing.JTextField();
        user_name = new javax.swing.JTextField();
        user_name1 = new javax.swing.JLabel();
        backgroundimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Frame");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        agrejimeadiumposter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/th (1).jpg"))); // NOI18N
        agrejimeadiumposter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agrejimeadiumposterMouseClicked(evt);
            }
        });
        jPanel1.add(agrejimeadiumposter, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 156, 240));

        tanjiposter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/th (2).jpg"))); // NOI18N
        tanjiposter.setText("jLabel1");
        tanjiposter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tanjiposterMouseClicked(evt);
            }
        });
        jPanel1.add(tanjiposter, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 155, 240));

        gunjansaxenaposter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images (4).jpg"))); // NOI18N
        gunjansaxenaposter.setText("jLabel1");
        gunjansaxenaposter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gunjansaxenaposterMouseClicked(evt);
            }
        });
        jPanel1.add(gunjansaxenaposter, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 60, 155, -1));

        dillbecharaposter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/th.jpg"))); // NOI18N
        dillbecharaposter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dillbecharaposterFocusGained(evt);
            }
        });
        dillbecharaposter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dillbecharaposterMouseClicked(evt);
            }
        });
        jPanel1.add(dillbecharaposter, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        sadak2poster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crop_175x175_1598073017_3348331.jpg"))); // NOI18N
        sadak2poster.setText("jLabel1");
        sadak2poster.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sadak2posterMouseClicked(evt);
            }
        });
        jPanel1.add(sadak2poster, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 60, 150, -1));

        lakkyposter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download (5).jpg"))); // NOI18N
        lakkyposter.setText("jLabel1");
        lakkyposter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lakkyposterMouseClicked(evt);
            }
        });
        jPanel1.add(lakkyposter, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 155, -1));

        khudahafisposter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images (3).jpg"))); // NOI18N
        khudahafisposter.setText("jLabel1");
        khudahafisposter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                khudahafisposterMouseClicked(evt);
            }
        });
        khudahafisposter.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                khudahafisposterComponentHidden(evt);
            }
        });
        jPanel1.add(khudahafisposter, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 60, 160, 240));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ticket Daitails");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 430, 290, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Movie Rate");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 530, 100, 30));

        TicketCount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TicketCount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        TicketCount.setToolTipText("gyutyutut");
        TicketCount.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                TicketCountHierarchyChanged(evt);
            }
        });
        TicketCount.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                TicketCountAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TicketCountAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        TicketCount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                TicketCountStateChanged(evt);
            }
        });
        TicketCount.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                TicketCountMouseMoved(evt);
            }
        });
        TicketCount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TicketCountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TicketCountFocusLost(evt);
            }
        });
        TicketCount.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                TicketCountAncestorMoved1(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
            }
        });
        TicketCount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TicketCountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TicketCountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TicketCountMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TicketCountMousePressed(evt);
            }
        });
        TicketCount.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                TicketCountComponentMoved(evt);
            }
        });
        TicketCount.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                TicketCountCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        TicketCount.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TicketCountPropertyChange(evt);
            }
        });
        TicketCount.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                TicketCountVetoableChange(evt);
            }
        });
        jPanel1.add(TicketCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 60, 40));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 410, -1, -1));

        TotalTicketPriceLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(TotalTicketPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 740, 270, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("----------------------------------------------------");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 700, 520, 40));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Seat Type");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 620, 90, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Food");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 670, 90, 40));

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Movies Ticket");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 230, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ticket Count            :-");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 200, 40));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Total Ticket");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 580, 100, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Movie");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 490, 100, 30));

        movienameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        movienameLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(movienameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 490, 190, 30));

        TicketCountLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TicketCountLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(TicketCountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 580, 190, 30));

        movierateLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        movierateLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(movierateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 530, 190, 30));

        seattypeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        seattypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(seattypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 630, 270, 30));

        foodPriceLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        foodPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(foodPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 680, 330, 30));

        sadak2datails.setEditable(false);
        sadak2datails.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jScrollPane3.setViewportView(sadak2datails);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 300, 150, 120));

        dillbecharadatails.setEditable(false);
        dillbecharadatails.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jScrollPane9.setViewportView(dillbecharadatails);

        jPanel1.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 160, 120));

        Angregimediumdatails.setEditable(false);
        Angregimediumdatails.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jScrollPane10.setViewportView(Angregimediumdatails);

        jPanel1.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 160, 120));

        Tanajidatails.setEditable(false);
        Tanajidatails.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jScrollPane11.setViewportView(Tanajidatails);

        jPanel1.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 160, 120));

        lakkydatails.setEditable(false);
        lakkydatails.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jScrollPane12.setViewportView(lakkydatails);

        jPanel1.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 160, 120));

        Gunjansaxenadatails.setEditable(false);
        Gunjansaxenadatails.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jScrollPane13.setViewportView(Gunjansaxenadatails);

        jPanel1.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 300, 160, 120));

        khudahafizdatails.setEditable(false);
        khudahafizdatails.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jScrollPane14.setViewportView(khudahafizdatails);

        jPanel1.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 300, 160, 120));

        FoodBeveragesComboBox.setBackground(new java.awt.Color(153, 153, 153));
        FoodBeveragesComboBox.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        FoodBeveragesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Food/Beverages", "Popcorn(small)-50$", "Popcorn(meadium)-70$", "Popcorn(larg)-100$", "Soft Drink-100$", "Combo(Soft Drink-Popcorn (meadium) )-150$" }));
        FoodBeveragesComboBox.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                FoodBeveragesComboBoxMouseMoved(evt);
            }
        });
        FoodBeveragesComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FoodBeveragesComboBoxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FoodBeveragesComboBoxFocusLost(evt);
            }
        });
        FoodBeveragesComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FoodBeveragesComboBoxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FoodBeveragesComboBoxMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                FoodBeveragesComboBoxMouseReleased(evt);
            }
        });
        FoodBeveragesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoodBeveragesComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(FoodBeveragesComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, 370, 50));

        TicketTypeComboBox.setBackground(new java.awt.Color(153, 153, 153));
        TicketTypeComboBox.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        TicketTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Ticket Type", "Dimond(+70$)", "Gold(+40$)", "Silver(+20$)", "Dimond(+70$) + AC(50$)", "Gold(+40$) + AC(50$)", "Silver(+20$) + AC(50$)" }));
        TicketTypeComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TicketTypeComboBoxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TicketTypeComboBoxFocusLost(evt);
            }
        });
        TicketTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TicketTypeComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(TicketTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 260, 40));

        PaymentButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PaymentButton.setText("Paymeant");
        PaymentButton.setBorder(new javax.swing.border.MatteBorder(null));
        PaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentButtonActionPerformed(evt);
            }
        });
        jPanel1.add(PaymentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 730, 320, 40));

        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.setBorder(new javax.swing.border.MatteBorder(null));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 730, 180, 40));

        newButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        newButton.setText("New");
        newButton.setBorder(new javax.swing.border.MatteBorder(null));
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });
        jPanel1.add(newButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 730, 180, 40));

        user_no.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        user_no.setForeground(new java.awt.Color(255, 255, 255));
        user_no.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_no.setText("Phone No:-");
        jPanel1.add(user_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 620, 120, 40));

        user_number.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(user_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 620, 460, 40));

        user_name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(user_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, 470, 40));

        user_name1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        user_name1.setForeground(new java.awt.Color(255, 255, 255));
        user_name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_name1.setText("Name :-");
        jPanel1.add(user_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, 120, 40));

        backgroundimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linus-mimietz-uWjBqbCHY7g-unsplash.jpg"))); // NOI18N
        backgroundimg.setText("jLabel3");
        jPanel1.add(backgroundimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1439, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void khudahafisposterComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_khudahafisposterComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_khudahafisposterComponentHidden

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_newButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void TicketCountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TicketCountFocusLost
        // TODO add your handling code here:   
     //   count = (int) TicketCount.getValue();
      //  TicketCountLabel.setText("" + count);
        
    }//GEN-LAST:event_TicketCountFocusLost

    private void TicketTypeComboBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TicketTypeComboBoxFocusGained
        // TODO add your handling code here:        
       // count = (int) TicketCount.getValue();
      // TicketCountLabel.setText("" + count);
    //   String spinner ;
   //    spinner =TicketCount.getValue().toString();
   //    TicketCountLabel.setText(spinner);
        FoodBeveragesComboBox.setEnabled(true);
    }//GEN-LAST:event_TicketTypeComboBoxFocusGained

    private void TicketCountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TicketCountMouseClicked
        // TODO add your handling code here:
        TicketTypeComboBox.setEnabled(true );
    }//GEN-LAST:event_TicketCountMouseClicked

    private void TicketCountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TicketCountMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_TicketCountMouseExited

    private void dillbecharaposterFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dillbecharaposterFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_dillbecharaposterFocusGained

    private void dillbecharaposterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dillbecharaposterMouseClicked
        // TODO add your handling code here:
        set_false();
        dillbecharaposter.setEnabled(true);
        dillbecharadatails.setEnabled(rootPaneCheckingEnabled);
        movienameLabel.setText("Dill Bechara");
        movierateLabel.setText("150");
        movierate = 150;
        ticketCountCalculation();
    }//GEN-LAST:event_dillbecharaposterMouseClicked

    private void TicketCountCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_TicketCountCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_TicketCountCaretPositionChanged

    private void agrejimeadiumposterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agrejimeadiumposterMouseClicked
        // TODO add your handling code here:
        set_false();
        agrejimeadiumposter.setEnabled(true);
        Angregimediumdatails.setEnabled(true);
        
        movienameLabel.setText("Agreji Meadium");
        movierateLabel.setText("170");
        movierate = 170;
        ticketCountCalculation();
    }//GEN-LAST:event_agrejimeadiumposterMouseClicked

    private void tanjiposterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tanjiposterMouseClicked
        // TODO add your handling code here:
        set_false();
        
        tanjiposter.setEnabled(true);
        Tanajidatails.setEnabled(true);
        
        movienameLabel.setText("Tanaji");
        movierateLabel.setText("200");
        movierate = 200;
        ticketCountCalculation();
    }//GEN-LAST:event_tanjiposterMouseClicked

    private void lakkyposterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lakkyposterMouseClicked
        // TODO add your handling code here:
        set_false();
        
        lakkyposter.setEnabled(true);
        lakkydatails.setEnabled(true);
        
        movienameLabel.setText("Lakky");
        movierateLabel.setText("120");
        movierate = 120;
        ticketCountCalculation();
    }//GEN-LAST:event_lakkyposterMouseClicked

    private void gunjansaxenaposterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gunjansaxenaposterMouseClicked
        // TODO add your handling code here:
        set_false();
        
        gunjansaxenaposter.setEnabled(true);
        Gunjansaxenadatails.setEnabled(true);
        
        movienameLabel.setText("Gunjan Saxena");
        movierateLabel.setText("200");
        movierate = 200;
        ticketCountCalculation();
    }//GEN-LAST:event_gunjansaxenaposterMouseClicked

    private void khudahafisposterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khudahafisposterMouseClicked
        // TODO add your handling code here:
        set_false();
        
        khudahafisposter.setEnabled(true);
        khudahafizdatails.setEnabled(true);
        
        movienameLabel.setText("Khuda Hafis");
        movierateLabel.setText("150");
        movierate = 150;
        ticketCountCalculation();
    }//GEN-LAST:event_khudahafisposterMouseClicked

    private void sadak2posterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sadak2posterMouseClicked
        // TODO add your handling code here:
        set_false();
        
        sadak2datails.setEnabled(true);
        sadak2poster.setEnabled(true);
        
        movienameLabel.setText("Sadak 2");
        movierateLabel.setText("210");
        movierate = 210;
        ticketCountCalculation();
    }//GEN-LAST:event_sadak2posterMouseClicked

    private void TicketTypeComboBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TicketTypeComboBoxFocusLost
        // TODO add your handling code here:  
        if (seattype.equals("Dimond(+70$)")) {
            seatrate = 70;
        } else if (seattype.equals("Gold(+40$)")) {
            seatrate = 40;
        } else if (seattype.equals("Silver(+20$)")) {
            seatrate = 20;
        } else if (seattype.equals("Dimond(+70$) + AC(50$)")) {
            seatrate = 120;
        } else if (seattype.equals("Gold(+40$) + AC(50$)")) {
            seatrate = 90;
        } else if (seattype.equals("Silver(+20$) + AC(50$)")) {
            seatrate = 70;
        }
        
    }//GEN-LAST:event_TicketTypeComboBoxFocusLost

    private void FoodBeveragesComboBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FoodBeveragesComboBoxFocusLost
        // TODO add your handling code here:            
    }//GEN-LAST:event_FoodBeveragesComboBoxFocusLost

    private void FoodBeveragesComboBoxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FoodBeveragesComboBoxMouseEntered
        // TODO add your handling code here:       
    }//GEN-LAST:event_FoodBeveragesComboBoxMouseEntered

    private void FoodBeveragesComboBoxMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FoodBeveragesComboBoxMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_FoodBeveragesComboBoxMouseReleased

    private void FoodBeveragesComboBoxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FoodBeveragesComboBoxMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_FoodBeveragesComboBoxMouseExited

    private void FoodBeveragesComboBoxMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FoodBeveragesComboBoxMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_FoodBeveragesComboBoxMouseMoved

    private void FoodBeveragesComboBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FoodBeveragesComboBoxFocusGained
      // validationCheck();
    }//GEN-LAST:event_FoodBeveragesComboBoxFocusGained

    private void FoodBeveragesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodBeveragesComboBoxActionPerformed
        // TODO add your handling code here:
        foodtype = FoodBeveragesComboBox.getSelectedItem().toString();
        foodPriceLabel.setText(foodtype);     
        
        if (foodtype.equals("Popcorn(small)-50$")) {
            foodrate = 50;
        } else if (foodtype.equals("Popcorn(meadium)-70$")) {
            foodrate = 70;
        } else if (foodtype.equals("Popcorn(larg)-100$")) {
            foodrate = 100;
        } else if (foodtype.equals("Soft Drink-100$")) {
            foodrate = 100;
        } else if (foodtype.equals("Combo(Soft Drink-Popcorn (meadium) )-150$")) {
            foodrate = 150;
        }
        // Calculation For Ticket              
          calcuation();
    }//GEN-LAST:event_FoodBeveragesComboBoxActionPerformed

    private void TicketTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TicketTypeComboBoxActionPerformed
        // TODO add your handling code here:                     
        seattype = TicketTypeComboBox.getSelectedItem().toString();
        seattypeLabel.setText(seattype);
        if (seattype.equals("Dimond(+70$)")) {
            seatrate = 70;
        } else if (seattype.equals("Gold(+40$)")) {
            seatrate = 40;
        } else if (seattype.equals("Silver(+20$)")) {
            seatrate = 20;
        } else if (seattype.equals("Dimond(+70$) + AC(50$)")) {
            seatrate = 120;
        } else if (seattype.equals("Gold(+40$) + AC(50$)")) {
            seatrate = 90;
        }else if(seattype.equals("Silver(+20$) + AC(50$)"))
            seatrate = 70;
        
        calcuation();
    }//GEN-LAST:event_TicketTypeComboBoxActionPerformed

    private void PaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentButtonActionPerformed
        if (validationCheck()) {
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/book_my_show","root","");
            Statement stm = con.createStatement();
            String quiry = "INSERT INTO `ticketinfo` (`name`, `phone_no`, `movie_name`, `ticket_count`, `ticket`, `food_bevereges`) VALUES ('"+user_name.getText()+"','"+user_number.getText()+"', '"+movienameLabel.getText()+"',"+TicketCount.getValue()+", '"+TicketTypeComboBox.getSelectedItem()+"', '"+FoodBeveragesComboBox.getSelectedItem()+"')";
           // String str=       "INSERT INTO ticketinfo (name,phone_no,ticket_count,ticket,movie_name,food_bevereges)"+"VALUES('"+user_name.getText()+"','"+user_number.getText()+"',"+TicketCount.getName()+",'"+TicketTypeComboBox.getName()+"','"+movienameLabel.getText()+"','"+FoodBeveragesComboBox.getSelectedItem()+"')";
            stm.execute(quiry);   
            JOptionPane.showMessageDialog(null, "Done");
                 con.close();
                 dispose();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e+" Data Connection Problem");
             //   System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(null,"Please Fill All Imformation...");
        }
        
        
                
    }//GEN-LAST:event_PaymentButtonActionPerformed

    private void TicketCountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TicketCountFocusGained
   
    }//GEN-LAST:event_TicketCountFocusGained

    private void TicketCountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TicketCountMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TicketCountMouseEntered

    private void TicketCountAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TicketCountAncestorAdded
        // TODO add your handling code here:
     //   TicketTypeComboBox.setEnabled(true);
    }//GEN-LAST:event_TicketCountAncestorAdded

    private void TicketCountAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TicketCountAncestorMoved
        // TODO add your handling code here:
        //TicketTypeComboBox.setEnabled(true);
    }//GEN-LAST:event_TicketCountAncestorMoved

    private void TicketCountMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TicketCountMousePressed
        // TODO add your handling code here:
        //TicketTypeComboBox.setEnabled(true);
    }//GEN-LAST:event_TicketCountMousePressed

    private void TicketCountHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_TicketCountHierarchyChanged
        // TODO add your handling code here:
      //  TicketTypeComboBox.setEnabled(true);
    }//GEN-LAST:event_TicketCountHierarchyChanged

    private void TicketCountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_TicketCountStateChanged
        // TODO add your handling code here:
       TicketTypeComboBox.setEnabled(true);
       ticketCountCalculation();
       calcuation();
    }//GEN-LAST:event_TicketCountStateChanged

    private void TicketCountComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TicketCountComponentMoved
/*        // TODO add your handling code here:
         String spinner ;
       spinner =TicketCount.getValue().toString();
       TicketCountLabel.setText(spinner);*/
    }//GEN-LAST:event_TicketCountComponentMoved

    private void TicketCountAncestorMoved1(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_TicketCountAncestorMoved1

        // TODO add your handling code here:
        
    }//GEN-LAST:event_TicketCountAncestorMoved1

    private void TicketCountMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TicketCountMouseMoved
        // TODO add your handling code here:
      //  TicketTypeComboBox.setEnabled(true);
    }//GEN-LAST:event_TicketCountMouseMoved

    private void TicketCountPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TicketCountPropertyChange
        // TODO add your handling code here:
      //  TicketTypeComboBox.setEnabled(true);
    }//GEN-LAST:event_TicketCountPropertyChange

    private void TicketCountVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_TicketCountVetoableChange
        // TODO add your handling code here:
        //TicketTypeComboBox.setEnabled(true);
    }//GEN-LAST:event_TicketCountVetoableChange

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
            java.util.logging.Logger.getLogger(mainTicketBookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainTicketBookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainTicketBookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainTicketBookFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainTicketBookFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane Angregimediumdatails;
    private javax.swing.JComboBox<String> FoodBeveragesComboBox;
    private javax.swing.JTextPane Gunjansaxenadatails;
    private javax.swing.JButton PaymentButton;
    private javax.swing.JTextPane Tanajidatails;
    private javax.swing.JSpinner TicketCount;
    private javax.swing.JLabel TicketCountLabel;
    private javax.swing.JComboBox<String> TicketTypeComboBox;
    private javax.swing.JLabel TotalTicketPriceLabel;
    private javax.swing.JLabel agrejimeadiumposter;
    private javax.swing.JLabel backgroundimg;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextPane dillbecharadatails;
    private javax.swing.JLabel dillbecharaposter;
    private javax.swing.JLabel foodPriceLabel;
    private javax.swing.JLabel gunjansaxenaposter;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel khudahafisposter;
    private javax.swing.JTextPane khudahafizdatails;
    private javax.swing.JTextPane lakkydatails;
    private javax.swing.JLabel lakkyposter;
    private javax.swing.JLabel movienameLabel;
    private javax.swing.JLabel movierateLabel;
    private javax.swing.JButton newButton;
    private javax.swing.JTextPane sadak2datails;
    private javax.swing.JLabel sadak2poster;
    private javax.swing.JLabel seattypeLabel;
    private javax.swing.JLabel tanjiposter;
    private javax.swing.JTextField user_name;
    private javax.swing.JLabel user_name1;
    private javax.swing.JLabel user_no;
    private javax.swing.JTextField user_number;
    // End of variables declaration//GEN-END:variables
}
