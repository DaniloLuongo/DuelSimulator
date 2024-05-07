package dev.dany.duelsimulator;

import dev.dany.duelsimulator.characters.Character;
import dev.dany.duelsimulator.items.*;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Main extends javax.swing.JFrame {

    public Main(String title)
    {
        super(title);
        initComponents();
        PrintStream standardOut = System.out;
        PrintStream printStream = new PrintStream(new CustomOutputStream(duelConsole));
        System.setOut(printStream);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        fCreation = new javax.swing.JFrame();
        pCreation = new javax.swing.JPanel();
        lCreationTitle = new javax.swing.JLabel();
        lName = new javax.swing.JLabel();
        lHp = new javax.swing.JLabel();
        lArmor = new javax.swing.JLabel();
        lSxHand = new javax.swing.JLabel();
        lDxHand = new javax.swing.JLabel();
        bDone = new javax.swing.JButton();
        bCreationClear = new javax.swing.JButton();
        bCancel = new javax.swing.JButton();
        tName = new javax.swing.JTextField();
        sHp = new javax.swing.JSpinner();
        cArmor = new javax.swing.JComboBox<>();
        cSxHand = new javax.swing.JComboBox<>();
        cDxHand = new javax.swing.JComboBox<>();
        strSpdSlider = new javax.swing.JSlider();
        lStrength = new javax.swing.JLabel();
        lSpeed = new javax.swing.JLabel();
        lNameError = new javax.swing.JLabel();
        lHpError = new javax.swing.JLabel();
        directoryChooser = new javax.swing.JFileChooser();
        pMain = new javax.swing.JPanel();
        lTitle = new javax.swing.JLabel();
        bCreate = new javax.swing.JButton();
        bSave = new javax.swing.JButton();
        bClear = new javax.swing.JButton();
        bLoad = new javax.swing.JButton();
        lChNameLabel = new javax.swing.JLabel();
        lChName = new javax.swing.JLabel();
        lEnemy = new javax.swing.JLabel();
        cEnemies = new javax.swing.JComboBox<>();
        bStop = new javax.swing.JButton();
        bStart = new javax.swing.JButton();
        lInventory = new javax.swing.JLabel();
        lInv3 = new javax.swing.JLabel();
        lInv2 = new javax.swing.JLabel();
        lInv4 = new javax.swing.JLabel();
        lInv1 = new javax.swing.JLabel();
        lInv5 = new javax.swing.JLabel();
        bUse3 = new javax.swing.JButton();
        bUse2 = new javax.swing.JButton();
        bUse4 = new javax.swing.JButton();
        bUse5 = new javax.swing.JButton();
        bUse1 = new javax.swing.JButton();
        lLeftHand = new javax.swing.JLabel();
        lSx = new javax.swing.JLabel();
        bSxAttack = new javax.swing.JButton();
        bDxAttack = new javax.swing.JButton();
        lDx = new javax.swing.JLabel();
        lRightHand = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lArmorLabel = new javax.swing.JLabel();
        playerHealth = new javax.swing.JProgressBar();
        enemyHealth = new javax.swing.JProgressBar();
        lPlayerHp = new javax.swing.JLabel();
        lEnemyHp = new javax.swing.JLabel();
        lLoadError = new javax.swing.JLabel();
        lRemActions = new javax.swing.JLabel();
        lActions = new javax.swing.JLabel();
        spDuelConsole = new javax.swing.JScrollPane();
        duelConsole = new javax.swing.JTextArea();

        fCreation.setMinimumSize(new java.awt.Dimension(500, 400));

        pCreation.setBackground(new java.awt.Color(51, 0, 204));

        lCreationTitle.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        lCreationTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lCreationTitle.setText("Character Creation");

        lName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lName.setText("Name:");

        lHp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lHp.setText("Health Points:");

        lArmor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lArmor.setText("Armor:");

        lSxHand.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lSxHand.setText("Left Hand:");

        lDxHand.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lDxHand.setText("Right Hand:");

        bDone.setText("Done");
        bDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDoneActionPerformed(evt);
            }
        });

        bCreationClear.setText("Clear");
        bCreationClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCreationClearActionPerformed(evt);
            }
        });

        bCancel.setText("Cancel");
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });

        cArmor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Leather Armor", "Chain Shirt", "Full Plate" }));

        cSxHand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fist", "Sword", "Axe", "Mace", "Shield" }));

        cDxHand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fist", "Sword", "Axe", "Mace", "Shield" }));

        strSpdSlider.setMaximum(3);
        strSpdSlider.setMinimum(1);

        lStrength.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lStrength.setText("Strength");

        lSpeed.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lSpeed.setText("Speed");

        lNameError.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lNameError.setForeground(new java.awt.Color(255, 51, 51));
        lNameError.setText("Name can't be empty!");

        lHpError.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lHpError.setForeground(new java.awt.Color(255, 51, 51));
        lHpError.setText("Health Points must be greater than 0!");

        javax.swing.GroupLayout pCreationLayout = new javax.swing.GroupLayout(pCreation);
        pCreation.setLayout(pCreationLayout);
        pCreationLayout.setHorizontalGroup(
            pCreationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lCreationTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
            .addGroup(pCreationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCreationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCreationLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bCancel)
                        .addGap(18, 18, 18)
                        .addComponent(bCreationClear)
                        .addGap(18, 18, 18)
                        .addComponent(bDone))
                    .addGroup(pCreationLayout.createSequentialGroup()
                        .addGroup(pCreationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pCreationLayout.createSequentialGroup()
                                .addComponent(lName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lNameError))
                            .addGroup(pCreationLayout.createSequentialGroup()
                                .addComponent(lHp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sHp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lHpError))
                            .addGroup(pCreationLayout.createSequentialGroup()
                                .addComponent(lArmor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cArmor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pCreationLayout.createSequentialGroup()
                                .addComponent(lSxHand)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cSxHand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pCreationLayout.createSequentialGroup()
                                .addComponent(lDxHand)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cDxHand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pCreationLayout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(lStrength)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(strSpdSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lSpeed)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pCreationLayout.setVerticalGroup(
            pCreationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCreationLayout.createSequentialGroup()
                .addGroup(pCreationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pCreationLayout.createSequentialGroup()
                        .addComponent(lCreationTitle)
                        .addGap(30, 30, 30)
                        .addGroup(pCreationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pCreationLayout.createSequentialGroup()
                                .addGroup(pCreationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lName)
                                    .addComponent(tName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lNameError))
                                .addGap(18, 18, 18)
                                .addGroup(pCreationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lHp)
                                    .addComponent(sHp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lHpError))
                                .addGap(18, 18, 18)
                                .addGroup(pCreationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lArmor)
                                    .addComponent(cArmor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pCreationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lSxHand)
                                    .addComponent(cSxHand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pCreationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lDxHand)
                                    .addComponent(cDxHand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(strSpdSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lSpeed)))
                    .addComponent(lStrength))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(pCreationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bDone)
                    .addComponent(bCreationClear)
                    .addComponent(bCancel))
                .addContainerGap())
        );

        lNameError.setVisible(false);
        lHpError.setVisible(false);

        javax.swing.GroupLayout fCreationLayout = new javax.swing.GroupLayout(fCreation.getContentPane());
        fCreation.getContentPane().setLayout(fCreationLayout);
        fCreationLayout.setHorizontalGroup(
            fCreationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fCreationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pCreation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        fCreationLayout.setVerticalGroup(
            fCreationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fCreationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pCreation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        directoryChooser.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        pMain.setBackground(new java.awt.Color(153, 153, 153));

        lTitle.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        lTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitle.setText("Duel Simulator");

        bCreate.setText("Create Character");
        bCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCreateActionPerformed(evt);
            }
        });

        bSave.setText("Save Character");
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });

        bClear.setText("Clear Character");
        bClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearActionPerformed(evt);
            }
        });

        bLoad.setText("Load Character");
        bLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoadActionPerformed(evt);
            }
        });

        lChNameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lChNameLabel.setText("Player Character Name:");

        lChName.setBackground(new java.awt.Color(255, 255, 255));
        lChName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lEnemy.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lEnemy.setText("Enemy:");

        cEnemies.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giant Spider", "Outlaw", "Black Knight", "Dragon" }));

        bStop.setText("Stop Duel");
        bStop.setEnabled(false);
        bStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStopActionPerformed(evt);
            }
        });

        bStart.setText("Start Duel!");
        bStart.setEnabled(false);
        bStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStartActionPerformed(evt);
            }
        });

        lInventory.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lInventory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lInventory.setText("Potions");

        lInv3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lInv3.setText("Empty");

        lInv2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lInv2.setText("Empty");

        lInv4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lInv4.setText("Empty");

        lInv1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lInv1.setText("Empty");

        lInv5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lInv5.setText("Empty");

        bUse3.setText("Use");
        bUse3.setEnabled(false);
        bUse3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUse3ActionPerformed(evt);
            }
        });

        bUse2.setText("Use");
        bUse2.setEnabled(false);
        bUse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUse2ActionPerformed(evt);
            }
        });

        bUse4.setText("Use");
        bUse4.setToolTipText("");
        bUse4.setEnabled(false);
        bUse4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUse4ActionPerformed(evt);
            }
        });

        bUse5.setText("Use");
        bUse5.setEnabled(false);
        bUse5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUse5ActionPerformed(evt);
            }
        });

        bUse1.setText("Use");
        bUse1.setEnabled(false);
        bUse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUse1ActionPerformed(evt);
            }
        });

        lLeftHand.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lLeftHand.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lLeftHand.setText("Left Hand");

        lSx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lSx.setText("Empty");

        bSxAttack.setText("Attack");
        bSxAttack.setEnabled(false);
        bSxAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSxAttackActionPerformed(evt);
            }
        });

        bDxAttack.setText("Attack");
        bDxAttack.setEnabled(false);
        bDxAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDxAttackActionPerformed(evt);
            }
        });

        lDx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lDx.setText("Empty");

        lRightHand.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lRightHand.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lRightHand.setText("Right Hand");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Armor");

        lArmorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lArmorLabel.setText("Empty");

        playerHealth.setForeground(new java.awt.Color(51, 255, 0));
        playerHealth.setStringPainted(true);

        enemyHealth.setForeground(new java.awt.Color(255, 0, 0));
        enemyHealth.setStringPainted(true);

        lPlayerHp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lPlayerHp.setForeground(new java.awt.Color(51, 255, 0));
        lPlayerHp.setText("Player Health");

        lEnemyHp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lEnemyHp.setForeground(new java.awt.Color(204, 0, 51));
        lEnemyHp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lEnemyHp.setText("Enemy Health");

        lLoadError.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lLoadError.setForeground(new java.awt.Color(255, 0, 0));
        lLoadError.setText("Error reading file!");

        lRemActions.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lRemActions.setText("Remaning actions:");

        javax.swing.GroupLayout pMainLayout = new javax.swing.GroupLayout(pMain);
        pMain.setLayout(pMainLayout);
        pMainLayout.setHorizontalGroup(
            pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pMainLayout.createSequentialGroup()
                        .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pMainLayout.createSequentialGroup()
                                .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bCreate)
                                    .addComponent(bSave))
                                .addGap(73, 73, 73)
                                .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bClear)
                                    .addComponent(bLoad)))
                            .addComponent(lTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lLoadError)
                                .addGroup(pMainLayout.createSequentialGroup()
                                    .addComponent(lEnemy)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cEnemies, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pMainLayout.createSequentialGroup()
                                .addComponent(lRemActions)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lActions, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pMainLayout.createSequentialGroup()
                        .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pMainLayout.createSequentialGroup()
                                .addComponent(lChNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lChName, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE))
                            .addGroup(pMainLayout.createSequentialGroup()
                                .addComponent(bStart, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bStop, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pMainLayout.createSequentialGroup()
                                .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(playerHealth, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                        .addComponent(lPlayerHp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(bSxAttack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lSx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lLeftHand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMainLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lRightHand))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMainLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(enemyHealth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lEnemyHp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(pMainLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pMainLayout.createSequentialGroup()
                                                .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(pMainLayout.createSequentialGroup()
                                                        .addComponent(bUse1)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(bUse2)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(bUse3))
                                                    .addGroup(pMainLayout.createSequentialGroup()
                                                        .addComponent(lInv1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lInv2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(lInv3, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                                                            .addComponent(lInventory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(pMainLayout.createSequentialGroup()
                                                        .addComponent(bUse4)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(bUse5))
                                                    .addGroup(pMainLayout.createSequentialGroup()
                                                        .addComponent(lInv4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lInv5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                                                .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lDx, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(bDxAttack, javax.swing.GroupLayout.Alignment.TRAILING)))
                                            .addGroup(pMainLayout.createSequentialGroup()
                                                .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lArmorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))))))
                        .addContainerGap())))
        );
        pMainLayout.setVerticalGroup(
            pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitle)
                .addGap(18, 18, 18)
                .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lChNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lChName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCreate)
                    .addComponent(bClear))
                .addGap(18, 18, 18)
                .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSave)
                    .addComponent(bLoad))
                .addGap(42, 42, 42)
                .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEnemy)
                    .addComponent(cEnemies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(lLoadError)
                .addGap(44, 44, 44)
                .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bStart, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bStop, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMainLayout.createSequentialGroup()
                        .addComponent(lPlayerHp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMainLayout.createSequentialGroup()
                        .addComponent(lEnemyHp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enemyHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(lArmorLabel)
                .addGap(3, 3, 3)
                .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lRemActions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lActions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bUse3)
                    .addComponent(bUse2)
                    .addComponent(bUse4)
                    .addComponent(bUse5)
                    .addComponent(bUse1)
                    .addComponent(bSxAttack)
                    .addComponent(bDxAttack))
                .addGap(18, 18, 18)
                .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lInv3)
                    .addComponent(lInv2)
                    .addComponent(lInv4)
                    .addComponent(lInv1)
                    .addComponent(lInv5)
                    .addComponent(lSx)
                    .addComponent(lDx))
                .addGap(38, 38, 38)
                .addGroup(pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lInventory)
                    .addComponent(lLeftHand)
                    .addComponent(lRightHand))
                .addContainerGap())
        );

        lLoadError.setVisible(false);

        duelConsole.setColumns(20);
        duelConsole.setForeground(new java.awt.Color(255, 0, 0));
        duelConsole.setRows(5);
        duelConsole.setEnabled(false);
        spDuelConsole.setViewportView(duelConsole);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spDuelConsole, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spDuelConsole)
                    .addComponent(pMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCreateActionPerformed
        tName.setText("");
        sHp.setValue(0);
        cArmor.setSelectedIndex(0);
        cSxHand.setSelectedIndex(0);
        cDxHand.setSelectedIndex(0);
        
        fCreation.setVisible(true);
    }//GEN-LAST:event_bCreateActionPerformed

    private void bCreationClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCreationClearActionPerformed
        tName.setText("");
        sHp.setValue(0);
        cArmor.setSelectedIndex(0);
        cSxHand.setSelectedIndex(0);
        cDxHand.setSelectedIndex(0);
    }//GEN-LAST:event_bCreationClearActionPerformed

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelActionPerformed
        fCreation.setVisible(false);
        
        if(player != null)
        {
            lChName.setText(player.getName());
            lArmorLabel.setText(player.getArmor().getName());
            lSx.setText(player.getSxHand().getName());
            lDx.setText(player.getDxHand().getName());
            lInv1.setText(player.getInventory()[0].getName());
            lInv2.setText(player.getInventory()[1].getName());
            lInv3.setText(player.getInventory()[2].getName());
            lInv4.setText(player.getInventory()[3].getName());
            lInv5.setText(player.getInventory()[4].getName());
            actions = player.getSpeed();
            lActions.setText(Integer.toString(actions));
        }
    }//GEN-LAST:event_bCancelActionPerformed

    private void bDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDoneActionPerformed
        try
        {
            //Name
            String name = tName.getText();
            if(name.equals(""))
                throw new Exception();
            //Health Points
            int hp = (int) sHp.getValue();
            if(hp <= 0)
                throw new Exception();
            //Armor
            String armorName = (String) cArmor.getSelectedItem();
            Armor armor;
            int spd = 0;
            switch(armorName)
            {
                default:
                    armor = new Armor(armorName, 0);
                    break;
                case "Leather Armor":
                    armor = new Armor(armorName, 5);
                    spd = -1;
                    break;
                case "Chain Shirt":
                    armor = new Armor(armorName, 9);
                    spd = -2;
                    break;
                case "Full Plate":
                    armor = new Armor(armorName, 13);
                    spd = -3;
                    break;
            }
            //Hands
            String sxName = (String) cSxHand.getSelectedItem();
            Weapon sx;
            String dxName = (String) cDxHand.getSelectedItem();
            Weapon dx;
            switch(sxName)
            {
                default:
                    sx = new Weapon(sxName, 0, 5, 1, 1);
                    break;
                case "Sword":
                    sx = new Weapon(sxName, 11, 16, 5, 1);
                    break;
                case "Axe":
                    sx = new Weapon(sxName, 9, 18, 3, 1);
                    break;
                case "Mace":
                    sx = new Weapon(sxName, 7, 20, 3, 1);
                    break;
                case "Shield":
                    sx = new Weapon(sxName, 1, 6, 8, 1);
                    break;
            }
            switch(dxName)
            {
                default:
                    dx = new Weapon(dxName, 0, 5, 1, 1);
                    break;
                case "Sword":
                    dx = new Weapon(dxName, 11, 16, 5, 1);
                    break;
                case "Axe":
                    dx = new Weapon(dxName, 9, 18, 3, 1);
                    break;
                case "Mace":
                    dx = new Weapon(dxName, 7, 20, 3, 1);
                    break;
                case "Shield":
                    dx = new Weapon(dxName, 1, 6, 8, 1);
                    break;
            }
            //Strength / Speed Balancing
            float str = 0f;
            int value = strSpdSlider.getValue();
            switch(value)
            {
                case 1:
                    str = 2.5f;
                    spd += 2;
                    break;
                case 2:
                    str = 2.0f;
                    spd += 3;
                    break;
                case 3:
                    str = 1.5f;
                    spd += 4;
                    break;
            }
            if(spd <= 0)
                spd = 1;
            if(sx.equals(dx))
                spd++;
            
            player = new Character(name, hp, armor, sx, dx, str, spd);
            
            fCreation.setVisible(false);
            
            if(player != null)
            {
                lChName.setText(player.getName());
                lArmorLabel.setText(player.getArmor().getName());
                lSx.setText(player.getSxHand().getName());
                lDx.setText(player.getDxHand().getName());
                lInv1.setText(player.getInventory()[0].getName());
                lInv2.setText(player.getInventory()[1].getName());
                lInv3.setText(player.getInventory()[2].getName());
                lInv4.setText(player.getInventory()[3].getName());
                lInv5.setText(player.getInventory()[4].getName());
                actions = player.getSpeed();
                lActions.setText(Integer.toString(actions));
            }
            
            lNameError.setVisible(false);
            lHpError.setVisible(false);
            bStart.setEnabled(true);
        }
        catch(Exception e)
        {
            if(tName.getText().equals(""))
            {
                lNameError.setVisible(true);
            }
            else
            {
                lNameError.setVisible(false);
            }
            if((int)sHp.getValue() <= 0)
            {
                lHpError.setVisible(true);
            }
            else
            {
                lHpError.setVisible(false);
            }
        }
    }//GEN-LAST:event_bDoneActionPerformed

    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
        try
        {
            directoryChooser.showSaveDialog(pMain);
            FileHandler.save(directoryChooser.getSelectedFile().getPath() + "\\" + player.getName() + ".chr", player);
        
            if(player != null)
            {
                lChName.setText(player.getName());
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_bSaveActionPerformed

    private void bLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoadActionPerformed
        FileNameExtensionFilter extFilter = new FileNameExtensionFilter("CHR files (*.chr)", "chr");
        fileChooser.setFileFilter(extFilter);
        fileChooser.showOpenDialog(pMain);
        try
        {
            player = (Character) FileHandler.load(fileChooser.getSelectedFile().getPath());
        }
        catch(Exception e)
        {
            lLoadError.setVisible(true);
        }
        
        lLoadError.setVisible(false);
        
        if(player != null)
        {
            lChName.setText(player.getName());
            lArmorLabel.setText(player.getArmor().getName());
            lSx.setText(player.getSxHand().getName());
            lDx.setText(player.getDxHand().getName());
            lInv1.setText(player.getInventory()[0].getName());
            lInv2.setText(player.getInventory()[1].getName());
            lInv3.setText(player.getInventory()[2].getName());
            lInv4.setText(player.getInventory()[3].getName());
            lInv5.setText(player.getInventory()[4].getName());
            actions = player.getSpeed();
            lActions.setText(Integer.toString(actions));
            bStart.setEnabled(true);
        }
    }//GEN-LAST:event_bLoadActionPerformed

    private void bClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearActionPerformed
        player = null;
        bStart.setEnabled(false);
        lChName.setText("");
        lArmorLabel.setText("Empty");
        lSx.setText("Empty");
        lDx.setText("Empty");
        lInv1.setText("Empty");
        lInv2.setText("Empty");
        lInv3.setText("Empty");
        lInv4.setText("Empty");
        lInv5.setText("Empty");
        lActions.setText("0");
    }//GEN-LAST:event_bClearActionPerformed

    private void bStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStartActionPerformed
        bCreate.setEnabled(false);
        bClear.setEnabled(false);
        bSave.setEnabled(false);
        bLoad.setEnabled(false);
        cEnemies.setEnabled(false);
        bStart.setEnabled(false);
        bStop.setEnabled(true);
        bSxAttack.setEnabled(true);
        bDxAttack.setEnabled(true);
        bUse1.setEnabled(true);
        bUse2.setEnabled(true);
        bUse3.setEnabled(true);
        bUse4.setEnabled(true);
        bUse5.setEnabled(true);

        switch( (String) cEnemies.getSelectedItem() )
        {
            case "Giant Spider":
                enemy = new Character("Giant Spider", 40, new Armor("None", 8), new Weapon("Bite", 12, 25, 3, 1), new Weapon("Poisoned Web", 13, 30, 0, 2), 1.5f, 2);
                break;
            case "Outlaw":
                enemy = new Character("Outlaw", 30, new Armor("Leather Armor", 5), new Weapon("Dagger", 12, 20, 1, 1), new Weapon("Dagger", 12, 20, 1, 1), 1.0f, 4);
                break;
            case "Black Knight":
                enemy = new Character("Black Knight", 50, new Armor("Full Plate", 13), new Weapon("Great Shield", 1, 6, 10, 2), new Weapon("Flame Sword", 7, 18, 3, 1), 2.0f, 2);
                break;
            case "Dragon":
                enemy = new Character("Dragon", 80, new Armor("Scales", 15), new Weapon("Bite", 10, 20, 2, 1), new Weapon("Fire Breath", 15, 25, 0, 2), 2.5f, 2);
                break;
        }
        
        actions = player.getSpeed();
        lActions.setText(Integer.toString(actions));
        playerHealth.setMaximum(player.getMaxHp());
        playerHealth.setValue(player.getHp());
        enemyHealth.setMaximum(enemy.getMaxHp());
        enemyHealth.setValue(enemy.getHp());
        
        System.out.println("Duel Started!");
        System.out.println();
    }//GEN-LAST:event_bStartActionPerformed

    private void bStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStopActionPerformed
        duelStopped();
        
        System.out.println();
        System.out.println("Duel Stopped!");
    }//GEN-LAST:event_bStopActionPerformed

    private void bSxAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSxAttackActionPerformed
        if(actions >= player.getSxHand().getSpeed())
        {
            actions -= player.getSxHand().getSpeed();
            lActions.setText(Integer.toString(actions));
            
            if(player.attack(enemy, player.getSxHand()))
            {
                System.out.println("Enemy Defeated!");
                
                enemyHealth.setValue(0);
                duelStopped();
                
                return;
            }
            
            enemyHealth.setValue(enemy.getHp());
            
            if(actions <= 0)
            {
                enemyAction();
            }
        }
    }//GEN-LAST:event_bSxAttackActionPerformed

    private void bDxAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDxAttackActionPerformed
        if(actions >= player.getDxHand().getSpeed())
        {
            actions -= player.getDxHand().getSpeed();
            lActions.setText(Integer.toString(actions));
            
            if(player.attack(enemy, player.getDxHand()))
            {
                System.out.println("Enemy Defeated!");
                
                enemyHealth.setValue(0);
                duelStopped();
                
                return;
            }
            
            enemyHealth.setValue(enemy.getHp());
            
            
            if(actions <= 0)
            {
                enemyAction();
            }
        }
    }//GEN-LAST:event_bDxAttackActionPerformed

    private void bUse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUse1ActionPerformed
        if(actions >= 1)
        {
            actions--;
            usePotion(0);
            bUse1.setEnabled(false);
        }
    }//GEN-LAST:event_bUse1ActionPerformed

    private void bUse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUse2ActionPerformed
        if(actions >= 1)
        {
            actions--;
            usePotion(1);
            bUse2.setEnabled(false);
        }
    }//GEN-LAST:event_bUse2ActionPerformed

    private void bUse3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUse3ActionPerformed
        if(actions >= 1)
        {
            actions--;
            usePotion(2);
            bUse3.setEnabled(false);
        }
    }//GEN-LAST:event_bUse3ActionPerformed

    private void bUse4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUse4ActionPerformed
        if(actions >= 1)
        {
            actions--;
            usePotion(3);
            bUse4.setEnabled(false);
        }
    }//GEN-LAST:event_bUse4ActionPerformed

    private void bUse5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUse5ActionPerformed
        if(actions >= 1)
        {
            actions--;
            usePotion(4);
            bUse5.setEnabled(false);
        }
    }//GEN-LAST:event_bUse5ActionPerformed

    private void usePotion(int i)
    {
        System.out.println(player.getName() + " used " + player.getInventory()[i].getName() + " potion.");
        
        if(player.getInventory()[i].isHarmful())
        {
            if(enemy.takeDamage(player.getInventory()[i].getValue()))
            {
                System.out.println("Enemy Defeated!");
                
                enemyHealth.setValue(0);
                duelStopped();
                
                return;
            }
            else
            {
                enemyHealth.setValue(enemy.getHp());
            }
        }
        else
        {
            player.setHp(player.getHp() + player.getInventory()[i].getValue());
            if(player.getHp() > player.getMaxHp())
                player.setHp(player.getMaxHp());
            playerHealth.setValue(player.getHp());
        }
        
        if(actions <= 0)
        {
            enemyAction();
        }
    }
    
    //AI Enemy
    private void enemyAction()
    {
        int eActions = enemy.getSpeed();
        
        while(eActions > 0)
        {
            int random = (int) (Math.random() * 2);
            switch(random)
            {
                case 0:
                    if(eActions >= enemy.getSxHand().getSpeed())
                    {
                        eActions -= enemy.getSxHand().getSpeed();

                        if(enemy.attack(player, enemy.getSxHand()))
                        {
                            System.out.println("Player Defeated!");

                            playerHealth.setValue(0);
                            duelStopped();
                            
                            return;
                        }

                        playerHealth.setValue(player.getHp());
                        
                        break;
                    }
                    else
                    {
                        continue;
                    }
                    
                case 1:
                    if(eActions >= enemy.getDxHand().getSpeed())
                    {
                        eActions -= enemy.getDxHand().getSpeed();

                        if(enemy.attack(player, enemy.getDxHand()))
                        {
                            System.out.println("Player Defeated!");

                            playerHealth.setValue(0);
                            duelStopped();
                            
                            return;
                        }

                        playerHealth.setValue(player.getHp());
                    }
                    break;
                    
                default:
                    break;
            }
        }
        
        System.out.println();
        actions = player.getSpeed();
        lActions.setText(Integer.toString(actions));
    }
    
    private void duelStopped()
    {
        bCreate.setEnabled(true);
        bClear.setEnabled(true);
        bSave.setEnabled(true);
        bLoad.setEnabled(true);
        cEnemies.setEnabled(true);
        bStart.setEnabled(true);
        bStop.setEnabled(false);
        bSxAttack.setEnabled(false);
        bDxAttack.setEnabled(false);
        bUse1.setEnabled(false);
        bUse2.setEnabled(false);
        bUse3.setEnabled(false);
        bUse4.setEnabled(false);
        bUse5.setEnabled(false);

        enemy = null;

        player.reset();
    }
    
    private void wait(int seconds)
    {
        try
        {
            TimeUnit.SECONDS.sleep(seconds);
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
    }
    
    public static void main(String args[])
    {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Main("Duel Simulator").setVisible(true);
            }
        });
    }
    
    private int actions;
    private Character player;
    private Character enemy;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancel;
    private javax.swing.JButton bClear;
    private javax.swing.JButton bCreate;
    private javax.swing.JButton bCreationClear;
    private javax.swing.JButton bDone;
    private javax.swing.JButton bDxAttack;
    private javax.swing.JButton bLoad;
    private javax.swing.JButton bSave;
    private javax.swing.JButton bStart;
    private javax.swing.JButton bStop;
    private javax.swing.JButton bSxAttack;
    private javax.swing.JButton bUse1;
    private javax.swing.JButton bUse2;
    private javax.swing.JButton bUse3;
    private javax.swing.JButton bUse4;
    private javax.swing.JButton bUse5;
    private javax.swing.JComboBox<String> cArmor;
    private javax.swing.JComboBox<String> cDxHand;
    private javax.swing.JComboBox<String> cEnemies;
    private javax.swing.JComboBox<String> cSxHand;
    private javax.swing.JFileChooser directoryChooser;
    private javax.swing.JTextArea duelConsole;
    private javax.swing.JProgressBar enemyHealth;
    private javax.swing.JFrame fCreation;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel lActions;
    private javax.swing.JLabel lArmor;
    private javax.swing.JLabel lArmorLabel;
    private javax.swing.JLabel lChName;
    private javax.swing.JLabel lChNameLabel;
    private javax.swing.JLabel lCreationTitle;
    private javax.swing.JLabel lDx;
    private javax.swing.JLabel lDxHand;
    private javax.swing.JLabel lEnemy;
    private javax.swing.JLabel lEnemyHp;
    private javax.swing.JLabel lHp;
    private javax.swing.JLabel lHpError;
    private javax.swing.JLabel lInv1;
    private javax.swing.JLabel lInv2;
    private javax.swing.JLabel lInv3;
    private javax.swing.JLabel lInv4;
    private javax.swing.JLabel lInv5;
    private javax.swing.JLabel lInventory;
    private javax.swing.JLabel lLeftHand;
    private javax.swing.JLabel lLoadError;
    private javax.swing.JLabel lName;
    private javax.swing.JLabel lNameError;
    private javax.swing.JLabel lPlayerHp;
    private javax.swing.JLabel lRemActions;
    private javax.swing.JLabel lRightHand;
    private javax.swing.JLabel lSpeed;
    private javax.swing.JLabel lStrength;
    private javax.swing.JLabel lSx;
    private javax.swing.JLabel lSxHand;
    private javax.swing.JLabel lTitle;
    private javax.swing.JPanel pCreation;
    private javax.swing.JPanel pMain;
    private javax.swing.JProgressBar playerHealth;
    private javax.swing.JSpinner sHp;
    private javax.swing.JScrollPane spDuelConsole;
    private javax.swing.JSlider strSpdSlider;
    private javax.swing.JTextField tName;
    // End of variables declaration//GEN-END:variables
}