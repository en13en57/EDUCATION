package kr.green.win1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

// 상태바를 만들어 보자 
public class WinEx05 extends JFrame{
	private static final long serialVersionUID = -3368019011478597275L;
	private JLabel statusBar;
	
	public WinEx05() {
		super("상태바 연습");
		setSize(600, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 라벨을 만들어 배치 한다.
		setLayout(new BorderLayout());
	
		statusBar = new JLabel("Easy");
        statusBar.setBorder(BorderFactory.createEtchedBorder());
        add(statusBar, BorderLayout.SOUTH);
        
     	JMenuBar menuBar = new JMenuBar();
     	JMenu viewMenu = new JMenu("View");
     	viewMenu.setMnemonic(KeyEvent.VK_V);
     	// 체크 박스 메뉴 아이템
     	JMenuItem showStatusBarMenuItem = new JCheckBoxMenuItem("Show statubar");
        showStatusBarMenuItem.setMnemonic(KeyEvent.VK_S);
        showStatusBarMenuItem.setDisplayedMnemonicIndex(5);
        showStatusBarMenuItem.setSelected(true);

        showStatusBarMenuItem.addItemListener((e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                statusBar.setVisible(true);
            } else {
                statusBar.setVisible(false);
            }
        });

        viewMenu.add(showStatusBarMenuItem);
        menuBar.add(viewMenu);
        // 라디오버튼 메뉴 아이템
     	JMenu bgMenu = new JMenu("배경색(B)");
     	bgMenu.setMnemonic(KeyEvent.VK_B); 
        
     	ButtonGroup bgGroup = new ButtonGroup();
     	JMenuItem bgRedItem = new JRadioButtonMenuItem("빨강색");
     	bgRedItem.addActionListener((e)->{
     		getContentPane().setBackground(Color.RED);
     	});
     	bgRedItem.setSelected(true);
     	getContentPane().setBackground(Color.RED);
     	
     	JMenuItem bgGreenItem = new JRadioButtonMenuItem("초록색");
     	bgGreenItem.addActionListener((e)->{
     		getContentPane().setBackground(Color.GREEN);
     	});
     	JMenuItem bgBlueItem = new JRadioButtonMenuItem("파란색");
     	bgBlueItem.addActionListener((e)->{
     		getContentPane().setBackground(Color.BLUE);
     	});
     	
     	bgGroup.add(bgRedItem);
     	bgGroup.add(bgGreenItem);
     	bgGroup.add(bgBlueItem);
     	
     	bgMenu.add(bgRedItem);
     	bgMenu.add(bgGreenItem);
     	bgMenu.add(bgBlueItem);
     	
     	menuBar.add(bgMenu);
     	
        setJMenuBar(menuBar);
        setVisible(true);
	}
	
	public static void main(String[] args) {
		new WinEx05();
	}
}
