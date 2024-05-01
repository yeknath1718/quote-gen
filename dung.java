import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
class TextbasedgamewithGUI
{
    JFrame window;
    Container con;
    JPanel titleName,startButtonPanel,maintextpanel,choiceButtonPanel,playerPanel,enemyPanel,infopanel;
    JLabel titleNameLabel,yourhealthLabel,enemyhealthlabel,enemynameLabel,enemynameLabelname,enemyhealthlabelname,yourhealthLabelname,infopanellLabel,infopanellLabelname;
    Font titleFont=new Font("Times New Roman",Font.PLAIN,50);
    JButton startButton,Choice1,Choice2,Choice3;
    JTextArea mainArea;
    Font normalfont=new Font("Times New Roman",Font.PLAIN,50);
    TitleScreenHandler tsHandler=new TitleScreenHandler();
    RunHandler runhandler=new RunHandler();
    AttackHandler attackhandler=new AttackHandler();
    ElixrHandler elixrhandler=new ElixrHandler();
    public static void main(String[] args){
        new TextbasedgamewithGUI();
    }
    TextbasedgamewithGUI(){
        window=new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setVisible(true);
        con = window.getContentPane();

        titleName=new JPanel();
        titleName.setBounds(500,300,500,80);
        titleName.setBackground(Color.black);
        titleNameLabel=new JLabel("Welcome to Dungeon");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);

        startButtonPanel=new JPanel();
        startButtonPanel.setBounds(650,450,200,80);
        startButtonPanel.setBackground(Color.black);

        startButton=new JButton("Start");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(normalfont);
        startButton.addActionListener(tsHandler);

