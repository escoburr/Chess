package project;

import javax.swing.JButton;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Siddharth
 */
public class manager {

    static String buttontext = null;
    static int clickCount = 0;
    static int ac = 0, ca = 0, ab = 0, ba = 0;
    static board updated = new board();
    static ArrayList<pieces> chesspieces = new ArrayList();

    public static void main(String[] args) {

        String temp1 = " ", temp2 = " ", temp3 = " ", temp4 = " ", temp5 = " ";
        int temp = 0;
        manager m = new manager();
        String[][] board = new String[8][8];
        board = m.updatearray(board);
        updated.setVisible(true);

        chesspieces.add(new rook("br1", true));
        chesspieces.add(new horse("bh1", true));
        chesspieces.add(new bishop("bb1", true));
        chesspieces.add(new queen("bq1", true));
        chesspieces.add(new king("bk1", true));
        chesspieces.add(new pawn("bp1", true, 'b'));
        chesspieces.add(new pawn("wp1", true, 'w'));

        while (true) {
            System.out.print("");
            if (buttontext != null) {
                if (clickCount == 1) {
                    temp1 = buttontext;
                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8; j++) {
                            if ((board[i][j].equals(temp1))) {
                                if (m.recoverButton(board[i][j]).getText().length() > 1) {
                                    temp3 = (m.recoverButton(board[i][j])).getText().charAt(1) + " ";
                                }
                                ab = i;
                                ba = j;
                                buttontext = null;
                            }
                        }
                    }
                } else if (clickCount == 2) {
                    temp2 = buttontext;
                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8; j++) {
                            if (board[i][j].equals(temp2)) {
                                m.helper(chesspieces.get(m.extract(temp3)).allowedMoves(ab, ba), board, i, j);
                                System.out.println(m.extract(temp3) + "THIS IS NUMBER");
                                m.updateGUI(m.recoverButton(board[ab][ba]), m.recoverButton(board[ac][ca]), m.recoverButton(board[ab][ba]).getText(), m.recoverButton(board[ac][ca]).getText(), chesspieces.get(m.extract(temp3)).allowedMoves(ab, ba), i, j);
                                buttontext = null;
                            }
                        }
                    }
                }
            }

        }
    }

    public static int extract(String b) {
        System.out.println(b + "   This is IDENTIFIER");
        if (b.startsWith("r")) {
            return 0;
        } else if (b.startsWith("h")) {
            return 1;
        } else if (b.startsWith("b")) {
            return 2;
        } else if (b.startsWith("q")) {
            return 3;
        } else if (b.startsWith("k")) {
            return 4;
        } else if (b.startsWith("p")) {
            return 5;
        } else {
            return -1;
        }

    }

    public void helper(boolean[][] allowed, String[][] board, int a, int b) {
        if (allowed[a][b]) {
            System.out.println(a + " " + b + " can move here");
            ac = a;
            ca = b;
        }
    }

    public void updateGUI(JButton source, JButton dest, String s, String d, boolean[][] allowed, int a, int b) {
        if (allowed[a][b]) {
            ac = a;
            ca = b;
            System.out.println(s + " s and d is " + d);
            System.out.println(a + " " + b + " can move here for update GUI");
        source.setText(d);
            dest.setText(s);
        }

    }

    public void setButtonText(String butt) {
        buttontext = butt;
    }

    public String getButtonText() {
        return buttontext;
    }

    public void setClickCount(int count) {
        clickCount = count;
    }

    public int getClickCount() {
        return clickCount;
    }

    public void setArrayList(ArrayList p) {
        chesspieces = p;
    }

    public ArrayList getArrayList() {
        return chesspieces;
    }

    public JButton recoverButton(String c) {
        if (c.equals(updated.jButton1.getActionCommand())) {
            return updated.jButton1;
        } else if (c.equals(updated.jButton2.getActionCommand())) {
            return updated.jButton2;
        } else if (c.equals(updated.jButton3.getActionCommand())) {
            return updated.jButton3;
        } else if (c.equals(updated.jButton4.getActionCommand())) {
            return updated.jButton4;
        } else if (c.equals(updated.jButton5.getActionCommand())) {
            return updated.jButton5;
        } else if (c.equals(updated.jButton6.getActionCommand())) {
            return updated.jButton6;
        } else if (c.equals(updated.jButton7.getActionCommand())) {
            return updated.jButton7;
        } else if (c.equals(updated.jButton8.getActionCommand())) {
            return updated.jButton8;
        } else if (c.equals(updated.jButton9.getActionCommand())) {
            return updated.jButton9;
        } else if (c.equals(updated.jButton10.getActionCommand())) {
            return updated.jButton10;
        } else if (c.equals(updated.jButton11.getActionCommand())) {
            return updated.jButton11;
        } else if (c.equals(updated.jButton12.getActionCommand())) {
            return updated.jButton12;
        } else if (c.equals(updated.jButton13.getActionCommand())) {
            return updated.jButton13;
        } else if (c.equals(updated.jButton14.getActionCommand())) {
            return updated.jButton14;
        } else if (c.equals(updated.jButton15.getActionCommand())) {
            return updated.jButton15;
        } else if (c.equals(updated.jButton16.getActionCommand())) {
            return updated.jButton16;
        } else if (c.equals(updated.jButton17.getActionCommand())) {
            return updated.jButton17;
        } else if (c.equals(updated.jButton18.getActionCommand())) {
            return updated.jButton18;
        } else if (c.equals(updated.jButton19.getActionCommand())) {
            return updated.jButton19;
        } else if (c.equals(updated.jButton20.getActionCommand())) {
            return updated.jButton20;
        } else if (c.equals(updated.jButton21.getActionCommand())) {
            return updated.jButton21;
        } else if (c.equals(updated.jButton22.getActionCommand())) {
            return updated.jButton22;
        } else if (c.equals(updated.jButton23.getActionCommand())) {
            return updated.jButton23;
        } else if (c.equals(updated.jButton24.getActionCommand())) {
            return updated.jButton24;
        } else if (c.equals(updated.jButton25.getActionCommand())) {
            return updated.jButton25;
        } else if (c.equals(updated.jButton26.getActionCommand())) {
            return updated.jButton26;
        } else if (c.equals(updated.jButton27.getActionCommand())) {
            return updated.jButton27;
        } else if (c.equals(updated.jButton28.getActionCommand())) {
            return updated.jButton28;
        } else if (c.equals(updated.jButton29.getActionCommand())) {
            return updated.jButton29;
        } else if (c.equals(updated.jButton30.getActionCommand())) {
            return updated.jButton30;
        } else if (c.equals(updated.jButton31.getActionCommand())) {
            return updated.jButton31;
        } else if (c.equals(updated.jButton32.getActionCommand())) {
            return updated.jButton32;
        } else if (c.equals(updated.jButton33.getActionCommand())) {
            return updated.jButton33;
        } else if (c.equals(updated.jButton34.getActionCommand())) {
            return updated.jButton34;
        } else if (c.equals(updated.jButton35.getActionCommand())) {
            return updated.jButton35;
        } else if (c.equals(updated.jButton36.getActionCommand())) {
            return updated.jButton36;
        } else if (c.equals(updated.jButton37.getActionCommand())) {
            return updated.jButton37;
        } else if (c.equals(updated.jButton38.getActionCommand())) {
            return updated.jButton38;
        } else if (c.equals(updated.jButton39.getActionCommand())) {
            return updated.jButton39;
        } else if (c.equals(updated.jButton40.getActionCommand())) {
            return updated.jButton40;
        } else if (c.equals(updated.jButton41.getActionCommand())) {
            return updated.jButton41;
        } else if (c.equals(updated.jButton42.getActionCommand())) {
            return updated.jButton42;
        } else if (c.equals(updated.jButton43.getActionCommand())) {
            return updated.jButton43;
        } else if (c.equals(updated.jButton44.getActionCommand())) {
            return updated.jButton44;
        } else if (c.equals(updated.jButton45.getActionCommand())) {
            return updated.jButton45;
        } else if (c.equals(updated.jButton46.getActionCommand())) {
            return updated.jButton46;
        } else if (c.equals(updated.jButton47.getActionCommand())) {
            return updated.jButton47;
        } else if (c.equals(updated.jButton48.getActionCommand())) {
            return updated.jButton48;
        } else if (c.equals(updated.jButton49.getActionCommand())) {
            return updated.jButton49;
        } else if (c.equals(updated.jButton50.getActionCommand())) {
            return updated.jButton50;
        } else if (c.equals(updated.jButton51.getActionCommand())) {
            return updated.jButton51;
        } else if (c.equals(updated.jButton52.getActionCommand())) {
            return updated.jButton52;
        } else if (c.equals(updated.jButton53.getActionCommand())) {
            return updated.jButton53;
        } else if (c.equals(updated.jButton54.getActionCommand())) {
            return updated.jButton54;
        } else if (c.equals(updated.jButton55.getActionCommand())) {
            return updated.jButton55;
        } else if (c.equals(updated.jButton56.getActionCommand())) {
            return updated.jButton56;
        } else if (c.equals(updated.jButton57.getActionCommand())) {
            return updated.jButton57;
        } else if (c.equals(updated.jButton58.getActionCommand())) {
            return updated.jButton58;
        } else if (c.equals(updated.jButton59.getActionCommand())) {
            return updated.jButton59;
        } else if (c.equals(updated.jButton60.getActionCommand())) {
            return updated.jButton60;
        } else if (c.equals(updated.jButton62.getActionCommand())) {
            return updated.jButton62;
        } else if (c.equals(updated.jButton63.getActionCommand())) {
            return updated.jButton63;
        } else if (c.equals(updated.jButton64.getActionCommand())) {
            return updated.jButton64;
        } else if (c.equals(updated.jButton65.getActionCommand())) {
            return updated.jButton65;
        } else {
            return null;
        }

    }

    public String[][] updatearray(String[][] b) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                b[i][j] = " ";
            }
        }
        b[0][0] = updated.jButton1.getActionCommand();
        b[1][0] = updated.jButton4.getActionCommand();
        b[2][0] = updated.jButton2.getActionCommand();
        b[3][0] = updated.jButton3.getActionCommand();
        b[4][0] = updated.jButton6.getActionCommand();
        b[5][0] = updated.jButton8.getActionCommand();
        b[6][0] = updated.jButton5.getActionCommand();
        b[7][0] = updated.jButton7.getActionCommand();

        b[0][1] = updated.jButton10.getActionCommand();
        b[1][1] = updated.jButton14.getActionCommand();
        b[2][1] = updated.jButton9.getActionCommand();
        b[3][1] = updated.jButton13.getActionCommand();
        b[4][1] = updated.jButton12.getActionCommand();
        b[5][1] = updated.jButton16.getActionCommand();
        b[6][1] = updated.jButton11.getActionCommand();
        b[7][1] = updated.jButton15.getActionCommand();

        b[0][2] = updated.jButton18.getActionCommand();
        b[1][2] = updated.jButton22.getActionCommand();
        b[2][2] = updated.jButton17.getActionCommand();
        b[3][2] = updated.jButton21.getActionCommand();
        b[4][2] = updated.jButton20.getActionCommand();
        b[5][2] = updated.jButton24.getActionCommand();
        b[6][2] = updated.jButton19.getActionCommand();
        b[7][2] = updated.jButton23.getActionCommand();

        b[0][3] = updated.jButton26.getActionCommand();
        b[1][3] = updated.jButton30.getActionCommand();
        b[2][3] = updated.jButton25.getActionCommand();
        b[3][3] = updated.jButton29.getActionCommand();
        b[4][3] = updated.jButton28.getActionCommand();
        b[5][3] = updated.jButton32.getActionCommand();
        b[6][3] = updated.jButton27.getActionCommand();
        b[7][3] = updated.jButton31.getActionCommand();

        b[0][4] = updated.jButton34.getActionCommand();
        b[1][4] = updated.jButton38.getActionCommand();
        b[2][4] = updated.jButton33.getActionCommand();
        b[3][4] = updated.jButton37.getActionCommand();
        b[4][4] = updated.jButton36.getActionCommand();
        b[5][4] = updated.jButton40.getActionCommand();
        b[6][4] = updated.jButton35.getActionCommand();
        b[7][4] = updated.jButton39.getActionCommand();

        b[0][5] = updated.jButton42.getActionCommand();
        b[1][5] = updated.jButton46.getActionCommand();
        b[2][5] = updated.jButton41.getActionCommand();
        b[3][5] = updated.jButton45.getActionCommand();
        b[4][5] = updated.jButton44.getActionCommand();
        b[5][5] = updated.jButton48.getActionCommand();
        b[6][5] = updated.jButton43.getActionCommand();
        b[7][5] = updated.jButton47.getActionCommand();

        b[0][6] = updated.jButton50.getActionCommand();
        b[1][6] = updated.jButton54.getActionCommand();
        b[2][6] = updated.jButton49.getActionCommand();
        b[3][6] = updated.jButton53.getActionCommand();
        b[4][6] = updated.jButton52.getActionCommand();
        b[5][6] = updated.jButton56.getActionCommand();
        b[6][6] = updated.jButton51.getActionCommand();
        b[7][6] = updated.jButton55.getActionCommand();

        b[0][7] = updated.jButton58.getActionCommand();
        b[1][7] = updated.jButton63.getActionCommand();
        b[2][7] = updated.jButton57.getActionCommand();
        b[3][7] = updated.jButton64.getActionCommand();
        b[4][7] = updated.jButton60.getActionCommand();
        b[5][7] = updated.jButton62.getActionCommand();
        b[6][7] = updated.jButton59.getActionCommand();
        b[7][7] = updated.jButton65.getActionCommand();
        return b;
    }

}
