import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator {
    public Calculator() {
        JFrame jf=new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600,600);
        jf.setLocation(300,150);

        JLabel displayLabel = new JLabel("Hello ");
        displayLabel.setBounds(30,50,540,50);
        displayLabel.setBackground(Color.GRAY);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        
        jf.add(displayLabel);

        JButton sevenButton = new JButton("7");
        sevenButton.setBounds(30,130,80,80);
        sevenButton.setFont(sevenButton.getFont().deriveFont(30f));
        jf.add(sevenButton);

        
        JButton eightButton = new JButton("8");
        eightButton.setBounds(130,130,80,80);
        eightButton.setFont(eightButton.getFont().deriveFont(30f));
        jf.add(eightButton);

        JButton nineButton = new JButton("9");
        nineButton.setBounds(230,130,80,80);
        nineButton.setFont(nineButton.getFont().deriveFont(30f));
        jf.add(nineButton);

        
        JButton fourButton = new JButton("4");
        fourButton.setBounds(30,230,80,80);
        fourButton.setFont(fourButton.getFont().deriveFont(30f));
        jf.add(fourButton);

        
        JButton fiveButton = new JButton("5");
        fiveButton.setBounds(130,230,80,80);
        fiveButton.setFont(fiveButton.getFont().deriveFont(30f));
        jf.add(fiveButton);

        JButton sixButton = new JButton("6");
        sixButton.setBounds(230,230,80,80);
        sixButton.setFont(sixButton.getFont().deriveFont(30f));
        jf.add(sixButton);


        JButton oneButton = new JButton("1");
        oneButton.setBounds(30,330,80,80);
        oneButton.setFont(oneButton.getFont().deriveFont(30f));
        jf.add(oneButton);

        
        JButton twoButton = new JButton("2");
        twoButton.setBounds(130,330,80,80);
        twoButton.setFont(twoButton.getFont().deriveFont(30f));
        jf.add(twoButton);

        JButton threeButton = new JButton("3");
        threeButton.setBounds(230,330,80,80);
        threeButton.setFont(threeButton.getFont().deriveFont(30f));
        jf.add(threeButton);


           JButton dotButton = new JButton(".");
        dotButton.setBounds(30,430,80,80);
        dotButton.setFont(dotButton.getFont().deriveFont(30f));
        jf.add(dotButton);

        
        JButton zeroButton = new JButton("0");
        zeroButton.setBounds(130,430,80,80);
        zeroButton.setFont(zeroButton.getFont().deriveFont(30f));
        jf.add(zeroButton);

        JButton equalButton = new JButton("=");
        equalButton.setBounds(230,430,80,80);
        equalButton.setFont(equalButton.getFont().deriveFont(30f));
        jf.add(equalButton);

        JButton divButton = new JButton("/");
        divButton.setBounds(330,130,80,80);
        divButton.setFont(divButton.getFont().deriveFont(30f));
        jf.add(divButton);

        JButton mulButton = new JButton("x");
        mulButton.setBounds(330,230,80,80);
        mulButton.setFont(mulButton.getFont().deriveFont(30f));
        jf.add(mulButton);

        JButton minusButton = new JButton("-");
        minusButton.setBounds(330,330,80,80);
        minusButton.setFont(minusButton.getFont().deriveFont(30f));
        jf.add(minusButton);

        JButton plusButton = new JButton("+");
        plusButton.setBounds(330,430,80,80);
        plusButton.setFont(plusButton.getFont().deriveFont(30f));
        jf.add(plusButton);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    }

