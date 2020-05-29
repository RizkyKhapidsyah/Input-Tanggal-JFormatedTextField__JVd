package com.rk;

import javax.swing.*;
import javax.swing.text.DateFormatter;
import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormUtama extends JFrame {

    JFormattedTextField JFTF;

    public FormUtama() {
        super("Input Tanggal");
        Inisialisasi_Komponen();
    }

    private void Inisialisasi_Komponen() {
        setPreferredSize(new Dimension(350, 150));
        setLayout(new FlowLayout(FlowLayout.LEFT));
        AturInputTanggal("Tanggal 1");
        AturInputTanggal("Tanggal 2");
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void AturInputTanggal(String Teks) {
        JFormattedTextField jftf;
        JLabel jl;

        jl = new JLabel(Teks);
        jl.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(jl);
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        DateFormatter dft = new DateFormatter(df);

        jftf = new JFormattedTextField(dft);
        jftf.setFont(new Font("Tahoma", Font.PLAIN, 14));
        jftf.setPreferredSize(new Dimension(250, 40));
        jftf.setValue(new Date());
        add(jftf);
    }
}