        titleName.add(titleNameLabel);
        startButtonPanel.add(startButton);
        con.add(titleName);
        con.add(startButtonPanel);
    }
    public void createGameScreen(){
        titleName.setVisible(false);
        startButtonPanel.setVisible(false);
        
        maintextpanel=new JPanel();
        maintextpanel.setBounds(400,300,800,60);
        maintextpanel.setBackground(Color.black);
        con.add(maintextpanel);

        mainArea=new JTextArea("Choose one of the options from below:");
        mainArea.setBounds(400,300,800,450);
        mainArea.setBackground(Color.black);
        mainArea.setForeground(Color.white);
        mainArea.setFont(normalfont);
        mainArea.setLineWrap(true);
        maintextpanel.add(mainArea);

        choiceButtonPanel =new JPanel();
        choiceButtonPanel.setBounds(650,500,300,248);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setFont(normalfont);
        choiceButtonPanel.setLayout(new GridLayout(3,1));
        con.add(choiceButtonPanel);

        Choice1=new JButton("Attack");
        Choice1.setBackground(Color.black);
        Choice1.setForeground(Color.white);
        Choice1.setFont(normalfont);
        Choice1.addActionListener(attackhandler);
        choiceButtonPanel.add(Choice1);


        Choice2=new JButton("Drink Elixr");
        Choice2.setBackground(Color.black);
        Choice2.setForeground(Color.white);
        Choice2.setFont(normalfont);
        choiceButtonPanel.add(Choice2);
        Choice2.addActionListener(elixrhandler);
        choiceButtonPanel.add(Choice2);

        Choice3=new JButton("Run!");
        Choice3.setBackground(Color.black);
        Choice3.setForeground(Color.white);
        Choice3.setFont(normalfont);
        Choice3.addActionListener(runhandler);
        choiceButtonPanel.add(Choice3);

        playerPanel=new JPanel();
        playerPanel.setBounds(200, 100, 1500, 50);
        playerPanel.setBackground(Color.black);
        playerPanel.setLayout(new GridLayout(1,4));
        con.add(playerPanel);
        yourhealthLabel =new JLabel("   Your HP:");
        yourhealthLabel.setFont(normalfont);
        yourhealthLabel.setForeground(Color.white);
        playerPanel.add(yourhealthLabel);
        yourhealthLabelname=new JLabel();
        yourhealthLabelname.setFont(normalfont);
        yourhealthLabelname.setForeground(Color.white);
        playerPanel.add(yourhealthLabelname);

        enemyhealthlabel=new JLabel("Enemy's HP:");
        enemyhealthlabel.setFont(normalfont);
        enemyhealthlabel.setForeground(Color.white);
        playerPanel.add(enemyhealthlabel);
        enemyhealthlabelname=new JLabel();
        enemyhealthlabelname.setFont(normalfont);
        enemyhealthlabelname.setForeground(Color.white);
        playerPanel.add(enemyhealthlabelname);


        enemyPanel=new JPanel();
        enemyPanel.setBounds(600,200,400,50);
        enemyPanel.setBackground(Color.black);
        enemyPanel.setLayout(new GridLayout(1,2));
        con.add(enemyPanel);
        enemynameLabel=new JLabel("Enemy:");
        enemynameLabel.setFont(normalfont);
        enemynameLabel.setForeground(Color.white);
        enemyPanel.add(enemynameLabel);
        enemynameLabelname=new JLabel();
        enemynameLabelname.setFont(normalfont);
        enemynameLabelname.setForeground(Color.white);
        enemyPanel.add(enemynameLabelname);

        infopanel=new JPanel();
        infopanel.setBounds(400,400,800,55);
        infopanel.setBackground(Color.black);
        infopanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        con.add(infopanel);
        infopanellLabel=new JLabel();
        infopanellLabel.setFont(normalfont);
        infopanellLabel.setForeground(Color.white);
        infopanel.add(infopanellLabel);
        infopanellLabelname=new JLabel();
        infopanellLabelname.setFont(normalfont);
        infopanellLabelname.setForeground(Color.white);
        infopanel.add(infopanellLabelname);
        Textbasedgamereplica();
    }
    public void Textbasedgamereplica(){
        Random r=new Random();
        String[] enemies={"Skeleton","Zombie","Warrior","Assassin"};
        int maxenemyhealth=75;
        int health=100;
        int enemyHealth=r.nextInt(maxenemyhealth);
        String enemy=enemies[r.nextInt(enemies.length)];
        enemynameLabelname.setText(""+enemy);
        yourhealthLabelname.setText(""+health);
        enemyhealthlabelname.setText(""+enemyHealth);

    }
    public int life=3;
    public class TitleScreenHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            createGameScreen();
        }
    }
    public class RunHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            Random r=new Random();
            int maxenemyhealth=100;
            int enemyHealth=r.nextInt(maxenemyhealth);
            enemyhealthlabelname.setText(""+enemyHealth);
            String[] enemies={"Skeleton","Zombie","Warrior","Assassin"};
            String enemy=enemies[r.nextInt(enemies.length)];
            enemynameLabelname.setText(""+enemy);
        }
    }
    public class AttackHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            Random r=new Random();
            int attackdamage=25;
            int ememy_attack_damage=25;
            int damage_amt=r.nextInt(attackdamage);
            int enemyHealth=Integer.parseInt(""+enemyhealthlabelname.getText());
            int health=Integer.parseInt(""+yourhealthLabelname.getText());
            if(health<=0){
                infopanellLabelname.setText("You got defeated by "+enemynameLabelname.getText());
                // window.removeAll();
                window.dispose();
            }
            else if(enemyHealth<=0){
                infopanellLabelname.setText("You defeated "+enemynameLabelname.getText()+"!");
            }
            else{
                    int enemy_damage_amt=r.nextInt(ememy_attack_damage);
                    enemyHealth-=damage_amt;
                    health-=enemy_damage_amt;
                    if(enemyHealth<=0 ){
                        enemyhealthlabelname.setText(""+enemyHealth);
                        infopanellLabelname.setText("You defeated "+enemynameLabelname.getText());
                    }
                    else if(health<=0){
                        yourhealthLabelname.setText(""+health);
                        infopanellLabelname.setText("You got defeated by "+enemynameLabelname.getText());
                    }
                    else{
                        enemyhealthlabelname.setText(""+enemyHealth);
                        yourhealthLabelname.setText(""+health);
                    }
                }
        }
    }
    public class ElixrHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            int healthpotionHealAmount=30;
            int health=Integer.parseInt(yourhealthLabelname.getText());
            if(life>0){
                    health+=healthpotionHealAmount;
                    life--;
                    if(health>100){
                        health=100;
                        yourhealthLabelname.setText(""+health);
                    }
                    else{
                        yourhealthLabelname.setText(""+health);
                        infopanellLabelname.setText("You have "+life+" lives left.");
                    }
                }
            else if(life<=0 && health>0){
                infopanellLabelname.setText("0 lives left.");
            }
            else{
                yourhealthLabelname.setText(""+health);
                infopanellLabelname.setText("You got defeated by "+enemynameLabelname.getText());
                window.dispose();
                }
            }
        }
    }